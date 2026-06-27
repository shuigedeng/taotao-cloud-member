<#
.SYNOPSIS
    taotao-cloud-member 安全扫描脚本 (PowerShell)
.DESCRIPTION
    用于检查 DDD 项目中的常见安全问题：
    1. 敏感信息泄露（配置文件中的明文密码/secret）
    2. SQL 注入风险（原生 SQL 查询）
    3. 权限控制注解覆盖率
    4. 跨聚合直接访问数据表
.NOTES
    平台: Windows PowerShell 5.1+
    运行: .\security-scan.ps1 [项目根目录]
#>

param(
    [string]$BaseDir = "."
)

$HAS_WARNINGS = $false
$MODULES = @(
    "taotao-cloud-member-api",
    "taotao-cloud-member-application",
    "taotao-cloud-member-domain",
    "taotao-cloud-member-infrastructure",
    "taotao-cloud-member-interfaces"
)

Write-Host "================================================" -ForegroundColor Cyan
Write-Host "  taotao-cloud-member 安全扫描 (PowerShell)" -ForegroundColor Cyan
Write-Host "================================================" -ForegroundColor Cyan

# 1. 检查敏感信息泄露
Write-Host ""
Write-Host "[1/4] 检查敏感信息泄露..." -ForegroundColor Yellow
$leakFound = $false
foreach ($module in $MODULES) {
    $resPath = Join-Path -Path $BaseDir -ChildPath "$module/src/main/resources"
    if (Test-Path $resPath) {
        $sensitive = Get-ChildItem -Path $resPath -Recurse -Include @("*.yml", "*.yaml", "*.properties") |
            Select-String -Pattern "password|secret|token|jwt-secret|access-key" |
            Where-Object { $_ -notmatch "ENC\(" -and $_ -notmatch "^\s*#" }
        if ($sensitive) {
            Write-Host "  ⚠️  发现明文敏感信息 in $module" -ForegroundColor Red
            $sensitive | ForEach-Object { Write-Host "    $($_.Line.Trim())" }
            $leakFound = $true
            $HAS_WARNINGS = $true
        }
    }
}
if (-not $leakFound) { Write-Host "  ✅ 未发现明文敏感信息" -ForegroundColor Green }

# 2. 检查 SQL 注入风险
Write-Host ""
Write-Host "[2/4] 检查 SQL 注入风险..." -ForegroundColor Yellow
foreach ($module in $MODULES) {
    $srcPath = Join-Path -Path $BaseDir -ChildPath "$module/src/main/java"
    if (Test-Path $srcPath) {
        $sqlAnnotations = Get-ChildItem -Path $srcPath -Recurse -Filter "*.java" |
            Select-String -Pattern "nativeQuery|createNativeQuery|@Select|@Update|@Delete|@Insert"
        if ($sqlAnnotations) {
            Write-Host "  ℹ️  发现 SQL 注解 in $module（请确认使用参数绑定）" -ForegroundColor Cyan
        }
    }
}
Write-Host "  ✅ SQL 注入检查完成" -ForegroundColor Green

# 3. 检查权限控制注解
Write-Host ""
Write-Host "[3/4] 检查权限控制注解..." -ForegroundColor Yellow
$authFound = $false
foreach ($module in $MODULES) {
    $srcPath = Join-Path -Path $BaseDir -ChildPath "$module/src/main/java"
    if (Test-Path $srcPath) {
        $authCount = (Get-ChildItem -Path $srcPath -Recurse -Filter "*.java" |
            Select-String -Pattern "@PreAuthorize|@Secured").Count
        if ($authCount -gt 0) {
            Write-Host "  ✅ $module`: 发现 $authCount 处权限控制" -ForegroundColor Green
            $authFound = $true
        }
    }
}
if (-not $authFound) {
    Write-Host "  ⚠️  未发现权限控制注解" -ForegroundColor Red
    $HAS_WARNINGS = $true
}

# 4. 检查跨聚合直接访问数据表（domain 层持久化操作）
Write-Host ""
Write-Host "[4/4] 检查跨聚合数据访问..." -ForegroundColor Yellow
$domainPath = Join-Path -Path $BaseDir -ChildPath "taotao-cloud-member-domain/src/main/java/com/taotao/cloud/member/domain"
if (Test-Path $domainPath) {
    $persistenceOps = Get-ChildItem -Path $domainPath -Recurse -Filter "*.java" |
        Select-String -Pattern "\.save\(|\.update\(|\.delete\(|\.findById\(|@Table|@Entity"
    if ($persistenceOps) {
        Write-Host "  ⚠️  domain 层发现持久化操作（违反 DDD 规范）" -ForegroundColor Red
        $persistenceOps | ForEach-Object { Write-Host "    $($_.Path): $($_.Line.Trim())" }
        $HAS_WARNINGS = $true
    } else {
        Write-Host "  ✅ domain 层未发现持久化操作" -ForegroundColor Green
    }
}

Write-Host ""
Write-Host "================================================" -ForegroundColor Cyan
if (-not $HAS_WARNINGS) {
    Write-Host "  ✅ 安全扫描通过，未发现问题" -ForegroundColor Green
} else {
    Write-Host "  ⚠️  扫描完成，存在需要关注的问题" -ForegroundColor Yellow
}
Write-Host "================================================" -ForegroundColor Cyan

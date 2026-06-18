---
description: 编译前检查 — 确保代码通过编译
hook: pre-commit
---

# 编译前检查（Hook）

## 执行步骤
```powershell
# 编译检查
gradlew compileJava
if ($LASTEXITCODE -ne 0) {
    Write-Error "编译失败，请修复后重试"
    exit 1
}
```

## 跳过条件
仅跳过纯文档变更（.md 文件）。

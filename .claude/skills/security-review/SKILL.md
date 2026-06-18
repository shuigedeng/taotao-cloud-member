---
name: security-review
description: 安全审查 — OWASP Top 10、敏感信息泄露、权限检查
triggers:
  - "安全审查"
  - "安全扫描"
  - "安全检查"
---

# 安全审查

## 执行步骤

### 1. 敏感信息扫描
```powershell
powershell -File .opencode/skills/security-scan.ps1
```

### 2. 手动检查项
- [ ] 配置文件中的明文密码/secret
- [ ] 日志中是否打印手机号、密码等敏感字段
- [ ] Controller 是否有权限注解
- [ ] 输入参数是否校验
- [ ] SQL 注入防护（使用参数绑定）

### 3. DDD 安全规范
- [ ] domain 层无持久化操作
- [ ] 跨聚合通过 ID 引用
- [ ] 领域事件不包含敏感信息

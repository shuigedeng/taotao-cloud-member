---
name: performance-check
description: 性能检查 — SQL 查询优化、缓存策略、N+1 检测
triggers:
  - "性能检查"
  - "SQL优化"
  - "慢查询"
---

# 性能检查

## 检查清单

### 1. SQL 查询
- [ ] 是否存在 N+1 查询
- [ ] 是否有 `SELECT *`
- [ ] JOIN 字段是否有索引
- [ ] 大结果集是否有分页

### 2. 缓存策略
- [ ] 热点数据是否使用 Redis 缓存（Redisson）
- [ ] 是否配置了缓存过期时间
- [ ] 是否存在缓存穿透/击穿风险

### 3. 批量操作
- [ ] 批量插入是否使用 MyBatis-Plus batch
- [ ] 循环中是否避免单条 SQL 操作

### 检查工具
```powershell
python .opencode/skills/optimize-query.py .
```

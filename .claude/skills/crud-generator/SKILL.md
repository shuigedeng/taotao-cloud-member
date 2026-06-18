---
name: crud-generator
description: 自动生成 DDD 分层标准 CRUD 代码（针对 taotao-cloud-member）
triggers:
  - "生成CRUD"
  - "创建增删改查"
  - "新建模块"
---

# CRUD 代码生成器

## 触发条件
用户输入包含 "生成CRUD" 或 "创建增删改查" 等关键词时自动触发。

## 生成文件结构

### Domain 层
```
domain/aggregate/    — 聚合根（*Agg.java）
domain/entity/       — 实体（*.java）
domain/valobj/       — 值对象（*Val.java）
domain/event/        — 领域事件（*Event.java）
domain/repository/   — 仓储接口（*DomainRepository.java）
```

### Application 层
```
application/dto/command/      — 命令（Create*Command, Update*Command）
application/dto/result/       — 结果（*Result）
application/service/command/  — 命令服务接口 + 实现
application/service/query/    — 查询服务接口 + 实现
```

### Infrastructure 层
```
infrastructure/persistent/persistence/ — PO（*PO.java）
infrastructure/persistent/mapper/      — MyBatis Mapper
infrastructure/repository/domain/      — 仓储实现（*DomainRepositoryImpl.java）
infrastructure/assembler/              — Assembler
```

### Interfaces 层
```
interfaces/controller/buyer/    — 买家端 Controller
interfaces/controller/seller/   — 卖家端 Controller
interfaces/controller/manager/  — 管理端 Controller
```

## 包路径
```java
package com.taotao.cloud.member.{layer}.{sub};
```

## 构建验证
```powershell
gradlew compileJava
```

# 架构规范 — DDD 六边形架构

> 本项目采用六边形架构（端口与适配器模式），严格分层。参考 `CLAUDE.md` 中的依赖规则图。

## 分层依赖

```
api → interfaces → application → domain ← infrastructure
                       ↓
                   facade (ACL)
```

### 各层职责

**Domain（领域层）** — 零外部依赖，只包含纯 Java 业务逻辑
- 聚合根 / 实体 / 值对象 / 领域事件 / 仓储接口 / 领域服务
- 不依赖 Spring，不依赖数据库
- 包：`com.taotao.cloud.member.domain.*`

**Application（应用层）** — 用例编排
- 命令/查询服务，事务边界，DTO 转换
- 依赖 domain，可依赖 facade 接口
- 不直接依赖 infrastructure
- 包：`com.taotao.cloud.member.application.*`

**Infrastructure（基础设施层）** — 技术实现
- 仓储实现（*DomainRepositoryImpl），PO，Mapper，事件发布，配置
- 依赖 domain 实现仓储，依赖 application 实现事件订阅
- 包：`com.taotao.cloud.member.infrastructure.*`

**Interfaces（接口层）** — 外部通信
- REST Controller（buyer/seller/manager/inner），RPC，gRPC
- 只做 HTTP 解析 + 参数校验 + 结果封装，不含业务逻辑
- 包：`com.taotao.cloud.member.interfaces.*`

**API（接口定义层）** — 纯 DTO + 接口
- RPC/gRPC 接口定义，Request/Response
- 不依赖任何业务模块
- 包：`com.taotao.cloud.member.api.*`

**Facade（防腐层）** — 外部系统适配
- ACL 实现，Client Proxy，Facade Assembler
- 包：`com.taotao.cloud.member.facade.*`

## 禁止的依赖方向

```java
// ❌ 禁止：Controller 直接调用 Repository
@Autowired private MemberRepository memberRepository;

// ❌ 禁止：Application Service 直接调用 Mapper
@Autowired private MemberMapper memberMapper;

// ❌ 禁止：Domain Service 注入 Repository
@Autowired private MemberRepository memberRepository;

// ✅ 正确：Application Service 通过仓储接口操作持久化
private final MemberDomainRepository memberRepository;
```

## 跨聚合规则

- 跨聚合通过 ID 引用，非对象引用
- 聚合间通信通过领域事件（最终一致性）
- 事务边界仅开在 application 层

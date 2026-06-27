# taotao-cloud-member — 会员领域 DDD 单体服务

## 技术栈

| 组件 | 版本 |
|------|------|
| Java | 25（预览特性，--enable-preview） |
| Gradle | 9.5 |
| Spring Boot | 4.1.0 |
| Spring Cloud | 2025.1.1 |
| Spring Cloud Alibaba | 2025.1.0.0 |
| Spring Security | 7.1.0 |
| MyBatis-Plus | 3.5.16 |
| Knife4j | 4.5.0 |
| Redisson | 4.3.1 |
| RocketMQ | 5.2.4 |
| Netty | 4.2.12.Final |
| Querydsl | 5.1.0 |
| MapStruct | 1.6.3 |
| Lombok | 1.18.46 |

## 项目结构

```
taotao-cloud-member/          ← 8 个 Gradle 模块，六边形架构
├── api/                      # RPC/gRPC 接口 + DTO（纯定义）
├── application/              # 应用层：编排、事务、DTO转换
├── assembly/                 # 启动器 + 环境配置
├── common/                   # 公共枚举、常量
├── domain/                   # ★ 领域层（零外部依赖）
├── facade/                   # 防腐层（ACL，独立模块）
├── infrastructure/           # 持久化、MQ、事件、缓存、任务
└── interfaces/               # REST / RPC / gRPC 实现
```

### 包路径

```
所有 Java 类位于: com.taotao.cloud.member.{module}
例如:
  com.taotao.cloud.member.domain.aggregate.MemberAgg
  com.taotao.cloud.member.infrastructure.persistent.persistence.MemberPO
  com.taotao.cloud.member.interfaces.controller.buyer.MemberBuyerController
```

### WHERE TO LOOK

| 需求 | 路径 |
|------|------|
| 新增业务功能 | `application/service/command/` 定义 + `interfaces/controller/{role}/` 实现 |
| 修改领域模型 | `domain/aggregate/` 或 `domain/entity/` |
| 值对象 | `domain/valobj/`（final 字段、无 setter、构造时验证） |
| 领域事件 | `domain/event/`（聚合内 registerEvent，仓储 flush 发布） |
| 仓储接口 | `domain/repository/` |
| 仓储实现 | `infrastructure/repository/domain/`（*DomainRepositoryImpl） |
| JPA PO | `infrastructure/persistent/persistence/` |
| MyBatis Mapper | `infrastructure/persistent/mapper/` |
| API 定义 | `api/rpc/` 或 `api/inner/` |
| REST 实现 | `interfaces/controller/{buyer,seller,manager,inner}/` |
| 防腐层 | `facade/`（acl/ + {domain}ClientProxy/ + assembler/） |
| 消息监听 | `infrastructure/event/consumer/` 或 `infrastructure/event/subscribe/` |
| 定时任务 | `infrastructure/job/` |
| 基础设施配置 | `infrastructure/configuration/` |

## 分层依赖规则

```
api → interfaces → application → domain ← infrastructure
                        ↓
                    facade (ACL)
```

- **domain**: 零外部依赖，不依赖 Spring、不依赖数据库
- **application**: 依赖 domain，可依赖 facade 接口，不依赖 infrastructure
- **infrastructure**: 依赖 domain 实现仓储，依赖 application 实现事件订阅
- **interfaces**: 依赖 application，不直接依赖 infrastructure
- **api**: 纯 DTO + 接口定义，不依赖任何业务模块

## 核心约定

- Controller 按 buyer / seller / manager / inner 四端分包
- 命令/查询命名：`{动词}{名词}{Command|Query}`
- 领域模型与持久化模型分离（domain entity ≠ JPA PO）
- 事务边界仅开在 application 层（`@Transactional`）
- 跨聚合通过 ID 引用，非对象引用
- infrastructure 仓储实现以 `*DomainRepositoryImpl` 后缀命名
- PO 以 `PO` 后缀，DO 以 `DO` 后缀

## 禁止行为（ANTI-PATTERNS）

- Controller 中写业务逻辑
- 聚合根中注入 Repository 或 Domain Service
- 值对象中包含业务行为以外的逻辑
- Application Service 中包含业务规则判断
- 跨聚合直接操作其他聚合的内部状态
- domain 层出现 Spring 注解或持久化操作
- Application Service 直接调用 Mapper/DAO

## 常用命令

```powershell
# 编译（Windows — 使用 gradlew，非 ./gradlew）
gradlew build

# 启动 dev 环境
gradlew :taotao-cloud-member-assembly:bootRun --args='--spring.profiles.active=dev'

# 代码质量检查
gradlew checkstyleMain spotlessCheck pmdMain spotbugsMain

# 运行测试
gradlew test

# 运行指定模块测试
gradlew :taotao-cloud-member-domain:test

# 发布到本地 Maven
gradlew publishToMavenLocal
```

## 注意事项

- **平台**: Windows（PowerShell 5.1），所有命令使用 `gradlew` 而非 `./gradlew`
- **JDK 25**: 预览特性，需要 `--enable-preview` + `--add-exports`
- **环境**: 四种配置 dev / test / pre / pro
- **质量门禁**: Checkstyle + SpotBugs + PMD + Spotless + OWASP
- **BOM**: `taotao-cloud-dependencies:2026.08` 未开源，外部构建需私有仓库凭据
- **事件机制**: 同时支持 Kafka、RocketMQ、Redis Pub/Sub、Guava EventBus、GreenRobot 五种事件总线
- **三 Repository 分层**: domain 接口 → infrastructure DomainRepositoryImpl + ApplicationRepository + 持久化 SuperRepository

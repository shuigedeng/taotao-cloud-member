# 代码风格规范

## 包命名规则
所有代码位于 `com.taotao.cloud.member.{layer}.{subdomain}`：
```
com.taotao.cloud.member.domain.aggregate.MemberAgg
com.taotao.cloud.member.infrastructure.persistent.persistence.MemberPO
com.taotao.cloud.member.interfaces.controller.buyer.MemberBuyerController
```

## 命名约定

| 元素 | 风格 | 示例 |
|------|------|------|
| 聚合根 | PascalCase + Agg 后缀 | `MemberAgg`, `MemberWalletAgg` |
| 实体 | PascalCase | `Member`, `MemberWallet` |
| 值对象 | PascalCase + Val 后缀 | `MemberVal`, `MemberWalletVal` |
| 领域事件 | PascalCase + Event 后缀 | `MemberCreateEvent`, `MemberWalletCreateEvent` |
| 仓储接口 | PascalCase + DomainRepository | `MemberDomainRepository` |
| 仓储实现 | PascalCase + DomainRepositoryImpl | `MemberDomainRepositoryImpl` |
| 命令 | PascalCase + Command 后缀 | `CreateMemberCommand` |
| 查询服务 | PascalCase + QueryService | `MemberQueryService` |
| PO | PascalCase + PO 后缀 | `MemberPO`, `MemberAddressPO` |

## 格式化规则
- 缩进：4 空格（不使用 Tab）
- 行宽：120 字符
- 大括号：K&R 风格（左括号不换行）
- 方法：小驼峰，动词开头（`createMember`, `queryByPhone`）

## 导入顺序
1. Java 标准库（`java.*`, `javax.*`, `jakarta.*`）
2. 第三方库（`org.*`, `com.*` 非项目）
3. Spring 框架（`org.springframework.*`）
4. 项目内部包（`com.taotao.cloud.member.*`）
5. 静态导入

## Lombok 使用
```java
@Data           // 简单 DTO
@Builder        // 复杂对象构建
@Slf4j          // 日志
@RequiredArgsConstructor  // 构造器注入
```

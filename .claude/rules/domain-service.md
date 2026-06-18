# 领域服务设计规范

> 包路径：`com.taotao.cloud.member.domain.service.*`

## 何时使用领域服务

### 适用场景
1. **跨聚合的业务逻辑** — 需要协调多个聚合
2. **无状态的计算服务** — 纯计算，不持有状态
3. **不属于任何单一聚合的业务概念**

### 不适用场景
1. **应该属于聚合根的行为**（如订单总价计算应在 Order 内）
2. **纯粹的技术性操作**（如发送邮件 → 应放在基础设施层）
3. **应用层的用例编排**（如创建订单流程 → 应放在 Application Service）

## 实现规范

### 1. 无状态设计
```java
@DomainService
public class MemberDomainService {
    // 只依赖其他无状态服务
    public MemberVal calculateMemberLevel(MemberAgg member, MemberGradePO grade) {
        // 纯计算逻辑
    }
}
```

### 2. 业务语义明确
```java
@DomainService
public class MemberWalletDomainService {
    public boolean canWithdraw(MemberWalletAgg wallet, Money amount) {
        return wallet.getBalance().compareTo(amount) >= 0;
    }

    public void transfer(MemberWalletAgg from, MemberWalletAgg to, Money amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
```

### 3. 异常处理
```java
@DomainService
public class MemberNoticeDomainService {
    public void sendNotice(MemberNoticeAgg notice) {
        if (notice.getContent() == null || notice.getContent().isBlank()) {
            throw new DomainException("通知内容不能为空");
        }
        notice.send();
    }
}
```

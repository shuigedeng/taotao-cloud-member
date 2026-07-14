# 聚合设计规范

> 针对 taotao-cloud-member 项目。包路径：`com.taotao.cloud.member.domain.aggregate.*`

## 聚合识别原则

### 1. 事务边界
聚合内修改必须在一个事务中完成，聚合间使用最终一致性。

```java
// ✅ 正确：聚合内行为
public class MemberAgg {
    public void updateProfile(String nickname, String avatar) {
        if (nickname == null || nickname.isBlank()) {
            throw new DomainException("昵称不能为空");
        }
        this.nickname = nickname;
        this.avatar = avatar;
        registerEvent(new MemberProfileUpdatedEvent(this.id, nickname, avatar));
    }
}
```

### 2. 小聚合原则
一个聚合根通常只包含 1-3 个实体。当前项目中的聚合：

| 聚合根 | 包含实体 | 值对象 |
|--------|---------|--------|
| MemberAgg | Member | MemberVal |
| MemberWalletAgg | MemberWallet | MemberWalletVal |
| MemberNoticeAgg | MemberNotice | MemberNoticeVal |

### 3. 聚合根方法设计

**命令方法**（状态变更，有业务语义）：
```java
public void addItem(...)    // 而不是 setItems(...)
public void submit()        // 而不是 setStatus(...)
public void cancel(reason)  // 而不是 setStatus(...)
```

**查询方法**（只读，不修改状态）：
```java
public boolean isPending() { return status == Status.PENDING; }
```

### 4. 不变性维护
聚合根必须在命令方法中校验业务规则：
```java
public void addItem(OrderItem item) {
    if (status != Status.PENDING) {
        throw new DomainException("只有待支付订单可以添加商品");
    }
    items.add(item);
}
```

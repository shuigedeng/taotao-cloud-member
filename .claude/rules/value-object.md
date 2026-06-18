# 值对象设计规范

> 包路径：`com.taotao.cloud.member.domain.valobj.*`。值对象命名以 `Val` 后缀（如 `MemberVal`, `MemberWalletVal`）。

## 核心特性

### 1. 不可变性
所有字段 `final`，无 setter 方法，构造时全部赋值。

```java
public final class MemberVal {
    private final String nickname;
    private final String avatar;
    private final Long points;

    public MemberVal(String nickname, String avatar, Long points) {
        this.nickname = nickname;
        this.avatar = avatar;
        this.points = points;
    }

    public String getNickname() { return nickname; }
    // 只有 getter，无 setter
}
```

### 2. 自验证
值对象在构造时必须验证自身有效性：

```java
public class Money {
    public Money(BigDecimal amount, Currency currency) {
        if (amount == null) {
            throw new DomainException("Amount cannot be null");
        }
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new DomainException("金额不能为负数");
        }
        this.amount = amount;
        this.currency = currency;
    }
}
```

### 3. 相等性基于属性
必须覆写 `equals()` 和 `hashCode()`，基于所有属性：

```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MemberVal)) return false;
    MemberVal memberVal = (MemberVal) o;
    return Objects.equals(nickname, memberVal.nickname);
}

@Override
public int hashCode() {
    return Objects.hash(nickname, avatar, points);
}
```

### 4. JPA 映射
使用 `@Embeddable` / `@Embedded` 映射：
```java
@Embeddable
public class MemberVal {
    private String nickname;
    private String avatar;
    // JPA 需要无参构造器
    protected MemberVal() {}
}
```

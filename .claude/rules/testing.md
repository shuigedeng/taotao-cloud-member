# 测试规范

## 测试层级

### 领域层测试（单元测试）
- 纯 POJO，无 Spring 上下文
- 测试聚合根行为、值对象验证、领域事件注册

```java
class MemberAggTest {
    @Test
    void shouldCreateMember() {
        MemberAgg member = MemberAgg.create("test_user", "13800138000");
        assertThat(member.getUsername()).isEqualTo("test_user");
        assertThat(member.getDomainEvents()).hasSize(1);
        assertThat(member.getDomainEvents().get(0))
            .isInstanceOf(MemberCreateEvent.class);
    }
}
```

### 应用层测试（集成测试）
- 使用 `@SpringBootTest` + `@Transactional`
- 测试用例编排、事务行为、DTO 转换

```java
@SpringBootTest
@Transactional
class MemberCommandServiceTest {
    @Autowired
    private MemberCommandService memberCommandService;

    @Test
    void shouldCreateMember() {
        CreateMemberCommand command = new CreateMemberCommand("test", "13800138000");
        MemberResult result = memberCommandService.create(command);
        assertThat(result.getId()).isNotNull();
    }
}
```

## 运行命令
```powershell
# 运行所有测试
gradlew test

# 运行指定模块测试
gradlew :taotao-cloud-member-domain:test

# 生成覆盖率报告
gradlew jacocoTestReport
```

## 覆盖率目标
- 指令覆盖率 ≥ 80%
- 领域层覆盖率 ≥ 90%
- 禁止在测试中使用 `@DirtiesContext`

# API 设计规范

> 本项目 API 位于 `com.taotao.cloud.member.api.*`（定义）和 `com.taotao.cloud.member.interfaces.controller.*`（实现）。

## Controller 四端分包

| 端 | 包路径 | 说明 |
|----|--------|------|
| 买家端 | `controller/buyer/` | 面向 C 端用户 |
| 卖家端 | `controller/seller/` | 面向商家 |
| 管理端 | `controller/manager/` | 面向平台管理员 |
| 内部 | `controller/inner/` | 其他微服务内部 Feign 调用 |

## RESTful 约定

### 资源命名
```java
@RequestMapping("/{role}/member/member")
// role = buyer | seller | manager
```

### HTTP 方法
| 方法 | 用途 | 示例 |
|------|------|------|
| GET | 查询 | `GET /buyer/member/member/page` |
| POST | 创建 | `POST /buyer/member/member` |
| PUT | 更新 | `PUT /buyer/member/member/{id}` |
| DELETE | 删除 | `DELETE /buyer/member/member/{id}` |

### 统一响应格式
使用 `Result<T>` 包装类：
```java
@GetMapping("/page")
public Result<PageResult<MemberSimpleResult>> page(MemberPageQuery query) {
    return Result.success(memberQueryService.pageQuery(query));
}

@PostMapping
public Result<MemberResult> create(@Valid @RequestBody CreateMemberCommand command) {
    return Result.success(memberCommandService.create(command));
}
```

## 参数校验
使用 `jakarta.validation` 注解：
```java
public record CreateMemberCommand(
    @NotBlank(message = "用户名不能为空")
    @Size(min = 2, max = 20, message = "用户名长度2-20")
    String username,

    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    String phone
) {}
```

## Knife4j 文档注解
```java
@Tag(name = "买家端-会员API")
@Operation(summary = "分页查询会员")
@Schema(description = "会员分页查询参数")
```

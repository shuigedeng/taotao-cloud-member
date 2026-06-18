---
name: event-storming
description: 事件风暴工作流，识别领域事件、命令和聚合
triggers:
  - "事件风暴"
  - "领域建模"
  - "识别聚合"
---

# 事件风暴工作流

## 步骤1：识别领域事件
针对会员领域，常见的领域事件：

| 领域事件 | 触发条件 | 订阅者 |
|---------|---------|--------|
| MemberCreateEvent | 用户注册 | 积分服务、通知服务 |
| MemberProfileUpdatedEvent | 修改资料 | 搜索服务 |
| MemberWalletCreateEvent | 开通钱包 | — |
| MemberWalletRechargeEvent | 充值 | 订单服务 |
| MemberLoginEvent | 登录 | 日志服务 |

## 步骤2：识别命令

| 命令 | 触发事件 | 执行者 |
|------|---------|--------|
| RegisterMember | MemberCreateEvent | 用户 |
| UpdateProfile | MemberProfileUpdatedEvent | 用户 |
| RechargeWallet | MemberWalletRechargeEvent | 用户/系统 |

## 步骤3：识别聚合

| 聚合根 | 实体 | 值对象 |
|--------|------|--------|
| MemberAgg | Member | MemberVal |
| MemberWalletAgg | MemberWallet | MemberWalletVal |
| MemberNoticeAgg | MemberNotice | MemberNoticeVal |

## 输出产物
生成 `docs/event-storming/` 目录：
- `domain-events.md` - 领域事件清单
- `aggregates.md` - 聚合设计文档
- `business-rules.md` - 业务规则文档

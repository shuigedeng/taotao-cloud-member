/*
 * Copyright (c) 2020-2030, Shuigedeng (981376577@qq.com & https://blog.taotaocloud.top/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.taotao.cloud.member.infrastructure.persistent.persistence;

import com.baomidou.mybatisplus.annotation.TableName;
import com.taotao.boot.webagg.entity.BaseSuperEntity;
import com.taotao.cloud.member.api.enums.DepositServiceTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 钱包变动日志表
 *
 * @author shuigedeng
 * @version 2021.10
 * @since 2022-03-11 15:43:36
 */
@Setter
@Getter
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = MemberWalletLogPO.TABLE_NAME)
@TableName(MemberWalletLogPO.TABLE_NAME)
@org.springframework.data.relational.core.mapping.Table(name = MemberWalletLogPO.TABLE_NAME)
public class MemberWalletLogPO extends BaseSuperEntity<MemberWalletLogPO, Long> {

    public static final String TABLE_NAME = "ttc_wallet_log";
    /** 会员id */
    @Column(name = "member_id", columnDefinition = "bigint not null comment '会员id'")
    private Long memberId;

    /** 会员id */
    @Column(name = "member_name", columnDefinition = "bigint not null comment '会员id'")
    private String memberName;

    /** 金额 */
    @Column(name = "money", columnDefinition = "decimal(10,2) not null comment '金额'")
    private BigDecimal money;

    /**
     * 业务类型
     *
     * @see DepositServiceTypeEnum
     */
    @Column(name = "service_type", columnDefinition = "varchar(32) not null comment '业务类型'")
    private String serviceType;

    /** 日志明细 */
    @Column(name = "detail", columnDefinition = "varchar(32) not null comment '日志明细'")
    private String detail;


}

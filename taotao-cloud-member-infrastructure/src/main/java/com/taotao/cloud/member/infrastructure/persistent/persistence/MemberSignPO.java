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
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 会员签到表
 *
 * @author shuigedeng
 * @version 2021.10
 * @since 2022-03-11 15:31:33
 */
@Setter
@Getter
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = MemberSignPO.TABLE_NAME)
@TableName(MemberSignPO.TABLE_NAME)
@org.springframework.data.relational.core.mapping.Table(name = MemberSignPO.TABLE_NAME)
public class MemberSignPO extends BaseSuperEntity<MemberSignPO, Long> {

    public static final String TABLE_NAME = "ttc_member_sign";

    /** 会员用户名 */
    @Column(name = "member_ame", columnDefinition = "varchar(32) not null comment '会员用户名'")
    private String memberName;

    /** 会员用户ID */
    @Column(name = "member_id", columnDefinition = "bigint not null comment '会员用户ID'")
    private Long memberId;

    /** 连续签到天数 */
    @Column(name = "sign_day", columnDefinition = "int not null default 0 comment '连续签到天数'")
    private Integer signDay;
}

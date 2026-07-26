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

package com.taotao.cloud.member.api.inner.request;

import com.taotao.boot.common.model.ddd.types.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/** 会员余额变动模型 */
@Setter
@Getter
@ToString

@AllArgsConstructor
@NoArgsConstructor
public class MemberWalletUpdateApiRequest implements Command {

    @Schema(description = "变动金额")
    private BigDecimal money;

    @Schema(description = "变动会员id")
    private Long memberId;

    @Schema(description = "日志详情")
    private String detail;

    /**
     * @see DepositServiceTypeEnum
     */
    @Schema(description = "变动业务原因")
    private String serviceType;

    /**
     * 获取
     *
     * @return BigDecimal
     * @since 2022.03
     */

    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money money
     * @return 无返回值
     * @since 2022.03
     */

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */

    public Long getMemberId() {
        return memberId;
    }

    /**
     * 设置
     *
     * @param memberId memberId
     * @return 无返回值
     * @since 2022.03
     */

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */

    public String getDetail() {
        return detail;
    }

    /**
     * 设置
     *
     * @param detail detail
     * @return 无返回值
     * @since 2022.03
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */

    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置
     *
     * @param serviceType serviceType
     * @return 无返回值
     * @since 2022.03
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}

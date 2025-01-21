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

package com.taotao.cloud.member.api.feign.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/** 会员搜索VO */
@Data
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "会员搜索VO")
public class MemberRechargeApiResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = -7605952923416404638L;

    /** 充值订单编号 */
    private String rechargeSn;
    /** 会员id */
    private Long memberId;
    /** 会员名称 */
    private String memberName;
    /** 充值金额 */
    private BigDecimal rechargeMoney;
    /** 充值方式，如：支付宝，微信不能为空 */
    private String rechargeWay;
    /** 支付状态 */
    private String payStatus;
    /** 支付插件id */
    private String paymentPluginId;
    /** 第三方流水 */
    private String receivableNo;
    /** 支付时间 */
    private LocalDateTime payTime;

	public String getRechargeSn() {
		return rechargeSn;
	}

	public void setRechargeSn(String rechargeSn) {
		this.rechargeSn = rechargeSn;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public BigDecimal getRechargeMoney() {
		return rechargeMoney;
	}

	public void setRechargeMoney(BigDecimal rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPaymentPluginId() {
		return paymentPluginId;
	}

	public void setPaymentPluginId(String paymentPluginId) {
		this.paymentPluginId = paymentPluginId;
	}

	public String getReceivableNo() {
		return receivableNo;
	}

	public void setReceivableNo(String receivableNo) {
		this.receivableNo = receivableNo;
	}

	public LocalDateTime getPayTime() {
		return payTime;
	}

	public void setPayTime(LocalDateTime payTime) {
		this.payTime = payTime;
	}
}

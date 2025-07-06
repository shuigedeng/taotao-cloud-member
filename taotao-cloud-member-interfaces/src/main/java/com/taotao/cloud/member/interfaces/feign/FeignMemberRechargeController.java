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

package com.taotao.cloud.member.interfaces.feign;

import com.taotao.boot.common.model.FeignRequest;
import com.taotao.boot.common.model.FeignResponse;
import com.taotao.boot.webagg.controller.FeignController;
import com.taotao.cloud.member.api.feign.MemberRechargeApi;
import com.taotao.cloud.member.api.feign.request.MemberRechargeQueryApiRequest;
import com.taotao.cloud.member.api.feign.response.BooleanApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberRechargeApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.dromara.hutool.core.date.DateTime;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * 店铺端,管理员API
 *
 * @since 2020/11/16 10:57
 */
@AllArgsConstructor
@Validated
@RestController
@Tag(name = "内部调用端-会员充值API", description = "内部调用端-会员充值API")
public class FeignMemberRechargeController extends FeignController implements MemberRechargeApi {

	@Override
	public FeignResponse<BooleanApiResponse> paySuccess(
		FeignRequest<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
		return null;
	}

	@Override
	public FeignResponse<MemberRechargeApiResponse> getRecharge(
		FeignRequest<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
		return null;
	}

	@Override
	public FeignResponse<MemberRechargeApiResponse> recharge(
		FeignRequest<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
		return null;
	}

	@Override
	public FeignResponse<List<MemberRechargeApiResponse>> list(
		FeignRequest<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
		return null;
	}

	@Override
	public FeignResponse<BooleanApiResponse> rechargeOrderCancel(
		FeignRequest<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
		return null;
	}
}

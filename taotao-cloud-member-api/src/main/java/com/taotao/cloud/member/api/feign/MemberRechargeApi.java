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

package com.taotao.cloud.member.api.feign;

import com.taotao.boot.common.constant.ServiceNameConstants;
import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.Response;
import com.taotao.cloud.member.api.feign.fallback.MemberRechargeApiFallback;
import com.taotao.cloud.member.api.feign.request.MemberRechargeQueryApiRequest;
import com.taotao.cloud.member.api.feign.response.BooleanApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberRechargeApiResponse;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 远程调用会员用户模块
 *
 * @author shuigedeng
 * @version 2022.04
 * @since 2022-04-25 16:37:54
 */
@FeignClient(
        value = ServiceNameConstants.TAOTAO_CLOUD_MEMBER,
        contextId = "MemberRechargeApi",
        fallbackFactory = MemberRechargeApiFallback.class)
public interface MemberRechargeApi {

    @PostMapping(value = "/member/feign/recharge/paySuccess")
    Response<BooleanApiResponse> paySuccess(
            @Validated @RequestBody
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest);

    @PostMapping(value = "/member/feign/recharge/getRecharge")
    Response<MemberRechargeApiResponse> getRecharge(
            @Validated @RequestBody
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest);

    @PostMapping(value = "/member/feign/recharge/recharge")
    Response<MemberRechargeApiResponse> recharge(
            @Validated @RequestBody
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest);

    @PostMapping(value = "/member/feign/recharge/list")
    Response<List<MemberRechargeApiResponse>> list(
            @Validated @RequestBody
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest);

    @PostMapping(value = "/member/feign/recharge/rechargeOrderCancel")
    Response<BooleanApiResponse> rechargeOrderCancel(
            @Validated @RequestBody
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest);
}

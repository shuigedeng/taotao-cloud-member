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

package com.taotao.cloud.member.api.client;

import com.taotao.boot.common.constant.ServiceNameConstants;
import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.Response;
import com.taotao.cloud.member.api.client.fallback.MemberWalletApiFallback;
import com.taotao.cloud.member.api.client.request.MemberWalletQueryApiRequest;
import com.taotao.cloud.member.api.client.request.MemberWalletUpdateApiRequest;
import com.taotao.cloud.member.api.client.response.BooleanApiResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange(value = ServiceNameConstants.TAOTAO_CLOUD_MEMBER)
public interface MemberWalletApi {

    @PostExchange(value = "/member/feign/wallet/increase")
    Response<BooleanApiResponse> increase(
            @Validated @RequestBody
                    Request<MemberWalletUpdateApiRequest> memberWalletUpdateApiRequest);

    @PostExchange(value = "/member/feign/recharge/save")
    Response<BooleanApiResponse> save(
            @Validated @RequestBody
                    Request<MemberWalletQueryApiRequest> memberWalletQueryApiRequest);
}

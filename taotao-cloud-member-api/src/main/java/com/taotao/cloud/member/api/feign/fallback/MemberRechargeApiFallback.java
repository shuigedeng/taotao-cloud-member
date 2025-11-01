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

package com.taotao.cloud.member.api.feign.fallback;

import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.Response;
import com.taotao.cloud.member.api.feign.MemberRechargeApi;
import com.taotao.cloud.member.api.feign.request.MemberRechargeQueryApiRequest;
import com.taotao.cloud.member.api.feign.response.BooleanApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberRechargeApiResponse;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * RemoteMemberFallbackImpl
 *
 * @author shuigedeng
 * @version 2022.03
 * @since 2020/11/20 下午4:10
 */
public class MemberRechargeApiFallback implements FallbackFactory<MemberRechargeApi> {

    @Override
    public MemberRechargeApi create(Throwable throwable) {
        return new MemberRechargeApi() {
            @Override
            public Response<BooleanApiResponse> paySuccess(
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
                return null;
            }

            @Override
            public Response<MemberRechargeApiResponse> getRecharge(
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
                return null;
            }

            @Override
            public Response<MemberRechargeApiResponse> recharge(
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
                return null;
            }

            @Override
            public Response<MemberRechargeApiResponse> list(
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
                return null;
            }

            @Override
            public Response<BooleanApiResponse> rechargeOrderCancel(
                    Request<MemberRechargeQueryApiRequest> memberRechargeQueryApiRequest) {
                return null;
            }
        };
    }
}

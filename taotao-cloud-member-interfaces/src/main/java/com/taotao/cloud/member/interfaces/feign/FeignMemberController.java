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

import com.taotao.boot.common.model.BaseSecurityUser;
import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.BatchResponse;
import com.taotao.boot.common.model.response.Response;
import com.taotao.boot.webagg.controller.FeignController;
import com.taotao.cloud.member.api.inner.MemberApi;
import com.taotao.cloud.member.api.inner.request.MemberApiRequest;
import com.taotao.cloud.member.api.inner.response.BooleanApiResponse;
import com.taotao.cloud.member.api.inner.response.MemberApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * 店铺端,管理员API
 *
 * @since 2020/11/16 10:57
 */
@RequiredArgsConstructor
@Validated
@RestController
@Tag(name = "内部调用端-会员API", description = "内部调用端-会员API")
public class FeignMemberController extends FeignController implements MemberApi {

//    @Override
//    public Response<BaseSecurityUser> getMemberSecurityUser(
//            Request<MemberApiRequest> memberApiRequest) {
//        return null;
//    }

    @Override
    public Response<MemberApiResponse> findMemberById(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }

    @Override
    public Response<BooleanApiResponse> updateMemberPoint(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }

    @Override
    public Response<MemberApiResponse> findByUsername(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }

    @Override
    public Response<MemberApiResponse> getById(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }

    @Override
    public Response<BooleanApiResponse> update(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }

    @Override
    public Response<BooleanApiResponse> updateById(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }

    @Override
    public Response<BatchResponse<Map<String, Object>>> listFieldsByMemberIds(
            Request<MemberApiRequest> memberApiRequest) {
        return null;
    }
}

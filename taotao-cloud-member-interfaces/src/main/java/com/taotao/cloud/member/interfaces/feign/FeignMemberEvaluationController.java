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

import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.BatchResponse;
import com.taotao.boot.common.model.response.PageResponse;
import com.taotao.boot.common.model.response.Response;
import com.taotao.boot.common.model.result.PageResult;
import com.taotao.boot.webagg.controller.FeignController;
import com.taotao.cloud.member.api.inner.MemberEvaluationApi;
import com.taotao.cloud.member.api.inner.request.EvaluationPageQueryApiRequest;
import com.taotao.cloud.member.api.inner.request.MemberEvaluationApiRequest;
import com.taotao.cloud.member.api.inner.response.BooleanApiResponse;
import com.taotao.cloud.member.api.inner.response.MemberEvaluationApiResponse;
import com.taotao.cloud.member.api.inner.response.MemberEvaluationListApiResponse;
import com.taotao.cloud.member.api.inner.response.StoreRatingApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * 店铺端,管理员API
 *
 * @since 2020/11/16 10:57
 */
@AllArgsConstructor
@Validated
@RestController
@Tag(name = "内部调用端-管理员API", description = "内部调用端-管理员API")
public class FeignMemberEvaluationController extends FeignController
        implements MemberEvaluationApi {

    @Override
    public Response<MemberEvaluationApiResponse> count(
            Request<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public Response<MemberEvaluationApiResponse> getEvaluationCount(
            Request<EvaluationPageQueryApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public Response<BatchResponse<Map<String, Object>>> memberEvaluationNum() {
        return null;
    }

    @Override
    public Response<BooleanApiResponse> addMemberEvaluation(
            Request<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public Response<StoreRatingApiResponse> getStoreRatingVO(
            Request<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public Response<MemberEvaluationApiResponse> queryById(
            Request<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public Response<BooleanApiResponse> reply(
            Request<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public Response<PageResponse<MemberEvaluationListApiResponse>> queryPage(
            Request<EvaluationPageQueryApiRequest> memberEvaluationApiRequest) {
        return null;
    }
}

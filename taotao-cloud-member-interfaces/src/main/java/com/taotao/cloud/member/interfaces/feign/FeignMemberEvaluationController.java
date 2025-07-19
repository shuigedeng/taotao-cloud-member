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
import com.taotao.boot.common.model.PageResult;
import com.taotao.boot.webagg.controller.FeignController;
import com.taotao.cloud.member.api.feign.MemberEvaluationApi;
import com.taotao.cloud.member.api.feign.request.EvaluationPageQueryApiRequest;
import com.taotao.cloud.member.api.feign.request.MemberEvaluationApiRequest;
import com.taotao.cloud.member.api.feign.response.BooleanApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberEvaluationApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberEvaluationListApiResponse;
import com.taotao.cloud.member.api.feign.response.StoreRatingApiResponse;
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
    public FeignResponse<MemberEvaluationApiResponse> count(
            FeignRequest<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public FeignResponse<MemberEvaluationApiResponse> getEvaluationCount(
            FeignRequest<EvaluationPageQueryApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public FeignResponse<List<Map<String, Object>>> memberEvaluationNum() {
        return null;
    }

    @Override
    public FeignResponse<BooleanApiResponse> addMemberEvaluation(
            FeignRequest<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public FeignResponse<StoreRatingApiResponse> getStoreRatingVO(
            FeignRequest<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public FeignResponse<MemberEvaluationApiResponse> queryById(
            FeignRequest<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public FeignResponse<BooleanApiResponse> reply(
            FeignRequest<MemberEvaluationApiRequest> memberEvaluationApiRequest) {
        return null;
    }

    @Override
    public FeignResponse<PageResult<MemberEvaluationListApiResponse>> queryPage(
            FeignRequest<EvaluationPageQueryApiRequest> memberEvaluationApiRequest) {
        return null;
    }
}

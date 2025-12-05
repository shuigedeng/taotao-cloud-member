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
import com.taotao.boot.common.model.response.BatchResponse;
import com.taotao.boot.common.model.response.PageResponse;
import com.taotao.boot.common.model.response.Response;
import com.taotao.boot.common.model.result.Result;
import com.taotao.cloud.member.api.client.fallback.MemberEvaluationApiFallback;
import com.taotao.cloud.member.api.client.request.EvaluationPageQueryApiRequest;
import com.taotao.cloud.member.api.client.request.MemberEvaluationApiRequest;
import com.taotao.cloud.member.api.client.response.BooleanApiResponse;
import com.taotao.cloud.member.api.client.response.MemberEvaluationApiResponse;
import com.taotao.cloud.member.api.client.response.MemberEvaluationListApiResponse;
import com.taotao.cloud.member.api.client.response.StoreRatingApiResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.Map;

/**
 * 远程调用会员用户模块
 *
 * @author shuigedeng
 * @version 2022.04
 * @since 2022-04-25 16:37:49
 */
@HttpExchange(value = ServiceNameConstants.TAOTAO_CLOUD_MEMBER)
public interface MemberEvaluationApi {

    /**
     * LambdaQueryWrapper<MemberEvaluation> goodEvaluationQueryWrapper = new LambdaQueryWrapper<>();
     * goodEvaluationQueryWrapper.eq(MemberEvaluation::getId, goodsId);
     * goodEvaluationQueryWrapper.eq(MemberEvaluation::getGrade, EvaluationGradeEnum.GOOD.name());
     *
     * @param goodsId 商品id
     * @param name    名字
     * @return {@link Result }<{@link Long }>
     * @since 2022-04-25 16:39:41
     */
    @PostExchange(value = "/member/feign/evaluation")
    Response<MemberEvaluationApiResponse> count(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    /**
     * 得到评价数
     *
     * @param queryParams 查询参数
     * @return {@link Result }<{@link Long }>
     * @since 2022-04-25 16:39:46
     */
    @PostExchange(value = "/member/feign/evaluationPageQuery")
    Response<MemberEvaluationApiResponse> getEvaluationCount(
            @Validated @RequestBody
                    Request<EvaluationPageQueryApiRequest> memberEvaluationApiRequest);

    @PostExchange(value = "/member/feign/memberEvaluationNum")
    Response<BatchResponse<Map<String, Object>>> memberEvaluationNum();

    @PostExchange(value = "/member/feign/memberEvaluationDTO")
    Response<BooleanApiResponse> addMemberEvaluation(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostExchange(value = "/member/feign/evaluation/getStoreRatingVO")
    Response<StoreRatingApiResponse> getStoreRatingVO(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostExchange(value = "/member/feign/evaluation/queryById")
    Response<MemberEvaluationApiResponse> queryById(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostExchange(value = "/member/feign/evaluation/reply")
    Response<BooleanApiResponse> reply(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostExchange(value = "/member/feign/evaluation/queryPage")
    Response<PageResponse<MemberEvaluationListApiResponse>> queryPage(
            @Validated @RequestBody
                    Request<EvaluationPageQueryApiRequest> memberEvaluationApiRequest);
}

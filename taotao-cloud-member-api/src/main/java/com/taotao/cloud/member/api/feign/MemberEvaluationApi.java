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
import com.taotao.boot.common.model.result.PageResult;
import com.taotao.boot.common.model.result.Result;
import com.taotao.cloud.member.api.feign.fallback.MemberEvaluationApiFallback;
import com.taotao.cloud.member.api.feign.request.EvaluationPageQueryApiRequest;
import com.taotao.cloud.member.api.feign.request.MemberEvaluationApiRequest;
import com.taotao.cloud.member.api.feign.response.BooleanApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberEvaluationApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberEvaluationListApiResponse;
import com.taotao.cloud.member.api.feign.response.StoreRatingApiResponse;
import java.util.List;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 远程调用会员用户模块
 *
 * @author shuigedeng
 * @version 2022.04
 * @since 2022-04-25 16:37:49
 */
@FeignClient(
        value = ServiceNameConstants.TAOTAO_CLOUD_MEMBER,
        contextId = "MemberEvaluationApi",
        fallbackFactory = MemberEvaluationApiFallback.class)
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
    @PostMapping(value = "/member/feign/evaluation")
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
    @PostMapping(value = "/member/feign/evaluationPageQuery")
    Response<MemberEvaluationApiResponse> getEvaluationCount(
            @Validated @RequestBody
                    Request<EvaluationPageQueryApiRequest> memberEvaluationApiRequest);

    @PostMapping(value = "/member/feign/memberEvaluationNum")
    Response<List<Map<String, Object>>> memberEvaluationNum();

    @PostMapping(value = "/member/feign/memberEvaluationDTO")
    Response<BooleanApiResponse> addMemberEvaluation(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostMapping(value = "/member/feign/evaluation/getStoreRatingVO")
    Response<StoreRatingApiResponse> getStoreRatingVO(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostMapping(value = "/member/feign/evaluation/queryById")
    Response<MemberEvaluationApiResponse> queryById(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostMapping(value = "/member/feign/evaluation/reply")
    Response<BooleanApiResponse> reply(
            @Validated @RequestBody
                    Request<MemberEvaluationApiRequest> memberEvaluationApiRequest);

    @PostMapping(value = "/member/feign/evaluation/queryPage")
    Response<PageResult<MemberEvaluationListApiResponse>> queryPage(
            @Validated @RequestBody
                    Request<EvaluationPageQueryApiRequest> memberEvaluationApiRequest);
}

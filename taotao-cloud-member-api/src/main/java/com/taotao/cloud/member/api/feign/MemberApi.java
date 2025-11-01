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
import com.taotao.boot.common.model.BaseSecurityUser;
import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.BatchResponse;
import com.taotao.boot.common.model.response.Response;
import com.taotao.boot.common.model.result.Result;
import com.taotao.cloud.member.api.feign.fallback.MemberApiFallback;
import com.taotao.cloud.member.api.feign.request.MemberApiRequest;
import com.taotao.cloud.member.api.feign.response.BooleanApiResponse;
import com.taotao.cloud.member.api.feign.response.MemberApiResponse;
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
 * @since 2022-04-25 16:37:54
 */
@FeignClient(
        value = ServiceNameConstants.TAOTAO_CLOUD_MEMBER,
        contextId = "MemberApi",
        fallbackFactory = MemberApiFallback.class)
public interface MemberApi {

//    /**
//     * 通过用户名查询用户包括角色权限等
//     *
//     * @param nicknameOrUserNameOrPhoneOrEmail 用户名
//     * @return 用户信息
//     * @since 2020/4/29 17:48
//     */
//    @PostMapping(value = "/member/feign/info/security")
//    Response<BaseSecurityUser> getMemberSecurityUser(
//            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    /**
     * 根据id查询会员信息
     *
     * @param id id
     * @return 会员信息
     * @since 2020/11/20 下午4:10
     */
    @PostMapping("/member/feign/info/id/{id:[0-9]*}")
    Response<MemberApiResponse> findMemberById(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    /**
     * 更新成员点
     *
     * @param payPoint 支付点
     * @param name     名字
     * @param memberId 成员身份
     * @param s        年代
     * @return {@link Result }<{@link Boolean }>
     * @since 2022-04-25 16:41:42
     */
    @PostMapping(value = "/member/feign/updateMemberPoint")
    Response<BooleanApiResponse> updateMemberPoint(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostMapping(value = "/member/feign/username")
    Response<MemberApiResponse> findByUsername(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostMapping(value = "/member/feign/memberId")
    Response<MemberApiResponse> getById(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    /**
     * new LambdaUpdateWrapper<Member>() .eq(Member::getId, member.getId()) .set(Member::getHaveStore, true)
     * .set(Member::getStoreId, store.getId())
     */
    @PostMapping(value = "/member/feign/memberId/storeId")
    Response<BooleanApiResponse> update(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostMapping(value = "/member/feign/updateById")
    Response<BooleanApiResponse> updateById(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostMapping(value = "/member/feign/listFieldsByMemberIds")
    Response<BatchResponse<Map<String, Object>>> listFieldsByMemberIds(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);
}

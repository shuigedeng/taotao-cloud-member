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

package com.taotao.cloud.member.api.inner;

import com.taotao.boot.common.constant.ServiceNameConstants;
import com.taotao.boot.common.model.request.Request;
import com.taotao.boot.common.model.response.BatchResponse;
import com.taotao.boot.common.model.response.Response;
import com.taotao.boot.common.model.result.Result;
import com.taotao.cloud.member.api.inner.request.MemberApiRequest;
import com.taotao.cloud.member.api.inner.response.BooleanApiResponse;
import com.taotao.cloud.member.api.inner.response.MemberApiResponse;
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
 * @since 2022-04-25 16:37:54
 */
@HttpExchange(value = ServiceNameConstants.TAOTAO_CLOUD_MEMBER)
public interface MemberApi {

//    /**
//     * 通过用户名查询用户包括角色权限等
//     *
//     * @param nicknameOrUserNameOrPhoneOrEmail 用户名
//     * @return 用户信息
//     * @since 2020/4/29 17:48
//     */
//    @PostExchange(value = "/member/info/security")
//    Response<BaseSecurityUser> getMemberSecurityUser(
//            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    /**
     * 根据id查询会员信息
     *
     * @param id id
     * @return 会员信息
     * @since 2020/11/20 下午4:10
     */
    @PostExchange("/member/info/id/{id:[0-9]*}")
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
    @PostExchange(value = "/member/updateMemberPoint")
    Response<BooleanApiResponse> updateMemberPoint(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostExchange(value = "/member/username")
    Response<MemberApiResponse> findByUsername(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostExchange(value = "/member/memberId")
    Response<MemberApiResponse> getById(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    /**
     * new LambdaUpdateWrapper<Member>() .eq(Member::getId, member.getId()) .set(Member::getHaveStore, true)
     * .set(Member::getStoreId, store.getId())
     */
    @PostExchange(value = "/member/memberId/storeId")
    Response<BooleanApiResponse> update(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostExchange(value = "/member/updateById")
    Response<BooleanApiResponse> updateById(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);

    @PostExchange(value = "/member/listFieldsByMemberIds")
    Response<BatchResponse<Map<String, Object>>> listFieldsByMemberIds(
            @Validated @RequestBody Request<MemberApiRequest> memberApiRequest);
}

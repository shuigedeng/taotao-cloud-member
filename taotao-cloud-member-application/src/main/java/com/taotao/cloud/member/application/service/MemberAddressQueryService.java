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

package com.taotao.cloud.member.application.service;

import com.taotao.boot.ddd.model.application.service.CommandService;

/**
 * 收货地址业务层
 */
public interface MemberAddressQueryService extends CommandService {

	/**
	 * 根据会员获取会员地址分页列表
	 *
	 * @param page     分页条件
	 * @param memberId 会员ID
	 * @return 会员地址分页列表
	 */
//	IPage<MemberAddressPO> queryPage(PageQuery page, Long memberId);

	/**
	 * 根据地址ID获取当前会员地址信息
	 *
	 * @param id 地址ID
	 * @return 当前会员的地址信息
	 */
//	MemberAddressPO getMemberAddress(Long id);

	/**
	 * 根据地址ID获取当前会员地址信息
	 *
	 * @return 当前会员的地址信息
	 */
//	MemberAddressPO getDefaultMemberAddress();

	/**
	 * 添加会员收货地址
	 *
	 * @param memberAddressPO 收货地址
	 * @return 操作状态
	 */
//	Boolean saveMemberAddress(MemberAddressPO memberAddressPO);

	/**
	 * 修改会员收货地址信息
	 *
	 * @param memberAddressPO 收货地址
	 * @return 操作状态
	 */
//	Boolean updateMemberAddress(MemberAddressPO memberAddressPO);

	/**
	 * 删除会员收货地址信息
	 *
	 * @param id 收货地址ID
	 * @return 操作状态
	 */
	Boolean removeMemberAddress(Long id);
}

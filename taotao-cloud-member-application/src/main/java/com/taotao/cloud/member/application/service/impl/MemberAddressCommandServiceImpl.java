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

package com.taotao.cloud.member.application.service.impl;

import com.taotao.cloud.member.application.service.MemberAddressCommandService;
import org.springframework.stereotype.Service;

/**
 * 收货地址业务层实现
 *
 * @author shuigedeng
 * @version 2022.06
 * @since 2022-05-31 13:55:30
 */
@Service
public class MemberAddressCommandServiceImpl implements MemberAddressCommandService {
    //	@Override
    //	public IPage<MemberAddressPO> queryPage(PageQuery page, Long memberId) {
    //		return null;
    //	}
    //
    //	@Override
    //	public MemberAddressPO getMemberAddress(Long id) {
    //		return null;
    //	}
    //
    //	@Override
    //	public MemberAddressPO getDefaultMemberAddress() {
    //		return null;
    //	}
    //
    //	@Override
    //	public Boolean saveMemberAddress(MemberAddressPO memberAddressPO) {
    //		return null;
    //	}
    //
    //	@Override
    //	public Boolean updateMemberAddress(MemberAddressPO memberAddressPO) {
    //		return null;
    //	}

    @Override
    public Boolean removeMemberAddress(Long id) {
        return null;
    }

    // @DubboReference
    // private IDubboUserRpc userRpc;
    //
    // @Override
    // public IPage<MemberAddressPO> queryPage(PageQuery page, Long memberId) {
    //	LambdaQueryWrapper<MemberAddressPO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    //	lambdaQueryWrapper.eq(MemberAddressPO::getMemberId, memberId);
    //	return this.page(page.buildMpPage(), lambdaQueryWrapper);
    // }
    //
    // @Override
    // public MemberAddressPO getMemberAddress(Long id) {
    //	LambdaQueryWrapper<MemberAddressPO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    //	lambdaQueryWrapper.eq(MemberAddressPO::getMemberId, SecurityUtils.getUserId());
    //	lambdaQueryWrapper.eq(MemberAddressPO::getId, id);
    //	return this.getOne(lambdaQueryWrapper);
    // }
    //
    // @Override
    // public MemberAddressPO getDefaultMemberAddress() {
    //	LambdaQueryWrapper<MemberAddressPO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    //	lambdaQueryWrapper.eq(MemberAddressPO::getMemberId, SecurityUtils.getUserId());
    //	lambdaQueryWrapper.eq(MemberAddressPO::getDefaulted, true);
    //	return this.getOne(lambdaQueryWrapper);
    // }
    //
    // @Override
    // @Transactional(rollbackFor = Exception.class)
    // public Boolean saveMemberAddress(MemberAddressPO memberAddressPO) {
    //	// 判断当前地址是否为默认地址，如果为默认需要将其他的地址修改为非默认
    //	removeDefaultAddress(memberAddressPO);
    //
    //	// 添加会员地址
    //	return this.save(memberAddressPO);
    // }
    //
    // @Override
    // @Transactional(rollbackFor = Exception.class)
    // public Boolean updateMemberAddress(MemberAddressPO memberAddressPO) {
    //	MemberAddressPO originalMemberAddressPO = this.getMemberAddress(memberAddressPO.getId());
    //
    //	if (originalMemberAddressPO != null && originalMemberAddressPO.getMemberId()
    //		.equals(SecurityUtils.getUserId())) {
    //		if (memberAddressPO.getDefaulted() == null) {
    //			memberAddressPO.setDefaulted(false);
    //		}
    //
    //		// 判断当前地址是否为默认地址，如果为默认需要将其他的地址修改为非默认
    //		removeDefaultAddress(memberAddressPO);
    //		this.saveOrUpdate(memberAddressPO);
    //	}
    //
    //	return true;
    // }
    //
    // @Override
    // @Transactional(rollbackFor = Exception.class)
    // public Boolean removeMemberAddress(Long id) {
    //	LambdaQueryWrapper<MemberAddressPO> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    //	lambdaQueryWrapper.eq(MemberAddressPO::getId, id);
    //	return this.remove(lambdaQueryWrapper);
    // }
    //
    /// **
    // * 修改会员默认收件地址
    // *
    // * @param memberAddressPO 收件地址
    // */
    // private void removeDefaultAddress(MemberAddressPO memberAddressPO) {
    //	// 如果不是默认地址不需要处理
    //	if (Boolean.TRUE.equals(memberAddressPO.getDefaulted())) {
    //		// 将会员的地址修改为非默认地址
    //		LambdaUpdateWrapper<MemberAddressPO> lambdaUpdateWrapper = Wrappers.lambdaUpdate();
    //		lambdaUpdateWrapper.set(MemberAddressPO::getDefaulted, false);
    //		lambdaUpdateWrapper.eq(MemberAddressPO::getMemberId, memberAddressPO.getMemberId());
    //		this.update(lambdaUpdateWrapper);
    //	}
    // }
}

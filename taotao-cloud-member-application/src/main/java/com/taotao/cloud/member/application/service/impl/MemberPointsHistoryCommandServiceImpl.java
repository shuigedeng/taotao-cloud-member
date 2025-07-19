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

import com.taotao.cloud.member.application.service.MemberCommandService;
import com.taotao.cloud.member.application.service.MemberPointsHistoryCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 会员积分历史业务层实现
 *
 * @author shuigedeng
 * @version 2023.01
 * @since 2023-02-01 13:48:04
 */
@Service
public class MemberPointsHistoryCommandServiceImpl implements MemberPointsHistoryCommandService {

    @Autowired private MemberCommandService memberCommandService;

    //	@Override
    //	public IPage<MemberPointsHistoryPO> pageQuery(PageQuery pageQuery) {
    //		return null;
    //	}
    //
    //	@Override
    //	public IPage<MemberPointsHistoryPO> memberPointsHistoryPageQuery(PageQuery pageQuery, Long
    // memberId, String memberName) {
    //		return null;
    //	}
    //
    // @Override
    // public MemberPointsHistoryVO getMemberPointsHistoryVO(Long memberId) {
    //	// 获取会员积分历史
    //	Member member = memberCommandService.getById(memberId);
    //
    //	MemberPointsHistoryVO memberPointsHistoryVO = new MemberPointsHistoryVO();
    //	if (member != null) {
    //		memberPointsHistoryVO.setPoint(member.getPoint());
    //		memberPointsHistoryVO.setTotalPoint(member.getTotalPoint());
    //		return memberPointsHistoryVO;
    //	}
    //	return new MemberPointsHistoryVO();
    // }
    //
    // @Override
    // public IPage<MemberPointsHistoryPO> pageQuery(PageQuery pageQuery) {
    //	LambdaQueryWrapper<MemberPointsHistoryPO> queryWrapper = Wrappers.lambdaQuery();
    //	queryWrapper.eq(MemberPointsHistoryPO::getMemberId, SecurityUtils.getUserId());
    //	queryWrapper.orderByDesc(MemberPointsHistoryPO::getCreateTime);
    //	return this.page(pageQuery.buildMpPage(), queryWrapper);
    // }
    //
    // @Override
    // public IPage<MemberPointsHistoryPO> memberPointsHistoryPageQuery(
    //	PageQuery pageQuery, Long memberId, String memberName) {
    //	LambdaQueryWrapper<MemberPointsHistoryPO> lambdaQueryWrapper = new
    // LambdaQueryWrapper<MemberPointsHistoryPO>()
    //		.eq(memberId != null, MemberPointsHistoryPO::getMemberId, memberId)
    //		.like(memberName != null, MemberPointsHistoryPO::getMemberName, memberName);
    //
    //	// 如果排序为空，则默认创建时间倒序
    //	if (StringUtils.isNotBlank(pageQuery.getSort())) {
    //		pageQuery.setSort("createTime");
    //		pageQuery.setOrder("desc");
    //	}
    //	return this.page(pageQuery.buildMpPage(), lambdaQueryWrapper);
    // }
}

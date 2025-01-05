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

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taotao.boot.common.exception.BusinessException;
import com.taotao.boot.common.model.PageQuery;
import com.taotao.cloud.member.application.service.MemberGoodsCollectionCommandService;
import com.taotao.cloud.member.infrastructure.persistent.mapper.GoodsCollectionMapper;
import com.taotao.cloud.member.infrastructure.persistent.persistence.MemberGoodsCollectionPO;
import com.taotao.boot.security.spring.utils.SecurityUtils;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 会员收藏业务层实现
 *
 * @since 2020/11/18 2:25 下午
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MemberGoodsCollectionCommandServiceImpl extends
	ServiceImpl<GoodsCollectionMapper, MemberGoodsCollectionPO>
	implements MemberGoodsCollectionCommandService {

	@Override
	public IPage<GoodsCollectionVO> goodsCollection(PageQuery pageQuery) {
		QueryWrapper<GoodsCollectionVO> queryWrapper = Wrappers.query();
		queryWrapper.eq("gc.member_id", SecurityUtils.getUserId());
		queryWrapper.groupBy("gc.id");
		queryWrapper.orderByDesc("gc.create_time");
		return this.baseMapper.goodsCollectionVOList(pageQuery.buildMpPage(), queryWrapper);
	}

	@Override
	public Boolean isCollection(Long skuId) {
		LambdaQueryWrapper<MemberGoodsCollectionPO> queryWrapper = Wrappers.lambdaQuery();
		queryWrapper.eq(MemberGoodsCollectionPO::getMemberId, SecurityUtils.getUserId());
		queryWrapper.eq(skuId != null, MemberGoodsCollectionPO::getSkuId, skuId);
		return Optional.ofNullable(this.getOne(queryWrapper)).isPresent();
	}

	@Override
	public Boolean addGoodsCollection(Long skuId) {
		MemberGoodsCollectionPO memberGoodsCollectionPO = this.getOne(
			new LambdaUpdateWrapper<MemberGoodsCollectionPO>()
				.eq(MemberGoodsCollectionPO::getMemberId, SecurityUtils.getUserId())
				.eq(MemberGoodsCollectionPO::getSkuId, skuId));

		if (memberGoodsCollectionPO == null) {
			memberGoodsCollectionPO = new MemberGoodsCollectionPO(SecurityUtils.getUserId(), skuId);
			return this.save(memberGoodsCollectionPO);
		}
		throw new BusinessException("用户不存在");
	}

	@Override
	public Boolean deleteGoodsCollection(Long skuId) {
		LambdaQueryWrapper<MemberGoodsCollectionPO> queryWrapper = Wrappers.lambdaQuery();
		queryWrapper.eq(MemberGoodsCollectionPO::getMemberId, SecurityUtils.getUserId());
		queryWrapper.eq(skuId != null, MemberGoodsCollectionPO::getSkuId, skuId);
		return this.remove(queryWrapper);
	}

	@Override
	public Boolean deleteGoodsCollection(List<Long> goodsIds) {
		LambdaQueryWrapper<MemberGoodsCollectionPO> queryWrapper = Wrappers.lambdaQuery();
		queryWrapper.in(MemberGoodsCollectionPO::getSkuId, goodsIds);
		return this.remove(queryWrapper);
	}

	@Override
	public Boolean deleteSkuCollection(List<Long> skuIds) {
		LambdaQueryWrapper<MemberGoodsCollectionPO> queryWrapper = Wrappers.lambdaQuery();
		queryWrapper.in(MemberGoodsCollectionPO::getSkuId, skuIds);
		return this.remove(queryWrapper);
	}
}

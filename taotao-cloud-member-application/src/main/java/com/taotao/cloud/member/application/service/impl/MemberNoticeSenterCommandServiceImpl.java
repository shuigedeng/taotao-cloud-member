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

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taotao.boot.common.enums.ResultEnum;
import com.taotao.boot.common.exception.BusinessException;
import com.taotao.boot.common.utils.lang.StringUtils;
import com.taotao.cloud.member.application.service.MemberNoticeSenterCommandService;
import com.taotao.cloud.member.application.service.MemberNoticeCommandService;
import com.taotao.cloud.member.application.service.MemberCommandService;
import com.taotao.cloud.member.infrastructure.persistent.mapper.MemberNoticeSenterMapper;
import com.taotao.cloud.member.infrastructure.persistent.persistence.MemberNoticePO;
import com.taotao.cloud.member.infrastructure.persistent.persistence.MemberNoticeSenterPO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 会员消息业务层实现
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MemberNoticeSenterCommandServiceImpl
	implements MemberNoticeSenterCommandService {
	@Override
	public boolean customSave(MemberNoticeSenterPO memberNoticeSenterPO) {
		return false;
	}
	//
	///**
	// * 会员
	// */
	//@Autowired
	//private MemberCommandService memberCommandService;
	///**
	// * 会员站内信
	// */
	//@Autowired
	//private MemberNoticeCommandService memberNoticeCommandService;
	//
	//@Override
	//public boolean customSave(MemberNoticeSenterPO memberNoticeSenterPO) {
	//	if (this.saveOrUpdate(memberNoticeSenterPO)) {
	//		List<MemberNoticePO> memberNoticePOS = new ArrayList<>();
	//		// 如果是选中会员发送
	//		if (memberNoticeSenterPO.getSendType().equals(SendTypeEnum.SELECT.name())) {
	//			// 判定消息是否有效
	//			if (!StringUtils.isEmpty(memberNoticeSenterPO.getMemberIds())) {
	//				String[] ids = memberNoticeSenterPO.getMemberIds().split(",");
	//				MemberNoticePO memberNoticePO;
	//				for (String id : ids) {
	//					memberNoticePO = new MemberNoticePO();
	//					memberNoticePO.setRead(false);
	//					memberNoticePO.setContent(memberNoticeSenterPO.getContent());
	//					memberNoticePO.setMemberId(Long.valueOf(id));
	//					memberNoticePO.setTitle(memberNoticeSenterPO.getTitle());
	//					memberNoticePOS.add(memberNoticePO);
	//				}
	//			}
	//			else {
	//				return true;
	//			}
	//		} // 否则是全部会员发送
	//		else {
	//			List<Member> members = memberCommandService.list();
	//			MemberNoticePO memberNoticePO;
	//			for (Member member : members) {
	//				memberNoticePO = new MemberNoticePO();
	//				memberNoticePO.setRead(false);
	//				memberNoticePO.setContent(memberNoticeSenterPO.getContent());
	//				memberNoticePO.setMemberId(member.getId());
	//				memberNoticePO.setTitle(memberNoticeSenterPO.getTitle());
	//				memberNoticePOS.add(memberNoticePO);
	//			}
	//		}
	//		// 防止没有会员导致报错
	//		if (memberNoticePOS.size() > 0) {
	//			// 批量保存
	//			if (memberNoticeCommandService.saveBatch(memberNoticePOS)) {
	//				return true;
	//			}
	//			else {
	//				throw new BusinessException(ResultEnum.NOTICE_SEND_ERROR);
	//			}
	//		}
	//	}
	//	return true;
	//}
}

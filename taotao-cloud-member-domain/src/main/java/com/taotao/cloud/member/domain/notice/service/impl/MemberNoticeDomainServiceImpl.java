package com.taotao.cloud.member.domain.notice.service.impl;

import com.taotao.cloud.member.domain.notice.entity.MemberNotice;
import com.taotao.cloud.member.domain.notice.repository.MemberNoticeDomainRepository;
import com.taotao.cloud.member.domain.notice.service.MemberNoticeDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberNoticeDomainServiceImpl implements MemberNoticeDomainService {

	private MemberNoticeDomainRepository memberNoticeDomainRepository;

	@Override
	public void create(MemberNotice dept) {

	}

	@Override
	public void modify(MemberNotice dept) {

	}

	@Override
	public void remove(Long[] ids) {

	}
}

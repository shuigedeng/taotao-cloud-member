package com.taotao.cloud.member.domain.member.service.impl;

import com.taotao.cloud.member.domain.member.entity.Member;
import com.taotao.cloud.member.domain.member.repository.MemberDomainRepository;
import com.taotao.cloud.member.domain.member.service.MemberDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberDomainServiceImpl implements MemberDomainService {

	private MemberDomainRepository deptDomainRepository;

	@Override
	public void create(Member dept) {

	}

	@Override
	public void modify(Member dept) {

	}

	@Override
	public void remove(Long[] ids) {

	}
}

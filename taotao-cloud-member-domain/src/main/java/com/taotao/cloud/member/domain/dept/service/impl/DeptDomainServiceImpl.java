package com.taotao.cloud.member.domain.dept.service.impl;

import com.taotao.cloud.member.domain.dept.entity.DeptEntity;
import com.taotao.cloud.member.domain.dept.repository.DeptDomainRepository;
import com.taotao.cloud.member.domain.dept.service.DeptDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeptDomainServiceImpl implements DeptDomainService {

	private DeptDomainRepository deptDomainRepository;

	@Override
	public void create(DeptEntity dept) {
		deptDomainRepository.create(dept);
	}

	@Override
	public void modify(DeptEntity dept) {
		deptDomainRepository.modify(dept);
	}

	@Override
	public void remove(Long[] ids) {
		deptDomainRepository.remove(ids);
	}
}
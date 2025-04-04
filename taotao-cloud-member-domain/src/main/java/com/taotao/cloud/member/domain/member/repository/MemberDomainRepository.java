package com.taotao.cloud.member.domain.member.repository;

import com.taotao.cloud.member.domain.member.entity.Member;

public interface MemberDomainRepository {
	/**
	 * 新增部门.
	 *
	 * @param dept 部门对象
	 */
	void create(Member dept);

	/**
	 * 修改部门.
	 *
	 * @param dept 部门对象
	 */
	void modify(Member dept);

	/**
	 * 根据ID删除部门.
	 *
	 * @param ids IDS
	 */
	void remove(Long[] ids);
}

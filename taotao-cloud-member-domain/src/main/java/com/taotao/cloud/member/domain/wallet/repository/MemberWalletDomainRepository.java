package com.taotao.cloud.member.domain.wallet.repository;

import com.taotao.cloud.member.domain.wallet.entity.MemberWallet;

public interface MemberWalletDomainRepository {
	/**
	 * 新增部门.
	 *
	 * @param dept 部门对象
	 */
	void create(MemberWallet dept);

	/**
	 * 修改部门.
	 *
	 * @param dept 部门对象
	 */
	void modify(MemberWallet dept);

	/**
	 * 根据ID删除部门.
	 *
	 * @param ids IDS
	 */
	void remove(Long[] ids);
}

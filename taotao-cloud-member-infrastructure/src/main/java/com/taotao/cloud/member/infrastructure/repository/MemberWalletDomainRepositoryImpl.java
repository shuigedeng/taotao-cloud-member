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

package com.taotao.cloud.member.infrastructure.repository;

import com.taotao.cloud.member.domain.member.entity.Member;
import com.taotao.cloud.member.domain.member.repository.MemberDomainRepository;
import com.taotao.cloud.member.domain.wallet.entity.MemberWallet;
import com.taotao.cloud.member.domain.wallet.repository.MemberWalletDomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberWalletDomainRepositoryImpl implements MemberWalletDomainRepository {

	@Override
	public void create(MemberWallet dept) {

	}

	@Override
	public void modify(MemberWallet dept) {

	}

	@Override
	public void remove(Long[] ids) {

	}
}

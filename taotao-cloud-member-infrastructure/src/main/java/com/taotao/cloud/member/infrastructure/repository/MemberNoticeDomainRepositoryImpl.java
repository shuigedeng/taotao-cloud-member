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

import com.taotao.cloud.member.domain.notice.entity.MemberNotice;
import com.taotao.cloud.member.domain.notice.repository.MemberNoticeDomainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberNoticeDomainRepositoryImpl implements MemberNoticeDomainRepository {
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

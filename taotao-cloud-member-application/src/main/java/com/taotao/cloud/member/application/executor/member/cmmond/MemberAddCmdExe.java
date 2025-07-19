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

package com.taotao.cloud.member.application.executor.member.cmmond;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 新增部门执行器.
 */
@Component
@RequiredArgsConstructor
public class MemberAddCmdExe {
    //
    //	private final DeptDomainService deptDomainService;
    //
    //	private final DeptMapper deptMapper;
    //
    //	private final DeptConvert memberNoticeConvertor;
    //
    //	/**
    //	 * 执行新增部门.
    //	 * @param cmd 新增部门参数
    //	 * @return 执行新增结果
    //	 */
    ////	@DS(TENANT)
    //	public Boolean execute(DeptInsertCmd cmd) {
    ////		DeptCO co = cmd.getDeptCO();
    ////		long count = deptMapper.selectCount(Wrappers.lambdaQuery(DeptDO.class).eq(DeptDO::getName,
    // co.getName()));
    ////		if (count > 0) {
    ////			throw new SystemException("部门已存在，请重新填写");
    ////		}
    ////		return deptGateway.insert(deptConvertor.toEntity(co));
    //		return false;
    //	}

}

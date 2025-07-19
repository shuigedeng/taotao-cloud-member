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
 * 修改部门执行器.
 */
@Component
@RequiredArgsConstructor
public class MemberEditCmdExe {

    //	private final DeptDomainService deptDomainService;
    //
    //	private final DeptMapper deptMapper;
    //
    //	private final DeptConvert memberNoticeConvertor;
    //
    //	/**
    //	 * 执行修改部门.
    //	 *
    //	 * @param cmd 修改部门参数
    //	 * @return 执行修改结果
    //	 */
    ////	@DS(TENANT)
    //	public Boolean execute(DeptUpdateCmd cmd) {
    ////		DeptCO co = cmd.getDeptCO();
    ////		Long id = co.getId();
    ////		if (ObjectUtil.isNull(id)) {
    ////			throw new SystemException(ValidatorUtil.getMessage(SYSTEM_ID_REQUIRE));
    ////		}
    ////		long count = deptMapper
    ////			.selectCount(Wrappers.lambdaQuery(DeptDO.class).eq(DeptDO::getName, co.getName())
    ////				.ne(DeptDO::getId, id));
    ////		if (count > 0) {
    ////			throw new BusinessException("部门已存在，请重新填写");
    ////		}
    ////		if (co.getId().equals(co.getPid())) {
    ////			throw new BusinessException("上级部门不能为当前部门");
    ////		}
    ////		return deptDomainService.update(deptConvertor.toEntity(co));
    //		return false;
    //	}

}

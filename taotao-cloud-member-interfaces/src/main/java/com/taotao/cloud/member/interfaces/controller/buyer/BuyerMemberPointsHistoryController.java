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

package com.taotao.cloud.member.interfaces.controller.buyer;

import com.taotao.boot.webagg.controller.BusinessController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 买家端,会员积分历史API
 */
@AllArgsConstructor
@Validated
@RestController
@Tag(name = "买家端-会员积分历史API", description = "买家端-会员积分历史API")
@RequestMapping("/member/buyer/member/points/history")
public class BuyerMemberPointsHistoryController extends BusinessController {

	//private final IMemberPointsHistoryService memberPointsHistoryService;
	//
	//@Operation(summary = "分页获取当前会员积分历史", description = "分页获取当前会员积分历史")
	//@RequestLogger
	//@PreAuthorize("@el.check('admin','timing:list')")
	//@GetMapping(value = "/page")
	//public Result<PageResult<MemberPointsHistoryPageVO>> getByPage(PageQuery page) {
	//    IPage<MemberPointsHistory> memberPointsHistoryPage = memberPointsHistoryService.pageQuery(page);
	//    return Result.success(MpUtils.convertMybatisPage(memberPointsHistoryPage, MemberPointsHistoryPageVO.class));
	//}
	//
	//@Operation(summary = "获取当前会员积分", description = "获取当前会员积分")
	//@RequestLogger
	//@PreAuthorize("@el.check('admin','timing:list')")
	//@GetMapping(value = "/current/points")
	//public Result<MemberPointsHistoryVO> getMemberPointsHistoryVO() {
	//    return Result.success(memberPointsHistoryService.getMemberPointsHistoryVO(SecurityUtils.getUserId()));
	//}
}

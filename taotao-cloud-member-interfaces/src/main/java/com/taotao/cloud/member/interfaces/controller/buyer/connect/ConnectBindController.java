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

package com.taotao.cloud.member.interfaces.controller.buyer.connect;

import com.taotao.boot.webagg.controller.BusinessController;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 买家端,app/小程序 联合登录 */
@AllArgsConstructor
@Validated
@RestController
@Tag(name = "买家端-app/小程序联合登录API", description = "买家端-app/小程序联合登录API")
@RequestMapping("/member/buyer/passport/connect/bind")
public class ConnectBindController extends BusinessController {

    //private final ConnectService connectService;
	//
    //@Operation(summary = "unionId绑定", description = "unionId绑定")
    //@RequestLogger
    //@PreAuthorize("@el.check('admin','timing:list')")
    //@PostMapping
    //public void unionIdBind(@RequestParam String unionId, @RequestParam String type) {
    //    connectService.bind(unionId, type);
    //}
	//
    //@Operation(summary = "unionID解绑", description = "unionID解绑")
    //@RequestLogger
    //@PreAuthorize("@el.check('admin','timing:list')")
    //@PostMapping("/unbind")
    //public void unionIdunBind(@RequestParam String type) {
    //    connectService.unbind(type);
    //}
	//
    //@Operation(summary = "绑定列表", description = "绑定列表")
    //@RequestLogger
    //@PreAuthorize("@el.check('admin','timing:list')")
    //@GetMapping("/list")
    //public Result<List<String>> bindList() {
    //    return Result.success(connectService.bindList());
    //}
}

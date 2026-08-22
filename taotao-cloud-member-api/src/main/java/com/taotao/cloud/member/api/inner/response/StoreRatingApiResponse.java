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

package com.taotao.cloud.member.api.inner.response;

import com.taotao.boot.common.model.ddd.types.MarkerResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/** 评分VO */
@Setter
@Getter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "评分VO")
public class StoreRatingApiResponse  implements MarkerResponse  {

    @Serial private static final long serialVersionUID = -7605952923416404638L;

    @Schema(description = "物流评分")
    private String deliveryScore;

    @Schema(description = "服务评分")
    private String serviceScore;

    @Schema(description = "描述评分")
    private String descriptionScore;

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getDeliveryScore() {
        return deliveryScore;
    }

    /**
     * 设置
     *
     * @param deliveryScore deliveryScore
     * @since 2022.03
     */
    public void setDeliveryScore(String deliveryScore) {
        this.deliveryScore = deliveryScore;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getServiceScore() {
        return serviceScore;
    }

    /**
     * 设置
     *
     * @param serviceScore serviceScore
     * @since 2022.03
     */
    public void setServiceScore(String serviceScore) {
        this.serviceScore = serviceScore;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getDescriptionScore() {
        return descriptionScore;
    }

    /**
     * 设置
     *
     * @param descriptionScore descriptionScore
     * @since 2022.03
     */
    public void setDescriptionScore(String descriptionScore) {
        this.descriptionScore = descriptionScore;
    }
}

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

package com.taotao.cloud.member.api.inner.request;

import com.taotao.boot.common.model.ddd.types.MarkerRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;

/** 会员评价DTO */
@Setter
@Getter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "租户id")
public class MemberEvaluationApiRequest implements MarkerRequest {

    @Serial private static final long serialVersionUID = -7605952923416404638L;

    @Schema(description = "子订单编号")
    @NotEmpty(message = "订单异常")
    private String orderItemSn;

    @Schema(description = "商品ID")
    @NotEmpty(message = "订单商品异常不能为空")
    private Long goodsId;

    @Schema(description = "规格ID")
    @NotEmpty(message = "订单商品不能为空")
    private Long skuId;

    @Schema(description = "好中差评价")
    @NotEmpty(message = "请评价")
    private String grade;

    @Schema(description = "评论内容")
    @NotEmpty(message = "评论内容不能为空")
    @Length(max = 500, message = "评论内容不能超过500字符")
    private String content;

    @Schema(description = "评论图片")
    private String images;

    @Schema(description = "物流评分")
    private Integer deliveryScore;

    @Schema(description = "服务评分")
    private Integer serviceScore;

    @Schema(description = "描述评分")
    private Integer descriptionScore;

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getOrderItemSn() {
        return orderItemSn;
    }

    /**
     * 设置
     *
     * @param orderItemSn orderItemSn
     * @return 无返回值
     * @since 2022.03
     */
    public void setOrderItemSn(String orderItemSn) {
        this.orderItemSn = orderItemSn;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置
     *
     * @param goodsId goodsId
     * @return 无返回值
     * @since 2022.03
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置
     *
     * @param skuId skuId
     * @return 无返回值
     * @since 2022.03
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置
     *
     * @param grade grade
     * @return 无返回值
     * @since 2022.03
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     *
     * @param content content
     * @return 无返回值
     * @since 2022.03
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getImages() {
        return images;
    }

    /**
     * 设置
     *
     * @param images images
     * @return 无返回值
     * @since 2022.03
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Integer getDeliveryScore() {
        return deliveryScore;
    }

    /**
     * 设置
     *
     * @param deliveryScore deliveryScore
     * @return 无返回值
     * @since 2022.03
     */
    public void setDeliveryScore(Integer deliveryScore) {
        this.deliveryScore = deliveryScore;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Integer getServiceScore() {
        return serviceScore;
    }

    /**
     * 设置
     *
     * @param serviceScore serviceScore
     * @return 无返回值
     * @since 2022.03
     */
    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Integer getDescriptionScore() {
        return descriptionScore;
    }

    /**
     * 设置
     *
     * @param descriptionScore descriptionScore
     * @return 无返回值
     * @since 2022.03
     */
    public void setDescriptionScore(Integer descriptionScore) {
        this.descriptionScore = descriptionScore;
    }
}

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

import com.taotao.boot.common.model.ddd.types.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serial;

/**
 * 评价查询条件
 *
 * @author shuigedeng
 * @version 2022.03
 * @since 2022-03-14 11:22:15
 */
@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "评价查询条件")
public class EvaluationPageQueryApiRequest implements Command {

    @Serial private static final long serialVersionUID = -7605952923416404638L;

    @Schema(description = "skuid")
    private Long skuId;

    @Schema(description = "买家ID")
    private Long memberId;

    @Schema(description = "会员名称")
    private String memberName;

    @Schema(description = "卖家名称")
    private String storeName;

    @Schema(description = "卖家ID")
    private Long storeId;

    @Schema(description = "商品名称")
    private String goodsName;

    @Schema(description = "商品ID")
    private Long goodsId;

    @Schema(
            description = "好中差评 , GOOD：好评，MODERATE：中评，WORSE：差评",
            allowableValues = "GOOD,MODERATE,WORSE")
    private String grade;

    @Schema(description = "是否有图")
    private String haveImage;

    @Schema(description = "评论日期--开始时间")
    private String startTime;

    @Schema(description = "评论日期--结束时间")
    private String endTime;

    @Schema(description = "状态")
    private String status;

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
     * @since 2022.03
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 设置
     *
     * @param memberId memberId
     * @since 2022.03
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置
     *
     * @param memberName memberName
     * @since 2022.03
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置
     *
     * @param storeName storeName
     * @since 2022.03
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * 设置
     *
     * @param storeId storeId
     * @since 2022.03
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置
     *
     * @param goodsName goodsName
     * @since 2022.03
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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
     * @since 2022.03
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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
    public String getHaveImage() {
        return haveImage;
    }

    /**
     * 设置
     *
     * @param haveImage haveImage
     * @since 2022.03
     */
    public void setHaveImage(String haveImage) {
        this.haveImage = haveImage;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 设置
     *
     * @param startTime startTime
     * @since 2022.03
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置
     *
     * @param endTime endTime
     * @since 2022.03
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     *
     * @param status status
     * @since 2022.03
     */
    public void setStatus(String status) {
        this.status = status;
    }
}

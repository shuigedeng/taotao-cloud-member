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
import java.util.List;

/** 会员评价VO */
@Setter
@Getter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "会员评价VO")
public class MemberEvaluationApiResponse  implements MarkerResponse  {

    @Serial private static final long serialVersionUID = 6696978796248845481L;

    @Schema(description = "会员ID")
    private String memberId;

    @Schema(description = "会员名称")
    private String memberName;

    @Schema(description = "会员头像")
    private String memberProfile;

    @Schema(description = "店铺ID")
    private String storeId;

    @Schema(description = "店铺名称")
    private String storeName;

    @Schema(description = "商品ID")
    private String goodsId;

    @Schema(description = "SKU_ID")
    private String skuId;

    @Schema(description = "会员ID")
    private String goodsName;

    @Schema(description = "商品图片")
    private String goodsImage;

    @Schema(description = "订单号")
    private String orderNo;

    @Schema(description = "好中差评 , GOOD：好评，MODERATE：中评，WORSE：差评")
    private String grade;

    @Schema(description = "评价内容")
    private String content;

    @Schema(description = "评价图片 逗号分割")
    private String images;

    @Schema(description = "状态  OPEN 正常 ,CLOSE 关闭")
    private String status;

    @Schema(description = "评论图片")
    private String reply;

    @Schema(description = "评价回复图片")
    private String replyImage;

    @Schema(description = "评论是否有图片 true 有 ,false 没有")
    private Boolean haveImage;

    @Schema(description = "回复是否有图片 true 有 ,false 没有")
    private Boolean haveReplyImage;

    @Schema(description = "回复状态")
    private Boolean replyStatus;

    @Schema(description = "物流评分")
    private Integer deliveryScore;

    @Schema(description = "服务评分")
    private Integer serviceScore;

    @Schema(description = "描述评分")
    private Integer descriptionScore;

    @Schema(description = "评论图片")
    private List<String> evaluationImages;

    @Schema(description = "回复评论图片")
    private List<String> replyEvaluationImages;

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置
     *
     * @param memberId memberId
     * @return 无返回值
     * @since 2022.03
     */
    public void setMemberId(String memberId) {
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
     * @return 无返回值
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
    public String getMemberProfile() {
        return memberProfile;
    }

    /**
     * 设置
     *
     * @param memberProfile memberProfile
     * @return 无返回值
     * @since 2022.03
     */
    public void setMemberProfile(String memberProfile) {
        this.memberProfile = memberProfile;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * 设置
     *
     * @param storeId storeId
     * @return 无返回值
     * @since 2022.03
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
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
     * @return 无返回值
     * @since 2022.03
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置
     *
     * @param goodsId goodsId
     * @return 无返回值
     * @since 2022.03
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * 设置
     *
     * @param skuId skuId
     * @return 无返回值
     * @since 2022.03
     */
    public void setSkuId(String skuId) {
        this.skuId = skuId;
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
     * @return 无返回值
     * @since 2022.03
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getGoodsImage() {
        return goodsImage;
    }

    /**
     * 设置
     *
     * @param goodsImage goodsImage
     * @return 无返回值
     * @since 2022.03
     */
    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置
     *
     * @param orderNo orderNo
     * @return 无返回值
     * @since 2022.03
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
     * @return 无返回值
     * @since 2022.03
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getReply() {
        return reply;
    }

    /**
     * 设置
     *
     * @param reply reply
     * @return 无返回值
     * @since 2022.03
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getReplyImage() {
        return replyImage;
    }

    /**
     * 设置
     *
     * @param replyImage replyImage
     * @return 无返回值
     * @since 2022.03
     */
    public void setReplyImage(String replyImage) {
        this.replyImage = replyImage;
    }

    /**
     * 获取
     *
     * @return 是否成功
     * @since 2022.03
     */
    public Boolean getHaveImage() {
        return haveImage;
    }

    /**
     * 设置
     *
     * @param haveImage haveImage
     * @return 无返回值
     * @since 2022.03
     */
    public void setHaveImage(Boolean haveImage) {
        this.haveImage = haveImage;
    }

    /**
     * 获取
     *
     * @return 是否成功
     * @since 2022.03
     */
    public Boolean getHaveReplyImage() {
        return haveReplyImage;
    }

    /**
     * 设置
     *
     * @param haveReplyImage haveReplyImage
     * @return 无返回值
     * @since 2022.03
     */
    public void setHaveReplyImage(Boolean haveReplyImage) {
        this.haveReplyImage = haveReplyImage;
    }

    /**
     * 获取
     *
     * @return 是否成功
     * @since 2022.03
     */
    public Boolean getReplyStatus() {
        return replyStatus;
    }

    /**
     * 设置
     *
     * @param replyStatus replyStatus
     * @return 无返回值
     * @since 2022.03
     */
    public void setReplyStatus(Boolean replyStatus) {
        this.replyStatus = replyStatus;
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

    public List<String> getEvaluationImages() {
        return evaluationImages;
    }

    /**
     * 设置
     *
     * @param evaluationImages evaluationImages
     * @return 无返回值
     * @since 2022.03
     */
    public void setEvaluationImages(List<String> evaluationImages) {
        this.evaluationImages = evaluationImages;
    }

    public List<String> getReplyEvaluationImages() {
        return replyEvaluationImages;
    }

    /**
     * 设置
     *
     * @param replyEvaluationImages replyEvaluationImages
     * @return 无返回值
     * @since 2022.03
     */
    public void setReplyEvaluationImages(List<String> replyEvaluationImages) {
        this.replyEvaluationImages = replyEvaluationImages;
    }
}

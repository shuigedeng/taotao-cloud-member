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

package com.taotao.cloud.member.api.feign.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.*;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.Accessors;

/** 会员评价VO */
@Setter
@Getter
@ToString
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "会员评价VO")
public class MemberEvaluationApiResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 6696978796248845481L;

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

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberProfile() {
		return memberProfile;
	}

	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyImage() {
		return replyImage;
	}

	public void setReplyImage(String replyImage) {
		this.replyImage = replyImage;
	}

	public Boolean getHaveImage() {
		return haveImage;
	}

	public void setHaveImage(Boolean haveImage) {
		this.haveImage = haveImage;
	}

	public Boolean getHaveReplyImage() {
		return haveReplyImage;
	}

	public void setHaveReplyImage(Boolean haveReplyImage) {
		this.haveReplyImage = haveReplyImage;
	}

	public Boolean getReplyStatus() {
		return replyStatus;
	}

	public void setReplyStatus(Boolean replyStatus) {
		this.replyStatus = replyStatus;
	}

	public Integer getDeliveryScore() {
		return deliveryScore;
	}

	public void setDeliveryScore(Integer deliveryScore) {
		this.deliveryScore = deliveryScore;
	}

	public Integer getServiceScore() {
		return serviceScore;
	}

	public void setServiceScore(Integer serviceScore) {
		this.serviceScore = serviceScore;
	}

	public Integer getDescriptionScore() {
		return descriptionScore;
	}

	public void setDescriptionScore(Integer descriptionScore) {
		this.descriptionScore = descriptionScore;
	}

	public List<String> getEvaluationImages() {
		return evaluationImages;
	}

	public void setEvaluationImages(List<String> evaluationImages) {
		this.evaluationImages = evaluationImages;
	}

	public List<String> getReplyEvaluationImages() {
		return replyEvaluationImages;
	}

	public void setReplyEvaluationImages(List<String> replyEvaluationImages) {
		this.replyEvaluationImages = replyEvaluationImages;
	}
}

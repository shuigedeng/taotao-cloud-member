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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.taotao.boot.common.model.ddd.types.MarkerResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/** 会员评价VO */
@Setter
@Getter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "会员评价VO")
public class MemberEvaluationListApiResponse  implements MarkerResponse  {

    @Serial private static final long serialVersionUID = -7605952923416404638L;

    @Schema(description = "评论ID")
    private String id;

    @Schema(description = "会员名称")
    private String memberName;

    @Schema(description = "商品名称")
    private String goodsName;

    @Schema(description = "好中差评", allowableValues = "GOOD,NEUTRAL,BAD")
    private String grade;

    @Schema(description = "评价内容")
    private String content;

    @Schema(description = "状态 ", allowableValues = " OPEN 正常 ,CLOSE 关闭")
    private String status;

    @Schema(description = "回复状态")
    private Boolean replyStatus;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

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
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id id
     * @since 2022.03
     */
    public void setId(String id) {
        this.id = id;
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
    public String getContent() {
        return content;
    }

    /**
     * 设置
     *
     * @param content content
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
     * @since 2022.03
     */
    public void setReplyStatus(Boolean replyStatus) {
        this.replyStatus = replyStatus;
    }

    /**
     * 获取
     *
     * @return LocalDateTime
     * @since 2022.03
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     *
     * @param createTime createTime
     * @since 2022.03
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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
     * @since 2022.03
     */
    public void setDescriptionScore(Integer descriptionScore) {
        this.descriptionScore = descriptionScore;
    }
}

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
import com.taotao.boot.common.enums.ClientTypeEnum;
import com.taotao.boot.common.model.response.ResponseBase;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/** 会员vo */
@Setter
@Getter
@ToString
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "MemberVO")
public class MemberApiResponse  extends ResponseBase implements Serializable {

    @Serial private static final long serialVersionUID = 1810890757303309436L;

    @Schema(description = "唯一标识", hidden = true)
    private Long id;

    @Schema(description = "会员用户名")
    private String username;

    @Schema(description = "昵称")
    private String nickName;

    @Schema(description = "会员性别,1为男，0为女")
    private Integer sex;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Schema(description = "会员生日")
    private Date birthday;

    @Schema(description = "会员地址ID")
    private String regionId;

    @Schema(description = "会员地址")
    private String region;

    @Schema(description = "手机号码", requiredMode = Schema.RequiredMode.REQUIRED)
    // @Sensitive(strategy = SensitiveStrategy.PHONE)
    private String mobile;

    @Schema(description = "积分数量")
    private Long point;

    @Schema(description = "积分总数量")
    private Long totalPoint;

    @Schema(description = "会员头像")
    private String face;

    @Schema(description = "会员状态")
    private Boolean disabled;

    @Schema(description = "是否开通店铺")
    private Boolean haveStore;

    @Schema(description = "店铺ID")
    private String storeId;

    @Schema(description = "openId")
    private String openId;

    /**
     * @see ClientTypeEnum
     */
    @Schema(description = "客户端")
    private String clientEnum;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "最后一次登录时间")
    private Date lastLoginDate;

    @Schema(description = "会员等级ID")
    private String gradeId;

    @Schema(description = "经验值数量")
    private Long experience;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Long getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Long totalPoint) {
        this.totalPoint = totalPoint;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getHaveStore() {
        return haveStore;
    }

    public void setHaveStore(Boolean haveStore) {
        this.haveStore = haveStore;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getClientEnum() {
        return clientEnum;
    }

    public void setClientEnum(String clientEnum) {
        this.clientEnum = clientEnum;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}

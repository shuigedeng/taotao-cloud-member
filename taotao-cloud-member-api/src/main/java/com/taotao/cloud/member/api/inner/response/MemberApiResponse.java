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
import com.taotao.boot.common.model.ddd.types.MarkerResponse;
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

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "MemberVO")
public class MemberApiResponse  implements MarkerResponse  {

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

    // @Sensitive(strategy = SensitiveStrategy.PHONE)
    @Schema(description = "手机号码")
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

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id id
     * @since 2022.03
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username username
     * @since 2022.03
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置
     *
     * @param nickName nickName
     * @since 2022.03
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex sex
     * @since 2022.03
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return Date
     * @since 2022.03
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置
     *
     * @param birthday birthday
     * @since 2022.03
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * 设置
     *
     * @param regionId regionId
     * @since 2022.03
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置
     *
     * @param region region
     * @since 2022.03
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置
     *
     * @param mobile mobile
     * @since 2022.03
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getPoint() {
        return point;
    }

    /**
     * 设置
     *
     * @param point point
     * @since 2022.03
     */
    public void setPoint(Long point) {
        this.point = point;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getTotalPoint() {
        return totalPoint;
    }

    /**
     * 设置
     *
     * @param totalPoint totalPoint
     * @since 2022.03
     */
    public void setTotalPoint(Long totalPoint) {
        this.totalPoint = totalPoint;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param face face
     * @since 2022.03
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 获取
     *
     * @return 是否成功
     * @since 2022.03
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 设置
     *
     * @param disabled disabled
     * @since 2022.03
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 获取
     *
     * @return 是否成功
     * @since 2022.03
     */
    public Boolean getHaveStore() {
        return haveStore;
    }

    /**
     * 设置
     *
     * @param haveStore haveStore
     * @since 2022.03
     */
    public void setHaveStore(Boolean haveStore) {
        this.haveStore = haveStore;
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
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置
     *
     * @param openId openId
     * @since 2022.03
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getClientEnum() {
        return clientEnum;
    }

    /**
     * 设置
     *
     * @param clientEnum clientEnum
     * @since 2022.03
     */
    public void setClientEnum(String clientEnum) {
        this.clientEnum = clientEnum;
    }

    /**
     * 获取
     *
     * @return Date
     * @since 2022.03
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置
     *
     * @param lastLoginDate lastLoginDate
     * @since 2022.03
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * 设置
     *
     * @param gradeId gradeId
     * @since 2022.03
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * 获取
     *
     * @return 结果数量
     * @since 2022.03
     */
    public Long getExperience() {
        return experience;
    }

    /**
     * 设置
     *
     * @param experience experience
     * @since 2022.03
     */
    public void setExperience(Long experience) {
        this.experience = experience;
    }
}

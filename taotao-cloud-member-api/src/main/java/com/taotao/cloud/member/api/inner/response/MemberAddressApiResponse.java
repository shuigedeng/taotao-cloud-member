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
import java.time.LocalDateTime;

/**
 * 会员收货地址DTO
 *
 * @author shuigedeng
 * @version 2021.10
 * @since 2022-03-11 14:55:28
 */
@Setter
@Getter
@ToString

@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "会员收货地址DTO")
public class MemberAddressApiResponse  implements MarkerResponse  {

    @Serial private static final long serialVersionUID = -7605952923416404638L;

    @Schema(description = "会员ID")
    private String memberId;

    @Schema(description = "收货人姓名")
    private String name;

    @Schema(description = "手机号码")
    private String mobile;

    @Schema(description = "地址名称，逗号分割")
    private String consigneeAddressPath;

    @Schema(description = "地址id,逗号分割")
    private String consigneeAddressIdPath;

    @Schema(description = "省")
    private String province;

    @Schema(description = "市")
    private String city;

    @Schema(description = "区县")
    private String area;

    @Schema(description = "省code")
    private String provinceCode;

    @Schema(description = "市code")
    private String cityCode;

    @Schema(description = "区县code")
    private String areaCode;

    @Schema(description = "街道地址")
    private String address;

    @Schema(description = "详细地址")
    private String detail;

    @Schema(description = "是否为默认收货地址")
    private Boolean defaulted;

    @Schema(description = "地址别名")
    private String alias;

    @Schema(description = "经度")
    private String lon;

    @Schema(description = "纬度")
    private String lat;

    @Schema(description = "邮政编码")
    private String postalCode;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "最后修改时间")
    private LocalDateTime lastModifiedTime;

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
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name name
     * @since 2022.03
     */
    public void setName(String name) {
        this.name = name;
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
     * @return 字符串
     * @since 2022.03
     */
    public String getConsigneeAddressPath() {
        return consigneeAddressPath;
    }

    /**
     * 设置
     *
     * @param consigneeAddressPath consigneeAddressPath
     * @since 2022.03
     */
    public void setConsigneeAddressPath(String consigneeAddressPath) {
        this.consigneeAddressPath = consigneeAddressPath;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getConsigneeAddressIdPath() {
        return consigneeAddressIdPath;
    }

    /**
     * 设置
     *
     * @param consigneeAddressIdPath consigneeAddressIdPath
     * @since 2022.03
     */
    public void setConsigneeAddressIdPath(String consigneeAddressIdPath) {
        this.consigneeAddressIdPath = consigneeAddressIdPath;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置
     *
     * @param province province
     * @since 2022.03
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     *
     * @param city city
     * @since 2022.03
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置
     *
     * @param area area
     * @since 2022.03
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置
     *
     * @param provinceCode provinceCode
     * @since 2022.03
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置
     *
     * @param cityCode cityCode
     * @since 2022.03
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置
     *
     * @param areaCode areaCode
     * @since 2022.03
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address address
     * @since 2022.03
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置
     *
     * @param detail detail
     * @since 2022.03
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取
     *
     * @return 是否成功
     * @since 2022.03
     */
    public Boolean getDefaulted() {
        return defaulted;
    }

    /**
     * 设置
     *
     * @param defaulted defaulted
     * @since 2022.03
     */
    public void setDefaulted(Boolean defaulted) {
        this.defaulted = defaulted;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置
     *
     * @param alias alias
     * @since 2022.03
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getLon() {
        return lon;
    }

    /**
     * 设置
     *
     * @param lon lon
     * @since 2022.03
     */
    public void setLon(String lon) {
        this.lon = lon;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置
     *
     * @param lat lat
     * @since 2022.03
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 获取
     *
     * @return 字符串
     * @since 2022.03
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置
     *
     * @param postalCode postalCode
     * @since 2022.03
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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
     * @return LocalDateTime
     * @since 2022.03
     */
    public LocalDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * 设置
     *
     * @param lastModifiedTime lastModifiedTime
     * @since 2022.03
     */
    public void setLastModifiedTime(LocalDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}

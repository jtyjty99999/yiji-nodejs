/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-23 14:32 创建
 *
 */
package com.yiji.openapi.message.common.user;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "updateUserService", type = ApiMessageType.Request)
public class UpdateUserServiceRequest extends ApiRequest {
	
	/** 用户ID */
    @NotBlank
    @OpenApiField(desc = "用户ID",demo = "20140909010000052206")
	private String userId;
	
	/** 用户真实姓名 */
    @OpenApiField(desc = "用户真实姓名",demo = "易极付")
	private String realName;
	
	/** 用户身份类型 */
    @OpenApiField(desc = "用户身份类型",demo = "Identity_Card")
	private String certType;
	
	/** 证件号 */
    @OpenApiField(desc = "证件号",demo = "123645897123456")
	private String certNo;
	
	/** 国家 */
    @OpenApiField(desc = "国家",demo = "China")
	private String country;
	
	/** 性别 */
    @OpenApiField(desc = "性别",demo = "MALE")
	private String gender;
	
	/** 职业 */
    @OpenApiField(desc = "职业",demo = "程序员")
    private String profession;
	
	/** 详细地址 */
    @OpenApiField(desc = "详细地址",demo = "重庆市北部新区黄山大道中段9号木星大厦一区6楼")
	private String address;
	
	/** 证件有效期 */
    @OpenApiField(desc = "证件有效期",demo = "1972-12-12 00:00:00")
	private Date licenseValidTime;
	
    /** 手机 */
    @OpenApiField(desc = "手机",demo = "10086100101")
    private String mobile;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLicenseValidTime() {
        return licenseValidTime;
    }

    public void setLicenseValidTime(Date licenseValidTime) {
        this.licenseValidTime = licenseValidTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

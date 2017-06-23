/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-08 10:12 创建
 *
 */
package com.yiji.openapi.message.common.register;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonThreeStepRegister", type = ApiMessageType.Request)
public class CommonThreeStepRegisterRequest extends ApiRequest {
	/**
	 * 用户名(登陆名) 如果用户名是手机，可以不能绑定手机，修改手机号，会修改登陆名
	 */
	@NotNull
	@Size(max = 128)
	@OpenApiField(desc = "用户名", constraint = "如果用户名是手机，则可以不能绑定手机，但是修改手机号后，登陆名也会修改", demo = "username")
	private String userName;
	
	/**
	 * email
	 */
	@Email
	@Size(max = 128)
	@OpenApiField(desc = "email", constraint = "电子邮件", demo = "xxx@mail.com")
	private String email;
	
	/**
	 * 绑定手机
	 */
	@NotNull
	@Size(max = 16)
	@OpenApiField(desc = "手机号码", demo = "10086100101")
	private String mobile;
	/**
	 * 真实名
	 */
	@NotNull
	@Size(max = 128)
	@OpenApiField(desc = "真实姓名", demo = "易极付")
	private String realName;
	
	/**
	 * 证件类型
	 */
	@NotNull
	@OpenApiField(desc = "证件类型", demo = "Identity_Card")
	private String certType;
	
	/**
	 * 证件号
	 */
	@NotNull
	@OpenApiField(desc = "证件号码", demo = "123456789012345678")
	private String certNo;
	
	/**
	 * 证件有效期 //19721212L表示长期
	 *
	 * */
	@NotNull
	@OpenApiField(desc = "证件有效期", constraint = "格式YYYY-MM-DD HH:mm:ss，长期传1972-12-12 00:00:00",
			demo = "1972-12-12 00:00:00")
	private Date licenseValidTime;
	/**
	 * 性别
	 */
	@NotNull
	@OpenApiField(desc = "性别", demo = "MALE")
	private String gender;
	
	/**
	 * 国籍
	 */
	@NotNull
	@OpenApiField(desc = "国籍", demo = "MAINLAND_CHINA")
	private String country;
	
	/**
	 * 地址
	 */
	@NotNull
	@Size(max = 256)
	@OpenApiField(desc = "地址", demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String address;
	
	/**
	 * 职业
	 */
	@NotNull
	@Size(max = 30)
	@OpenApiField(desc = "职业", demo = "教师")
	private String profession;
	
	/**
	 * 外部请求IP
	 */
	@OpenApiField(desc = "外部请求IP", demo = "127.0.0.0")
	private String requestIP;
	
	/** 外部用户ID */
	@OpenApiField(desc = "外部用户ID", demo = "123456789")
	private String externalId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public Date getLicenseValidTime() {
        return licenseValidTime;
    }

    public void setLicenseValidTime(Date licenseValidTime) {
        this.licenseValidTime = licenseValidTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getRequestIP() {
        return requestIP;
    }

    public void setRequestIP(String requestIP) {
        this.requestIP = requestIP;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}

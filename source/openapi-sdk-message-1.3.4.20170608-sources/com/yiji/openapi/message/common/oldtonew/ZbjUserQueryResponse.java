/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月9日 下午4:54:15 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.common.oldtonew.info.OpenApiLicenceImgPathInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月9日
 */
@OpenApiMessage(service = "zbjUserQuery", type = ApiMessageType.Response)
public class ZbjUserQueryResponse extends ApiResponse{
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "12346579801234567980")
	private String userId;
	
	@OpenApiField(desc = "用户登录名",constraint = "用户登录名",demo = "admin")
	private String userName;
	
	@OpenApiField(desc = "邮箱",constraint = "邮箱",demo = "yiji@12.com")
	private String email;
	
	@OpenApiField(desc = "手机",constraint = "手机",demo = "13521021453")
	private String mobile;
	
	@OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "T")
	private String userStatus;
	
	@OpenApiField(desc = "用户类型",constraint = "用户类型",demo = "P")
	private String userType;
	
	@OpenApiField(desc = "认证状态",constraint = "认证状态[U:未认证,A:已认证,I:认证中,R:被驳回,O:过期]",demo = "U")
	private String certifyStatus;
	@OpenApiField(desc = "证件类型",constraint = "证件类型",demo = "ID")
	private String certType;
	
	@OpenApiField(desc = "证件号",constraint = "证件号",demo = "500221198412192112")
	private String certNo;
	
	@OpenApiField(desc = "认证图片存放信息",constraint = "认证图片存放信息",demo = "{\"userId\":\"20150412010004878838\"}")
	private OpenApiLicenceImgPathInfo licenceImgPathInfo;
	
	@OpenApiField(desc = "营业执照有效期",constraint = "营业执照有效期",demo = "2014-12-12 12:12:12")
	private String licenseValidTime;
	
	@OpenApiField(desc = "真实名称",constraint = "真实名称",demo = "张三")
	private String realName;
	
	@OpenApiField(desc = "认证时间",constraint = "认证时间",demo = "2014-12-12 12:12:12")
	private String certificationtime;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCertifyStatus() {
		return this.certifyStatus;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public OpenApiLicenceImgPathInfo getLicenceImgPathInfo() {
		return this.licenceImgPathInfo;
	}

	public void setLicenceImgPathInfo(OpenApiLicenceImgPathInfo licenceImgPathInfo) {
		this.licenceImgPathInfo = licenceImgPathInfo;
	}

	public String getLicenseValidTime() {
		return this.licenseValidTime;
	}

	public void setLicenseValidTime(String licenseValidTime) {
		this.licenseValidTime = licenseValidTime;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertificationtime() {
		return this.certificationtime;
	}

	public void setCertificationtime(String certificationtime) {
		this.certificationtime = certificationtime;
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * dengwei@yiji.com 2015-09-16 11:06 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFQueryUserInfo", type = ApiMessageType.Response)
public class MpayPFQueryUserInfoResponse extends ApiResponse {

	@OpenApiField(desc = "外部用户ID",demo = "1234567980134567890")
	private String partnerUserId;
	
	/** 用户名 */
	@OpenApiField(desc = "用户名",demo = "易极付")
	private String userName;
	
	/** 真实姓名 */
	@OpenApiField(desc = "真实姓名",demo = "易极付")
	private String realName;
	
	/** 身份证号码 */
	@OpenApiField(desc = "身份证号码",demo = "123456798012345678")
	private String certNo;
	
	/** 身份证有效期 */
	@OpenApiField(desc = "身份证有效期",constraint = "格式：YYYY-MM-DD;长期传”1972-12-12”",demo = "1972-12-12")
	private String certNoValidDate;
	
	/** 性别 */
	@OpenApiField(desc = "性别",constraint = "MALE:”男”，FEMALE:”女",demo = "MALE")
	private String gender;
	
	/** 国籍 */
	@OpenApiField(desc = "国籍",demo = "中国")
	private String country;
	
	/** 证件类型 */
	@OpenApiField(desc = "证件类型",demo = "ID")
	private String certType;
	
	/** 联系方式 */
	@OpenApiField(desc = "联系方式",demo = "10086100101")
	private String phone;
	
	/** 地址 */
	@OpenApiField(desc = "地址",demo = "10086100101")
	private String address;
	
	/** 职业 */
	@OpenApiField(desc = "职业",demo = "职员")
	private String profession;

	public String getPartnerUserId() {
		return this.partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertNoValidDate() {
		return this.certNoValidDate;
	}

	public void setCertNoValidDate(String certNoValidDate) {
		this.certNoValidDate = certNoValidDate;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 11:06 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 完善个人信息接口(支付台)请求参数
 * @author dengwei@yiji.com
 */
@OpenApiMessage(service = "mpayPFCompleteUserInfo", type = ApiMessageType.Request)
public class MpayPFCompleteUserInfoRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128, min = 1)
	@OpenApiField(desc = "外部用户ID",demo = "21345678901234567890")
	private String partnerUserId;
	
	/** 身份证有效期 */
	@Length(max = 20)
	@OpenApiField(desc = "身份证有效期",constraint = "格式：YYYY-MM-DD;长期传”1972-12-12”",demo = "1972-12-12")
	private String certNoValidDate;
	
	/** 性别 */
	@Length(max = 64)
	@OpenApiField(desc = "性别",constraint = "传”男”，”女”",demo = "男")
	private String gender;
	
	/** 联系方式 */
	@Length(max = 64)
	@OpenApiField(desc = "联系方式",demo = "123456879123")
	private String phone;
	
	/** 地址 */
	@Length(max = 256)
	@OpenApiField(desc = "地址",demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String address;
	
	/** 职业 */
	@Length(max = 64)
	@OpenApiField(desc = "职业",demo = "COMPUTER")
	private String profession;
	
	public String getPartnerUserId() {
		return this.partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
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

	public String getCertNoValidDate() {
		return certNoValidDate;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

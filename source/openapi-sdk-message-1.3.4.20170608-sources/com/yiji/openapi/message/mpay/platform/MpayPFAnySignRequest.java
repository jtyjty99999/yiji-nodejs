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

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFAnySign", type = ApiMessageType.Request)
public class MpayPFAnySignRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128, min = 1)
	@OpenApiField(desc = "外部用户ID",demo = "12345678901234567890")
	private String partnerUserId;
	
	/** 银行卡号 */
	@NotBlank
	@Length(max = 64, message = "银行卡号不能为空")
	@OpenApiField(desc = "银行卡号",demo = "2314567893215456")
	private String bankAccountNo;
	
	/** 真实姓名 */
	@NotBlank
	@Length(max = 60, min = 1)
	@OpenApiField(desc = "真实姓名",demo = "易极付")
	private String realName;
	
	/** 身份证号码 */
	@NotBlank
	@Length(max = 50, min = 6)
	@OpenApiField(desc = "身份证号码",demo = "123456789012345678")
	private String certNo;
	
	/** 身份证有效期 */
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "身份证有效期",constraint = "格式：YYYY-MM-DD;长期传”1972-12-12”",demo = "1972-12-12")
	private String certNoValidDate;
	
	/** 手机号 */
	@NotBlank
	@Size(min = 8, max = 16)
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	/** 性别 */
	@Length(max = 64)
	@OpenApiField(desc = "性别",constraint = "可选值为“男”或“女”",demo = "男")
	private String gender;
	
	/** 国籍 */
	@Length(max = 64)
	@OpenApiField(desc = "国籍",demo = "中国")
	private String country;
	
	/** 证件类型 */
	@Length(max = 64)
	@OpenApiField(desc = "证件类型",demo = "身份证")
	private String certType;
	
	/** 联系方式 */
	@Length(max = 64)
	@OpenApiField(desc = "联系方式",demo = "10086100101")
	private String phone;
	
	/** 地址 */
	@Length(max = 256)
	@OpenApiField(desc = "地址",demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String address;
	
	/** 职业 */
	@Length(max = 64)
	@OpenApiField(desc = "职业",demo = "COMPUTER")
	private String profession;
	
	/** 设备编号 */
	@Length(min = 1, max = 500)
	@OpenApiField(desc = "设备编号",demo = "dfers3524dfswer")
	private String deviceId;
	
	/** sim编号 */
	@Length(min = 1, max = 500)
	@OpenApiField(desc = "sim编号",demo = "sdf325156")
	private String sim;
	
	/** 信用卡cvv2 */
	@Length(min = 1, max = 10)
	@OpenApiField(desc = "信用卡cvv2",constraint = "信用卡背面数字，如”274”",demo = "274")
	private String cvv2;
	
	/** 信用卡有效期 */
	@Length(min = 1, max = 10)
	@OpenApiField(desc = "信用卡有效期",constraint = "四位数字年月， 如03/13, 传1303",demo = "1501")
	private String validDate;

	public String getPartnerUserId() {
		return this.partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	@JSONField(serialize = false)
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
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

	@JSONField(serialize = false)
	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertNoValidDate() {
		return certNoValidDate;
	}

	public void setCertNoValidDate(String certNoValidDate) {
		this.certNoValidDate = certNoValidDate;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
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

	public String getCvv2() {
		return this.cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public String getValidDate() {
		return this.validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
}

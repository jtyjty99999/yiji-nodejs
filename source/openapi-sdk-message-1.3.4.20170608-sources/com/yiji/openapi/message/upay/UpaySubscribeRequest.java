/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月23日 下午3:25:50 创建
 */
package com.yiji.openapi.message.upay;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upaySubscribe", type = ApiMessageType.Request)
public class UpaySubscribeRequest extends ApiRequest {
	
	@Length(max = 32)
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "签约类型")
	private String subscribeType;
	
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "用户名")
	private String userName;
	
	@Size(min = 15, max = 18)
	@OpenApiField(desc = "身份证号码")
	private String idCard;

	@OpenApiField(desc = "身份证到期日", constraint = "格式yyyyMMdd")
	private String validity;
	
	@NotBlank
	@Size(min = 11, max = 11)
	@OpenApiField(desc = "手机号码")
	private String mobileNo;
	
	@NotBlank
	@OpenApiField(desc = "银行卡号")
	private String bankCard;

	/**
	 * 性别
	 */
	@OpenApiField(desc = "性别",constraint = "性别")
	private String gender;

	/**
	 * [必填]国籍
	 */
	@Size(min = 3)
	@OpenApiField(desc = "国籍",constraint = "国籍")
	private String country;
	/**
	 * [必填]职业
	 */
	@Size(min = 2)
	@OpenApiField(desc = "职业",constraint = "职业")
	private String profession;
	/**
	 * 地址
	 */
	@Size(min = 10)
	@OpenApiField(desc = "地址",constraint = "地址")
	private String address;

	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getSubscribeType() {
		return this.subscribeType;
	}
	
	public void setSubscribeType(String subscribeType) {
		this.subscribeType = subscribeType;
	}
	
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
	
	public String getIdCard() {
		return this.idCard;
	}
	
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	public String getValidity() {
		return this.validity;
	}
	
	public void setValidity(String validity) {
		this.validity = validity;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getBankCard() {
		return this.bankCard;
	}
	
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
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
}

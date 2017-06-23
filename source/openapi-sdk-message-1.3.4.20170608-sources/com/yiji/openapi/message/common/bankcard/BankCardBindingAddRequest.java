/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月5日 上午10:32:48创建
 */
package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
@OpenApiMessage(service = "bankCardBindingAdd", type = ApiMessageType.Request)
public class BankCardBindingAddRequest extends ApiRequest {
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "易极付会员ID", constraint = "需要绑定银行卡的易极付会员ID",demo = "13245679801234567980")
	private String userId;
	
	@NotEmpty
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "需要绑定的卡号",demo = "123465798012346578")
	private String bankCardNo;
	
	@Length(max = 32)
	@OpenApiField(desc = "银行预留手机号", constraint = "银行预留手机号",demo = "10086100101")
	private String mobileNo;
	
	@Length(max = 16)
	@OpenApiField(desc = "开户行省份", constraint = "如：四川，重庆",demo = "重庆")
	private String province;
	
	@Length(max = 16)
	@OpenApiField(desc = "开户行城市", constraint = "如：成都，重庆",demo = "重庆")
	private String city;

	@OpenApiField(desc = "信用卡有效期", constraint = "格式：0118 表示2018年01月",demo = "0118")
	private String validDate;
	
	@OpenApiField(desc = "绑卡用途",demo = "DEDUCT")
	private String purpose = "DEDUCT";
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBankCardNo() {
		return this.bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getProvince() {
		return this.province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getValidDate() {
		return this.validDate;
	}
	
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}

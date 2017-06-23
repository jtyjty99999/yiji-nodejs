/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年12月1日 下午5:42:48 创建
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "mpayDeductDeposit", type = ApiMessageType.Request)
public class MpayDeductDepositRequest extends ApiRequest {
	
	@Length(max = 20)
	@NotBlank
	@OpenApiField(desc = "用户名",constraint="用户名",demo="20150619010000072320")
	private String userId;
	
	@Length(max = 32)
	@OpenApiField(desc = "签约编号",constraint="签约编号",demo="20150611000000361787")
	private String pactNo;
	
	@NotNull
	@OpenApiField(desc = "金额", constraint = "单位元,支持两位小数",demo="66.66")
	private Money amount;
	
	@Length(max = 32)
	@NotBlank
	@OpenApiField(desc = "支付密码",constraint="支付密码",demo="142154")
	private String password;
	
	@Length(max = 15)
	@NotBlank
	@OpenApiField(desc = "充值手机号",constraint="充值手机号",demo="13520124520")
	private String mobileNo;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "运营商编号",constraint="运营商编号",demo="002300009")
	private String agencyCode;
	
	@OpenApiField(desc = "支付方式", constraint = "支付方式",demo="BY_DEPOSIT")
	private String payWay;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPactNo() {
		return this.pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getAgencyCode() {
		return this.agencyCode;
	}
	
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	
	public String getPayWay() {
		return this.payWay;
	}
	
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
}

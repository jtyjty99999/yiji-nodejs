/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月24日 下午5:16:23 创建
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.Size;

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
@OpenApiMessage(service = "mpayBindBankCard", type = ApiMessageType.Request)
public class MpayBindBankCardRequest extends ApiRequest {
	
	@Size(min = 11, max = 20)
	@NotBlank
	@OpenApiField(desc = "用户ID",constraint="用户ID",demo="20150619010000072320")
	private String userId;
	
	@Size(min = 15, max = 21)
	@NotBlank
	@OpenApiField(desc = "银行卡号码",constraint="银行卡号码",demo="3652 2000 1954 3523")
	private String cardNo;
	
	@Size(min = 6, max = 10)
	@OpenApiField(desc = "手机支付密码",constraint="手机支付密码",demo="324234")
	private String mPayPwd;
	
	@Size(min = 4, max = 8)
	@NotBlank
	@OpenApiField(desc = "验证码",constraint="验证码",demo="2154")
	private String verifyCode;
	
	@Size(min = 4, max = 64)
	@NotBlank
	@OpenApiField(desc = "验证码服务端编号",constraint="验证码服务端编号",demo="1442971266265715")
	private String verifyCodeUniqueId;
	
	@OpenApiField(desc = "手机号",constraint="手机号",demo="13652142120")
	private String mobileNo;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardNo() {
		return this.cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getmPayPwd() {
		return this.mPayPwd;
	}
	
	public void setmPayPwd(String mPayPwd) {
		this.mPayPwd = mPayPwd;
	}
	
	public String getVerifyCode() {
		return this.verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getVerifyCodeUniqueId() {
		return this.verifyCodeUniqueId;
	}
	
	public void setVerifyCodeUniqueId(String verifyCodeUniqueId) {
		this.verifyCodeUniqueId = verifyCodeUniqueId;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}

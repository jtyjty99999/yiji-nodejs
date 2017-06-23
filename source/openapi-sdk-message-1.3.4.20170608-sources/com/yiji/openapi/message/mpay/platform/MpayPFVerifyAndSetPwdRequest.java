/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:21 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

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
@OpenApiMessage(service = "mpayPFVerifyAndSetPwd", type = ApiMessageType.Request)
public class MpayPFVerifyAndSetPwdRequest extends ApiRequest {
	
	/**
	 * 交易号
	 */
	@NotBlank
	@Length(max = 20, min = 20, message = "交易号不能为空")
	@OpenApiField(desc = "交易号",demo = "23156489713254")
	private String tradeNo;
	
	/**
	 * 外部会员id
	 */
	@NotBlank
	@Length(max = 200, min = 1, message = "外部会员id不能为空")
	@OpenApiField(desc = "外部会员id",demo = "12345678901234567890")
	private String partnerUserId;
	
	/**
	 * 验证码
	 */
	@NotBlank
	@Length(max = 10, min = 1, message = "验证码不能为空")
	@OpenApiField(desc = "验证码",demo = "123456")
	private String verifyCode;
	
	/**
	 * 支付密码
	 */
	@NotBlank
	@OpenApiField(desc = "支付密码", security = true,demo = "21345dfds")
	private String payPassword;

	@JSONField(serialize = false)
	public String getPayPassword() {
		return this.payPassword;
	}
	
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getVerifyCode() {
		return this.verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
}

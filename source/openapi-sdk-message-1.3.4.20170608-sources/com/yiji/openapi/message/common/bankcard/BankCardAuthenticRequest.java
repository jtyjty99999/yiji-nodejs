/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年9月19日 上午11:15:43 创建
 */
package com.yiji.openapi.message.common.bankcard;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "bankCardAuthentic", type = ApiMessageType.Request)
public class BankCardAuthenticRequest extends ApiRequest {
	
	@OpenApiField(desc = "签约流水号",demo = "12341564")
	@NotBlank
	@Size(max = 32)
	private String bindId;
	
	@OpenApiField(desc = "手机验证码",demo = "123456")
	@NotBlank
	@Size(max = 6, min = 6)
	private String verifyCode;
	
	public String getBindId() {
		return this.bindId;
	}
	
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	
	public String getVerifyCode() {
		return this.verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
}

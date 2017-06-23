/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年9月19日 上午11:15:43 创建
 */
package com.yiji.openapi.message.common.pact;

import javax.validation.constraints.NotNull;
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
@OpenApiMessage(service = "pactSign", type = ApiMessageType.Request)
public class PactSignRequest extends ApiRequest {
	@OpenApiField(desc = "签约流水号")
	@NotBlank
	@Size(max = 20)
	private String tradeNo;
	
	@OpenApiField(desc = "签约类型")
	@NotNull
	private String pactType;
	
	@OpenApiField(desc = "手机验证码")
	@NotBlank
	@Size(max = 6, min = 6)
	private String verifyCode;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPactType() {
		return this.pactType;
	}
	
	public void setPactType(String pactType) {
		this.pactType = pactType;
	}
	
	public String getVerifyCode() {
		return this.verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
}

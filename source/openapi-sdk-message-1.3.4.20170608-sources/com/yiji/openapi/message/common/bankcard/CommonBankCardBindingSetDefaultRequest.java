/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

package com.yiji.openapi.message.common.bankcard;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author zhike@yiji.com
 * 
 */
@OpenApiMessage(service = "commonBankCardBindingSetDefault", type = ApiMessageType.Request)
public class CommonBankCardBindingSetDefaultRequest extends ApiRequest {
	
	@NotBlank
	@Length(max=35)
	@OpenApiField(desc = "签约流水号", constraint = "签约流水号",demo = "F1K8QRwU00251X")
	private String pactNo;
	
	@NotNull
	@OpenApiField(desc = "签约目的", constraint = "签约目的",demo = "DEDUCT")
	private String purpose;

	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
}

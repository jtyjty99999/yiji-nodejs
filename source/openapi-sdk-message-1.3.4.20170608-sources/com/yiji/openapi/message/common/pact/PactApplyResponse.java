/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月19日 上午10:45:45 创建
 */
package com.yiji.openapi.message.common.pact;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "pactApply", type = ApiMessageType.Response)
public class PactApplyResponse extends ApiResponse {
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "签约流水号", constraint = "")
	private String tradeNo;
	
	@NotNull
	@OpenApiField(desc = "签约类型", constraint = "")
	private String pactType;
	
	@OpenApiField(desc = "签约状态")
	private String status;
	
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
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}

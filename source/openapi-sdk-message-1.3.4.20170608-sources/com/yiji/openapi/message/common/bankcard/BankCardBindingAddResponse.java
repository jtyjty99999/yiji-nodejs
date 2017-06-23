/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月5日 上午9:40:16创建
 */
package com.yiji.openapi.message.common.bankcard;

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
 * @author husheng@yiji.com
 * 
 */
@OpenApiMessage(service = "bankCardBindingAdd", type = ApiMessageType.Response)
public class BankCardBindingAddResponse extends ApiResponse {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "绑卡编号", demo = "1321465")
	private String bindId;
	
	@NotNull
	@OpenApiField(desc = "签约类型", demo = "REAL_NAME")
	private String pactType;
	
	@OpenApiField(desc = "签约状态",demo = "INIT")
	private String status;
	
	public String getBindId() {
		return this.bindId;
	}
	
	public void setBindId(String bindId) {
		this.bindId = bindId;
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
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月6日 下午4:40:08 创建
 */
package com.yiji.openapi.message.common.guaranteepay;

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
@OpenApiMessage(service = "guaranteePayDelay", type = ApiMessageType.Request)
public class GuaranteePayDelayRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "交易号", constraint = "易极付交易流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "延期时长", constraint = "延期时长，单位：分钟")
	private int deferMinutes;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public int getDeferMinutes() {
		return deferMinutes;
	}
	
	public void setDeferMinutes(int deferMinutes) {
		this.deferMinutes = deferMinutes;
	}
	
}

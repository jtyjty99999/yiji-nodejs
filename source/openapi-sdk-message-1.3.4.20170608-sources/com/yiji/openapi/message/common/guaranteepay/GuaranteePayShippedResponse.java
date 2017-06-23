/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月6日 下午4:10:38 创建
 */
package com.yiji.openapi.message.common.guaranteepay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "guaranteePayShipped", type = ApiMessageType.Response)
public class GuaranteePayShippedResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "交易状态",demo = "WAIT_BUYER_PAY")
	private String tradeStatus;
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
}

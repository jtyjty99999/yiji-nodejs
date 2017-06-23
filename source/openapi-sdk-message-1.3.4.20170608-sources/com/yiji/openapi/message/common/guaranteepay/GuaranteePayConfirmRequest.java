/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月6日 下午4:21:15 创建
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
@OpenApiMessage(service = "guaranteePayConfirm", type = ApiMessageType.Request)
public class GuaranteePayConfirmRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "交易号", constraint = "易极付交易流水号",demo = "2311564654987123")
	private String tradeNo;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}

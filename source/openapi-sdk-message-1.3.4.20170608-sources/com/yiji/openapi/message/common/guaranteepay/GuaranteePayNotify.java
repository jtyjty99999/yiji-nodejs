/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 下午2:43:27 创建
 */
package com.yiji.openapi.message.common.guaranteepay;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "guaranteePay", type = ApiMessageType.Notify)
public class GuaranteePayNotify extends ApiNotify {
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "交易号", constraint = "易极付交易流水号",demo = "1235644789")
	private String tradeNo;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "外部交易号",demo = "12356446893512")
	private String outOrderNo;
	
	@NotNull
	@OpenApiField(desc = "交易动作",demo = "escowTradeBuyerEscowpay")
	private String executeAction;
	
	@NotNull
	@OpenApiField(desc = "交易状态",demo = "wait_buyer_pay")
	private String tradeStatus;
	
	@NotNull
	@OpenApiField(desc = "交易金额",demo = "88.66")
	private String tradeAmount;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getExecuteAction() {
		return executeAction;
	}
	
	public void setExecuteAction(String executeAction) {
		this.executeAction = executeAction;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public String getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
}

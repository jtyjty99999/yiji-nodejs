/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月6日 下午4:25:53 创建
 */
package com.yiji.openapi.message.common.guaranteepay;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "guaranteePayConfirm", type = ApiMessageType.Notify)
public class GuaranteePayConfirmNotify extends ApiNotify {
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "交易号", constraint = "易极付交易流水号")
	private String tradeNo;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "商户订单号", constraint = "商户支付请求的原始订单号。")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "交易金额", constraint = "交易额度，必须等于买家所付总额（包含交易金额、买家收费、物流费、保险费）")
	private Money tradeAmount;
	
	@OpenApiField(desc = "交易动作")
	private String executeAction;
	
	@NotBlank
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
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
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
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
	
}

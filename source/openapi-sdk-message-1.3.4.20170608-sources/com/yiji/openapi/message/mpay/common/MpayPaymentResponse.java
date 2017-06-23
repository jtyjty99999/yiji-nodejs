/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月24日 下午5:16:23 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author xiyang
 * 
 */
@OpenApiMessage(service = "mpayPayment", type = ApiMessageType.Response)
public class MpayPaymentResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号",constraint="交易号",demo="20151016000124130517")
	private String tradeNo;
	
	@NotEmpty
	@OpenApiField(desc = "外部订单号",constraint="外部订单号",demo="20151016000124130517")
	private String outOrderNo;
	
	@OpenApiField(desc = "支付金额",constraint="支付金额",demo="20151016000124130517")
	private Money amount;
	
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
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 14:21 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzHandTenderPayment", type = ApiMessageType.Response)
public class YzzHandTenderPaymentResponse extends ApiResponse {
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	@OpenApiField(desc = "借款项目主交易号")
	@Size(min = 20, max = 20)
	private String tradeNo;
	
	@OpenApiField(desc = "投资交易号")
	@Size(min = 20, max = 20)
	private String paymentTradeNo;
	
	@OpenApiField(desc = "投资用戶ID")
	@Size(min = 20, max = 20)
	private String userId;
	
	@OpenApiField(desc = "付款状态")
	private String paymentStatus;
	
	@OpenApiField(desc = "投资金额")
	private Money amount;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPaymentTradeNo() {
		return paymentTradeNo;
	}
	
	public void setPaymentTradeNo(String paymentTradeNo) {
		this.paymentTradeNo = paymentTradeNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPaymentStatus() {
		return paymentStatus;
	}
	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
}

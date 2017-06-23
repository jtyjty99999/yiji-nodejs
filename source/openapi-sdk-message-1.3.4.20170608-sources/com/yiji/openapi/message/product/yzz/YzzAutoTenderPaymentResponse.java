/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 14:36 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yzz.info.PaymentResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzAutoTenderPayment", type = ApiMessageType.Response)
public class YzzAutoTenderPaymentResponse extends ApiResponse {
	
	@NotEmpty
	@OpenApiField(desc = "借款项目主交易号")
	@Size(min = 20, max = 20)
	private String tradeNo;
	
	@NotEmpty
	@OpenApiField(desc = "投资交易号")
	@Size(min = 20, max = 20)
	private String paymentTradeNo;
	
	@NotEmpty
	@OpenApiField(desc = "投资用戶ID")
	@Size(min = 20, max = 20)
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "付款状态")
	private String paymentStatus;
	
	@NotNull
	@OpenApiField(desc = "投资金额")
	private Money amount;
	
	@Size(min = 0, max = 10)
	@OpenApiField(desc = "分润付款明细")
	private List<PaymentResult> paymentResults;
	
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
	
	public List<PaymentResult> getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(List<PaymentResult> paymentResults) {
		this.paymentResults = paymentResults;
	}
}

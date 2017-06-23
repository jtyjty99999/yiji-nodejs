/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 14:17 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.Size;

import com.yiji.openapi.message.product.yzz.info.PaymentResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzTenderTradeConfirm", type = ApiMessageType.Response)
public class YzzTenderTradeConfirmResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "投资付款明细")
	List<PaymentResult> paymentResults;
	
	@OpenApiField(desc = "分润付款明细")
	List<PaymentResult> profitResults;
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public List<PaymentResult> getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(List<PaymentResult> paymentResults) {
		this.paymentResults = paymentResults;
	}
	
	public List<PaymentResult> getProfitResults() {
		return profitResults;
	}
	
	public void setProfitResults(List<PaymentResult> profitResults) {
		this.profitResults = profitResults;
	}
}

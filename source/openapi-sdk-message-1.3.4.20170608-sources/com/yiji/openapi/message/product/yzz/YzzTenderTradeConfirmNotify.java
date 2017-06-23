/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-09 14:29 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzTenderTradeConfirm", type = ApiMessageType.Notify)
public class YzzTenderTradeConfirmNotify extends ApiNotify {
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "投资付款明细")
	private String paymentResults;
	
	@OpenApiField(desc = "分润付款明细")
	private String profitResults;
	
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
	
	public String getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(String paymentResults) {
		this.paymentResults = paymentResults;
	}
	
	public String getProfitResults() {
		return profitResults;
	}
	
	public void setProfitResults(String profitResults) {
		this.profitResults = profitResults;
	}
}

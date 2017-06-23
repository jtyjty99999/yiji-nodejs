/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-12 17:40 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import com.yiji.openapi.message.product.yzz.info.PaymentResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzClaimsTransfer", type = ApiMessageType.Response)
public class YzzClaimsTransferResponse extends ApiResponse {
	
	@OpenApiField(desc = "业务号")
	private String bizNo;
	
	@OpenApiField(desc = "付款状态")
	private String paymentStatus;
	
	@OpenApiField(desc = "借款标号")
	private String tradeNo;
	
	@OpenApiField(desc = "付款人(买方)")
	private String buyerUserId;
	
	@OpenApiField(desc = "收款人(卖方)")
	private String sellerUserId;
	
	@OpenApiField(desc = "出售份额")
	private Money claimsAmount;
	
	@OpenApiField(desc = "转账金额")
	private Money transferAmount;
	
	@OpenApiField(desc = "分润付款明细")
	private List<PaymentResult> profitResults;
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getPaymentStatus() {
		return paymentStatus;
	}
	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public void setClaimsAmount(Money claimsAmount) {
		this.claimsAmount = claimsAmount;
	}
	
	public void setTransferAmount(Money transferAmount) {
		this.transferAmount = transferAmount;
	}
	
	public void setProfitResults(List<PaymentResult> profitResults) {
		this.profitResults = profitResults;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public Money getClaimsAmount() {
		return claimsAmount;
	}
	
	public Money getTransferAmount() {
		return transferAmount;
	}
	
	public List<PaymentResult> getProfitResults() {
		return profitResults;
	}
}

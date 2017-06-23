/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-12 13:47 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.yzz.info.ProfitOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzClaimsTransfer", type = ApiMessageType.Request)
public class YzzClaimsTransferRequest extends ApiRequest {
	
	@Length(max = 20, min = 20)
	@NotBlank
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人")
	private String buyerUserId;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "收款人")
	private String sellerUserId;
	
	@NotNull
	@OpenApiField(desc = "出售份额")
	private Money claimsAmount;
	
	@NotNull
	@OpenApiField(desc = "转账金额")
	private Money transferAmount;
	
	@OpenApiField(desc = "备注")
	private String memo;
	
	@Size(min = 0, max = 10)
	@OpenApiField(desc = "分润列表")
	private List<ProfitOrder> profitOrders;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public Money getClaimsAmount() {
		return claimsAmount;
	}
	
	public void setClaimsAmount(Money claimsAmount) {
		this.claimsAmount = claimsAmount;
	}
	
	public Money getTransferAmount() {
		return transferAmount;
	}
	
	public void setTransferAmount(Money transferAmount) {
		this.transferAmount = transferAmount;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public List<ProfitOrder> getProfitOrders() {
		return profitOrders;
	}
	
	public void setProfitOrders(List<ProfitOrder> profitOrders) {
		this.profitOrders = profitOrders;
	}
}

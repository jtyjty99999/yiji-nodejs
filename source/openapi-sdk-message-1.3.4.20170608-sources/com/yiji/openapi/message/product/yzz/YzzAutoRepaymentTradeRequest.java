/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 15:00 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yzz.info.PaymentSubOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzAutoRepaymentTrade", type = ApiMessageType.Request)
public class YzzAutoRepaymentTradeRequest extends ApiRequest {
	
	@NotEmpty
	@Size(min = 20, max = 64)
	@OpenApiField(desc = "借款项目编码", constraint = "借款项目编码需要与借款项目交易一致")
	private String tradeNo;
	
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "还款用户Id")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "还款总金额")
	private Money totalAmount;
	
	@Size(min = 1, max = 400)
	@OpenApiField(desc = "还款明细")
	List<PaymentSubOrder> repaymentSubOrders;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public List<PaymentSubOrder> getRepaymentSubOrders() {
		return repaymentSubOrders;
	}
	
	public void setRepaymentSubOrders(List<PaymentSubOrder> repaymentSubOrders) {
		this.repaymentSubOrders = repaymentSubOrders;
	}
}

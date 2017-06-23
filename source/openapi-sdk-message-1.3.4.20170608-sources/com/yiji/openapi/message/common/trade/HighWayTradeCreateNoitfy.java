/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月14日 上午11:13:55 创建
 */
package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "highWayTradeCreate", type = ApiMessageType.Notify)
public class HighWayTradeCreateNoitfy extends ApiNotify {
	
	@OpenApiField(desc = "充值流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "充值金额")
	private Money amount;
	
	@OpenApiField(desc = "实际到账金额")
	private Money amountIn;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getAmountIn() {
		return this.amountIn;
	}
	
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
}

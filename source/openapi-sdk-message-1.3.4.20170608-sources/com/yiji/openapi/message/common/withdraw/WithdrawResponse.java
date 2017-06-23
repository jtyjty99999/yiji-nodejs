/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午2:36:02 创建
 */
package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "withdraw", type = ApiMessageType.Response)
public class WithdrawResponse extends ApiResponse {
	/**
	 * 提现流水号
	 */
	@OpenApiField(desc = "提现流水号")
	private String tradeNo;
	
	/** 提现金额 */
	@OpenApiField(desc = "提现金额")
	private Money amount = Money.zero();
	
	/** 提现金额 */
	@OpenApiField(desc = "到账金额")
	private Money amountIn = Money.zero();
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getAmountIn() {
		return amountIn;
	}
	
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
}

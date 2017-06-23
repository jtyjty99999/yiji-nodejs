/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午8:52:09 创建
 */
package com.yiji.openapi.message.common.deposit;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author mayansen
 * @date 20140904
 * 
 */
@OpenApiMessage(service = "ebankGatewayDeposit", type = ApiMessageType.Notify)
public class EBankDepositGatewayNotify extends ApiNotify {
	
	@OpenApiField(desc = "充值流水号",demo = "1234567498")
	private String tradeNo;
	
	@OpenApiField(desc = "充值金额",demo = "88.66")
	private Money amount;
	
	@OpenApiField(desc = "实际到账金额",demo = "88.66")
	private Money amountIn;
	
	/**
	 * @return the tradeNo
	 */
	public String getTradeNo() {
		return tradeNo;
	}
	
	/**
	 * @param tradeNo the tradeNo to set
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the amountIn
	 */
	public Money getAmountIn() {
		return amountIn;
	}
	
	/**
	 * @param amountIn the amountIn to set
	 */
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
}

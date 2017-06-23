/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月4日 上午10:35:33 创建
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
 * @author xiyang
 *
 */
@OpenApiMessage(service = "rechargeBackApply", type = ApiMessageType.Notify)
public class RechargeBackApplyNotify extends ApiNotify {
	
	/**
	 * 充退流水号
	 */
	@OpenApiField(desc = "充退流水号")
	private String tradeNo;
	
	/**
	 * 充退成功金额
	 */
	@OpenApiField(desc = "充退成功金额")
	private Money amount;
	
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
	
}

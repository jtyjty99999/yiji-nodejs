/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-30 10:42 创建
 *
 */
package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "mpayGotoWithdraw", type = ApiMessageType.Notify)
public class MpayGotoWithdrawNotify extends ApiNotify {
	
	@OpenApiField(desc = "用户ID", constraint = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "易极付交易号", constraint = "易极付交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "业务订单号", constraint = "业务订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易金额", constraint = "交易金额")
	private Money amount;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
}

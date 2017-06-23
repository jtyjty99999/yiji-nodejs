/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月12日 下午5:48:51 创建
 */
package com.yiji.openapi.message.upay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upayRefund", type = ApiMessageType.Notify)
public class UpayRefundNotify extends ApiNotify {
	
	@OpenApiField(desc = "退款交易流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "退款金额")
	private String amount;
	
	@OpenApiField(desc = "外部请求订单号")
	private String outOrderNo;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getAmount() {
		return this.amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

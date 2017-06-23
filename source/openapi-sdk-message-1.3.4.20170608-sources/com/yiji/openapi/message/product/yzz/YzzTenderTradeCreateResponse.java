/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com Thu Jan 22 14:00:55 CST 2015 创建
 */
package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "yzzTenderTradeCreate", type = ApiMessageType.Response)
public class YzzTenderTradeCreateResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易状态", constraint = "可选值：{TRADE_PROCESSING：交易中，TRADE_FINISHED：交易完成，TRADE_CLOSED：交易关闭}")
	private String tradeStatus;
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
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
	
}
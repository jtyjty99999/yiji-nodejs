/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月4日 下午10:20:34 创建
 */
package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "tradeRemittance", type = ApiMessageType.Response)
public class TradeRemittanceApiResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "交易状态", constraint = "trade_finished交易已完成 trade_process交易处理中 trade_closed交易关闭")
	private String tradeStatus;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeStatus() {
		return this.tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
}

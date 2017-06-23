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
 * @author zyinyan@yiji.com
 *
 */
@OpenApiMessage(service = "tradeTransferWarp", type = ApiMessageType.Response)
public class TradeTransferWarpResponse extends ApiResponse {
	
	/** 交易号 */
	@OpenApiField(desc = "交易号")
	protected String tradeNo;
	
	/** 交易状态 */
	@OpenApiField(desc = "交易状态")
	protected String tradeStatus;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
}

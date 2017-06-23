/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月20日 下午6:02:54 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.Map;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "queryTradeOrderType", type = ApiMessageType.Response)
public class QueryTradeOrderTypeResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易类型列表")
	private Map<String, String> tradeOrderType;
	
	public Map<String, String> getTradeOrderType() {
		return this.tradeOrderType;
	}
	
	public void setTradeOrderType(Map<String, String> tradeOrderType) {
		this.tradeOrderType = tradeOrderType;
	}
	
}

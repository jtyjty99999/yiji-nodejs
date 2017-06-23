/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月21日 下午1:49:17 创建
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
@OpenApiMessage(service = "queryTradeOrderAuditStatus", type = ApiMessageType.Response)
public class QueryTradeOrderAuditStatusResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易订单审核状态")
	private Map<String, String> tradeOrderAuditStatus;
	
	public Map<String, String> getTradeOrderAuditStatus() {
		return this.tradeOrderAuditStatus;
	}
	
	public void setTradeOrderAuditStatus(Map<String, String> tradeOrderAuditStatus) {
		this.tradeOrderAuditStatus = tradeOrderAuditStatus;
	}
	
}

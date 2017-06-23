/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-27 11:10 创建
 *
 */
package com.yiji.openapi.message.common.query;

import java.util.ArrayList;
import java.util.List;

import com.yiji.openapi.message.common.query.info.RefundQueryInfo;
import com.yiji.openapi.message.common.query.info.TradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "tradePolymerQuery", type = ApiMessageType.Response)
public class TradePolymerQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易基本信息")
	private TradeInfo tradeInfo;
	
	@OpenApiField(desc = "退款信息列表")
	private List<RefundQueryInfo> refundInfo = new ArrayList<RefundQueryInfo>();
	
	public TradeInfo getTradeInfo() {
		return tradeInfo;
	}
	
	public void setTradeInfo(TradeInfo tradeInfo) {
		this.tradeInfo = tradeInfo;
	}
	
	public List<RefundQueryInfo> getRefundInfo() {
		return refundInfo;
	}
	
	public void setRefundInfo(List<RefundQueryInfo> refundInfo) {
		this.refundInfo = refundInfo;
	}
}

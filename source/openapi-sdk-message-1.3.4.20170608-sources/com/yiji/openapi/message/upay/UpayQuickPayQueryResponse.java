/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月24日 上午11:05:23 创建
 */
package com.yiji.openapi.message.upay;

import java.util.List;

import com.yiji.openapi.message.upay.info.QuickPayTrade;
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
@Deprecated
@OpenApiMessage(service = "upayQuickPay", type = ApiMessageType.Response)
public class UpayQuickPayQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "总行数")
	private int totalRows;
	
	@OpenApiField(desc = "是否所有数据已返回")
	private boolean isTruncated;
	
	@OpenApiField(desc = "查询结果")
	private List<QuickPayTrade> quickPayTrades;
	
	public int getTotalRows() {
		return this.totalRows;
	}
	
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	
	public boolean isTruncated() {
		return this.isTruncated;
	}
	
	public void setTruncated(boolean isTruncated) {
		this.isTruncated = isTruncated;
	}
	
	public List<QuickPayTrade> getQuickPayTrades() {
		return this.quickPayTrades;
	}
	
	public void setQuickPayTrades(List<QuickPayTrade> quickPayTrades) {
		this.quickPayTrades = quickPayTrades;
	}
	
}

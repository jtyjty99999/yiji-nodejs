/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年9月3日 下午8:12:35 创建
 */
package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.IncomeOutcomeInfo;
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
@OpenApiMessage(service = "incomeOutcomeQuery", type = ApiMessageType.Response)
public class IncomeOutcomeQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "记录总数",demo = "2")
	private long totalCount;
	
	@OpenApiField(desc = "总页数",demo = "1")
	private long totalPageCount;
	
	@OpenApiField(desc = "当前页",demo = "1")
	private long currentPageNo;
	
	@OpenApiField(desc = "本页记录")
	private List<IncomeOutcomeInfo> incomeOutcomeInfoList;
	
	public List<IncomeOutcomeInfo> getIncomeOutcomeInfoList() {
		return this.incomeOutcomeInfoList;
	}
	
	public void setIncomeOutcomeInfoList(List<IncomeOutcomeInfo> incomeOutcomeInfoList) {
		this.incomeOutcomeInfoList = incomeOutcomeInfoList;
	}
	
	public long getTotalCount() {
		return this.totalCount;
	}
	
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
	public long getTotalPageCount() {
		return this.totalPageCount;
	}
	
	public void setTotalPageCount(long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public long getCurrentPageNo() {
		return this.currentPageNo;
	}
	
	public void setCurrentPageNo(long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	
}

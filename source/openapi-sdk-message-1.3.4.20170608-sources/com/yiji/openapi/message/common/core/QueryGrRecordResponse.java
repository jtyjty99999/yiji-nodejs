/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-05 11:05 创建
 *
 */
package com.yiji.openapi.message.common.core;

import java.util.List;

import com.yiji.openapi.message.common.core.info.GrQueryRecordResultInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "queryGrRecord", type = ApiMessageType.Response)
public class QueryGrRecordResponse extends ApiResponse {
	
	@OpenApiField(desc = "记录列表")
	private List<GrQueryRecordResultInfo> recordInfoList;
	
	@OpenApiField(desc = "总行数")
	private long totalRows;
	
	public List<GrQueryRecordResultInfo> getRecordInfoList() {
		return recordInfoList;
	}
	
	public void setRecordInfoList(List<GrQueryRecordResultInfo> recordInfoList) {
		this.recordInfoList = recordInfoList;
	}
	
	public long getTotalRows() {
		return totalRows;
	}
	
	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}
}

package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.TradeQueryInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

@OpenApiMessage(service = "tradeRecordQuery", type = ApiMessageType.Response)
public class TradeRecordQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "页码")
	private long pageNo;
	
	@OpenApiField(desc = "每页记录数")
	private long pageSize;
	
	@OpenApiField(desc = "总记录数")
	private long totalCount;
	
	@OpenApiField(desc = "查询查询列表")
	private List<TradeQueryInfo> tradeQueryInfolist;
	
	public long getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}
	
	public long getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	
	public long getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
	public List<TradeQueryInfo> getTradeQueryInfolist() {
		return tradeQueryInfolist;
	}
	
	public void setTradeQueryInfolist(List<TradeQueryInfo> tradeQueryInfolist) {
		this.tradeQueryInfolist = tradeQueryInfolist;
	}
	
}

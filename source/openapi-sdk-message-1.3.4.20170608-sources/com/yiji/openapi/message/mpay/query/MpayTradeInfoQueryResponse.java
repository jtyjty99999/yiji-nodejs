package com.yiji.openapi.message.mpay.query;

import java.util.List;

import com.yiji.openapi.message.mpay.query.info.MpayTradeInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "mpayTradeInfoQuery", type = ApiMessageType.Response)
public class MpayTradeInfoQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "页码",demo = "1")
	private Long pageNo;
	
	@OpenApiField(desc = "每页大小",demo = "1")
	private Long pageSize;
	
	@OpenApiField(desc = "记录总数",demo = "1")
	private Long count;
	
	@OpenApiField(desc = "查询列表")
	private List<MpayTradeInfo> tradeInfoList;

	public List<MpayTradeInfo> getTradeInfoList() {
		return tradeInfoList;
	}

	public void setTradeInfoList(List<MpayTradeInfo> tradeInfoList) {
		this.tradeInfoList = tradeInfoList;
	}

	public Long getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	
	public Long getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	
	public Long getCount() {
		return count;
	}
	
	public void setCount(Long count) {
		this.count = count;
	}
	
}

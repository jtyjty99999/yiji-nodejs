package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.ProductOverviewInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "storeGoodsQuery", type = ApiMessageType.Response)
public class StoreGoodsQueryResponse extends ApiResponse {
	@OpenApiField(desc = "当前页数")
	private int pageNo;
	
	@OpenApiField(desc = "当前页记录数")
	private int pageSize;
	
	@OpenApiField(desc = "总记录数")
	private int totalCount;
	
	@OpenApiField(desc = "结果列表")
	private List<ProductOverviewInfo> protOverviewInfoPageList;
	
	public int getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public List<ProductOverviewInfo> getProtOverviewInfoPageList() {
		return protOverviewInfoPageList;
	}
	
	public void setProtOverviewInfoPageList(List<ProductOverviewInfo> protOverviewInfoPageList) {
		this.protOverviewInfoPageList = protOverviewInfoPageList;
	}
	
}

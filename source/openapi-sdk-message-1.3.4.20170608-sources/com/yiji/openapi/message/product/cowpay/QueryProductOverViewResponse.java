package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.ProductOverviewInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "queryProductOverView", type = ApiMessageType.Response)
public class QueryProductOverViewResponse extends ApiResponse {
	
	@OpenApiField(desc = "分页结果列表")
	private List<ProductOverviewInfo> productOverviewInfoPageList;
	
	@OpenApiField(desc = "总记录数")
	private int totalCount;
	
	public List<ProductOverviewInfo> getProductOverviewInfoPageList() {
		return productOverviewInfoPageList;
	}
	
	public void setProductOverviewInfoPageList(List<ProductOverviewInfo> productOverviewInfoPageList) {
		this.productOverviewInfoPageList = productOverviewInfoPageList;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
}

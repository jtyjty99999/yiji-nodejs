package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.SellingTradeOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/20.
 */
@OpenApiMessage(service = "findSellerOrderInfoByUserId", type = ApiMessageType.Response)
public class FindSellerInfoResponse extends ApiResponse {
	
	@OpenApiField(desc = "当前页数")
	private int pageNo;
	
	@OpenApiField(desc = "当前页记录数")
	private int pageSize;
	
	@OpenApiField(desc = "总记录数")
	private int totalCount;
	
	@OpenApiField(desc = "经销商订单信息")
	private List<SellingTradeOrderInfo> sellingTradeOrderInfos;
	
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
	
	public List<SellingTradeOrderInfo> getSellingTradeOrderInfos() {
		return sellingTradeOrderInfos;
	}
	
	public void setSellingTradeOrderInfos(List<SellingTradeOrderInfo> sellingTradeOrderInfos) {
		this.sellingTradeOrderInfos = sellingTradeOrderInfos;
	}
}

package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.RaceOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/4/17.
 */
@OpenApiMessage(service = "queryOrderInfoPageList", type = ApiMessageType.Response)
public class QueryPageListForQiFuTongResponse extends ApiResponse {
	
	@OpenApiField(desc = "订单列表信息")
	private List<RaceOrder> raceOrderPageList;
	
	@OpenApiField(desc = "当前页记录数")
	private int pageSize;
	
	@OpenApiField(desc = "页码")
	private int pageNum;
	
	public List<RaceOrder> getRaceOrderPageList() {
		return raceOrderPageList;
	}
	
	public void setRaceOrderPageList(List<RaceOrder> raceOrderPageList) {
		this.raceOrderPageList = raceOrderPageList;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}

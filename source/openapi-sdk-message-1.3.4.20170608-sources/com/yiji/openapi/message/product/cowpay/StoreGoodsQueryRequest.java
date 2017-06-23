package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "storeGoodsQuery", type = ApiMessageType.Request)
public class StoreGoodsQueryRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "经销商ID")
	private String dealerUserId;
	
	@OpenApiField(desc = "页面记录数")
	private Long pageSize;
	
	@OpenApiField(desc = "页码数")
	private Long pageNo;
	
	public String getDealerUserId() {
		return dealerUserId;
	}
	
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}
	
	public Long getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	
	public Long getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	
}

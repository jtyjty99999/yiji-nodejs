package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "queryProductBasic", type = ApiMessageType.Request)
public class QueryProductBasicRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 128)
	@OpenApiField(desc = "产品基础代码")
	private String productBasicCode;
	
	@NotEmpty
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "经销商UserId")
	private String dealerUserId;
	
	public String getProductBasicCode() {
		return productBasicCode;
	}
	
	public void setProductBasicCode(String productBasicCode) {
		this.productBasicCode = productBasicCode;
	}
	
	public String getDealerUserId() {
		return dealerUserId;
	}
	
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}
	
}

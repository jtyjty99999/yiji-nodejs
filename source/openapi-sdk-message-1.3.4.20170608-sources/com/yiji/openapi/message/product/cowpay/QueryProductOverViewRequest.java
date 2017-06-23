package com.yiji.openapi.message.product.cowpay;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.cowpay.info.ProductClassify;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "queryProductOverView", type = ApiMessageType.Request)
public class QueryProductOverViewRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "供应商userId")
	private String providerUserId;
	
	@OpenApiField(desc = "商品分类")
	private ProductClassify classify;
	
	@Min(value = 1)
	@OpenApiField(desc = "页码")
	private Long pageNo;
	
	@Max(value = 50)
	@Min(value = 1)
	@OpenApiField(desc = "每页大小")
	private Long pageSize;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "经销商userId")
	private String dealerUserId;
	
	public String getProviderUserId() {
		return providerUserId;
	}
	
	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	
	public ProductClassify getClassify() {
		return classify;
	}
	
	public void setClassify(ProductClassify classify) {
		this.classify = classify;
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
	
	public String getDealerUserId() {
		return dealerUserId;
	}
	
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}
}

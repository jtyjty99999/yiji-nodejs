package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "queryProductClassifyTree", type = ApiMessageType.Request)
public class QueryProductClassifyTreeRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "供应商userId")
	private String providerUserId;
	
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
	
	public String getDealerUserId() {
		return dealerUserId;
	}
	
	public void setDealerUserId(String dealerUserId) {
		this.dealerUserId = dealerUserId;
	}
}

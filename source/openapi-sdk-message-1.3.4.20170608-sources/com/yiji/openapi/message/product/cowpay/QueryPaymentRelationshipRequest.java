package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/4/18.
 */
@OpenApiMessage(service = "queryPaymentRelationship", type = ApiMessageType.Request)
public class QueryPaymentRelationshipRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@OpenApiField(desc = "付款类型")
	private Integer type;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
}

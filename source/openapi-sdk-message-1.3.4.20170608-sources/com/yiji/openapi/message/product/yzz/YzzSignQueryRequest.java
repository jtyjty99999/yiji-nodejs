package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "yzzSignQuery", type = ApiMessageType.Request)
public class YzzSignQueryRequest extends ApiRequest {
	
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "还款用户Id")
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

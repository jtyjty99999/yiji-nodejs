package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/1/15.
 */
@OpenApiMessage(service = "", type = ApiMessageType.Request)
public class UserBelongMerchantOrNotRequest extends ApiRequest {
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

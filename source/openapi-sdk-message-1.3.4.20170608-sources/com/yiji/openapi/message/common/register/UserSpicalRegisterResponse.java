package com.yiji.openapi.message.common.register;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@Deprecated
@OpenApiMessage(service = "userSpicalRegister", type = ApiMessageType.Response)
public class UserSpicalRegisterResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户id",demo = "20140909010000052206")
	private String userId;
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

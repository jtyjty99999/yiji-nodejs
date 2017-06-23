package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "yzzSignForward", type = ApiMessageType.Response)
public class YzzSignForwardResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@OpenApiField
	private String gid;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

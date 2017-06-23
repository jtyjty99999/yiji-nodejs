package com.yiji.openapi.message.product.yzz;

import java.util.List;

import com.yiji.openapi.message.product.yzz.info.SignInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "yzzSignQuery", type = ApiMessageType.Response)
public class YzzSignQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "用户有效协议列表")
	private List<SignInfo> signInfos;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public List<SignInfo> getSignInfos() {
		return signInfos;
	}
	
	public void setSignInfos(List<SignInfo> signInfos) {
		this.signInfos = signInfos;
	}
	
}

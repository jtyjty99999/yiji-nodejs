package com.yiji.openapi.message.common.tool;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/16.
 */
@OpenApiMessage(service = "bornSign", type = ApiMessageType.Response)
public class SignResponse extends ApiResponse {
	
	@OpenApiField(desc = "签名字符串")
	private String signStr;
	
	public String getSignStr() {
		return signStr;
	}
	
	public void setSignStr(String signStr) {
		this.signStr = signStr;
	}
	
}

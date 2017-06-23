package com.yiji.openapi.message.common.tool;

import java.util.Map;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/1/16.
 */
@OpenApiMessage(service = "bornSign", type = ApiMessageType.Request)
public class SignRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(desc = "请求集合")
	private Map<String, String> requestMap;
	
	public Map<String, String> getRequestMap() {
		return requestMap;
	}
	
	public void setRequestMap(Map<String, String> requestMap) {
		this.requestMap = requestMap;
	}
}

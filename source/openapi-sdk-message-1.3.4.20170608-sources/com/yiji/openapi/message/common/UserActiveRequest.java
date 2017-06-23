package com.yiji.openapi.message.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 用户激活 请求报文
 * 
 * @author zhangpu
 * 
 */
@OpenApiMessage(service = "userActive", type = ApiMessageType.Request)
public class UserActiveRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "易极付用户ID")
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

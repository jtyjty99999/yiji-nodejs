/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */
package com.yiji.openapi.message.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 通用注册响应
 * 
 * @author zhangpu
 * @date 2014年8月5日
 */
@Deprecated
@OpenApiMessage(service = "userCommonRegister", type = ApiMessageType.Response)
public class UserCommonRegisterResponse extends ApiResponse {
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "易极付用户ID",demo = "12345678901234567890")
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-07 16:41 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "verifyPayPwd", type = ApiMessageType.Request)
public class VerifyPayPwdRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户帐号", constraint = "用户登陆易极付的ID",demo ="12345678901234567890")
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-17 14:48 创建
 *
 */
package com.yiji.openapi.message.common.user;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "ppmActivate", type = ApiMessageType.Request)
public class PpmActivateRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "用户名")
	private String userName;
	
	@Size(max = 2)
	@OpenApiField(desc = "是否需要设置密码", constraint = "是否需要设置密码")
	private String setPassword;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getSetPassword() {
		return setPassword;
	}
	
	public void setSetPassword(String setPassword) {
		this.setPassword = setPassword;
	}
}

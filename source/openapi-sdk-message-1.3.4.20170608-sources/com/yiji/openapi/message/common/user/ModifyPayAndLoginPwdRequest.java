/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-14 17:53 创建
 *
 */
package com.yiji.openapi.message.common.user;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "modifyPayAndLoginPwd", type = ApiMessageType.Request)
public class ModifyPayAndLoginPwdRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "请求时间", constraint = "格式yyyyMMddHHmmss")
	private String requestTime;
	
	@NotBlank
	@OpenApiField(desc = "修改类型", constraint = "payPwd支付密码，loginPwd登录密码，all全部")
	private String passwordType;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRequestTime() {
		return requestTime;
	}
	
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
	public String getPasswordType() {
		return passwordType;
	}
	
	public void setPasswordType(String passwordType) {
		this.passwordType = passwordType;
	}
}

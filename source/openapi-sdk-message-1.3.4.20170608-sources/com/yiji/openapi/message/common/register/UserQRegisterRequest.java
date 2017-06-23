/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-14 10:32 创建
 *
 */
package com.yiji.openapi.message.common.register;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "userQRegister", type = ApiMessageType.Request)
public class UserQRegisterRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户姓名")
	private String userName;
	
	@NotNull
	@OpenApiField(desc = "用户类型")
	private String userType;
	
	@OpenApiField(desc = "注册来源")
	private String registerFrom;
	
	@NotBlank
	@OpenApiField(desc = "外部用户ID")
	private String externalId;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getRegisterFrom() {
		return registerFrom;
	}
	
	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
}

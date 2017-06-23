/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-15 16:44 创建
 *
 */
package com.yiji.openapi.message.common.user;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonChangePassword", type = ApiMessageType.Request)
public class CommonChangePasswordRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "用户名",demo = "易极付")
	private String userName;
	
	@NotBlank
	@OpenApiField(desc = "旧密码", constraint = "旧密码", security = true,demo = "1sdf")
	private String oldPassword;
	
	@NotBlank
	@OpenApiField(desc = "新密码", constraint = "新密码", security = true,demo = "1231456")
	private String newPassword;
	
	@NotBlank
	@OpenApiField(desc = "新密码", constraint = "新密码", security = true,demo = "1321456")
	private String newConfirmPassword;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getOldPassword() {
		return oldPassword;
	}
	
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	public String getNewConfirmPassword() {
		return newConfirmPassword;
	}
	
	public void setNewConfirmPassword(String newConfirmPassword) {
		this.newConfirmPassword = newConfirmPassword;
	}
}

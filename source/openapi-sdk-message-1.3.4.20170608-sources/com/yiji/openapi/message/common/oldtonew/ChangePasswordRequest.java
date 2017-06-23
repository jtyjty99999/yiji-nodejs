/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 上午9:48:05 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "changePassword", type = ApiMessageType.Request)
public class ChangePasswordRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "用户名", demo = "123@yiji.com")
	private String userName;

	@NotBlank
	@OpenApiField(desc = "老密码", demo = "123456")
	private String oldPassword;

	@NotBlank
	@OpenApiField(desc = "新密码", demo = "234567")
	private String newPassword;

	@NotBlank
	@OpenApiField(desc = "确认密码", demo = "234567")
	private String newConfirmPassword;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOldPassword() {
		return this.oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewConfirmPassword() {
		return this.newConfirmPassword;
	}

	public void setNewConfirmPassword(String newConfirmPassword) {
		this.newConfirmPassword = newConfirmPassword;
	}
}

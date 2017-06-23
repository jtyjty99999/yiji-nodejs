package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-19<br>
 */
@OpenApiMessage(service = "forgetPaymentPassword", type = ApiMessageType.Request)
public class ForgetPaymentPasswordRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "新密码", demo = "password123")
	private String newPassword;

	@NotNull
	@OpenApiField(desc = "确认新密码", demo = "password123")
	private String newConfirmPassword;

	@NotNull
	@OpenApiField(desc = "用户名", demo = "someone@yiji.com")
	private String userName;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

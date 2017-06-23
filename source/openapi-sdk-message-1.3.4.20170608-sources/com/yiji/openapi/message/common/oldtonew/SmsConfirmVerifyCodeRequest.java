package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-01<br>
 */
@OpenApiMessage(service = "smsConfirmVerifyCode", type = ApiMessageType.Request)
public class SmsConfirmVerifyCodeRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "验证码", demo = "2398")
	private String checkCodeString;

	@NotNull
	@OpenApiField(desc = "验证码id", demo = "xxx")
	private String checkCodeUniqueId;

	public String getCheckCodeString() {
		return checkCodeString;
	}

	public void setCheckCodeString(String checkCodeString) {
		this.checkCodeString = checkCodeString;
	}

	public String getCheckCodeUniqueId() {
		return checkCodeUniqueId;
	}

	public void setCheckCodeUniqueId(String checkCodeUniqueId) {
		this.checkCodeUniqueId = checkCodeUniqueId;
	}
}

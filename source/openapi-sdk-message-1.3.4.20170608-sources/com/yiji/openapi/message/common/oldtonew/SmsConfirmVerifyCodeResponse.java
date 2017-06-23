package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-01<br>
 */
@OpenApiMessage(service = "smsConfirmVerifyCode", type = ApiMessageType.Response)
public class SmsConfirmVerifyCodeResponse extends ApiResponse {

	@OpenApiField(desc = "验证码id", demo = "xxx")
	private String checkCodeUniqueId;

	@OpenApiField(desc = "验证码", demo = "239876")
	private String checkCodeString;

	@OpenApiField(desc = "验证码字节流", demo = "xxx")
	private String checkCodeByte;

	public String getCheckCodeUniqueId() {
		return checkCodeUniqueId;
	}

	public void setCheckCodeUniqueId(String checkCodeUniqueId) {
		this.checkCodeUniqueId = checkCodeUniqueId;
	}

	public String getCheckCodeString() {
		return checkCodeString;
	}

	public void setCheckCodeString(String checkCodeString) {
		this.checkCodeString = checkCodeString;
	}

	public String getCheckCodeByte() {
		return checkCodeByte;
	}

	public void setCheckCodeByte(String checkCodeByte) {
		this.checkCodeByte = checkCodeByte;
	}
}

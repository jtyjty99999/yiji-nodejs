package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-26<br>
 */
@Deprecated
@OpenApiMessage(service = "userSpecialRegister", type = ApiMessageType.Response)
public class UserSpecialRegisterResponse extends ApiResponse {

	@OpenApiField(desc = "用户ID", demo = "20130812020055285248")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

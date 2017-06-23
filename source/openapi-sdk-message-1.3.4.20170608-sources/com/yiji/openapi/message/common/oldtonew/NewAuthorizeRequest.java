package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-18<br>
 */
@Deprecated
@OpenApiMessage(service = "new_authorize", type = ApiMessageType.Request)
public class NewAuthorizeRequest extends ApiRequest {

	@NotNull
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "12346579801234567980")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

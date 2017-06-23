package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-15<br>
 */
@OpenApiMessage(service = "ppmBalanceRecord", type = ApiMessageType.Request)
public class PpmBalanceRecordRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "用户ID", demo = "12345678900987654321")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

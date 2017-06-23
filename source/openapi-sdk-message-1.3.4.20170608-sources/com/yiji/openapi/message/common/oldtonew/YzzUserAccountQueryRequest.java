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
 * @since 2016-01-19<br>
 */
@OpenApiMessage(service = "yzzUserAccountQuery", type = ApiMessageType.Request)
public class YzzUserAccountQueryRequest extends ApiRequest {

	@NotNull
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID", demo = "12345679801324567890")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

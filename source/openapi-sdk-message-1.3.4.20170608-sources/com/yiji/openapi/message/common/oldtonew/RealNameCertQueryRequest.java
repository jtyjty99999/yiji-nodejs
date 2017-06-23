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
 * @since 2016-01-26<br>
 */
@Deprecated
@OpenApiMessage(service = "realNameCert.query", type = ApiMessageType.Request)
public class RealNameCertQueryRequest extends ApiRequest {

	@NotNull
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID", demo = "12390289489238789476")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

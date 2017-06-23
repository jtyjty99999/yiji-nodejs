package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-02-01<br>
 */
@OpenApiMessage(service = "applyMobileBindingCustomer", type = ApiMessageType.Request)
public class ApplyMobileBindingCustomerRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "用户ID", demo = "12345678900987654321")
	private String userId;

	@NotBlank
	@OpenApiField(desc = "手机号", demo = "135****2356")
	private String mobile;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}

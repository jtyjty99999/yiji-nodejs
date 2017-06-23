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
 * @since 2016-02-01<br>
 */
@OpenApiMessage(service = "updateMobileBindingCustomer", type = ApiMessageType.Request)
public class UpdateMobileBindingCustomeRequest extends ApiRequest {

	@NotNull
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id", demo = "23412349876987276893")
	private String userId;

	@NotNull
	@Length(max = 20)
	@OpenApiField(desc = "申请绑定的手机号码", demo = "135****9102")
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

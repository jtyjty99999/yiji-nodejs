package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/19.
 */
@OpenApiMessage(service = "findUserSpecialInfoByUserId", type = ApiMessageType.Response)
public class FindSpecialInfoByUserIdResponse extends ApiResponse {
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "商户id")
	private String userId;
	
	@NotEmpty
	@Length(max = 128)
	@OpenApiField(desc = "商户id")
	private String registerFrom;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRegisterFrom() {
		return registerFrom;
	}
	
	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}
}

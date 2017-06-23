package com.yiji.openapi.message.common.bankcard;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/19.
 */
@OpenApiMessage(service = "bankCardUserIdCheck", type = ApiMessageType.Response)
public class BankCardUserIdCheckResponse extends ApiResponse {
	
	@OpenApiField(desc = "验证状态")
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

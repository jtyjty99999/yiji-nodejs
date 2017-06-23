package com.yiji.openapi.message.common.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/15.
 */
@OpenApiMessage(service = "", type = ApiMessageType.Response)
public class UserBelongMerchantOrNotResponse extends ApiResponse {
	
	@OpenApiField(desc = "是否属于该平台")
	private boolean isBelong;
	
	public boolean isBelong() {
		return isBelong;
	}
	
	public void setBelong(boolean isBelong) {
		this.isBelong = isBelong;
	}
}

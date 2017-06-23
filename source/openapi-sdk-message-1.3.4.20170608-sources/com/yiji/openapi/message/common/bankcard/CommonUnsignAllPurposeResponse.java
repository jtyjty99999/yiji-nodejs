package com.yiji.openapi.message.common.bankcard;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xinqing@yiji.com
 *
 * @date   2015年7月10日
 */
@OpenApiMessage(service = "commonUnsignAllPurpose", type = ApiMessageType.Response)
public class CommonUnsignAllPurposeResponse extends ApiResponse {

	/** 结果状态 */
	@OpenApiField(desc = "结果状态",demo = "SUCCESS")
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

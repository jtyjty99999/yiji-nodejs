package com.yiji.openapi.message.product.rewardloan;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

@OpenApiMessage(service = "rewardloanOrderCompleteNotify", type = ApiMessageType.Response)
public class RewardloanOrderCompleteNotifyResponse extends ApiResponse {
	@OpenApiField(desc = "执行是否成功")
	private String status;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

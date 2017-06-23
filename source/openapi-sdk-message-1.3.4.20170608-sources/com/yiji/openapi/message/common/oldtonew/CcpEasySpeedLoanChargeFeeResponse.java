package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-29<br>
 */
@OpenApiMessage(service = "ccpEasySpeedLoanChargeFee", type = ApiMessageType.Response)
public class CcpEasySpeedLoanChargeFeeResponse extends ApiResponse {

	@OpenApiField(desc = "融资订单id", demo = "xxx")
	private String bizNo;

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
}

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-28<br>
 */
@OpenApiMessage(service = "ccpEasySpeedLoanVerifyTransfer", type = ApiMessageType.Response)
public class CcpEasySpeedLoanVerifyTransferResponse extends ApiResponse {

	@OpenApiField(desc = "易融通的融资订单id", demo = "xxx")
	private String bizNo;

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
}

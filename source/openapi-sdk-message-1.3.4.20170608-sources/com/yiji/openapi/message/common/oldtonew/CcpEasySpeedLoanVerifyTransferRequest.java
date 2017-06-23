package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-28<br>
 */
@OpenApiMessage(service = "ccpEasySpeedLoanVerifyTransfer", type = ApiMessageType.Request)
public class CcpEasySpeedLoanVerifyTransferRequest extends ApiRequest {

	@OpenApiField(desc = "外部流水号", demo = "xxx")
	private String outBizNo;

	@OpenApiField(desc = "调用系统平台id", demo = "xxx")
	private String platformId;

	@OpenApiField(desc = "融资订单id", demo = "xxx")
	private String bizNo;

	public String getOutBizNo() {
		return outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
}

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mr.li
 * @email nanshan@yiji.com
 * @since 2016-01-29<br>
 */
@OpenApiMessage(service = "ccpEasySpeedLoanChargeFee", type = ApiMessageType.Request)
public class CcpEasySpeedLoanChargeFeeRequest extends ApiRequest {

	@NotNull(message = "外部流水不能为空")
	@OpenApiField(desc = "外部流水号", demo = "xxx")
	private String outBizNo;

	@NotNull(message = "调用系统平台ID不能为空")
	@OpenApiField(desc = "调用系统平台id", demo = "xxx")
	private String platformId;

	@OpenApiField(desc = "融资订单id", demo = "xxx")
	private String bizNo;

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getOutBizNo() {
		return outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
}

package com.yiji.openapi.message.product.rewardloan;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "queryUserTrialCredit", type = ApiMessageType.Response)
public class QueryUserTrialCreditResponse extends ApiResponse {
	
	@OpenApiField(desc = "结果码")
	private String code;
	/**
	 * 临时可用余额
	 */
	@OpenApiField(desc = "临时可用余额")
	private Money trialCreditAmount;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Money getTrialCreditAmount() {
		return this.trialCreditAmount;
	}
	
	public void setTrialCreditAmount(Money trialCreditAmount) {
		this.trialCreditAmount = trialCreditAmount;
	}
}

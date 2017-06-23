package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "mpayFreeze", type = ApiMessageType.Response)
public class MpayFreezeResponse extends ApiResponse {
	
	@OpenApiField(desc = "描述",constraint="描述",demo="冻结资金")
	private String message;
	
	@OpenApiField(desc = "冻结金额",constraint="冻结金额",demo="66.66")
	private Money amount;
	
	@OpenApiField(desc = "充值状态",constraint="充值状态",demo="true")
	private boolean status;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

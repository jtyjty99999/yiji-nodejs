package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "withdrawApply", type = ApiMessageType.Response)
public class WithdrawApplyResponse extends ApiResponse {
	
	@OpenApiField(desc = "提现流水号",demo = "1234567980")
	private String tradeNo;
	
	@OpenApiField(desc = "提现金额",demo = "88.66")
	private Money amount;
	
	@OpenApiField(desc = "到账金额",demo = "88.66")
	private Money amountIn;
	

	public void setResultCode(String resultCode) {
		if ("BIZ_PROCESSING".equals(resultCode)) {
			super.setResultCode(ApiServiceResultCode.PROCESSING.getCode());
		} else {
			super.setResultCode(resultCode);
		}
		
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getAmountIn() {
		return amountIn;
	}
	
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
}

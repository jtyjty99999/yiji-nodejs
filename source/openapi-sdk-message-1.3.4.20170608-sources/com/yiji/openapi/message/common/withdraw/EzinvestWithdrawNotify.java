package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "ezinvestWithdraw", type = ApiMessageType.Notify)
public class EzinvestWithdrawNotify extends ApiNotify {
	
	@OpenApiField(desc = "提现流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "提现状态")
	private String withdrawStatus;
	
	@OpenApiField(desc = "提现金额")
	private Money amount;
	
	@OpenApiField(desc = "实到金额")
	private Money amountIn;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getWithdrawStatus() {
		return withdrawStatus;
	}
	
	public void setWithdrawStatus(String withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
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

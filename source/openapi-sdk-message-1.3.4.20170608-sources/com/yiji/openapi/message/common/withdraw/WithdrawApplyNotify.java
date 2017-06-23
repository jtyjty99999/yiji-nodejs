package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "withdrawApply", type = ApiMessageType.Notify)
public class WithdrawApplyNotify extends ApiNotify {
	
	@OpenApiField(desc = "提现流水号",demo = "12324578901")
	private String tradeNo;
	
	@OpenApiField(desc = "提现状态",demo = "SUCCESS")
	private String withdrawStatus;
	
	@OpenApiField(desc = "提现金额",demo = "88.66")
	private Money amount;
	
	@OpenApiField(desc = "实到金额",demo = "88.66")
	private Money amountIn;
	
	@OpenApiField(desc = "外部订单号",demo = "123449873465")
	private String outOrderNo;
	
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
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "mpayPayment", type = ApiMessageType.Notify)
public class MpayPaymentNotify extends ApiNotify {
	
	@OpenApiField(desc = "交易号",constraint="交易号",demo="20151016000124130517")
	private String tradeNo;
	
	@NotEmpty
	@OpenApiField(desc = "外部交易码",constraint="外部交易码",demo="20151016000124130517")
	private String outOrderNo;
	
	@OpenApiField(desc = "外部交易码",constraint="外部交易码",demo="66.66")
	private Money amount;
	
	@OpenApiField(desc = "充值状态",constraint="充值状态",demo="false")
	private boolean status;
	
	@OpenApiField(desc = "描述",constraint="描述",demo="充值成功")
	private String message;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
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
	
}

package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

@OpenApiMessage(service = "mpayDeposit", type = ApiMessageType.Notify)
public class MpayDepositNotify extends ApiNotify {

	@NotEmpty
	@OpenApiField(desc = "交易号",constraint="交易号",demo="20151015000073556356")
	private String tradeNo;

	@NotEmpty
	@OpenApiField(desc = "外部交易码",constraint="外部交易码",demo="147753388")
	private String outOrderNo;

	@OpenApiField(desc = "充值状态",constraint="充值状态",demo="true")
	private String status;

	@OpenApiField(desc = "描述",constraint="描述",demo="充值成功")
	private String message;

	@OpenApiField(desc = "交易类型",demo = "充值")
	private String type;

	@OpenApiField(desc = "交易金额",demo = "88.66")
	private String amount;

	@OpenApiField(desc = "用户ID",demo = "12345679801234567890")
	private String userId;
	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

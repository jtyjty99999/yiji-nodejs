package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "tradeRefund", type = ApiMessageType.Notify)
public class TradeRefundApiNotify extends ApiNotify {
	
	@OpenApiField(desc = "交易号",demo = "13245656484935223")
	private String tradeNo;
	
	@OpenApiField(desc = "退款编号",demo = "12345614682")
	private String refundNo;
	
	@OpenApiField(desc = "退款完成时间，格式yyyy-MM-dd hh:mm:ss",demo = "2015-12-12 12:12:12")
	private String refundFinishTime;
	
	@OpenApiField(desc = "货币种类",demo = "CNY")
	private String currency;
	
	@OpenApiField(desc = "退款金额",demo = "88.66")
	private Money refundAmount;
	
	@OpenApiField(desc = "退款状态", constraint = "true,false",demo = "true")
	private boolean executeStatus;
	
	@OpenApiField(desc = "描述",demo = "退款成功")
	private String message;
	
	public String getRefundFinishTime() {
		return refundFinishTime;
	}
	
	public void setRefundFinishTime(String refundFinishTime) {
		this.refundFinishTime = refundFinishTime;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Money getRefundAmount() {
		return refundAmount;
	}
	
	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public boolean getExecuteStatus() {
		return executeStatus;
	}
	
	public void setExecuteStatus(boolean executeStatus) {
		this.executeStatus = executeStatus;
	}
	
	public String getRefundNo() {
		return refundNo;
	}
	
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}

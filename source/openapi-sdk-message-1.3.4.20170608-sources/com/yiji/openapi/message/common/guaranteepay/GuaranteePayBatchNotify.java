package com.yiji.openapi.message.common.guaranteepay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

@OpenApiMessage(service = "guaranteePayBatch", type = ApiMessageType.Notify)
public class GuaranteePayBatchNotify extends ApiNotify {
	
	@OpenApiField(desc = "交易号",demo = "13214566321564")
	private String tradeNo;
	
	@OpenApiField(desc = "外部订单号",demo = "3212345123456132")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易金额",demo = "88.66")
	private String tradeAmount;
	
	@OpenApiField(desc = "状态",demo = "trade_finished")
	private String tradeStatus;
	
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
	
	public String getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
}

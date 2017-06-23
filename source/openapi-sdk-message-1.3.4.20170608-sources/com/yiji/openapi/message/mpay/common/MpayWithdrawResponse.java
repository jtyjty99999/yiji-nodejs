package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 移动转账响应对象
 * 
 * @author lingjiao
 * 
 */
@OpenApiMessage(service = "mpayWithdraw", type = ApiMessageType.Response)
public class MpayWithdrawResponse extends ApiResponse {
	
	@OpenApiField(desc = "转账总金额",constraint="转账总金额",demo="6.66")
	private Money amount;
	
	@OpenApiField(desc = "交易号",constraint="交易号",demo="20150713000000485104")
	private String tradeNo;
	
	@OpenApiField(desc = "外部订单号",constraint="外部订单号",demo="20150713000000485104")
	private String outOrderNo;
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
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
}

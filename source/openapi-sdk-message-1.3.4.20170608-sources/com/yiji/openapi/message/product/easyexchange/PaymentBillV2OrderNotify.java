package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/4/28.
 */
@OpenApiMessage(service = "paymentBillV2Order", type = ApiMessageType.Notify)
public class PaymentBillV2OrderNotify extends ApiNotify {
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "支付交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "描述")
	private String message;
	
	@OpenApiField(desc = "可用余额")
	private Money availableBalance;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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
	
	public Money getAvailableBalance() {
		return availableBalance;
	}
	
	public void setAvailableBalance(Money availableBalance) {
		this.availableBalance = availableBalance;
	}
}

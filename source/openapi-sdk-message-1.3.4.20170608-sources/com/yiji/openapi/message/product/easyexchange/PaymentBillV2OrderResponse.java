package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * Created by Jason Ma on 2015/4/28.
 */
@OpenApiMessage(service = "paymentBillV2Order", type = ApiMessageType.Response)
public class PaymentBillV2OrderResponse extends ApiResponse {
	
	@OpenApiField(desc = "支付金额")
	private Money paymentBillMoney;
	
	@OpenApiField(desc = "外部商户订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "状态")
	private String serviceStatus;
	
	public Money getPaymentBillMoney() {
		return paymentBillMoney;
	}
	
	public void setPaymentBillMoney(Money paymentBillMoney) {
		this.paymentBillMoney = paymentBillMoney;
	}
	
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
	
	public String getServiceStatus() {
		return serviceStatus;
	}
	
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
}

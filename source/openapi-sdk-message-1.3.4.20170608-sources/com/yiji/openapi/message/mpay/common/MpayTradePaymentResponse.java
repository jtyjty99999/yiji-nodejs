package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "mpayTradePayment", type = ApiMessageType.Response)
public class MpayTradePaymentResponse extends ApiResponse {
	/** 支付引擎交易编号-代扣方式有返回值 */
	@OpenApiField(desc = "支付引擎交易编号",constraint="支付引擎交易编号",demo="20151016026035860522")
	private String depositId;
	
	/** 支付金额 */
	@OpenApiField(desc = "支付金额",constraint="支付金额",demo="66.66")
	private Money amount;
	
	/** 服务端交易号 */
	@OpenApiField(desc = "服务端交易号",constraint="服务端交易号",demo="20151015000073698623")
	private String tradeNo;
	
	/** 外部订单号 */
	@OpenApiField(desc = "外部订单号",constraint="外部订单号",demo="20151016026035860522")
	private String outOrderNo;
	
	/** 支付方式 */
	@OpenApiField(desc = "支付方式",constraint="支付方式",demo="BY_DEPOSIT")
	private String payWay;
	
	public String getDepositId() {
		return depositId;
	}
	
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	
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
	
	public String getPayWay() {
		return payWay;
	}
	
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
}

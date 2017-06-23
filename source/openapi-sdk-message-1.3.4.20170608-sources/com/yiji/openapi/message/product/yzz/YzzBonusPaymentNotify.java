package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzBonusPayment", type = ApiMessageType.Notify)
public class YzzBonusPaymentNotify extends ApiNotify {
	
	@OpenApiField(desc = "付款用户id,默认使用partnerId")
	private String payerUserId;
	
	@OpenApiField(desc = "交易号")
	private String bonusNo;
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@OpenApiField(desc = "付款总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "奖励付款明细")
	private String paymentResults;
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getBonusNo() {
		return bonusNo;
	}
	
	public void setBonusNo(String bonusNo) {
		this.bonusNo = bonusNo;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(String paymentResults) {
		this.paymentResults = paymentResults;
	}
}

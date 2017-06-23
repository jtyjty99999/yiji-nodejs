package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

@OpenApiMessage(service = "yzzBonusPayment", type = ApiMessageType.Response)
public class YzzBonusPaymentResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号")
	private String bonusNo;
	
	@OpenApiField(desc = "付款用户id")
	private String payerUserId;
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@OpenApiField(desc = "付款总金额")
	private Money totalAmount;
	
	public String getBonusNo() {
		return bonusNo;
	}
	
	public void setBonusNo(String bonusNo) {
		this.bonusNo = bonusNo;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
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
	
}

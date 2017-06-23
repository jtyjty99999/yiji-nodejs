package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.Size;

import com.yiji.openapi.message.product.yzz.info.PaymentResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzTenderPaymentQuery", type = ApiMessageType.Response)
public class YzzTenderPaymentQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "借款项目主交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "交易号")
	private String paymentTradeNo;
	
	@OpenApiField(desc = "付款状态")
	private String paymentStatus;
	
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "还款用户Id")
	private String userId;
	
	@OpenApiField(desc = "总金额")
	private Money amount;
	
	@OpenApiField(desc = "还款明细")
	private List<PaymentResult> paymentResults;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPaymentTradeNo() {
		return paymentTradeNo;
	}
	
	public void setPaymentTradeNo(String paymentTradeNo) {
		this.paymentTradeNo = paymentTradeNo;
	}
	
	public String getPaymentStatus() {
		return paymentStatus;
	}
	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public List<PaymentResult> getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(List<PaymentResult> paymentResults) {
		this.paymentResults = paymentResults;
	}
	
}

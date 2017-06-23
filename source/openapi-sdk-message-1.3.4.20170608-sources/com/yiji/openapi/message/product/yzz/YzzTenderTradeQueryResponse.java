package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;


@OpenApiMessage(service = "yzzTenderTradeQuery", type = ApiMessageType.Response)
public class YzzTenderTradeQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	//	public List<PaymentResult> getPaymentResults() {
	//		return paymentResults;
	//	}
	//
	//	public void setPaymentResults(List<PaymentResult> paymentResults) {
	//		this.paymentResults = paymentResults;
	//	}
	//
	//	public List<PaymentResult> getProfitResults() {
	//		return profitResults;
	//	}
	//
	//	public void setProfitResults(List<PaymentResult> profitResults) {
	//		this.profitResults = profitResults;
	//	}
	
}

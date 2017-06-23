package com.yiji.openapi.message.product.yzz;

import java.util.List;

import com.yiji.openapi.message.product.yzz.info.PaymentResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzRepaymentTradeQuery", type = ApiMessageType.Response)
public class YzzRepaymentTradeQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "借款项目主交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "交易号")
	private String repaymentNo;
	
	@OpenApiField(desc = "还款用户Id")
	private String userId;
	
	@OpenApiField(desc = "交易状态")
	private String tradeStatus;
	
	@OpenApiField(desc = "还款总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "还款明细")
	private List<PaymentResult> paymentResults;
	
	@OpenApiField(desc = "分润付款明细")
	private List<PaymentResult> profitResults;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getRepaymentNo() {
		return repaymentNo;
	}
	
	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
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
	
	public List<PaymentResult> getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(List<PaymentResult> paymentResults) {
		this.paymentResults = paymentResults;
	}
	
	public List<PaymentResult> getProfitResults() {
		return profitResults;
	}
	
	public void setProfitResults(List<PaymentResult> profitResults) {
		this.profitResults = profitResults;
	}
}

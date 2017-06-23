package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.Size;

import com.yiji.openapi.message.product.yzz.info.PaymentResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "yzzBonusPaymentQuery", type = ApiMessageType.Response)
public class YzzBonusPaymentQueryResponse extends ApiResponse {
	
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "交易号")
	private String bonusNo;
	
	@OpenApiField(desc = "奖励模式")
	private String bonusType;
	
	@OpenApiField(desc = "奖励总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "已经处理金额")
	private Money dealtAmount;
	
	@OpenApiField(desc = "奖励明细")
	private List<PaymentResult> paymentResults;
	
	public String getBonusNo() {
		return bonusNo;
	}
	
	public void setBonusNo(String bonusNo) {
		this.bonusNo = bonusNo;
	}
	
	public String getBonusType() {
		return bonusType;
	}
	
	public void setBonusType(String bonusType) {
		this.bonusType = bonusType;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Money getDealtAmount() {
		return dealtAmount;
	}
	
	public void setDealtAmount(Money dealtAmount) {
		this.dealtAmount = dealtAmount;
	}
	
	public List<PaymentResult> getPaymentResults() {
		return paymentResults;
	}
	
	public void setPaymentResults(List<PaymentResult> paymentResults) {
		this.paymentResults = paymentResults;
	}
	
}

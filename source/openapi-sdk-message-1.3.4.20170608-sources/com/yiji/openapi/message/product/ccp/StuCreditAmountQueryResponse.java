package com.yiji.openapi.message.product.ccp;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "stuCreditAmountQuery", type = ApiMessageType.Response)
public class StuCreditAmountQueryResponse extends ApiResponse {
	
	@NotNull
	@OpenApiField(desc = "信用额度")
	private Money creditAmount;
	
	@NotNull
	@OpenApiField(desc = "可用额度")
	private Money remainAmount;
	
	@NotNull
	@OpenApiField(desc = "有效期")
	private Date expirationDate;
	
	public Money getCreditAmount() {
		return creditAmount;
	}
	
	public void setCreditAmount(Money creditAmount) {
		this.creditAmount = creditAmount;
	}
	
	public Money getRemainAmount() {
		return remainAmount;
	}
	
	public void setRemainAmount(Money remainAmount) {
		this.remainAmount = remainAmount;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}

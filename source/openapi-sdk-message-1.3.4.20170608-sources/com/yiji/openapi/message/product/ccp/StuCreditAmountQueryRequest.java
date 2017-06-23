package com.yiji.openapi.message.product.ccp;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "stuCreditAmountQuery", type = ApiMessageType.Request)
public class StuCreditAmountQueryRequest extends ApiRequest {
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "借款人易极付ID")
	private String borrowerId;
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
}

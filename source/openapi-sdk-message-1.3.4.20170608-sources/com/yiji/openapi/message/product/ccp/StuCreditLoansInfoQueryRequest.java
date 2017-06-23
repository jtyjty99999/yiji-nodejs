package com.yiji.openapi.message.product.ccp;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;



@OpenApiMessage(service = "stuCreditLoansInfoQuery", type = ApiMessageType.Request)
public class StuCreditLoansInfoQueryRequest extends ApiRequest {
	
	@OpenApiField(desc = "借款人id")
	private String borrowerId;
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
}

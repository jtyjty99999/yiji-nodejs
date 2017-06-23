package com.yiji.openapi.message.product.ccp;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;



@OpenApiMessage(service = "stuConfirmLoanReceipt", type = ApiMessageType.Request)
public class StuConfirmLoanReceiptRequest extends ApiRequest {
	
	@NotEmpty
	@Length(min = 6, max = 128)
	@OpenApiField(desc = "贷款流水号")
	private String applicationNo;
	
	@NotNull
	@OpenApiField(desc = "是否同意电子借据")
	private Boolean agree;
	
	public String getApplicationNo() {
		return applicationNo;
	}
	
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	public boolean isAgree() {
		return agree;
	}
	
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	
}

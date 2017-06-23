package com.yiji.openapi.message.product.ccp;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;



@OpenApiMessage(service = "stuCreditLoanManualRepay", type = ApiMessageType.Request)
public class StuCreditLoanManualRepayRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 6, max = 64)
	@OpenApiField(desc = "外部流水号")
	private String outBizNo;
	
	@NotBlank
	@Length(min = 6, max = 128)
	@OpenApiField(desc = "贷款流水号")
	private String applicationNo;
	
	@NotNull
	@OpenApiField(desc = "还款金额")
	private Money repayAmount;
	
	@NotNull
	@OpenApiField(desc = "是否偿还剩余全部金额")
	private Boolean repayRestInstallments;
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public Money getRepayAmount() {
		return repayAmount;
	}
	
	public void setRepayAmount(Money repayAmount) {
		this.repayAmount = repayAmount;
	}
	
	public String getApplicationNo() {
		return applicationNo;
	}
	
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	public boolean isRepayRestInstallments() {
		return repayRestInstallments;
	}
	
	public void setRepayRestInstallments(boolean repayRestInstallments) {
		this.repayRestInstallments = repayRestInstallments;
	}
	
}

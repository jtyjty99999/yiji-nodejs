package com.yiji.openapi.message.product.ccp;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;



@OpenApiMessage(service = "stuSimulateRepaymentPlan", type = ApiMessageType.Request)
public class StuSimulateRepaymentPlanRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "借款人ID")
	private String borrowerId;
	
	@Min(value = 1)
	@Max(value = 9)
	@OpenApiField(desc = "所在年级")
	private int grade;
	
	@NotNull
	@OpenApiField(desc = "借款金额")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "还款类型")
	private String repaymentType;
	
	@OpenApiField(desc = "分期期数,只支持不超过5期计算")
	private int[] installments;
	
	public String getBorrowerId() {
		return borrowerId;
	}
	
	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getRepaymentType() {
		return repaymentType;
	}
	
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	
	public int[] getInstallments() {
		return installments;
	}
	
	public void setInstallments(int[] installments) {
		this.installments = installments;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
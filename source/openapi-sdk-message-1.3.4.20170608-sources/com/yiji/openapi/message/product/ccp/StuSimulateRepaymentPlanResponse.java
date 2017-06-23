package com.yiji.openapi.message.product.ccp;

import java.util.List;

import com.yiji.openapi.message.product.ccp.info.StudentCreditLoanSimulateRepaymentInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "stuSimulateRepaymentPlan", type = ApiMessageType.Response)
public class StuSimulateRepaymentPlanResponse extends ApiResponse {
	
	@OpenApiField(desc = "还款金额")
	private Money repayAmount;
	
	@OpenApiField(desc = "还款类型")
	private String repaymentType;
	
	@OpenApiField(desc = "利率")
	private double interestRate;
	
	@OpenApiField(desc = "最后还款日期")
	private int repayDate;
	
	@OpenApiField(desc = "分期还款计划")
	private List<StudentCreditLoanSimulateRepaymentInfo> installmentRepaymentPlan;
	
	public String getRepaymentType() {
		return repaymentType;
	}
	
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int getRepayDate() {
		return repayDate;
	}
	
	public void setRepayDate(int repayDate) {
		this.repayDate = repayDate;
	}
	
	public List<StudentCreditLoanSimulateRepaymentInfo> getInstallmentRepaymentPlan() {
		return installmentRepaymentPlan;
	}
	
	public void setInstallmentRepaymentPlan(List<StudentCreditLoanSimulateRepaymentInfo> installmentRepaymentPlan) {
		this.installmentRepaymentPlan = installmentRepaymentPlan;
	}
	
	public Money getRepayAmount() {
		return repayAmount;
	}
	
	public void setRepayAmount(Money repayAmount) {
		this.repayAmount = repayAmount;
	}
	
}
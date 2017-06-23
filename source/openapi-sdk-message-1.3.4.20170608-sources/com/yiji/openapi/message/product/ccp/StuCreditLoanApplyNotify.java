package com.yiji.openapi.message.product.ccp;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;



@OpenApiMessage(service = "stuCreditLoanApply", type = ApiMessageType.Notify)
public class StuCreditLoanApplyNotify extends ApiNotify {
	
	@OpenApiField(desc = "申请流水号")
	private String applicationNo;
	
	@OpenApiField(desc = "外部流水")
	private String outBizNo;
	
	@OpenApiField(desc = "贷款状态")
	private String loanStatus;
	
	@OpenApiField(desc = "实际放款金额")
	private Money loanAmount;
	
	@OpenApiField(desc = "利率")
	private Double interestRate;
	
	@OpenApiField(desc = "期数")
	private int installments;
	
	@OpenApiField(desc = "每期金额")
	private Money installmentAmount;
	
	@OpenApiField(desc = "每期还款日")
	private Date installmentRepayDate;
	
	public String getApplicationNo() {
		return applicationNo;
	}
	
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getLoanStatus() {
		return loanStatus;
	}
	
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	public Money getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(Money loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int getInstallments() {
		return installments;
	}
	
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	
	public Money getInstallmentAmount() {
		return installmentAmount;
	}
	
	public void setInstallmentAmount(Money installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	
	public Date getInstallmentRepayDate() {
		return installmentRepayDate;
	}
	
	public void setInstallmentRepayDate(Date installmentRepayDate) {
		this.installmentRepayDate = installmentRepayDate;
	}
	
}

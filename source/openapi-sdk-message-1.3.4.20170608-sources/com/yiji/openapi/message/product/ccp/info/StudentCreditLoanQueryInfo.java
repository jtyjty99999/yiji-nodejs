/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:45:37 创建
 */
package com.yiji.openapi.message.product.ccp.info;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class StudentCreditLoanQueryInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 贷款平台申请流水号，由贷款平台生成，标识该笔申请
	 */
	@NotBlank
	private String applicationNo;
	
	/**
	 * 外部流水，标识该笔申请记录
	 */
	@NotBlank
	private String outBizNo;
	
	/**
	 * 贷款状态
	 */
	@NotBlank
	private String loanStatus;
	
	/**
	 * 还款类型
	 */
	@NotNull
	private String repaymentType;
	
	/**
	 * 该笔借款总额
	 */
	@NotNull
	private Money amount;
	
	/**
	 * 该笔借款未还款总额
	 */
	@NotNull
	private Money remainAmount = Money.zero();
	
	/**
	 * 逾期金额
	 */
	private Money overduedAmount = Money.zero();
	
	/**
	 * 最后还款日期
	 */
	private String repayDate;
	
	/**
	 * 未还期数
	 */
	private int remainInstallments;
	
	/**
	 * 下期还款金额
	 */
	private Money nextInstallmentAmount;
	
	/**
	 * 下期还款日
	 */
	private String nextInstallmentRepayDate;
	
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getRepaymentType() {
		return this.repaymentType;
	}
	
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getRemainAmount() {
		return this.remainAmount;
	}
	
	public void setRemainAmount(Money remainAmount) {
		this.remainAmount = remainAmount;
	}
	
	public int getRemainInstallments() {
		return this.remainInstallments;
	}
	
	public void setRemainInstallments(int remainInstallments) {
		this.remainInstallments = remainInstallments;
	}
	
	public Money getNextInstallmentAmount() {
		return this.nextInstallmentAmount;
	}
	
	public void setNextInstallmentAmount(Money nextInstallmentAmount) {
		this.nextInstallmentAmount = nextInstallmentAmount;
	}
	
	public String getNextInstallmentRepayDate() {
		return this.nextInstallmentRepayDate;
	}
	
	public void setNextInstallmentRepayDate(String nextInstallmentRepayDate) {
		this.nextInstallmentRepayDate = nextInstallmentRepayDate;
	}
	
	public Money getOverduedAmount() {
		return this.overduedAmount;
	}
	
	public void setOverduedAmount(Money overduedAmount) {
		this.overduedAmount = overduedAmount;
	}
	
	public String getRepayDate() {
		return this.repayDate;
	}
	
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}
	
	public String getLoanStatus() {
		return loanStatus;
	}
	
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
}

    
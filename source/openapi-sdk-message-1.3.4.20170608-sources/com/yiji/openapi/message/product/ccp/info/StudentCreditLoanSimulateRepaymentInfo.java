/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:48:26 创建
 */
package com.yiji.openapi.message.product.ccp.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class StudentCreditLoanSimulateRepaymentInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 期数
	 */
	private int installments;
	
	/**
	 * 每期金额
	 */
	private Money installmentAmount;
	
	/**
	 * 还款日
	 */
	private int repayDate;
	
	public int getInstallments() {
		return this.installments;
	}
	
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	
	public Money getInstallmentAmount() {
		return this.installmentAmount;
	}
	
	public void setInstallmentAmount(Money installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	
	public int getRepayDate() {
		return this.repayDate;
	}
	
	public void setRepayDate(int repayDate) {
		this.repayDate = repayDate;
	}
}

    
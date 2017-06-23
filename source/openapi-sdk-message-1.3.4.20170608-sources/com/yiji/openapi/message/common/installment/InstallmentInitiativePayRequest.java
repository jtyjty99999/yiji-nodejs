/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-26 15:07 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentInitiativePay", type = ApiMessageType.Request)
public class InstallmentInitiativePayRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "合约号", constraint = "合约号")
	private String contractNo;
	
	@Range(min = 1L, max = 120L)
	@OpenApiField(desc = "还款期数", constraint = "主动还款的期数（单期）")
	private int time;
	
	@NotNull
	@OpenApiField(desc = "还款总金额", constraint = "还款总金额")
	private Money totalAmount;
	
	@NotNull
	@OpenApiField(desc = "本金金额", constraint = "本金金额")
	private Money capitalAmount;
	
	@OpenApiField(desc = "利息金额", constraint = "利息金额")
	private Money interestAmount = new Money();
	
	@OpenApiField(desc = "其他金额", constraint = "其他金额")
	private Money otherAmount = new Money();
	
	@OpenApiField(desc = "滞纳金", constraint = "滞纳金")
	private Money overdueFineAmount = new Money();
	
	@NotNull
	@OpenApiField(desc = "预计还款日期", constraint = "预计还款日期")
	private Date expectedRepayDate;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Money getCapitalAmount() {
		return capitalAmount;
	}
	
	public void setCapitalAmount(Money capitalAmount) {
		this.capitalAmount = capitalAmount;
	}
	
	public Money getInterestAmount() {
		return interestAmount;
	}
	
	public void setInterestAmount(Money interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	public Money getOtherAmount() {
		return otherAmount;
	}
	
	public void setOtherAmount(Money otherAmount) {
		this.otherAmount = otherAmount;
	}
	
	public Money getOverdueFineAmount() {
		return overdueFineAmount;
	}
	
	public void setOverdueFineAmount(Money overdueFineAmount) {
		this.overdueFineAmount = overdueFineAmount;
	}
	
	public Date getExpectedRepayDate() {
		return expectedRepayDate;
	}
	
	public void setExpectedRepayDate(Date expectedRepayDate) {
		this.expectedRepayDate = expectedRepayDate;
	}
}

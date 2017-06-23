/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-05-19 10:52 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import javax.validation.constraints.DecimalMin;
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
@OpenApiMessage(service = "installmentModifySchedule", type = ApiMessageType.Request)
public class InstallmentModifyScheduleRequest extends ApiRequest {
	
	/**
	 * 签约合同号
	 */
	@NotEmpty
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	/**
	 * 还款期数
	 */
	@Range(min = 1, max = 120)
	@OpenApiField(desc = "还款期数")
	private int time;
	
	/**
	 * 还款总金额
	 */
	@NotNull
	@OpenApiField(desc = "还款总金额")
	private Money totalAmount;
	
	/**
	 * 本金金额
	 */
	@NotNull
	@OpenApiField(desc = "本金金额")
	private Money capitalAmount;
	
	/**
	 * 利息金额
	 */
	@NotNull
	@OpenApiField(desc = "利息金额")
	private Money interestAmount;
	
	/**
	 * 其他金额，除本金，利息之外的金额累加后放在此字段
	 */
	@NotNull
	@OpenApiField(desc = "其他金额", constraint = "除本金和利息之外的金额之和")
	private Money otherAmount;
	
	/**
	 * 滞纳金金额
	 */
	@NotNull
	@OpenApiField(desc = "滞纳金")
	private Money overdueFineAmount;
	
	/**
	 * 预计还款日期
	 */
	@NotNull
	@OpenApiField(desc = "还款日期", constraint = "预计的还款日期")
	private String expectedRepayDate;
	
	/**
	 * 逾期减免天数
	 */
	@DecimalMin("0")
	@OpenApiField(desc = "逾期减免天数")
	private int overdueRemitDay = 0;
	
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
	
	public String getExpectedRepayDate() {
		return expectedRepayDate;
	}
	
	public void setExpectedRepayDate(String expectedRepayDate) {
		this.expectedRepayDate = expectedRepayDate;
	}
	
	public int getOverdueRemitDay() {
		return overdueRemitDay;
	}
	
	public void setOverdueRemitDay(int overdueRemitDay) {
		this.overdueRemitDay = overdueRemitDay;
	}
}

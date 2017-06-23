/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月14日 下午5:56:17 创建
 */
package com.yiji.openapi.message.common.transferAccounts.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年10月14日
 */

public class ApiFundsQuotaZbjOrderInfo {
	/**
	 * 易极付用户ID
	 */
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "易极付用户ID",constraint = "易极付用户ID",demo = "20150619010000072320")
	protected String userId;

	/**
	 * 资金币种，默认为CNY
	 */
	@OpenApiField(desc = "资金币种",constraint = "资金币种",demo = "CNY")
	protected String currency;

	/**
	 * 交易金额
	 */
	@NotNull
	@OpenApiField(desc = "交易金额",constraint = "交易金额",demo = "66.66")
	protected Money amount;

	/**
	 * 资金操作类型（充值、提现、转入、转出等）
	 *
	 * DEPOSIT : 充值
	 * WITHDRAW : 提现
	 * TRANSFER_IN : 转入
	 * TRANSFER_OUT : 转出
	 */
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = " 资金操作类型",constraint = "资金操作类型[DEPOSIT:充值,WITHDRAW:提现,TRANSFER_IN:转入,TRANSFER_OUT:转出]",demo = "TRANSFER_OUT")
	protected String operation;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

}

    
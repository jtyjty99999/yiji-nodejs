/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月7日 下午3:15:58 创建
 */
package com.yiji.openapi.message.common.query.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月7日
 */

public class OpenApiIntegrateQuotaOrderInfo {
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "会员ID", constraint = "会员ID", demo = "20150817010007217971")
	private String userId;
	
	@OpenApiField(desc = "资金币种", constraint = "资金币种，默认为CNY", demo = "CNY")
	private String currency;
	
	@NotNull
	@OpenApiField(desc = "资金金额", constraint = "资金金额", demo = "66.66")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "资金操作类型", constraint = "资金操作类型[DEPOSIT:充值,WITHDRAW:提现,TRANSFER_IN:转入,TRANSFER_OUT:转出]",
			demo = "DEPOSIT")
	private String operation;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getOperation() {
		return this.operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
}

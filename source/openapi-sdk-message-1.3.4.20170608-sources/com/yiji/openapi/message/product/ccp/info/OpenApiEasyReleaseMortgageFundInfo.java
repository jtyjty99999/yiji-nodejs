/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月23日 下午4:18:08 创建
 */
package com.yiji.openapi.message.product.ccp.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月23日
 */

public class OpenApiEasyReleaseMortgageFundInfo {
	
	@NotBlank
	@OpenApiField(desc = "资金类型", constraint = "资金类型", demo = "SERVICE_CHARGE")
	private String type;
	
	@NotBlank
	@OpenApiField(desc = "转账流水号", constraint = "转账流水号", demo = "20160105520042456250")
	private String transferNo;
	
	@NotNull
	@OpenApiField(desc = "转账金额", constraint = "转账金额", demo = "66.66")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "付款方账号", constraint = "付款方账号", demo = "20164546787979797")
	private String payerAccount;
	
	@NotBlank
	@OpenApiField(desc = "收款方账号", constraint = "收款方账号", demo = "20164546787979797")
	private String payeeAccount;
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getTransferNo() {
		return this.transferNo;
	}
	
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPayerAccount() {
		return this.payerAccount;
	}
	
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}
	
	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	
}

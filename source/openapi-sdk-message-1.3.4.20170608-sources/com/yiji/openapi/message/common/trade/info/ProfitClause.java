/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * Administrator 2015年8月31日 下午3:49:30 创建
 */
    
package com.yiji.openapi.message.common.trade.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author Administrator
 *
 */

public class ProfitClause {
	/** 付款方会员号 */
	@NotBlank
	@OpenApiField(desc = "付款方会员号",demo = "20140821010000051558")
	private String payerUserId;
	
	/** 付款方卡号 */
	@OpenApiField(desc = "付款方卡号",demo = "12345678901234567890")
	private String payerCardNo;
	
	@OpenApiField(desc = "付款方账号",demo = "12345678901234567890")
	private String payerAccountNo;
	
	/** 收款方会员号 */
	@NotBlank
	@OpenApiField(desc = "收款方会员号",demo = "20140821010000051558")
	private String payeeUserId;
	
	/** 收款方卡号 */
	@OpenApiField(desc = "收款方卡号",demo = "12345697803124567980")
	private String payeeCardNo;
	
	@OpenApiField(desc = "收费方账号",demo = "12345678901234568789")
	private String payeeAccountNo;
	
	/** 分润金额 */
	@NotNull
	@OpenApiField(desc = "分润金额",demo = "88.66")
	private Money profitAmount;
	
	/** 分润描述 */
	@Length(max = 128)
	@OpenApiField(desc = "分润描述",demo = "协商分润")
	private String profitMemo;

	public String getPayerUserId() {
		return this.payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getPayerCardNo() {
		return this.payerCardNo;
	}

	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}

	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}

	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getPayeeCardNo() {
		return this.payeeCardNo;
	}

	public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}

	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public Money getProfitAmount() {
		return this.profitAmount;
	}

	public void setProfitAmount(Money profitAmount) {
		this.profitAmount = profitAmount;
	}

	public String getProfitMemo() {
		return this.profitMemo;
	}

	public void setProfitMemo(String profitMemo) {
		this.profitMemo = profitMemo;
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 下午2:54:31 创建
 */
package com.yiji.openapi.message.common.guaranteepay.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
public class AdditionalFeeInfo {
	/** 付费方角色,只允许传买家或卖家 */
	@NotBlank
	@OpenApiField(desc = "付费方角色",constraint = "只允许传买家或卖家",demo = "TRADE_BUYER")
	private String payerRole;
	
	/** 收费方会员号 */
	@NotBlank
	@OpenApiField(desc = "收费方会员号",demo = "20140814010000052219")
	private String payeeUserId;
	
	/** 费用金额 */
	@NotNull
	@OpenApiField(desc = "费用金额",demo = "88.66")
	private Money feeAmount;
	
	/** 描述 */
	@Length(max = 256)
	@OpenApiField(desc = "描述",demo = "描述")
	private String memo;
	
	public String getPayerRole() {
		return payerRole;
	}
	
	public void setPayerRole(String payerRole) {
		this.payerRole = payerRole;
	}
	
	public String getPayeeUserId() {
		return payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	
	public Money getFeeAmount() {
		return feeAmount;
	}
	
	public void setFeeAmount(Money feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * Administrator 2015年8月31日 下午3:49:38 创建
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

public class IncidentalFeeClause {
	@Deprecated
	@OpenApiField(desc = "附带费用类型",demo = "POSTAGE")
	private String feeType;
	
	/** 付费方角色,只允许传买家或卖家 */
	@NotNull
	@OpenApiField(desc = "付费方角色",demo = "TRADE_BUYER")
	private String payerRole;
	
	/** 收费方会员号 */
	@NotBlank
	@OpenApiField(desc = "收费方会员号",demo = "20140821010000051558")
	private String payeeUserId;
	
	/** 收费方卡号 */
	@OpenApiField(desc = "收费方卡号",demo = "235564587123456")
	private String payeeCardNo;
	
	@OpenApiField(desc = "收费方账号",demo = "21356452546123")
	private String payeeAccountNo;
	
	/** 费用金额 */
	@OpenApiField(desc = "费用金额",demo = "88.66")
	private Money feeAmount;
	
	/** 描述 */
	@Length(max = 256)
	@OpenApiField(desc = "描述",demo = "备注")
	private String memo;

	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getPayerRole() {
		return this.payerRole;
	}

	public void setPayerRole(String payerRole) {
		this.payerRole = payerRole;
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

	public Money getFeeAmount() {
		return this.feeAmount;
	}

	public void setFeeAmount(Money feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}

    
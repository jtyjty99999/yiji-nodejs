/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午3:19:34 创建
 */
package com.yiji.openapi.message.common.withdraw;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author lingjiao@yiji.com
 * 
 */
@OpenApiMessage(service = "yhWithdraw", type = ApiMessageType.Notify)
public class YhWithdrawNotify extends ApiNotify {
	
	@OpenApiField(desc = "会员Id")
	private String userId;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "提现金额")
	private Money amount = Money.zero();
	
	@OpenApiField(desc = "实到金额")
	private Money amountIn;
	
	@OpenApiField(desc = "银行卡号")
	private String bankCardNo;
	
	@OpenApiField(desc = "银行名称")
	private String bankName;
	
	@OpenApiField(desc = "描述")
	private String message;
	
	@OpenApiField(desc = "提现流水号")
	private String payNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public Money getAmountIn() {
		return amountIn;
	}
	
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getPayNo() {
		return payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
}

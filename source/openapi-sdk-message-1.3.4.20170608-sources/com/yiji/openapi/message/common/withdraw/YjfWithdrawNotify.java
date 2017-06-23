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
@OpenApiMessage(service = "yjfWithdraw", type = ApiMessageType.Notify)
public class YjfWithdrawNotify extends ApiNotify {
	
	@OpenApiField(desc = "会员Id",demo = "20140809010000051239")
	private String userId;
	
	@OpenApiField(desc = "状态",demo = "SUCCESS")
	private String status;
	
	@OpenApiField(desc = "提现金额",demo = "88.66")
	private Money amount = Money.zero();
	
	@OpenApiField(desc = "实到金额",demo = "88.66")
	private Money amountIn;
	
	@OpenApiField(desc = "银行卡号",demo = "12345678901123456")
	private String bankCardNo;
	
	@OpenApiField(desc = "银行名称",demo = "中国银行")
	private String bankName;
	
	@OpenApiField(desc = "描述",demo = "提现")
	private String message;
	
	@OpenApiField(desc = "提现流水号",demo = "21345456876")
	private String payNo;
	
	@OpenApiField(desc = "收费码",demo = "paymentPay")
	private String tradeBizProductCode;
	
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
	
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
}

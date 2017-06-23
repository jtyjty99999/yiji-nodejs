/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:18:13 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class WithdrawRecordInfo {
	/** 交易时间 创建时间 yyyyMMDDHHMMSS */
	private String payTime;
	
	/** 用户id 会员id */
	private String userId;
	
	/** 支付流水 */
	private String payNo;
	
	/** 提现账号 */
	private String accountNo;
	
	/** 提现账户名 */
	private String accountName;
	
	/** 银行名称 资金渠道 */
	private String bankName;
	
	/** 银行账号 卡号 */
	private String bankAccountNo;
	
	/** 提现金额 本金 */
	private Money amout;
	
	/** 手续费 */
	private Money charge;
	
	/** 提现总金额 本金+手续费 */
	private Money amountIn;
	
	/** 提现状态 */
	private String status;
	
	public String getPayTime() {
		return payTime;
	}
	
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPayNo() {
		return payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public Money getAmout() {
		return amout;
	}
	
	public void setAmout(Money amout) {
		this.amout = amout;
	}
	
	public Money getCharge() {
		return charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public Money getAmountIn() {
		return amountIn;
	}
	
	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

    
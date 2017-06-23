/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月5日 下午4:01:50 创建
 */
package com.yiji.openapi.message.common.query.info;

import java.util.Date;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
public class QueryDepositInfoResult {
	
	/** 交易时间 创建时间 yyyyMMDDHHMMSS */
	private Date payTime;
	
	/** 用户id 会员id */
	private String userId;
	
	/** 支付流水 */
	private String payNo;
	
	/** 外部订单号 */
	private String outBizNo;
	
	/** 充值账号 */
	private String accountNo;
	
	/** 充值账户名 */
	private String accountName;
	
	/** 银行名称 资金渠道 */
	private String bankName;
	
	/** 银行账号 卡号 */
	private String bankAccountNo;
	
	/** 充值金额 本金 */
	private Money amout;
	
	/** 手续费 */
	private Money charge;
	
	/** 充值总金额 本金+手续费 */
	private Money amouontIn;
	
	/** 充值状态 */
	private String status;
	
	/** 备注 原因 */
	private String memo;
	
	private String statusName;
	
	public Date getPayTime() {
		return this.payTime;
	}
	
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPayNo() {
		return this.payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public Money getAmout() {
		return this.amout;
	}
	
	public void setAmout(Money amout) {
		this.amout = amout;
	}
	
	public Money getCharge() {
		return this.charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public Money getAmouontIn() {
		return this.amouontIn;
	}
	
	public void setAmouontIn(Money amouontIn) {
		this.amouontIn = amouontIn;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getStatusName() {
		return this.statusName;
	}
	
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
}

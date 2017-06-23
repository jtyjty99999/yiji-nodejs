/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-25 20:09 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/25
 */
public class WithdrawInfo implements Serializable {
	/** 主键，提现流水，系统间应以此作为交互凭证 */
	@OpenApiField(desc = "主键，提现流水", constraint = "主键，提现流水", demo = "005234812631273")
	private String withdrawId;
	
	/** 业务请求者身份标识码 */
	@OpenApiField(desc = "业务请求者身份标识码", constraint = "业务请求者身份标识码", demo = "234324232234")
	protected String bizIdentity;
	
	/** 外部订单号 */
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20129034023232")
	protected String outBizNo;
	
	/** 账务冻结码 */
	@OpenApiField(desc = "账务冻结码", constraint = "账务冻结码", demo = "EASY_MONEY")
	protected String freezeType;
	
	/** 回执产品层的通知地址 */
	@OpenApiField(desc = "回执地址", constraint = "回执地址", demo = "http://receipt.xxx.com")
	protected String receiptUrl;
	
	/** 回执优先级 */
	@OpenApiField(desc = "回执优先级", constraint = "回执优先级", demo = "1")
	protected String priority;
	
	/** 子协议代码 */
	@OpenApiField(desc = "子协议代码", constraint = "子协议代码", demo = "异步提现协议")
	private String subContractCode;
	
	/** 指令状态 */
	@OpenApiField(desc = "指令状态", constraint = "指令状态", demo = "已报清算")
	private String status;
	
	/** 提现类型 */
	@OpenApiField(desc = "提现类型", constraint = "提现类型", demo = "WITHDRAW_SINGLE")
	private String withdrawType;
	
	/** 应付额币种 */
	@OpenApiField(desc = "应付额币种", constraint = "应付额币种", demo = "CNY")
	private String payAmountCurrency;
	
	/** 应付额 */
	@OpenApiField(desc = "应付额", constraint = "应付额", demo = "2.32")
	private Money payAmount;
	
	/** 应付实收额 */
	@OpenApiField(desc = "应付实收额", constraint = "应付实收额", demo = "2.32")
	private Money payAmountIn;
	
	/** 账户账号 */
	@OpenApiField(desc = "资金账号", constraint = "资金账号", demo = "2018923812391293")
	private String accountNo;
	
	/** 账户名 */
	@OpenApiField(desc = "账户名", constraint = "账户名", demo = "方世玉")
	private String accountName;
	
	/** 账户类别 */
	@OpenApiField(desc = "账户类别", constraint = "账户类别", demo = "账户类别")
	private String accountType;
	
	/** 用户银行账号 */
	@OpenApiField(desc = "用户银行账号", constraint = "用户银行账号", demo = "6222123123123123")
	private String bankAccountNo;
	
	/** 用户开户名 */
	@OpenApiField(desc = "用户开户名", constraint = "用户开户名", demo = "方世玉")
	private String bankAccountName;
	
	/** 银行代码 */
	@OpenApiField(desc = "银行代码", constraint = "银行代码", demo = "CCB")
	private String bankCode;
	
	/** 银行联号 */
	@OpenApiField(desc = "银行联号", constraint = "银行联号", demo = "12341234")
	private String bankCnapsNo;
	
	/** 银行名称 */
	@OpenApiField(desc = "银行名称", constraint = "银行名称", demo = "中信银行")
	private String bankName;
	
	/** 银行地址 */
	@OpenApiField(desc = "银行地址", constraint = "银行地址", demo = "重庆市渝北区黄山大道中段木星大厦")
	private String bankAddress;
	
	/** 备注 */
	@OpenApiField(desc = "备注", constraint = "备注", demo = "用户提现")
	protected String memo;
	
	@OpenApiField(desc = "reserved1", constraint = "reserved1", demo = "reserved1")
	private String reserved1;
	
	@OpenApiField(desc = "reserved2", constraint = "reserved2", demo = "reserved2")
	private String reserved2;
	
	public String getWithdrawId() {
		return withdrawId;
	}
	
	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}
	
	public String getBizIdentity() {
		return bizIdentity;
	}
	
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getFreezeType() {
		return freezeType;
	}
	
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
	
	public String getReceiptUrl() {
		return receiptUrl;
	}
	
	public void setReceiptUrl(String receiptUrl) {
		this.receiptUrl = receiptUrl;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String getSubContractCode() {
		return subContractCode;
	}
	
	public void setSubContractCode(String subContractCode) {
		this.subContractCode = subContractCode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getWithdrawType() {
		return withdrawType;
	}
	
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}
	
	public String getPayAmountCurrency() {
		return payAmountCurrency;
	}
	
	public void setPayAmountCurrency(String payAmountCurrency) {
		this.payAmountCurrency = payAmountCurrency;
	}
	
	public Money getPayAmount() {
		return payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		this.payAmount = payAmount;
	}
	
	public Money getPayAmountIn() {
		return payAmountIn;
	}
	
	public void setPayAmountIn(Money payAmountIn) {
		this.payAmountIn = payAmountIn;
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
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getBankAccountName() {
		return bankAccountName;
	}
	
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankCnapsNo() {
		return bankCnapsNo;
	}
	
	public void setBankCnapsNo(String bankCnapsNo) {
		this.bankCnapsNo = bankCnapsNo;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankAddress() {
		return bankAddress;
	}
	
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getReserved1() {
		return reserved1;
	}
	
	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}
	
	public String getReserved2() {
		return reserved2;
	}
	
	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}
}

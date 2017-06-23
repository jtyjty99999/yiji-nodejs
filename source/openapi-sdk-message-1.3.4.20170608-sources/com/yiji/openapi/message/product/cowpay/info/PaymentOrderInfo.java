/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:21:21 创建
 */
package com.yiji.openapi.message.product.cowpay.info;

import com.yiji.openapi.message.product.yzz.info.OrderBase;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class PaymentOrderInfo extends OrderBase{
	private static final long serialVersionUID = 1L;
	/**
	 * ID
	 */
	private Long paymentId;
	/**
	 * 交易号
	 */
	private String tradeNo;
	/**
	 * 付款人姓名
	 */
	private String payerName;
	/**
	 * 付款人账户
	 */
	private String payerAccount;
	/**
	 * 收款人姓名
	 */
	private String payeeName;
	/**
	 * 收款人账户
	 */
	private String payeeAccount;
	/**
	 * 交易金额
	 */
	private Money money;
	/**
	 * 收费金额
	 */
	private Money chargeMoney;
	/**
	 * 交易类型
	 */
	private Integer type;
	/**
	 * 交易类型描述
	 */
	private String typeDescribe;
	/**
	 * 交易状态
	 */
	private Integer status;
	/**
	 * 交易状态描述
	 */
	private String statusDescribe;
	/**
	 * 银行名称
	 */
	private String bankName;
	/**
	 * 银行省
	 */
	private String bankProvince;
	/**
	 * 银行市
	 */
	private String bankCity;
	/**
	 * 银行地址
	 */
	private String bankAddress;
	/**
	 * 添加时间
	 */
	private String rowAddTime;
	/**
	 * 操作员ID
	 */
	private String operatorId;
	/**
	 * 操作员姓名
	 */
	private String operatorName;
	/**
	 * 扩展1
	 */
	private String extendOne;
	/**
	 * 扩展2
	 */
	private String extendTwo;
	
	public Long getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPayerName() {
		return payerName;
	}
	
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	public String getPayerAccount() {
		return payerAccount;
	}
	
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}
	
	public String getPayeeName() {
		return payeeName;
	}
	
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	
	public String getPayeeAccount() {
		return payeeAccount;
	}
	
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	
	public Money getMoney() {
		return money;
	}
	
	public void setMoney(Money money) {
		this.money = money;
	}
	
	public Money getChargeMoney() {
		return chargeMoney;
	}
	
	public void setChargeMoney(Money chargeMoney) {
		this.chargeMoney = chargeMoney;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getTypeDescribe() {
		return typeDescribe;
	}
	
	public void setTypeDescribe(String typeDescribe) {
		this.typeDescribe = typeDescribe;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getStatusDescribe() {
		return statusDescribe;
	}
	
	public void setStatusDescribe(String statusDescribe) {
		this.statusDescribe = statusDescribe;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankProvince() {
		return bankProvince;
	}
	
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}
	
	public String getBankCity() {
		return bankCity;
	}
	
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	
	public String getBankAddress() {
		return bankAddress;
	}
	
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public String getRowAddTime() {
		return rowAddTime;
	}
	
	public void setRowAddTime(String rowAddTime) {
		this.rowAddTime = rowAddTime;
	}
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getOperatorName() {
		return operatorName;
	}
	
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	
	public String getExtendOne() {
		return extendOne;
	}
	
	public void setExtendOne(String extendOne) {
		this.extendOne = extendOne;
	}
	
	public String getExtendTwo() {
		return extendTwo;
	}
	
	public void setExtendTwo(String extendTwo) {
		this.extendTwo = extendTwo;
	}

	/**
	 * 
	 * @see com.yiji.openapi.message.product.yzz.info.Order#check()
	 */
	public void check() {
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-03-10 15:29 创建
 *
 */
package com.yiji.openapi.message.common.query.info;

import java.io.Serializable;
import java.util.Date;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
public class UserTransLogInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** 流水号 */
	private String bizNo;
	
	/** 可能为交易流水号，支付引擎流水号，收费流水号 */
	private String outBizNo;
	
	/** 会员id */
	private String userId;
	
	/** 卡号 */
	private String cardNo;
	
	/** 资金账号 */
	private String accountNo;
	
	/** 姓名 */
	private String userName;
	
	/** 账务流水号 */
	private String accountBizNo;
	
	/** 用户类型 */
	private String userType;
	
	/** 交易金额 */
	private Money tradeAmount;
	
	/** 数据业务类型 */
	private String dataBizType;
	
	/** 收支方向 */
	private String direction;
	
	/** 币种枚举 */
	private String currency;
	
	/** 账期 */
	private String accountDay;
	
	/** 交易对方用户ID */
	private String counterPartyUserId;
	
	/** 交易对方用户ID */
	private String counterPartyCardNo;
	
	/** 交易对方资金账户 */
	private String counterPartyAccountNo;
	
	/** 交易对方姓名 */
	private String counterPartyUserName;
	
	/** 产品编号 */
	private String productCode;
	
	/** 行业 */
	private String category;
	
	/** 来源 */
	private String origin;
	
	/** 交易类型 */
	private String tradeType;
	
	/** 业务产品编码 */
	private String tradeBizProductCode;
	
	/** 银行代码 */
	private String bankCode;
	
	/** 银行账号 */
	private String bankAccountNo;
	
	/** 银行户名 */
	private String bankAccountName;
	
	/** 交易创建时间 */
	private Date createTime;
	
	/** 交易完成时间 */
	private Date finishedTime;
	
	/** 交易备注 */
	private String tradeMemo;
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getAccountBizNo() {
		return accountBizNo;
	}
	
	public void setAccountBizNo(String accountBizNo) {
		this.accountBizNo = accountBizNo;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getDataBizType() {
		return dataBizType;
	}
	
	public void setDataBizType(String dataBizType) {
		this.dataBizType = dataBizType;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getAccountDay() {
		return accountDay;
	}
	
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}
	
	public String getCounterPartyUserId() {
		return counterPartyUserId;
	}
	
	public void setCounterPartyUserId(String counterPartyUserId) {
		this.counterPartyUserId = counterPartyUserId;
	}
	
	public String getCounterPartyCardNo() {
		return counterPartyCardNo;
	}
	
	public void setCounterPartyCardNo(String counterPartyCardNo) {
		this.counterPartyCardNo = counterPartyCardNo;
	}
	
	public String getCounterPartyAccountNo() {
		return counterPartyAccountNo;
	}
	
	public void setCounterPartyAccountNo(String counterPartyAccountNo) {
		this.counterPartyAccountNo = counterPartyAccountNo;
	}
	
	public String getCounterPartyUserName() {
		return counterPartyUserName;
	}
	
	public void setCounterPartyUserName(String counterPartyUserName) {
		this.counterPartyUserName = counterPartyUserName;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getTradeType() {
		return tradeType;
	}
	
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getFinishedTime() {
		return finishedTime;
	}
	
	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
}

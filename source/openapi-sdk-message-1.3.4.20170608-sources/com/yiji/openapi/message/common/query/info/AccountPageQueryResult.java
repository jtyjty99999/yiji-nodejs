/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-05 15:25 创建
 *
 */
package com.yiji.openapi.message.common.query.info;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
public class AccountPageQueryResult {
	
	/** 可能为交易流水号，支付引擎流水号，收费流水号 */
	@OpenApiField(desc = "交易流水号",demo = "12345678798")
	private String tradeNo;
	
	/** 外部订单号 */
	@OpenApiField(desc = "外部订单号",demo = "132546978")
	private String outBizNo;
	
	/** 用户ID */
	@OpenApiField(desc = "用户ID",demo = "12345678901234567890")
	private String userId;
	
	/** 交易金额 */
	@OpenApiField(desc = "交易金额",demo = "88.66")
	private Money tradeAmount;
	
	/** 数据业务类型 */
	@OpenApiField(desc = "数据业务类型",demo = "TRADE")
	private String event;
	
	/** 交易备注 */
	@OpenApiField(desc = "交易备注",demo = "充值")
	private String tradeMemo;
	
	/** 交易创建时间 */
	@OpenApiField(desc = "交易创建时间",demo = "2012-12-12 12:12:12")
	private Date createTime;
	
	/** 交易完成时间 */
	@OpenApiField(desc = "交易完成时间",demo = "2013-12-12 12:12:12")
	private Date finishedTime;
	
	/** 交易商品名称 */
	@OpenApiField(desc = "交易商品名称",demo = "话费")
	private String tradeName;
	
	/** 手续费 */
	@OpenApiField(desc = "手续费",constraint = "只表示交易过程产生了手续费，但是不确定此项费用由谁支付",demo = "88.66")
	private Money fee;
	
	/** 收支方向 */
	@OpenApiField(desc = "收支方向",demo = "IN")
	private String direction;
	
	/** 银行名称 */
	@OpenApiField(desc = "银行名称",demo = "中国农业银行")
	private String bankName;
	
	/** 银行账号 */
	@OpenApiField(desc = "银行账号",demo = "1234567980123245678")
	private String bankAccountNo;
	
	/** 银行账户名称 */
	@OpenApiField(desc = "银行账户名称",demo = "易极付")
	private String bankAccountName;
	
	/** 买家ID */
	@OpenApiField(desc = "买家ID",demo = "12345678901234567890")
	private String buyerUserId;
	
	/** 买家名称 */
	@OpenApiField(desc = "买家名称",demo = "易极付")
	private String buyerUserName;
	
	/** 卖家ID */
	@OpenApiField(desc = "卖家ID",demo = "13245697801234567980")
	private String selleruserId;
	
	/** 卖家名称 */
	@OpenApiField(desc = "卖家名称",demo = "易极付")
	private String selleruserName;
	
	/** 币种 */
	@OpenApiField(desc = "币种",demo = "CNY")
	private String currency;
	
	/** 状态 */
	@OpenApiField(desc = "状态",demo = "FINISH")
	private String state;
	
	/** 交易后余额 */
	@OpenApiField(desc = "交易后余额",demo = "88.66")
	private Money balance;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
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
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public Money getFee() {
		return fee;
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
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
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
		if (StringUtils.isNotBlank(bankAccountNo)) {
			int length = bankAccountNo.length();
			if(length>7){
				this.bankAccountNo = bankAccountNo.replace(bankAccountNo.substring(4,length-3),"*********");
			}
			else{
				this.bankAccountNo = bankAccountNo;
			}
		} else {
			this.bankAccountNo = bankAccountNo;
		}
	}
	
	public String getBankAccountName() {
		return bankAccountName;
	}
	
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getBuyerUserName() {
		return buyerUserName;
	}
	
	public void setBuyerUserName(String buyerUserName) {
		this.buyerUserName = buyerUserName;
	}
	
	public String getSelleruserId() {
		return selleruserId;
	}
	
	public void setSelleruserId(String selleruserId) {
		this.selleruserId = selleruserId;
	}
	
	public String getSelleruserName() {
		return selleruserName;
	}
	
	public void setSelleruserName(String selleruserName) {
		this.selleruserName = selleruserName;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Money getBalance() {
		return balance;
	}
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public void setFee(Money fee) {
		this.fee = fee;
		
	}
}

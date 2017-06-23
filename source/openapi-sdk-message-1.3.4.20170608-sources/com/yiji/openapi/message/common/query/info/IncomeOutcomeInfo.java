/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年9月3日 下午8:31:23 创建
 */
package com.yiji.openapi.message.common.query.info;

import com.yiji.openapi.message.common.query.enums.FundsDirectionEnum;
import com.yiji.openapi.message.common.query.enums.TradeTypeEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
public class IncomeOutcomeInfo {
	
	@OpenApiField(desc = "账号",demo = "12346579801234567890")
	private String userId;
	
	@OpenApiField(desc = "交易额",demo = "88.66")
	private Money transAmount;
	
	@OpenApiField(desc = "资金流向",demo = "INCOME")
	private FundsDirectionEnum direction;
	
	@OpenApiField(desc = "交易事后余额",demo = "88.66")
	private Money balance;
	
	@OpenApiField(desc = "收支备注",demo = "充值")
	private String memo;
	
	@OpenApiField(desc = "交易类型",demo = "RECHARGE")
	private TradeTypeEnum tradeType;
	
	@OpenApiField(desc = "交易开始时间",demo = "1972-12-12 08:32:54")
	private String tradeBeginTime;
	
	@OpenApiField(desc = "交易更新时间",demo = "1972-12-12 05:12:45")
	private String tradeUpdateTime;
	
	@OpenApiField(desc = "交易创建描述",demo = "充值")
	private String tradeCreateDesc;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getTransAmount() {
		return this.transAmount;
	}
	
	public void setTransAmount(Money transAmount) {
		this.transAmount = transAmount;
	}
	
	public FundsDirectionEnum getDirection() {
		return this.direction;
	}
	
	public void setDirection(FundsDirectionEnum direction) {
		this.direction = direction;
	}
	
	public Money getBalance() {
		return this.balance;
	}
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public TradeTypeEnum getTradeType() {
		return this.tradeType;
	}
	
	public void setTradeType(TradeTypeEnum tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getTradeBeginTime() {
		return this.tradeBeginTime;
	}
	
	public void setTradeBeginTime(String tradeBeginTime) {
		this.tradeBeginTime = tradeBeginTime;
	}
	
	public String getTradeUpdateTime() {
		return this.tradeUpdateTime;
	}
	
	public void setTradeUpdateTime(String tradeUpdateTime) {
		this.tradeUpdateTime = tradeUpdateTime;
	}
	
	public String getTradeCreateDesc() {
		return this.tradeCreateDesc;
	}
	
	public void setTradeCreateDesc(String tradeCreateDesc) {
		this.tradeCreateDesc = tradeCreateDesc;
	}
	
}

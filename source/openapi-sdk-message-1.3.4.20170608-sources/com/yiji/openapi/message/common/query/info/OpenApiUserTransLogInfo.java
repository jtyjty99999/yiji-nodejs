/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月27日 下午1:07:14 创建
 */
package com.yiji.openapi.message.common.query.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年10月27日
 */

public class OpenApiUserTransLogInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/** 事件*/
	@OpenApiField(desc="事件",constraint="事件",demo="TRADE")
	private String event;
	
	/** 收支方向 */
	@OpenApiField(desc="收支方向",constraint="收支方向",demo="IN")
	private String direction;
	
	/** 会员id */
	@OpenApiField(desc="会员id",constraint="会员id",demo="20151013010000081073")
	private String userId;
	
	/** 会员卡号 */
	@OpenApiField(desc="会员卡号",constraint="会员卡号",demo="20141106020000058750")
	private String cardNo;
	
	/** 资金账号 */
	@OpenApiField(desc="资金账号",constraint="资金账号",demo="20150116010000063674")
	private String accountNo;
	
	/** 交易金额 */
	@OpenApiField(desc="交易金额",constraint="交易金额",demo="66.66")
	private Money tradeAmount;
	
	/** 币种枚举 */
	@OpenApiField(desc="币种",constraint="币种",demo="CNY")
	private String currency;

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Money getTradeAmount() {
		return this.tradeAmount;
	}

	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}

    
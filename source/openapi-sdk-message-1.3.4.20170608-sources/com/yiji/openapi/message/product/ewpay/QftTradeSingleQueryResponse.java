/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午1:51:05 创建
 */
package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "qftTradeSingleQuery", type = ApiMessageType.Response)
public class QftTradeSingleQueryResponse extends ApiResponse {

	/**
	 * 外部订单号
	 */
	@OpenApiField(desc = "外部订单号" ,demo = "outorderno1443068550641")
	private String outOrderNo;
	
	/**
	 * 交易名称
	 */
	@OpenApiField(desc = "交易名称" ,demo = "购买基金")
	private String outTradeTitle;
	
	/**
	 * 交易渠道
	 */
	@OpenApiField(desc = "交易渠道" ,demo = "GATEWAY")
	private String tradeChannel;
	
	/**
	 * 交易类型
	 */
	@OpenApiField(desc = "交易类型" ,demo = "TRADE")
	private String tradeType;
	
	/**
	 * 交易金额
	 */
	@OpenApiField(desc = "交易金额" ,demo = "10000.00")
	private Money money;
	
	/**
	 * 红包
	 */
	@OpenApiField(desc = "红包" ,demo = "100.00")
	private Money moneyGift;
	
	/**
	 * 收费金额
	 */
	@OpenApiField(desc = "收费金额" ,demo = "5000.00")
	private Money chargeMoney;
	
	/**
	 * 收费方式
	 */
	@OpenApiField(desc = "收费方式" ,demo = "PAYER")
	private String chargeParty;
	
	/**
	 * 备注
	 */
	@OpenApiField(desc = "备注" ,demo = "备注")
	private String mome;
	
	/**
	 * 买家外部会员id
	 */
	@OpenApiField(desc = "买家外部会员id" ,demo = "1443068550641")
	private String outPayerShopId;
	
	/**
	 * 买家外部会员姓名
	 */
	@OpenApiField(desc = "买家外部会员姓名" ,demo = "易极付")
	private String payerName;
	
	/**
	 * 买家会员id
	 */
	@OpenApiField(desc = "买家会员id" ,demo = "1443068550641")
	private String payerUserId;
	
	/**
	 * 卖家外部会员id
	 */
	@OpenApiField(desc = "卖家外部会员id" ,demo = "1443068550641")
	private String outPayeeShopId;
	
	/**
	 * 卖家外部会员姓名
	 */
	@OpenApiField(desc = "卖家外部会员姓名" ,demo = "易极付")
	private String payeeName;
	
	/**
	 * 卖家会员id
	 */
	@OpenApiField(desc = "卖家会员id" ,demo = "1443068550641")
	private String payeeUserId;
	
	/**
	 * 交易状态
	 */
	@OpenApiField(desc = "交易状态" ,demo = "SUCCESS")
	private String tradeStatus;
	
	/**
	 * 交易状态描述
	 */
	@OpenApiField(desc = "交易状态描述" ,demo = "描述")
	private String tradeStatusDescription;
	
	/**
	 * 创建时间
	 */
	@OpenApiField(desc = "创建时间" ,demo = "1972-12-12 00:00:00")
	private String rawAddTime;
	
	/**
	 * 更新时间
	 */
	@OpenApiField(desc = "更新时间" ,demo = "1972-12-12 00:00:00")
	private String rawUpdateTime;

	/**
	 * 交易订单号
	 */
	@OpenApiField(desc = "交易订单号" ,demo = "123564897123456")
	private String tradeNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutTradeTitle() {
		return this.outTradeTitle;
	}

	public void setOutTradeTitle(String outTradeTitle) {
		this.outTradeTitle = outTradeTitle;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}

	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Money getMoney() {
		return this.money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public Money getMoneyGift() {
		return this.moneyGift;
	}

	public void setMoneyGift(Money moneyGift) {
		this.moneyGift = moneyGift;
	}

	public Money getChargeMoney() {
		return this.chargeMoney;
	}

	public void setChargeMoney(Money chargeMoney) {
		this.chargeMoney = chargeMoney;
	}

	public String getChargeParty() {
		return this.chargeParty;
	}

	public void setChargeParty(String chargeParty) {
		this.chargeParty = chargeParty;
	}

	public String getMome() {
		return this.mome;
	}

	public void setMome(String mome) {
		this.mome = mome;
	}

	public String getOutPayerShopId() {
		return this.outPayerShopId;
	}

	public void setOutPayerShopId(String outPayerShopId) {
		this.outPayerShopId = outPayerShopId;
	}

	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getOutPayeeShopId() {
		return this.outPayeeShopId;
	}

	public void setOutPayeeShopId(String outPayeeShopId) {
		this.outPayeeShopId = outPayeeShopId;
	}

	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}

	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTradeStatusDescription() {
		return this.tradeStatusDescription;
	}

	public void setTradeStatusDescription(String tradeStatusDescription) {
		this.tradeStatusDescription = tradeStatusDescription;
	}

	public String getRawAddTime() {
		return this.rawAddTime;
	}

	public void setRawAddTime(String rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public String getRawUpdateTime() {
		return this.rawUpdateTime;
	}

	public void setRawUpdateTime(String rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}

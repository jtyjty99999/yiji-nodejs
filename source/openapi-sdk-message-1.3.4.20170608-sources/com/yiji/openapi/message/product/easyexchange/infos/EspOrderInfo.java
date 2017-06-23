/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:54:27 创建
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class EspOrderInfo {
	/** 商户订单号 */
	private String outOrderNo;
	
	/** 商户易极付账户ID */
	private String userId;
	
	/** 交易金额 */
	private Money amountLoc = new Money(0.0);
	
	/** 交易币种如USD、CNY等等 */
	private String currencyCode;
	
	/** 手续费(人民币) */
	private Money charge = new Money(0.0);
	
	/** 卡种 */
	private String cardType;
	
	/** 交易时间 */
	private String tradeTime;
	
	/** 买家email */
	private String buyerEmail;
	
	/** 订单状态 */
	private String orderStatus;
	
	/** 订单操作标记(根据操作标记调用撤销、退款功能),默认不能进行任何操作 */
	private String operationFlag;
	
	/** 剩余退款金额(退款时使用) */
	private Money usableRefundMoney = new Money(0.0);
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmountLoc() {
		return amountLoc;
	}
	
	public void setAmountLoc(Money amountLoc) {
		this.amountLoc = amountLoc;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public Money getCharge() {
		return charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getTradeTime() {
		return tradeTime;
	}
	
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
	
	public String getBuyerEmail() {
		return buyerEmail;
	}
	
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getOperationFlag() {
		return operationFlag;
	}
	
	public void setOperationFlag(String operationFlag) {
		this.operationFlag = operationFlag;
	}
	
	public Money getUsableRefundMoney() {
		return usableRefundMoney;
	}
	
	public void setUsableRefundMoney(Money usableRefundMoney) {
		this.usableRefundMoney = usableRefundMoney;
	}
}

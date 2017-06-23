/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * 
 * @Filename TradeSimpleStringInfo.java
 *
 * @Description
 *
 * @Version 1.0
 *
 * @Author wangjiayin
 *
 * @Email wjiayin@yiji.com
 * 
 * @History <li>Author: wangjiayin</li> <li>Date: 2013-3-13</li> <li>Version:
 * 1.0</li> <li>Content: create</li>
 *
 */
public class TradeSimpleStringInfo implements Serializable {
	
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -7867941372688693222L;
	
	/** 交易号 */
	@OpenApiField(desc = "交易号",demo = "20160128001111111111",constraint = "交易号")
	private String tradeNo;
	
	/** 父交易号 */
	@OpenApiField(desc = "父交易号",demo = "20160128001111111111",constraint = "父交易号")
	private String parentNo;
	
	/** 订单号 */
	@OpenApiField(desc = "订单号",demo = "20160128001111111111",constraint = "订单号")
	private String orderNo;
	
	/** 交易业务产品编号 */
	@OpenApiField(desc = "业务编码",demo = "",constraint = "业务编码")
	private String tradeBizProductCode;
	
	/** 付款人 */
	@OpenApiField(desc = "付款人会员号",demo = "20160128001111111111",constraint = "付款人会员号")
	private String payerUserId;
	
	/** 收款人 */
	@OpenApiField(desc = "收款人会员号",demo = "20160128001111111112",constraint = "收款人会员号")
	private String payeeUserId;
	
	/** 交易额 */
	@OpenApiField(desc = "交易金额",demo = "23.60",constraint = "交易金额")
	private String tradeAmount;

	/** 交易状态 */
	@OpenApiField(desc = "交易状态",demo = "TRADE_FINISHED")
	private String tradeStatus;

	/** 支付状态 */
	@OpenApiField(desc = "支付状态",demo = "SUCCESS")
	private String payStatus;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getParentNo() {
		return parentNo;
	}
	
	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayeeUserId() {
		return payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	
	public String getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TradeSimpleStringInfo [tradeNo=");
		builder.append(tradeNo);
		builder.append(", parentNo=");
		builder.append(parentNo);
		builder.append(", orderNo=");
		builder.append(orderNo);
		builder.append(", tradeBizProductCode=");
		builder.append(tradeBizProductCode);
		builder.append(", payerUserId=");
		builder.append(payerUserId);
		builder.append(", payeeUserId=");
		builder.append(payeeUserId);
		builder.append(", tradeAmount=");
		builder.append(tradeAmount);
		builder.append("]");
		return builder.toString();
	}
}

/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.yiji.openapi.message.common.query.info;

import com.yiji.openapi.message.common.query.enums.TradeTypeEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Filename TradeQueryInfo.java
 * 
 * @Description 交易查询返回结果
 * 
 * @Version 1.0
 * 
 * @Author tanyongfu
 * 
 * @Email tyohngfu@yiji.com
 * 
 * @History <li>Author: tanyongfu</li> <li>Date: 2012-9-17</li> <li>Version: 1.0
 * </li> <li>Content: create</li>
 * 
 */
public class TradeQueryInfo implements Serializable {

	@OpenApiField(desc = "交易号",demo = "1231654168413278615467")
	private String tradeNo;

	@OpenApiField(desc = "商户订单号",demo = "1234732165815745")
	private String outOrderNo;

	@OpenApiField(desc = "交易名称",demo = "代购-即时到帐交易")
	private String tradeName;

	@OpenApiField(desc = "买家易极付用户ID",demo = "20165489784521548745")
	private String buyerId;

	@OpenApiField(desc = "买家真实姓名",demo = "张*")
	private String buyerRealName;

	@OpenApiField(desc = "买家邮箱",demo = "**@yiji.com")
	private String buyerEmail;

	@OpenApiField(desc = "卖家易极付用户ID",demo = "2016548596548752154")
	private String sellerId;

	@OpenApiField(desc = "卖家真实姓名",demo = "李*")
	private String sellerRealName;

	@OpenApiField(desc = "卖家邮箱",demo = "***@yiji.com")
	private String sellerEmail;

	@OpenApiField(desc = "付款人易极付用户ID",demo = "2016554895484526354")
	private String payerUserId;

	@OpenApiField(desc = "付款人真实姓名",demo = "王*子")
	private String payerRealName;

	@OpenApiField(desc = "付款人邮箱",demo = "*@yiji.com")
	private String payerEmail;

	@OpenApiField(desc = "平台商易极付用户ID",demo = "20165484579635214857")
	private String merchantUserId;

	@OpenApiField(desc = "交易创建时间",demo = "2016-05-14 12:45:65",constraint = "格式：yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@OpenApiField(desc = "交易类型",demo = "FASTPAYTRADE")
	private TradeTypeEnum tradeType;

	@OpenApiField(desc = "交易状态",demo = "TRADE_FINISHED")
	private String tradeStatus;

	@OpenApiField(desc = "产品编码",demo = "51541")
	private String tradeBizProductCode;

	@OpenApiField(desc = "交易金额",demo = "88.66")
	private Money tradeAmount;

	@OpenApiField(desc = "手续费",demo = "8.66")
	private Money serviceFee;

	@OpenApiField(desc = "交易备注",demo = "备注")
	private String tradeMemo;

	@OpenApiField(desc = "交易更新时间",demo = "2016-05-14 12:45:65",constraint = "格式：yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOutOrderNo() {
		return outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerRealName() {
		return buyerRealName;
	}

	public void setBuyerRealName(String buyerRealName) {
		this.buyerRealName = buyerRealName;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerRealName() {
		return sellerRealName;
	}

	public void setSellerRealName(String sellerRealName) {
		this.sellerRealName = sellerRealName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getPayerUserId() {
		return payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getPayerRealName() {
		return payerRealName;
	}

	public void setPayerRealName(String payerRealName) {
		this.payerRealName = payerRealName;
	}

	public String getPayerEmail() {
		return payerEmail;
	}

	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public TradeTypeEnum getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeTypeEnum tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}

	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}

	public Money getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public Money getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Money serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getTradeMemo() {
		return tradeMemo;
	}

	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
}

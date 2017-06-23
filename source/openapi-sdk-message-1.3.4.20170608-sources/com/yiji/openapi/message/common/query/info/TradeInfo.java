/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-28 15:39 创建
 *
 */
package com.yiji.openapi.message.common.query.info;

import java.io.Serializable;
import java.util.Date;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
public class TradeInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** 交易类型，及时到账fastpay,担保交易commonEscowTrade */
	private String product;
	
	/** 交易号 */
	private String tradeNo;
	
	/** 交易名称 */
	private String tradeName;
	
	/** 订单号 */
	private String outOrderNo;
	
	/** 买家会员号 */
	private String buyerUserId;
	
	/** 买家姓名 */
	private String buyerName;
	
	/** 卖家会员号 */
	private String sellerUserId;
	
	/** 卖家姓名 */
	private String sellerName;
	
	/** 付款人会员号 */
	private String payerUserId;
	
	/** 付款人姓名 */
	private String payerName;
	
	/** 交易状态 */
	private String tradeStatus;
	
	/** 交易金额 */
	private Money tradeAmount;
	
	/** 币种 */
	private String currency;
	
	/** 买家留言 */
	private String buyerMemo;
	
	/** 卖家留言 */
	private String sellerMemo;
	
	/** 备注 */
	private String tradeMemo;
	
	/** 创建日期 */
	private Date createTime;
	
	/** 买家付款日期 */
	private Date payDate;
	
	/** 卖家发货日期 */
	private Date sendGoodsDate;
	
	/** 确认收货日期 */
	private Date receivePayDate;
	
	/** 交易完成日期 */
	private Date tradeFinishDate;
	
	/** 更新时间 */
	private Date updateTime;
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getBuyerName() {
		return buyerName;
	}
	
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayerName() {
		return payerName;
	}
	
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getBuyerMemo() {
		return buyerMemo;
	}
	
	public void setBuyerMemo(String buyerMemo) {
		this.buyerMemo = buyerMemo;
	}
	
	public String getSellerMemo() {
		return sellerMemo;
	}
	
	public void setSellerMemo(String sellerMemo) {
		this.sellerMemo = sellerMemo;
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
	
	public Date getPayDate() {
		return payDate;
	}
	
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	
	public Date getSendGoodsDate() {
		return sendGoodsDate;
	}
	
	public void setSendGoodsDate(Date sendGoodsDate) {
		this.sendGoodsDate = sendGoodsDate;
	}
	
	public Date getReceivePayDate() {
		return receivePayDate;
	}
	
	public void setReceivePayDate(Date receivePayDate) {
		this.receivePayDate = receivePayDate;
	}
	
	public Date getTradeFinishDate() {
		return tradeFinishDate;
	}
	
	public void setTradeFinishDate(Date tradeFinishDate) {
		this.tradeFinishDate = tradeFinishDate;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}

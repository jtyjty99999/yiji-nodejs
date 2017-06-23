/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:13:59 创建
 */
package com.yiji.openapi.message.product.yzz.info;

import java.io.Serializable;
import java.util.List;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class QueryClaimsTransferInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	private String bizNo;

	private String tradeNo;

	private String merchantUserId;

	private String merchantOrderBizNo;

	private String buyerUserId;

	private String sellerUserId;

	private String paymentStatus;

	private Money claimsAmount;

	private Money transferAmount;

	private String memo;

	private String createTime;
	/**
	 * 下级付款列表
	 */
	private List<PaymentResult> paymentResults;

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}

	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}

	public String getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getSellerUserId() {
		return sellerUserId;
	}

	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public Money getClaimsAmount() {
		return claimsAmount;
	}

	public void setClaimsAmount(Money claimsAmount) {
		this.claimsAmount = claimsAmount;
	}

	public Money getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(Money transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<PaymentResult> getPaymentResults() {
		return paymentResults;
	}

	public void setPaymentResults(List<PaymentResult> paymentResults) {
		this.paymentResults = paymentResults;
	}
}

    
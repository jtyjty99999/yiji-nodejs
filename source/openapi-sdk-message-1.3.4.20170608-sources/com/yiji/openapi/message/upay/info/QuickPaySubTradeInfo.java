/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月8日 下午6:32:25 创建
 */
package com.yiji.openapi.message.upay.info;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月8日
 */

public class QuickPaySubTradeInfo {
	
	private String subOrderNo;
	
	/** 交易业务产品编号 */
	private String subTradeNo;
	
	@NotEmpty
	/** 付款人 */
	private String payerUserId;
	
	@NotEmpty
	/** 收款人 */
	private String payeeUserId;
	
	@NotEmpty
	/** 交易额 */
	private Money tradeAmount;
	
	@NotEmpty
	/** 交易类型 */
	private String subTradeType;
	
	/** 交易备注 */
	private String memo;
	
	public String getSubOrderNo() {
		return subOrderNo;
	}
	
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}
	
	public String getSubTradeNo() {
		return subTradeNo;
	}
	
	public void setSubTradeNo(String subTradeNo) {
		this.subTradeNo = subTradeNo;
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
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getSubTradeType() {
		return subTradeType;
	}
	
	public void setSubTradeType(String subTradeType) {
		this.subTradeType = subTradeType;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

    
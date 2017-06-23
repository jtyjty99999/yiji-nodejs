/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午4:01:00 创建
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年8月9日
 */

public class PaymentBillResultVo {
	/** 金额 */
	private Money paymentBillMoney;
	
	/** 原始商户订单号 */
	private String outOrderNo;
	
	/** 交易流水号 */
	private String tradeNo;
	
	/** 状态 */
	private String serviceStatus;
	
	/** 状态描述 */
	private String message;
	
	/**
	 * @return the paymentBillMoney
	 */
	public Money getPaymentBillMoney() {
		return paymentBillMoney;
	}
	
	/**
	 * @param paymentBillMoney the paymentBillMoney to set
	 */
	public void setPaymentBillMoney(Money paymentBillMoney) {
		this.paymentBillMoney = paymentBillMoney;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getServiceStatus() {
		return serviceStatus;
	}
	
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}

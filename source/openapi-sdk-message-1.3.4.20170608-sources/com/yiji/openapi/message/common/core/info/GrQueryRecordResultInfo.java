/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-28 16:39 创建
 *
 */
package com.yiji.openapi.message.common.core.info;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiyang@yiji.com
 */
public class GrQueryRecordResultInfo implements Serializable {
	
	/** 订单号 */
	private String orderNo;
	/** 汇付申请时间 */
	private Date applyTime;
	/** 交易流水号 */
	private String tradeNo;
	/** 汇款帐户ID */
	private String userId;
	/** 收款账户名 */
	private String cardName;
	/** 收款证件号码 */
	private String certNo;
	/** 收款银行帐户卡号 */
	private String cardNo;
	/** 银行名称 */
	private String bankName;
	/** 银行代码 */
	private String bankCode;
	/** 金额 */
	private String remittanceAmount;
	/** 手续费 */
	private String charge;
	/** 状态 */
	private String status;
	
	public String getOrderNo() {
		return this.orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	public Date getApplyTime() {
		return this.applyTime;
	}
	
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardName() {
		return this.cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCardNo() {
		return this.cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCode() {
		return this.bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getRemittanceAmount() {
		return this.remittanceAmount;
	}
	
	public void setRemittanceAmount(String remittanceAmount) {
		this.remittanceAmount = remittanceAmount;
	}
	
	public String getCharge() {
		return this.charge;
	}
	
	public void setCharge(String charge) {
		this.charge = charge;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

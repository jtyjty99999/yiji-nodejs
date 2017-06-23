/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 上午10:40:58 创建
 */
package com.yiji.openapi.message.product.ypos.info;

import java.io.Serializable;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class SettleDetail implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * pos消费ID
	 */
	private long id;
	/**
	 * 结算ID
	 */
	private String settleId; 
	/**
	 * 商户号
	 */
	private String merchantId;
	/**
	 * 终端号
	 */
	private String terminalId;
	/**
	 * 批次号
	 */
	private String batchId;
	/**
	 * 凭证号
	 */
	private String credentialId;
	/**
	 * 卡号
	 */
	private String cardNumber;
	/**
	 * 费率
	 */
	private float chargeRate;
	/**
	 * 刷卡金额
	 */
	private long amount;
	/**
	 * 实际到账金额
	 */
	private long accountedAmount;
	/**
	 * 手续费
	 */
	private long chargeAmount;
	/**
	 * 实际到账手续费
	 */
	private long accountedChargeAmount;
	/**
	 * 实际结算金额
	 */
	private long settleAmount;
	/**
	 * 交易时间
	 */
	private String tradeTime;
	
	public SettleDetail() {
	}

	public SettleDetail(long id, String settleId, String merchantId, String terminalId, String batchId, String credentialId, String cardNumber, float chargeRate, long amount,
			long accountedAmount, long chargeAmount, long accountedChargeAmount, long settleAmount, String tradeTime) {
		this.id = id;
		this.settleId = settleId;
		this.merchantId = merchantId;
		this.terminalId = terminalId;
		this.batchId = batchId;
		this.credentialId = credentialId;
		this.cardNumber = cardNumber;
		this.chargeRate = chargeRate;
		this.amount = amount;
		this.accountedAmount = accountedAmount;
		this.chargeAmount = chargeAmount;
		this.accountedChargeAmount = accountedChargeAmount;
		this.settleAmount = settleAmount;
		this.tradeTime = tradeTime;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSettleId() {
		return settleId;
	}

	public void setSettleId(String settleId) {
		this.settleId = settleId;
	}

	public float getChargeRate() {
		return chargeRate;
	}

	public void setChargeRate(float chargeRate) {
		this.chargeRate = chargeRate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getAccountedAmount() {
		return accountedAmount;
	}

	public void setAccountedAmount(long accountedAmount) {
		this.accountedAmount = accountedAmount;
	}

	public long getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(long chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public long getAccountedChargeAmount() {
		return accountedChargeAmount;
	}

	public void setAccountedChargeAmount(long accountedChargeAmount) {
		this.accountedChargeAmount = accountedChargeAmount;
	}

	public long getSettleAmount() {
		return settleAmount;
	}

	public void setSettleAmount(long settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}
}

    
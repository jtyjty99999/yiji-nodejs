/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-26 16:54 创建
 *
 */
package com.yiji.openapi.message.common.core.info;

import java.io.Serializable;

/**
 * @author xiyang@yiji.com
 */
public class GrQueryCardResultInfo implements Serializable {
	
	/** card 主键 */
	private Long cardId;
	/** 收款人姓名 */
	private String cardName;
	/** 收款人证件号 */
	private String certNo;
	/** 收款人银行帐户卡号 */
	private String cardNo;
	/** 银行名称 */
	private String bankName;
	/** 银行代码 */
	private String bankCode;
	/** 银行所在省 */
	private String bankProvince;
	/** 银行所在市 */
	private String bankCity;
	/** 银行分行 */
	private String bankBranch;
	/** 银行联行号 */
	private String bankCnapsNo;
	/** 账号类型 */
	private String cardType;
	/** 卡状态 */
	private String cardState;
	
	public Long getCardId() {
		return cardId;
	}
	
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankProvince() {
		return bankProvince;
	}
	
	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}
	
	public String getBankCity() {
		return bankCity;
	}
	
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	
	public String getBankBranch() {
		return bankBranch;
	}
	
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	public String getBankCnapsNo() {
		return bankCnapsNo;
	}
	
	public void setBankCnapsNo(String bankCnapsNo) {
		this.bankCnapsNo = bankCnapsNo;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardState() {
		return cardState;
	}
	
	public void setCardState(String cardState) {
		this.cardState = cardState;
	}
}

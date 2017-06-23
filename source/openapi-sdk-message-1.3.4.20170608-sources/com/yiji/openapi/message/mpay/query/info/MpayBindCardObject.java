/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午2:27:52 创建
 */
package com.yiji.openapi.message.mpay.query.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class MpayBindCardObject implements Serializable{
	private static final long serialVersionUID = 1L;

	/** 银行名称 */
	@OpenApiField(desc = "银行名称", demo = "中国银行")
	private String bankName;
	
	/** 卡类型 */
	@OpenApiField(desc = "卡类型", demo = "DEBIT_CARD")
	private String cardType;
	
	/** 卡号 */
	@OpenApiField(desc = "银行卡号", demo = "213564789123321")
	private String bankAccountNo;
	/** 省略卡号 */
	private String cardNo;
	/** 手机号 */
	@OpenApiField(desc = "手机号码", demo = "13800138000")
	private String mobileNo;
	/** 银行代码 */
	@OpenApiField(desc = "银行代码", demo = "BOC")
	private String bankCode;

	@OpenApiField(desc = "签约编号", demo = "Fbaska12Lf")
	private String pactNo;
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
}

    
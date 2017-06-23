/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:40 创建
 *
 */
package com.yiji.openapi.message.mpay.platform.info;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xiyang@yiji.com
 */
public class BindCardDto {
	
	/** 银行名称 */
	@OpenApiField(desc = "银行名称",demo = "中国银行")
	private String bankName;
	/** 卡类型 */
	@OpenApiField(desc = "卡类型",constraint = "“CREDIT_CARD”信用卡，”DEBIT_CARD”借记卡",demo = "DEBIT_CARD")
	private String cardType;
	/** 卡号 */
	@OpenApiField(desc = "卡号",demo = "123456789123")
	private String bankAccountNo;
	/** 省略卡号 */
	@OpenApiField(desc = "省略卡号",demo = "12345648253")
	private String cardNo;
	/** 手机号 */
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	/** 银行代码 */
	@OpenApiField(desc = "银行代码",demo = "ABC")
	private String bankCode;
	@OpenApiField(desc = "真实姓名",demo = "易极付")
	private String realName;
	@OpenApiField(desc = "签约编号",demo = "123561564132")
	private String pactNo;
	/** 银行图片 */
	@OpenApiField(desc = "银行图片",demo = "http://www.yiji.com/1.jpg")
	private String smallIcon;
	
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
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getSmallIcon() {
		return this.smallIcon;
	}

	public void setSmallIcon(String smallIcon) {
		this.smallIcon = smallIcon;
	}
	
}

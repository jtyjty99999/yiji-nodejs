/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月5日 上午10:37:05创建
 */
package com.yiji.openapi.message.common.bankcard.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
public class BankCard {
	
	@NotNull
	@OpenApiField(desc = "银行卡绑定编号", constraint = "银行卡绑定编号",demo = "123456789")
	private String bindId;
	
	@Length(max = 16)
	@OpenApiField(desc = "银行英文简称", constraint = "银行英文简称",demo = "ABC")
	private String bankCode;
	
	@Length(max = 32)
	@OpenApiField(desc = "银行中文全称", constraint = "银行中文全称",demo = "中国农业银行")
	private String bankName;
	
	@Length(max = 128)
	@OpenApiField(desc = "银行链接图片", constraint = "银行链接图片（预留字段，暂不提供）",demo = "http://www.yiji.com/1.jpg")
	private String logoUrl;
	
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "绑定的银行卡号，只显示后4位",demo = "123456798012345678")
	private String bankCardNo;
	
	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型，如储蓄卡、信用卡",demo = "DEBIT")
	private String bankCardType;
	
	@Length(max = 16)
	@OpenApiField(desc = "开户行省份", constraint = "如：四川，重庆",demo = "重庆")
	private String province;
	
	@Length(max = 16)
	@OpenApiField(desc = "开户行城市", constraint = "如：成都，重庆",demo = "重庆")
	private String city;
	
	@Length(max = 16)
	@OpenApiField(desc = "签约类型",demo = "REAL_NAME")
	private String pactType;
	
	/** 是否为默认银行卡；ON-是,OFF-否 */
	@OpenApiField(desc = "是否为默认银行卡",demo = "ON")
	private String defaultCard;
	
	public String getDefaultCard() {
		return this.defaultCard;
	}

	public void setDefaultCard(String defaultCard) {
		this.defaultCard = defaultCard;
	}

	public String getBindId() {
		return this.bindId;
	}
	
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	
	public String getBankCode() {
		return this.bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getLogoUrl() {
		return this.logoUrl;
	}
	
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	
	public String getBankCardNo() {
		return this.bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getBankCardType() {
		return this.bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getProvince() {
		return this.province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPactType() {
		return pactType;
	}
	
	public void setPactType(String pactType) {
		this.pactType = pactType;
	}
	
	public static enum YesNoTypeEnum {
		
		/** 默认绑定 */
		Y("Y", "默认绑定"),
		
		/** 非默认绑定 */
		N("N", "非默认绑定");
		
		private final String code;
		
		/** 枚举描述 */
		private final String message;
		
		private YesNoTypeEnum(String code, String message) {
			this.code = code;
			this.message = message;
		}
		
		public String getCode() {
			return code;
		}
		
		public String getMessage() {
			return message;
		}
		
		public String code() {
			return code;
		}
		
		public String message() {
			return message;
		}
	}
}

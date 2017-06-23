/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-08 10:29 创建
 *
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;
import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 * @author xiyang@yiji.com
 */
public class PactQueryInfo implements Serializable {
	/*
	 * 手机号
	 */
	@OpenApiField(desc = "手机号", constraint = "手机号", demo = "189xxxx8080")
	private String userPhoneNo;
	/*
	 * 签约类型
	 */
	@OpenApiField(desc = "签约类型", constraint = "签约类型", demo = "realName")
	private String pactType;
	/*
	 * 银行卡类型名称
	 */
	@OpenApiField(desc = "银行卡类型名称", constraint = "银行卡类型名称", demo = "储蓄卡")
	private String cardTypeName;

	private Integer id;

	@OpenApiField(desc = "商户id", constraint = "商户id", demo = "xxxxx")
	private String partnerId;

	@OpenApiField(desc = "外部流水号", constraint = "外部流水号", demo = "xxxxx")
	private String orderNo;

	/*
	 * 流水号
	 */
	@OpenApiField(desc = "通用签约流水号", constraint = "通用签约流水号", demo = "00000000000000005050")
	private String pactNo;
	/*
	 * 商户码
	 */
	@OpenApiField(desc = "商户码", constraint = "商户码", demo = "xxx")
	private String upUserNo;
	/*
	 * 会员号
	 */
	@OpenApiField(desc = "用户id", constraint = "用户id", demo = "20140808010001249129")
	private String userId;

	@OpenApiField(desc = "银行简称", constraint = "银行简称", demo = "ICBC")
	private String bankShort;

	@OpenApiField(desc = "银行简称", constraint = "银行简称", demo = "ICBC")
	private String bankCode;
	/*
	 * 银行名称
	 */
	@OpenApiField(desc = "银行名称", constraint = "银行名称", demo = "招商银行")
	private String bankName;

	@OpenApiField(desc = "所属银行url", constraint = "所属银行url", demo = "xxx")
	private String bankGifUrl;
	/*
	 * 持卡人姓名
	 */
	@OpenApiField(desc = "持卡人姓名", constraint = "持卡人姓名", demo = "某某")
	private String cardName;
	/*
	 * 卡号
	 */
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "6226901205604410")
	private String cardNo;
	/*
	 * 卡类型
	 */
	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型", demo = "DEBIT_CARD_TYPE")
	private String cardType;
	/*
	 * 证件号
	 */
	@OpenApiField(desc = "证件号", constraint = "证件号", demo = "50038219891004xxxx")
	private String certNo;
	/*
	 * 证件类型
	 */
	@OpenApiField(desc = "证件类型", constraint = "证件类型", demo = "PASSPORT")
	private String certType;
	/*
	 * 签约状态
	 */
	@OpenApiField(desc = "签约状态", constraint = "签约状态", demo = "PACT_FAIL")
	private String status;
	/*
	 * 申请时间
	 */
	@OpenApiField(desc = "申请时间", constraint = "申请时间", demo = "1413429501000")
	private Date createTime;
	/*
	 * 完成时间
	 */
	@OpenApiField(desc = "完成时间", constraint = "完成时间", demo = "1413429501000")
	private Date updateTime;
	
	public String getUserPhoneNo() {
		return userPhoneNo;
	}
	
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	
	public String getPactType() {
		return pactType;
	}
	
	public void setPactType(String pactType) {
		this.pactType = pactType;
	}
	
	public String getCardTypeName() {
		return cardTypeName;
	}
	
	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getUpUserNo() {
		return upUserNo;
	}
	
	public void setUpUserNo(String upUserNo) {
		this.upUserNo = upUserNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankShort() {
		return bankShort;
	}

	public void setBankShort(String bankShort) {
		this.bankShort = bankShort;
	}

	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertType() {
		return certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankGifUrl() {
		return bankGifUrl;
	}

	public void setBankGifUrl(String bankGifUrl) {
		this.bankGifUrl = bankGifUrl;
	}
}

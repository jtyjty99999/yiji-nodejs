/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-27 10:01 创建
 *
 */
package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yxtDeductSign", type = ApiMessageType.Request)
public class YxtDeductSignRequest extends ApiRequest {
	
	/**
	 * 业务编码
	 */
	@NotEmpty
	@Size(max = 20)
	@OpenApiField(desc = "业务编码", constraint = "业务编码")
	private String serviceCode;
	
	/**
	 * 签约用户姓名
	 */
	@NotEmpty
	@Size(max = 16)
	@OpenApiField(desc = "真实姓名", constraint = "签约用户姓名")
	private String realName;
	
	/**
	 * 签约用户身份证号
	 */
	@NotEmpty
	@Size(max = 18)
	@OpenApiField(desc = "身份证号", constraint = "签约用户身份证号")
	private String certNo;
	
	/**
	 * 签约用户身份证有效期
	 */
	@NotEmpty
	@Size(min = 1, max = 16)
	@OpenApiField(desc = "身份证有效期", constraint = "签约用户身份证有效期")
	private String certValidTime;
	
	/**
	 * 签约用户手机号
	 */
	@NotEmpty
	@Size(min = 11, max = 11)
	@OpenApiField(desc = "手机号", constraint = "签约用户手机号")
	private String mobileNo;
	
	/**
	 * 签约用户职业
	 */
	@NotEmpty
	@Size(max = 128)
	@OpenApiField(desc = "职业", constraint = "签约用户职业")
	private String profession;
	
	/**
	 * 签约用户地址
	 */
	@NotEmpty
	@Size(max = 256)
	@OpenApiField(desc = "地址", constraint = "签约用户地址")
	private String address;
	
	/**
	 * 银行卡号
	 */
	@NotEmpty
	@Size(max = 40)
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号")
	private String bankCardNo;
	
	/**
	 * 银行卡类型 DEBIT_CARD:借记卡 CREDIT_CARD:信用卡
	 */
	@NotNull
	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型")
	private String bankCardType;
	
	/**
	 * 银行编码
	 */
	@NotEmpty
	@Size(max = 16)
	@OpenApiField(desc = "银行编码", constraint = "银行编码")
	private String bankCode;
	
	/**
	 * 备用银行卡号
	 */
	@Size(max = 40)
	@OpenApiField(desc = "备用银行卡号", constraint = "备用银行卡号")
	private String standbyBankCardNo;
	
	/**
	 * 备用银行卡类型 DEBIT_CARD:借记卡 CREDIT_CARD:信用卡
	 */
	@OpenApiField(desc = "备用银行卡类型", constraint = "备用银行卡类型")
	private String standbyBankCardType;
	
	/**
	 * 备用银行编码
	 */
	@Size(max = 16)
	@OpenApiField(desc = "备用银行编码", constraint = "备用银行编码")
	private String standbyBankCode;
	
	/**
	 * 代扣合同号
	 */
	@NotEmpty
	@Size(max = 40)
	@OpenApiField(desc = "代扣合同号", constraint = "代扣合同号")
	private String withholdContractNo;
	
	/**
	 * 代扣合同照片或PDF文档，要求互联网可访问的链接
	 */
	@NotEmpty
	@Size(max = 256)
	@OpenApiField(desc = "代扣合同链接", constraint = "代扣合同照片或PDF文档，要求互联网可访问的链接")
	private String withholdContractImageUrl;
	
	/**
	 * 银行卡照片，要求互联网可访问的链接
	 */
	@NotEmpty
	@Size(max = 256)
	@OpenApiField(desc = "银行卡照片", constraint = "银行卡照片，要求互联网可访问的链接")
	private String bankCardImageUrl;
	
	/**
	 * 签约用户身份证正面照片，要求互联网可访问的链接
	 */
	@NotEmpty
	@Size(max = 256)
	@OpenApiField(desc = "身份证正面照片", constraint = "签约用户身份证正面照片，要求互联网可访问的链接")
	private String certFrontImageUrl;
	
	/**
	 * 签约用户身份证背面照片，要求互联网可访问的链接
	 */
	@NotEmpty
	@Size(max = 256)
	@OpenApiField(desc = "身份证背面照片", constraint = "签约用户身份证背面照片，要求互联网可访问的链接")
	private String certBackImageUrl;
	
	/**
	 * 备用银行卡照片，要求互联网可访问的链接
	 */
	@Size(max = 256)
	@OpenApiField(desc = "备用银行卡照片", constraint = "备用银行卡照片，要求互联网可访问的链接")
	private String standbyBankCardImageUrl;
	
	/**
	 * 备注
	 */
	@NotEmpty
	@Size(max = 1024)
	@OpenApiField(desc = "备注", constraint = "备注")
	private String memo;
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertValidTime() {
		return certValidTime;
	}
	
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getStandbyBankCardNo() {
		return standbyBankCardNo;
	}
	
	public void setStandbyBankCardNo(String standbyBankCardNo) {
		this.standbyBankCardNo = standbyBankCardNo;
	}
	
	public String getWithholdContractNo() {
		return withholdContractNo;
	}
	
	public void setWithholdContractNo(String withholdContractNo) {
		this.withholdContractNo = withholdContractNo;
	}
	
	public String getWithholdContractImageUrl() {
		return withholdContractImageUrl;
	}
	
	public void setWithholdContractImageUrl(String withholdContractImageUrl) {
		this.withholdContractImageUrl = withholdContractImageUrl;
	}
	
	public String getBankCardImageUrl() {
		return bankCardImageUrl;
	}
	
	public void setBankCardImageUrl(String bankCardImageUrl) {
		this.bankCardImageUrl = bankCardImageUrl;
	}
	
	public String getCertFrontImageUrl() {
		return certFrontImageUrl;
	}
	
	public void setCertFrontImageUrl(String certFrontImageUrl) {
		this.certFrontImageUrl = certFrontImageUrl;
	}
	
	public String getCertBackImageUrl() {
		return certBackImageUrl;
	}
	
	public void setCertBackImageUrl(String certBackImageUrl) {
		this.certBackImageUrl = certBackImageUrl;
	}
	
	public String getStandbyBankCardImageUrl() {
		return standbyBankCardImageUrl;
	}
	
	public void setStandbyBankCardImageUrl(String standbyBankCardImageUrl) {
		this.standbyBankCardImageUrl = standbyBankCardImageUrl;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getServiceCode() {
		return serviceCode;
	}
	
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getStandbyBankCardType() {
		return standbyBankCardType;
	}
	
	public void setStandbyBankCardType(String standbyBankCardType) {
		this.standbyBankCardType = standbyBankCardType;
	}
	
	public String getStandbyBankCode() {
		return standbyBankCode;
	}
	
	public void setStandbyBankCode(String standbyBankCode) {
		this.standbyBankCode = standbyBankCode;
	}
}

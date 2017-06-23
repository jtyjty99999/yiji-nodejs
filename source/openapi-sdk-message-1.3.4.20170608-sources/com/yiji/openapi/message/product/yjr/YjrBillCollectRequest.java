/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-25 09:32 创建
 *
 */
package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yjrBillCollect", type = ApiMessageType.Request)
public class YjrBillCollectRequest extends ApiRequest {
	/**
	 * 账户名
	 */
	@NotEmpty
	@OpenApiField(desc = "账户名", constraint = "账户名")
	private String accName;
	/**
	 * 账号
	 */
	@NotEmpty
	@OpenApiField(desc = "账号", constraint = "账号")
	private String accNum;
	/**
	 * 账户类型
	 */
	@NotBlank
	@OpenApiField(desc = "账户类型", constraint = "账户类型")
	private String accType;
	/**
	 * 证件类型
	 */
	@NotBlank
	@OpenApiField(desc = "证件类型", constraint = "证件类型")
	private String certType;
	/**
	 * 证件号
	 */
	@NotEmpty
	@OpenApiField(desc = "证件号", constraint = "证件号")
	private String certNo;
	/**
	 * 账户银行预留手机号
	 */
	@OpenApiField(desc = "预留手机号", constraint = "客户在银行预留的手机号")
	private String accPhoneNum;
	/**
	 * 交易金额
	 */
	@NotNull
	@OpenApiField(desc = "交易金额", constraint = "交易金额")
	private Money transAmt;
	/**
	 * 交易币种
	 */
	@OpenApiField(desc = "币种", constraint = "交易币种")
	private String currency;
	/**
	 * 交易日期
	 */
	@NotNull
	@OpenApiField(desc = "交易日期", constraint = "交易日期")
	private Date transDate;
	/**
	 * 客户银行代码
	 */
	@NotBlank
	@OpenApiField(desc = "客户银行代码", constraint = "客户所在银行代码")
	private String bankCode;
	/**
	 * 客户银行省
	 */
	@OpenApiField(desc = "客户银行省", constraint = "客户银行所在省")
	private String bankProvince;
	/**
	 * 客户银行市
	 */
	@OpenApiField(desc = "客户银行所在市", constraint = "客户银行所在市")
	private String bankCity;
	/**
	 * 备注
	 */
	@OpenApiField(desc = "备注", constraint = "备注说明")
	private String note;
	/**
	 * 预留Json格式的字符串
	 */
	@OpenApiField(desc = "预留字段", constraint = "预留JSON字符串")
	private String reserveJsonData;
	
	public String getAccName() {
		return accName;
	}
	
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public String getAccNum() {
		return accNum;
	}
	
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	public String getAccType() {
		return accType;
	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public String getCertType() {
		return certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getAccPhoneNum() {
		return accPhoneNum;
	}
	
	public void setAccPhoneNum(String accPhoneNum) {
		this.accPhoneNum = accPhoneNum;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
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
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getReserveJsonData() {
		return reserveJsonData;
	}
	
	public void setReserveJsonData(String reserveJsonData) {
		this.reserveJsonData = reserveJsonData;
	}
	
	public Money getTransAmt() {
		return transAmt;
	}
	
	public void Money(Money transAmt) {
		this.transAmt = transAmt;
	}
	
	public Date getTransDate() {
		return transDate;
	}
	
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
}

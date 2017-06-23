/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月9日 下午4:04:05 创建
 */
package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "yxtBankCardVerifyQuery", type = ApiMessageType.Response)
public class YxtBankCardVerifyQueryResponse extends ApiResponse {
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "验卡订单号", constraint = "验卡订单号", demo = "P144733894089711")
	private String verifyCardOrderNo;
	
	@Length(max = 32)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "P144733894089711")
	private String outOrderNo;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "姓名", constraint = "姓名", demo = "张三")
	private String realName;
	
	@NotBlank
	@Length(max = 18)
	@OpenApiField(desc = "身份证号", constraint = "身份证号", demo = "500221198912032314")
	private String certNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "电话号码", constraint = "电话号码", demo = "13521425145")
	private String mobileNo;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "银行编码", constraint = "银行编码", demo = "CCB")
	private String bankCode;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "银行名称", constraint = "银行名称", demo = "中国银行")
	private String bankName;
	
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "6210 3222 1578 2575")
	private String bankCardNo;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型", demo = "DEBIT_CARD")
	private String bankCardType;
	
	@NotNull
	@OpenApiField(desc = "收费金额", constraint = "收费金额", demo = "66.66")
	private Money amount;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "状态", constraint = "状态", demo = "INIT")
	private String status;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "收费状态", constraint = "收费状态", demo = "PROCESSING")
	private String chargeStatus;
	
	@OpenApiField(desc = "备注", constraint = "备注", demo = "收费成功")
	private String memo;
	
	@Length(max = 40)
	@OpenApiField(desc = "错误码", constraint = "错误码", demo = "S030_00_0000")
	private String errorCode;
	
	public String getVerifyCardOrderNo() {
		return this.verifyCardOrderNo;
	}

	public void setVerifyCardOrderNo(String verifyCardOrderNo) {
		this.verifyCardOrderNo = verifyCardOrderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getChargeStatus() {
		return this.chargeStatus;
	}
	
	public void setChargeStatus(String chargeStatus) {
		this.chargeStatus = chargeStatus;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

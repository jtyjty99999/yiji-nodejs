/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:21 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFPay", type = ApiMessageType.Request)
public class MpayPFPayRequest extends ApiRequest {
	/**
	 * 签约流水号
	 */
	@Length(max = 20, min = 1, message = "签约流水号不能为空")
	@OpenApiField(desc = "签约流水号", demo = "123456789")
	private String pactNo;
	
	/**
	 * 交易号
	 */
	@NotBlank
	@Length(max = 20, min = 20, message = "交易号不能为空")
	@OpenApiField(desc = "交易号", demo = "1254678912")
	private String tradeNo;
	
	/**
	 * 银行卡号
	 */
	@Length(max = 32, min = 10)
	@OpenApiField(desc = "银行卡号", demo = "1234567891324564")
	private String bankAccountNo;
	
	/**
	 * 支付密码
	 */
	@OpenApiField(desc = "支付密码", security = true, demo = "21345678912345")
	private String payPassword;
	
	/**
	 * 短信验证码
	 */
	@Length(max = 10, min = 1)
	@OpenApiField(desc = "短信验证码", demo = "123456")
	private String verifyCode;
	
	/**
	 * 信用卡cvv2
	 */
	@Length(max = 10, min = 1)
	@OpenApiField(desc = "信用卡cvv2", demo = "124")
	private String cvv2;
	
	/**
	 * 信用卡有效期
	 */
	@Length(max = 10, min = 1)
	@OpenApiField(desc = "信用卡有效期", demo = "1502")
	private String validDate;
	
	/**
	 * 是否用nfc支付, "true"是， "false"否
	 */
	@Length(max = 10, min = 1)
	@OpenApiField(desc = "是否用nfc支付, \"true\"是， \"false\"否", demo = "false")
	private String nfcPay = "false";
	
	/** 真实姓名 */
	@Length(max = 60, min = 1)
	@OpenApiField(desc = "真实姓名", demo = "易极付")
	private String realName;
	
	/** 身份证号码 */
	@Length(max = 50, min = 6)
	@OpenApiField(desc = "身份证号码", demo = "12346578901345678")
	private String certNo;
	
	@OpenApiField(desc = "支付方式", constraint = "支付方式", demo = "BY_DEPOSIT")
	private String payWay;
	
	public String getPayWay() {
		return this.payWay;
	}
	
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	
	public String getPactNo() {
		return this.pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	@JSONField(serialize = false)
	public String getPayPassword() {
		return this.payPassword;
	}
	
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	
	public String getVerifyCode() {
		return this.verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getCvv2() {
		return this.cvv2;
	}
	
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	
	public String getValidDate() {
		return this.validDate;
	}
	
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
	public String getNfcPay() {
		return this.nfcPay;
	}
	
	public void setNfcPay(String nfcPay) {
		this.nfcPay = nfcPay;
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
}

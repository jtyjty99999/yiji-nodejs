/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:22 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFQueryPartnerConfirg", type = ApiMessageType.Response)
public class MpayPFQueryPartnerConfirgResponse extends ApiResponse {
	
	/**
	 * 大额金额基准额度
	 */
	@OpenApiField(desc = "大额金额基准额度", demo = "88.66")
	private Money baseAmount;
	
	/**
	 * 商户配色
	 */
	@OpenApiField(desc = "商户配色", demo = "red")
	private String color;
	
	/**
	 * 用户单笔限额
	 */
	@OpenApiField(desc = "用户单笔限额", demo = "88.66")
	private Money singleMaxAmount;
	
	/**
	 * 是否支持nfc支付, "1"是, "0"否
	 * */
	@OpenApiField(desc = "是否支持nfc支付", constraint = " \"1\"是, \"0\"否", demo = "0")
	private int nfcPay;
	
	@Length(max=2)
	@OpenApiField(desc = "是否开启小额免密支付", constraint = "{\"data\":[\"1:是\",\"0:否\"],\"name\":\"是否开启小额免密支付\"}", demo = "0")
	private String pwdStatus;
	
	@Length(max=2)
	@OpenApiField(desc = "是否开启余额支付", constraint = "{\"data\":[\"1:是\",\"0:否\"],\"name\":\"是否开启余额支付\"}", demo = "0")
	private String balanceStatus;
	
	@OpenApiField(desc = "小额免密额度", constraint = "小额免密额度", demo = "66.66")
	private Money pwdQuota;
	
	public String getPwdStatus() {
		return this.pwdStatus;
	}
	
	public void setPwdStatus(String pwdStatus) {
		this.pwdStatus = pwdStatus;
	}
	
	public String getBalanceStatus() {
		return this.balanceStatus;
	}
	
	public void setBalanceStatus(String balanceStatus) {
		this.balanceStatus = balanceStatus;
	}
	
	public Money getPwdQuota() {
		return this.pwdQuota;
	}
	
	public void setPwdQuota(Money pwdQuota) {
		this.pwdQuota = pwdQuota;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getNfcPay() {
		return this.nfcPay;
	}
	
	public void setNfcPay(int nfcPay) {
		this.nfcPay = nfcPay;
	}
	
	public Money getBaseAmount() {
		return this.baseAmount;
	}
	
	public void setBaseAmount(Money baseAmount) {
		this.baseAmount = baseAmount;
	}
	
	public Money getSingleMaxAmount() {
		return this.singleMaxAmount;
	}
	
	public void setSingleMaxAmount(Money singleMaxAmount) {
		this.singleMaxAmount = singleMaxAmount;
	}
}

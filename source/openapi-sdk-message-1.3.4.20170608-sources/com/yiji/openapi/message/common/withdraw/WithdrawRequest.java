/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 下午2:35:42 创建
 */
package com.yiji.openapi.message.common.withdraw;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "withdraw", type = ApiMessageType.Request)
public class WithdrawRequest extends ApiRequest {
	@Size(max = 20, min = 20)
	@NotBlank
	@OpenApiField(desc = "会员ID", constraint = "提现的会员ID")
	private String userId;
	
	@OpenApiField(desc = "到账期限", constraint = "T+N，交易到账日期，如T+3表示在交易发起时刻第三天到账，默认为0")
	private int arrivedType = 0;
	
	@NotNull
	@OpenApiField(desc = "提现金额")
	private Money amount;
	
	@OpenApiField(desc = "币种", constraint = "可选参数为：CNY: 人民币(默认) USD: 美元 JPY:日元")
	private String currency;
	
	@NotNull
	@OpenApiField(desc = "提现方式", constraint = "可选值：BIND_CARD：使用绑定卡，CUSTOMIZE：定制化")
	private String withdrawType;
	
	@OpenApiField(desc = "银行卡绑定编号", constraint = "银行卡绑定编号")
	private Long bindId;
	
	@OpenApiField(desc = "银行英文简称", constraint = "银行英文简称")
	private String bankCode;
	
	@Size(max = 50)
	@OpenApiField(desc = "银行账户卡号")
	private String bankAccountNo;
	
	@Size(max = 16)
	@OpenApiField(desc = "开户行省份", constraint = "如：四川，重庆")
	private String provName;
	
	@Size(max = 16)
	@OpenApiField(desc = "开户行城市", constraint = "如：成都，重庆")
	private String cityName;
	
	@Size(max = 16)
	@OpenApiField(desc = "银行联行号")
	private String bankCnapsNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getArrivedType() {
		return arrivedType;
	}
	
	public void setArrivedType(int arrivedType) {
		this.arrivedType = arrivedType;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getWithdrawType() {
		return withdrawType;
	}
	
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}
	
	public Long getBindId() {
		return bindId;
	}
	
	public void setBindId(Long bindId) {
		this.bindId = bindId;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getProvName() {
		return provName;
	}
	
	public void setProvName(String provName) {
		this.provName = provName;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getBankCnapsNo() {
		return bankCnapsNo;
	}
	
	public void setBankCnapsNo(String bankCnapsNo) {
		this.bankCnapsNo = bankCnapsNo;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月24日 下午5:16:23 创建
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * @author lingjiao
 */
@OpenApiMessage(service = "mpayPayment", type = ApiMessageType.Request)
public class MpayPaymentRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "用户ID",constraint="用户ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "收款方",constraint="收款方",demo="20150619010000072320")
	private String sellerId;
	
	@OpenApiField(desc = "签约编号",constraint="签约编号",demo="20150619010000072320")
	private String pactNo;
	
	@NotNull
	@OpenApiField(desc = "支付金额",constraint="支付金额",demo="66.66")
	private Money amount;
	
	@NotEmpty
	@Length(min = 6, max = 32)
	@OpenApiField(desc = "支付密码",constraint="支付密码",demo="123456")
	private String password;
	
	@NotBlank
	@OpenApiField(desc = "支付方式",constraint="支付方式",demo="BY_DEPOSIT")
	private String payWay;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getSellerId() {
		return sellerId;
	}
	
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPayWay() {
		return payWay;
	}
	
	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}
	
}

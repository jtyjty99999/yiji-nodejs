/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年12月1日 下午5:43:53 创建
 */
package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "mpayDeductDeposit", type = ApiMessageType.Response)
public class MpayDeductDepositResponse extends ApiResponse {
	
	@OpenApiField(desc = "话费充值流水号",constraint="话费充值流水号",demo="1422154541541")
	private String rechargeNo;
	
	@OpenApiField(desc = "用户会员ID",constraint="用户会员ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "机构编号",constraint="机构编号",demo="002300001")
	private String agencyCode;
	
	@OpenApiField(desc = "手机号",constraint="手机号",demo="13521501251")
	private String mobileNo;
	
	@OpenApiField(desc = "话费充值金额",constraint="话费充值金额",demo="66.66")
	private Money paymentAmount;
	
	@OpenApiField(desc = "实际金额", constraint = "当有优惠时此金额为实际扣用户的金额",demo="66.66")
	private Money amount;
	
	public String getRechargeNo() {
		return this.rechargeNo;
	}
	
	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAgencyCode() {
		return this.agencyCode;
	}
	
	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Money getPaymentAmount() {
		return this.paymentAmount;
	}
	
	public void setPaymentAmount(Money paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
}

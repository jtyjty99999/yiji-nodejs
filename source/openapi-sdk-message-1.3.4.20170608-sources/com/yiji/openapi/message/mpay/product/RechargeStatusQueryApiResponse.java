/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年10月31日 下午2:00:17 创建
 */
package com.yiji.openapi.message.mpay.product;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "rechargeStatusQuery", type = ApiMessageType.Response)
public class RechargeStatusQueryApiResponse extends ApiResponse {
	
	/**
	 * 缴费流水号
	 */
	@OpenApiField(desc = "充值流水号",demo = "123546897123564")
	private String rechargeNo;
	
	/**
	 * 缴费状态
	 */
	@OpenApiField(desc = "缴费状态",demo = "PAYMENT_SUCCESS")
	private String rechargeStatus;
	
	/**
	 * 用户会员ID
	 */
	@OpenApiField(desc = "用户会员ID",demo = "12445679801234567980")
	private String userId;
	
	/**
	 * 机构编号
	 */
	@OpenApiField(desc = "机构编号",demo = "1234567845")
	private String agencyCode;
	
	/**
	 * 手机号
	 */
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	/**
	 * 缴费金额
	 */
	@OpenApiField(desc = "充值金额",demo = "88.66")
	private Money paymentAmount;
	
	public String getRechargeNo() {
		return this.rechargeNo;
	}
	
	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}
	
	public String getRechargeStatus() {
		return this.rechargeStatus;
	}
	
	public void setRechargeStatus(String rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
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
	
}

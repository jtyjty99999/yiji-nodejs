/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月4日 下午12:08:48 创建
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

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
@OpenApiMessage(service = "rechargeInfoQuery", type = ApiMessageType.Request)
public class RechargeInfoQueryApiRequest extends ApiRequest {
	
	@OpenApiField(desc = "订单号", constraint = "话费充值时传入的订单号",demo = "12345678901324567890")
	@Length(max = 48, min = 5, message = "订单号长度不合法")
	private String outOrderNo;
	
	@OpenApiField(desc = "充值流水号", constraint = "话费充值时返回的流水号",demo = "12365479821456")
	@Length(max = 48, min = 5, message = "充值流水号长度不合法")
	private String rechargeNo;
	
	@OpenApiField(desc = "购买者会员号",demo = "12345678901234567890")
	@Length(max = 20, min = 20, message = "购买者会员号长度不正确")
	private String userId;
	
	@OpenApiField(desc = "运营商编码",demo = "CHINA MOBILE")
	@Length(max = 32, message = "运营商编码不能超过32位")
	private String agencyCode;
	
	@OpenApiField(desc = "充值手机号",demo = "10086100101")
	@Length(max = 32, message = "手机号不能超过32位")
	private String mobileNo;
	
	/**
	 * 充值金额上限
	 */
	@OpenApiField(desc = "充值金额上限",demo = "88.66")
	private Money paymentAmountUpperLimit;
	
	/**
	 * 充值金额下限
	 */
	@OpenApiField(desc = "充值金额下限",demo = "88.66")
	private Money paymentAmountLowerLimit;
	
	/**
	 * 页号
	 */
	@OpenApiField(desc = "页码",demo = "1")
	@NotNull
	private int currentPageNo = 1;
	
	/**
	 * 每页条数
	 */
	@OpenApiField(desc = "每页条数", constraint = "默认每页10条,最多支持100条",demo = "10")
	@Min(value = 10)
	@Max(value = 100)
	@NotNull
	private int pageSize = 10;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
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
	
	public Money getPaymentAmountUpperLimit() {
		return this.paymentAmountUpperLimit;
	}
	
	public void setPaymentAmountUpperLimit(Money paymentAmountUpperLimit) {
		this.paymentAmountUpperLimit = paymentAmountUpperLimit;
	}
	
	public Money getPaymentAmountLowerLimit() {
		return this.paymentAmountLowerLimit;
	}
	
	public void setPaymentAmountLowerLimit(Money paymentAmountLowerLimit) {
		this.paymentAmountLowerLimit = paymentAmountLowerLimit;
	}
	
	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RechargeInfoQueryApiRequest [outOrderNo=");
		builder.append(outOrderNo);
		builder.append(", rechargeNo=");
		builder.append(rechargeNo);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", agencyCode=");
		builder.append(agencyCode);
		builder.append(", mobileNo=");
		builder.append(mobileNo);
		builder.append(", paymentAmountUpperLimit=");
		builder.append(paymentAmountUpperLimit);
		builder.append(", paymentAmountLowerLimit=");
		builder.append(paymentAmountLowerLimit);
		builder.append("]");
		return builder.toString();
	}
	
}

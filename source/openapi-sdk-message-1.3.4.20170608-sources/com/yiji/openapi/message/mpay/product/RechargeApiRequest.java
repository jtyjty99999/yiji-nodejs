/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年10月31日 上午11:42:40 创建
 */
package com.yiji.openapi.message.mpay.product;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

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
@OpenApiMessage(service = "recharge", type = ApiMessageType.Request)
public class RechargeApiRequest extends ApiRequest {
	
	@OpenApiField(desc = "购买者会员ID",demo = "12345679801234567890")
	@NotEmpty(message = "购买者会员ID不能为空")
	@Length(max = 20, min = 20, message = "购买者会员ID长度不正确")
	private String userId;
	
	@OpenApiField(desc = "运营商编码",demo = "CHINA MOBILE")
	@NotEmpty(message = "运营商编码不能为空")
	@Length(max = 32, message = "运营商编码不能超过32位")
	private String agencyCode;
	
	@OpenApiField(desc = "手机号",demo = "10086100101")
	@NotEmpty(message = "手机号不能为空")
	@Length(max = 32, message = "手机号不能超过32位")
	private String mobileNo;
	
	@OpenApiField(desc = "充值金额",demo = "88.66")
	@NotNull(message = "充值金额不能为空")
	private Money paymentAmount;
	
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

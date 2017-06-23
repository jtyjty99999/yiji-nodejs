/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月29日 下午2:31:59 创建
 */
package com.yiji.openapi.message.product.ypayment;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年4月29日
 */
@OpenApiMessage(service = "queryBindingCardInfo", type = ApiMessageType.Request)
public class QueryBindingCardInfoRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "缴费类型", constraint = "缴费类型", demo = "WATER")
	private String paymentType;
	
	@NotBlank
	@OpenApiField(desc = "平台类型", constraint = "平台类型", demo = "YiPingHui")
	private String platformType;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20130310bj5815689758")
	private String userId;
	
	public String getPaymentType() {
		return this.paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public String getPlatformType() {
		return this.platformType;
	}
	
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

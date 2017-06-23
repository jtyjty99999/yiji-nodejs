/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月29日 下午5:01:53 创建
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
@OpenApiMessage(service = "paymentBinding", type = ApiMessageType.Request)
public class PaymentBindingRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "缴费类型", constraint = "缴费类型", demo = "WATER")
	private String paymentType;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "用户卡号", constraint = "用户卡号", demo = "20130310bj5815689758")
	private String userCode;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20130310bj5815689758")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "平台类型", constraint = "平台类型", demo = "YiPingHui")
	private String platformType;
	
	@NotBlank
	@OpenApiField(desc = "资源代码", constraint = "资源代码", demo = "SOKD32")
	private String resourceCode;
	
	@NotBlank
	@OpenApiField(desc = "资源名称", constraint = "资源名称", demo = "水电费")
	private String resourceName;
	
	public String getUserCode() {
		return this.userCode;
	}
	
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPlatformType() {
		return this.platformType;
	}
	
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	
	public String getResourceCode() {
		return this.resourceCode;
	}
	
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	
	public String getResourceName() {
		return this.resourceName;
	}
	
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	public String getPaymentType() {
		return this.paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
}

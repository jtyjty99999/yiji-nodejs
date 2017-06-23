/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 上午11:18:24 创建
 */
package com.yiji.openapi.message.common.mobilebind;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "mobileReBindWithoutCaptcha", type = ApiMessageType.Request)
public class MobileRebindWithoutCaptchaRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "手机将绑定的会员ID", constraint = "必填")
	private String userId;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "绑定手机号", constraint = "必填")
	private String mobileNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}

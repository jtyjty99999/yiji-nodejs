/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 上午11:13:38 创建
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
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "mobileBind", type = ApiMessageType.Request)
public class MobileBindRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 35)
	@OpenApiField(desc = "验证码ID",demo = "123456")
	private String captchaId;
	
	@NotBlank
	@Size(max = 6, min = 4)
	@OpenApiField(desc = "用户输入验证码",demo = "123456")
	private String userCaptcha;
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "手机将绑定的会员ID",demo = "13245679801234657890")
	private String userId;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "绑定手机号",demo = "10086100101")
	private String mobileNo;
	
	public String getCaptchaId() {
		return captchaId;
	}
	
	public void setCaptchaId(String captchaId) {
		this.captchaId = captchaId;
	}
	
	public String getUserCaptcha() {
		return userCaptcha;
	}
	
	public void setUserCaptcha(String userCaptcha) {
		this.userCaptcha = userCaptcha;
	}
	
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

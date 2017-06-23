/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 上午10:57:36 创建
 */
package com.yiji.openapi.message.common.smsCaptcha;

import org.hibernate.validator.constraints.Length;
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
@OpenApiMessage(service = "smsCaptchaVerify", type = ApiMessageType.Request)
public class SmsCaptchaVerifyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 35, min = 20)
	@OpenApiField(desc = "验证码ID", constraint = "必填")
	private String captchaId;
	
	@NotBlank
	@Length(max = 6, min = 4)
	@OpenApiField(desc = "用户输入验证码", constraint = "必填")
	private String userCaptcha;
	
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
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 上午10:23:36 创建
 */
package com.yiji.openapi.message.common.smsCaptcha;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 
 * 
 * @author lvchen@yiji.com
 * 
 */
@OpenApiMessage(service = "smsCaptcha", type = ApiMessageType.Response)
public class SmsCaptchaResponse extends ApiResponse {
	
	@Size(max = 35, min = 35)
	@OpenApiField(desc = "验证码ID", constraint = "唯一标识本次验证码，校验时需要传入，验证码有效期为为3分钟")
	private String captchaId;
	
	public String getCaptchaId() {
		return captchaId;
	}
	
	public void setCaptchaId(String captchaId) {
		this.captchaId = captchaId;
	}
	
}

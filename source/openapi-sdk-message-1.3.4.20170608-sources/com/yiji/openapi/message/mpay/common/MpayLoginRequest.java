/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月20日 上午10:50:38 创建
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "mpayLogin", type = ApiMessageType.Request)
public class MpayLoginRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;
	
	@Size(min = 6, max = 64)
	@NotBlank
	@OpenApiField(desc = "登陆密码", security = true,constraint="登陆密码",demo="123456")
	private String loginPassword;
	
	@Size(max = 8)
	@OpenApiField(desc = "图片验证码", constraint = "图片验证码",demo="1245")
	private String captcha;
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLoginPassword() {
		return this.loginPassword;
	}
	
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	public String getCaptcha() {
		return captcha;
	}
	
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}

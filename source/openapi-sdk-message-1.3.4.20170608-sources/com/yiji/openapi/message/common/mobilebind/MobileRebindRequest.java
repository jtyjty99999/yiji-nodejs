/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 下午3:22:25 创建
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
@OpenApiMessage(service = "mobileRebind", type = ApiMessageType.Request)
public class MobileRebindRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 35)
	@OpenApiField(desc = "旧手机验证码ID", constraint = "请先调用smsCaptcha服务，并传入userId，得到此验证码ID",demo = "123456")
	private String oldCaptchaId;
	
	@NotBlank
	@Size(max = 6, min = 4)
	@OpenApiField(desc = "旧手机用户输入验证码", constraint = "旧手机用户输入验证码",demo = "123456")
	private String oldUserCaptcha;
	
	@NotBlank
	@Size(max = 35)
	@OpenApiField(desc = "新手机验证码ID", constraint = "请先调用smsCaptcha服务，并传入新的mobile，得到此验证码ID",demo = "123456")
	private String newCaptchaId;
	
	@NotBlank
	@Size(max = 6, min = 4)
	@OpenApiField(desc = "新手机用户输入验证码",demo = "132456")
	private String newUserCaptcha;
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "手机将绑定的会员ID",demo ="12345678901234567890")
	private String userId;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "将绑定的新手机号",demo = "10086100101")
	private String newMobile;
	
	public String getOldCaptchaId() {
		return oldCaptchaId;
	}
	
	public void setOldCaptchaId(String oldCaptchaId) {
		this.oldCaptchaId = oldCaptchaId;
	}
	
	public String getOldUserCaptcha() {
		return oldUserCaptcha;
	}
	
	public void setOldUserCaptcha(String oldUserCaptcha) {
		this.oldUserCaptcha = oldUserCaptcha;
	}
	
	public String getNewCaptchaId() {
		return newCaptchaId;
	}
	
	public void setNewCaptchaId(String newCaptchaId) {
		this.newCaptchaId = newCaptchaId;
	}
	
	public String getNewUserCaptcha() {
		return newUserCaptcha;
	}
	
	public void setNewUserCaptcha(String newUserCaptcha) {
		this.newUserCaptcha = newUserCaptcha;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getNewMobile() {
		return newMobile;
	}
	
	public void setNewMobile(String newMobile) {
		this.newMobile = newMobile;
	}
	
}

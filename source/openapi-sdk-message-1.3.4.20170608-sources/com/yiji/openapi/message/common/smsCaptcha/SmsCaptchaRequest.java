/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 上午10:23:17 创建
 */
package com.yiji.openapi.message.common.smsCaptcha;

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
@OpenApiMessage(service = "smsCaptcha", type = ApiMessageType.Request)
public class SmsCaptchaRequest extends ApiRequest {
	@NotBlank
	@Size(max = 14)
	@OpenApiField(desc = "按那种方式发送验证码", constraint = "可选值：BINDING_MOBILE,MOBILE_NO")
	private String sendBy;
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "接受短信验证码的会员ID或者手机号", constraint = "当为BINDING_MOBILE时，传入UserId，当为MOBILE_NO时，传入手机号")
	private String sendNo;
	
	@NotBlank
	@Size(max = 200)
	@OpenApiField(desc = "短信内容模板，短信验证码用{captcha}标识出来", constraint = "如，尊敬的用户，你的本次操作的验证码为{captcha}。")
	private String smsContentTemplate;
	
	@Size(max = 40)
	@OpenApiField(desc = "短信后缀", constraint = "默认使用易极付后缀，开通了此业务的商户可以自定义后缀")
	private String suffix;
	
	public String getSendBy() {
		return sendBy;
	}
	
	public void setSendBy(String sendBy) {
		this.sendBy = sendBy;
	}
	
	public String getSendNo() {
		return sendNo;
	}
	
	public void setSendNo(String sendNo) {
		this.sendNo = sendNo;
	}
	
	public String getSmsContentTemplate() {
		return smsContentTemplate;
	}
	
	public void setSmsContentTemplate(String smsContentTemplate) {
		this.smsContentTemplate = smsContentTemplate;
	}
	
	public String getSuffix() {
		return suffix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
}

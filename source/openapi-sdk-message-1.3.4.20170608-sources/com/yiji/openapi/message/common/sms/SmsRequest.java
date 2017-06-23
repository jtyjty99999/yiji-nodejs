/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月6日 下午5:37:58 创建
 */
package com.yiji.openapi.message.common.sms;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

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
@OpenApiMessage(service = "sms", type = ApiMessageType.Request)
public class SmsRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 200, min = 1)
	@OpenApiField(desc = "短信内容")
	private String smsContent;
	
	@NotEmpty
	@OpenApiField(desc = "手机号码列表")
	private List<String> mobileNos;
	
	@Size(max = 40)
	@OpenApiField(desc = "短信后缀", constraint = "默认使用易极付后缀，开通了此业务的商户可以自定义后缀")
	private String suffix;
	
	public String getSmsContent() {
		return smsContent;
	}
	
	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}
	
	public List<String> getMobileNos() {
		return mobileNos;
	}
	
	public void setMobileNos(List<String> mobileNos) {
		this.mobileNos = mobileNos;
	}
	
	public String getSuffix() {
		return suffix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
}

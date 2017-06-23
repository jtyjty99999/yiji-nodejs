/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-24 14:37 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mobileConfirmBind", type = ApiMessageType.Request)
public class MobileConfirmBindRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "签约流水号",demo="20150619010000072320")
	private String pactNo;
	
	@NotBlank
	@OpenApiField(desc = "验证码",demo="3254")
	private String verifyCode;
	
	@OpenApiField(desc = "易手富密码",demo="15425w24")
	private String mPayPwd;
	
	@OpenApiField(desc = "用户ID",demo="20150619010000072320")
	private String userId;
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getVerifyCode() {
		return verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getmPayPwd() {
		return mPayPwd;
	}
	
	public void setmPayPwd(String mPayPwd) {
		this.mPayPwd = mPayPwd;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-05-25 11:14 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "mobileLogin", type = ApiMessageType.Request)
public class MobileLoginRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "登陆易极付的用户名",demo="admin")
	private String userName;
	
	@NotBlank
	@Length(max = 512)
	@OpenApiField(desc = "密码", constraint = "登陆易极付的密码",demo="asd!25")
	private String loginPassword;
	
	@OpenApiField(desc = "设备编号",constraint="设备编号",demo="55483")
	private String deviceId;
	
	@OpenApiField(desc = "Sim卡号",constraint="Sim卡号",demo="8986 00 79 09 04 4 9311287")
	private String sim;
	
	@NotBlank
	@OpenApiField(desc = "交易号",constraint="交易号",demo="20151016000452886142")
	private String tradeNo;
	
	public String getLoginPassword() {
		return loginPassword;
	}
	
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLoginpassWord() {
		return loginPassword;
	}
	
	public void setLoginpassWord(String loginpassWord) {
		this.loginPassword = loginpassWord;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getSim() {
		return sim;
	}
	
	public void setSim(String sim) {
		this.sim = sim;
	}
}

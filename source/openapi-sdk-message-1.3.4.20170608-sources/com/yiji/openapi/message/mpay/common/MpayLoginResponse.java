/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月20日 上午10:51:41 创建
 */
package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "mpayLogin", type = ApiMessageType.Response)
public class MpayLoginResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户ID",constraint="用户ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;
	
	@OpenApiField(desc = "真实姓名",constraint="真实姓名",demo="张三")
	private String realName;
	
	@OpenApiField(desc = "移动绑定手机号",constraint="移动绑定手机号",demo="13521452562")
	private String mobileNo;
	
	@OpenApiField(desc = "易手富密码状态", constraint = "-1开，0关",demo="0")
	private int mPayStatus;
	
	@OpenApiField(desc = "实名认证状态", constraint = "CertifyStatusEnum的枚举值",demo="UNAUTHERIZED")
	private String certifyStatus;
	
	@OpenApiField(desc = "图片验证码确认", constraint = "图片验证码确认",demo="false")
	private String needCaptcha;
	
	@OpenApiField(desc = "令牌", constraint = "易品汇登录用户令牌",demo="32151441")
	private String token;

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getmPayStatus() {
		return this.mPayStatus;
	}
	
	public void setmPayStatus(int mPayStatus) {
		this.mPayStatus = mPayStatus;
	}
	
	public String getCertifyStatus() {
		return this.certifyStatus;
	}
	
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	
	public String getNeedCaptcha() {
		return needCaptcha;
	}
	
	public void setNeedCaptcha(String needCaptcha) {
		this.needCaptcha = needCaptcha;
	}
}

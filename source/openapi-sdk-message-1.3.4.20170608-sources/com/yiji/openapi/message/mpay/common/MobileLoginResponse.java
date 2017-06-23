/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-05-25 11:16 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "mobileLogin", type = ApiMessageType.Response)
public class MobileLoginResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "登陆易极付的用户名",demo="admin")
	private String userName;
	
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "易极付用户ID",demo="20150619010000072320")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "真实姓名",constraint="真实姓名",demo="张三")
	private String realName;
	
	@NotBlank
	@OpenApiField(desc = "手机号码",constraint="手机号码",demo="手机号码")
	private String mobileNo;
	
	@NotNull
	@OpenApiField(desc = "易手富密码状态", constraint = "易手富密码状态-1开，0关",demo="-1")
	private int mPayStatus;
	
	@NotBlank
	@OpenApiField(desc = "认证状态", constraint = "“U”未认证，“A”已认证，“I”认证中，“R”被驳回，“O”过期",demo="U")
	private String certifyStatus;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getmPayStatus() {
		return mPayStatus;
	}
	
	public void setmPayStatus(int mPayStatus) {
		this.mPayStatus = mPayStatus;
	}
	
	public String getCertifyStatus() {
		return certifyStatus;
	}
	
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
}

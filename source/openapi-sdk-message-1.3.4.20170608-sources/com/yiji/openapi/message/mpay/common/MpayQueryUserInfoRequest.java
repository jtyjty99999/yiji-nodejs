/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2014-12-16 16:08 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayQueryUserInfo", type = ApiMessageType.Request)
public class MpayQueryUserInfoRequest extends ApiRequest {
	
	@Length(max = 32)
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;
	
	@OpenApiField(desc = "用户ID",constraint="用户ID",demo="20150619010000072320")
	@Length(max = 20)
	private String userId;
	
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
}

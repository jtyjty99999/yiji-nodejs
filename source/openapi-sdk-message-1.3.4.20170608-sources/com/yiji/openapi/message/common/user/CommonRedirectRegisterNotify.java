/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月22日 上午10:41:55 创建
 */
package com.yiji.openapi.message.common.user;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@Deprecated
@OpenApiMessage(service = "commonRedirectRegister", type = ApiMessageType.Notify)
public class CommonRedirectRegisterNotify extends ApiNotify{
	@OpenApiField(desc = "状态",constraint="状态[success:注册成功,fail:注册失败,cancel:取消注册]",demo="success")
	private String status;
	
	@OpenApiField(desc = "用户ID",constraint="用户ID",demo="20140804010001198785")
	private String userId;
	
	@Length(max=32)
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
}

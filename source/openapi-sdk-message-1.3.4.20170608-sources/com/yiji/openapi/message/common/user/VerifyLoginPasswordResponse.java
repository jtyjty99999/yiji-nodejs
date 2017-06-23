/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月25日 上午11:05:17 创建
 */
package com.yiji.openapi.message.common.user;

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
@OpenApiMessage(service = "verifyLoginPassword", type = ApiMessageType.Response)
public class VerifyLoginPasswordResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户ID", constraint = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "操作员ID", constraint = "操作员ID")
	private String operatorId;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
}

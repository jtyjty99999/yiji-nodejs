/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:19 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@Deprecated
@OpenApiMessage(service = "realNameCert.save", type = ApiMessageType.Response)
public class RealNameCertSaveResponse extends ApiResponse {
	@OpenApiField(desc = "用户ID", constraint = "易极付用户ID", demo = "20123781239123123")
	private String userId;
	
	@OpenApiField(desc = "认证号码", constraint = "认证号码", demo = "1234")
	private String authNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAuthNo() {
		return authNo;
	}
	
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
}

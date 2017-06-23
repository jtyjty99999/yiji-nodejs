/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-07 16:45 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "verifyPayPwd", type = ApiMessageType.Response)
public class VerifyPayPwdResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户帐号", constraint = "用户登陆易极付的ID")
	private String userId;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

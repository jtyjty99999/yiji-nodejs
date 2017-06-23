/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-15 15:00 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "realNameAuthorize", type = ApiMessageType.Response)
public class RealNameAuthorizeResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-08 14:58 创建
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
@Deprecated
@OpenApiMessage(service = "activeUser", type = ApiMessageType.Response)
public class ActiveUserResponse extends ApiResponse {
	
	@OpenApiField(desc = "gid")
	private String gid;

	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
}

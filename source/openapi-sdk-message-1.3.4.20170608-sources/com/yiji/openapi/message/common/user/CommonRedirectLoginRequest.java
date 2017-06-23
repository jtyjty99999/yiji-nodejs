/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-23 10:49 创建
 *
 */
package com.yiji.openapi.message.common.user;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonLoginRedirect", type = ApiMessageType.Request)
public class CommonRedirectLoginRequest extends ApiRequest {
	
	@OpenApiField(desc = "导航栏", constraint = "1：显示；0：不显示", demo = "1")
	private String title = "1";
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}

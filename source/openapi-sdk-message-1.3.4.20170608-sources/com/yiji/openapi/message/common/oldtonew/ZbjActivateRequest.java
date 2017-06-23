/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午10:22:23 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "zbjActivate", type = ApiMessageType.Request)
public class ZbjActivateRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "用户ID", demo = "20151106010009133123")
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

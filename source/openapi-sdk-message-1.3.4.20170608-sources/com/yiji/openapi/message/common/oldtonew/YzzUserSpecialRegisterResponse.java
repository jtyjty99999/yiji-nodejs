/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午7:51:08 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "yzzUserSpecialRegister", type = ApiMessageType.Response)
public class YzzUserSpecialRegisterResponse extends ApiResponse {

	@OpenApiField(desc = "用户ID", demo = "20150519020005491913")
	private String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午5:03:10 创建
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
@OpenApiMessage(service = "verifyFacade", type = ApiMessageType.Response)
public class VerifyFacadeResponse extends ApiResponse {

	@OpenApiField(desc = "认证状态", constraint = "{\"data\":[\"VS:认证成功\",\"VF:认证失败\"],\"name\":\"认证状态\"}", demo = "VS")
	private String verifyStatus;

	public String getVerifyStatus() {
		return this.verifyStatus;
	}

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月29日 下午5:06:39 创建
 */
package com.yiji.openapi.message.common.ppm;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月29日
 */
@OpenApiMessage(service = "ppmNewRuleRegisterUser", type = ApiMessageType.Response)
public class PpmNewRuleRegisterUserResponse extends ApiResponse {

	@OpenApiField(desc = "用户ID", constraint = "用户ID(注册成功返回)", demo = "20140804010001199201")
	private String userId;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

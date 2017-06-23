/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午5:55:10 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

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
@OpenApiMessage(service = "checkUserNameExist", type = ApiMessageType.Response)
public class CheckUserNameExistResponse extends ApiResponse {

	@NotBlank
	@OpenApiField(desc = "用户是否存在", constraint = "{\"data\":[\"true:存在\",\"false:不存在\"],\"name\":\"用户是否存在\"}",
			demo = "true")
	private String isExist;

	public String getIsExist() {
		return this.isExist;
	}

	public void setIsExist(String isExist) {
		this.isExist = isExist;
	}

}

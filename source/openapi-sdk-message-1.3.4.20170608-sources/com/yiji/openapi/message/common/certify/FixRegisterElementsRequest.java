/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月10日 上午11:26:50 创建
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *注册要素补全
 * @author zhike@yiji.com
 * @data   2015年9月10日
 */
@OpenApiMessage(service = "fixRegisterElements", type = ApiMessageType.Request)
public class FixRegisterElementsRequest extends ApiRequest{
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "用户名Id",constraint="易极付的用户名称",demo="admin")
	private String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-15 14:58 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "realNameAuthorize", type = ApiMessageType.Request)
public class RealNameAuthorizeRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户ID",demo = "12345678901234567980")
	private String userId;
	
	@OpenApiField(desc = "外部用户ID",demo = "1232456465")
	private String externalId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
}

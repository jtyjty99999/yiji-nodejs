/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月27日 下午4:29:11 创建
 */
package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "queryCompatVersion", type = ApiMessageType.Response)
public class QueryCompatVersionResponse extends ApiResponse {
	
	@OpenApiField(desc = "系统类型")
	private String systemType;
	
	public String getSystemType() {
		return this.systemType;
	}
	
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	
}

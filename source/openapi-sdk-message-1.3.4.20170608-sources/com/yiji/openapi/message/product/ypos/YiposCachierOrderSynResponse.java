/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年12月8日 上午11:23:57 创建
 */
package com.yiji.openapi.message.product.ypos;

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
@OpenApiMessage(service = "yiposCachierOrderSyn", type = ApiMessageType.Response)
public class YiposCachierOrderSynResponse extends ApiResponse {
	
	@OpenApiField(desc = "状态")
	private boolean status;
	
	@OpenApiField(desc = "消息")
	private String message;
	
	public boolean isStatus() {
		return this.status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}

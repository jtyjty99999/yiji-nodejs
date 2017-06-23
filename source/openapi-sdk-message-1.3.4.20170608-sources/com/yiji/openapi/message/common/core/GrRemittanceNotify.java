/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-05 10:44 创建
 *
 */
package com.yiji.openapi.message.common.core;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "grRemittance", type = ApiMessageType.Notify)
public class GrRemittanceNotify extends ApiNotify {
	
	@OpenApiField(desc = "订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "消息")
	private String message;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}

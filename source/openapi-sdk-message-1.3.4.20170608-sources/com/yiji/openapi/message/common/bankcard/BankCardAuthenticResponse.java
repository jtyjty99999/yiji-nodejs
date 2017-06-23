/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年9月19日 上午11:16:00 创建
 */
package com.yiji.openapi.message.common.bankcard;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "bankCardAuthentic", type = ApiMessageType.Response)
public class BankCardAuthenticResponse extends ApiResponse {
	
	@OpenApiField(desc = "签约流水号",demo = "132465")
	private String bindId;
	
	@OpenApiField(desc = "签约状态",demo = "INIT")
	private String status;
	
	@OpenApiField(desc = "完成时间",demo = "1972-12-12 00:45:54")
	private Date finishTime;
	
	public String getBindId() {
		return this.bindId;
	}
	
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getFinishTime() {
		return this.finishTime;
	}
	
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	
}

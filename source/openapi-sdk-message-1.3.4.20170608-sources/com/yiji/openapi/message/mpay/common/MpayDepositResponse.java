/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月27日 上午11:13:16 创建
 */
package com.yiji.openapi.message.mpay.common;

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
@OpenApiMessage(service = "mpayDeposit", type = ApiMessageType.Response)
public class MpayDepositResponse extends ApiResponse {
	
	@OpenApiField(desc = "充值流水",constraint="充值流水",demo="20151016026035859666")
	private String depositId;
	
	public String getDepositId() {
		return this.depositId;
	}
	
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	
}

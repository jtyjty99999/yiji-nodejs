/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月3日 下午2:14:29 创建
 */
package com.yiji.openapi.message.common.deposit;

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
@OpenApiMessage(service = "rechargeBackApply", type = ApiMessageType.Response)
public class RechargeBackApplyResponse extends ApiResponse {
	
	@OpenApiField(desc = "充退流水号",demo = "2356417481234")
	private String depositBackId;
	
	public String getDepositBackId() {
		return this.depositBackId;
	}
	
	public void setDepositBackId(String depositBackId) {
		this.depositBackId = depositBackId;
	}
	
}

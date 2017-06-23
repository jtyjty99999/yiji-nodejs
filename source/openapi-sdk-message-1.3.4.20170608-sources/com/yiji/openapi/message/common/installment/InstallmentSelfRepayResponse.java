/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-26 10:11 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentSelfRepay", type = ApiMessageType.Response)
public class InstallmentSelfRepayResponse extends ApiResponse {
	
	@OpenApiField(desc = "超限类型", constraint = "如金额超限、次数超限等")
	private String overrunType;
	
	public String getOverrunType() {
		return overrunType;
	}
	
	public void setOverrunType(String overrunType) {
		this.overrunType = overrunType;
	}
}

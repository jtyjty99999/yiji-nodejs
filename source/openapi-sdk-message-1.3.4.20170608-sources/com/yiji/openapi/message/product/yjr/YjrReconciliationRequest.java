/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-21 16:16 创建
 *
 */
package com.yiji.openapi.message.product.yjr;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yjrReconciliation", type = ApiMessageType.Request)
public class YjrReconciliationRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "日期", constraint = "查询账单的日期")
	private String accountDate;
	
	public String getAccountDate() {
		return accountDate;
	}
	
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
}

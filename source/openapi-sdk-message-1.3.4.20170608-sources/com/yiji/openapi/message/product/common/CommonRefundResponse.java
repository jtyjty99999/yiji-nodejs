/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月22日 下午3:28:48 创建
 */
package com.yiji.openapi.message.product.common;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年2月22日
 */
@OpenApiMessage(service = "commonRefund", type = ApiMessageType.Response)
public class CommonRefundResponse extends ApiResponse {
	
	@OpenApiField(desc = "备注", constraint = "备注", demo = "退款成功")
	private String memo;
	
	@NotNull
	@OpenApiField(desc = "结果状态", constraint = "结果状态", demo = "SUCCESS")
	private String status;
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}

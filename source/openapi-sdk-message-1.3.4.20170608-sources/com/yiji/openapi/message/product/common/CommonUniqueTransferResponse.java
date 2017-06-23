/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午3:08:32 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "commonUniqueTransfer", type = ApiMessageType.Response)
public class CommonUniqueTransferResponse extends ApiResponse {
	@NotBlank
	@Length(min = 20, max = 40)
	@OpenApiField(desc = "流水号", constraint = "汇付或转账流水号", demo = "254154515154151")
	private String bizNo;
	
	@NotBlank
	@OpenApiField(desc = "结果状态", constraint = "SUCCESS(成功)<br>FAIL(失败)<br>PROCESSING(处理中)", demo = "SUCCESS")
	private String status;
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

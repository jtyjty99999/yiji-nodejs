/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月12日 下午5:48:51 创建
 */
package com.yiji.openapi.message.common.deposit;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upayRefund", type = ApiMessageType.Request)
public class UpayRefundRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "原始交易流水号", constraint = "原始交易流水号")
	private String transNo;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "用户ID", constraint = "用户ID")
	private String userId;
	
	public String getTransNo() {
		return this.transNo;
	}
	
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

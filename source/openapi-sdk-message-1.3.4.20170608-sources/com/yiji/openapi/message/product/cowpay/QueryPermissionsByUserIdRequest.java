/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月20日 上午9:56:04 创建
 */
package com.yiji.openapi.message.product.cowpay;

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
@OpenApiMessage(service = "queryPermissionsByUserId", type = ApiMessageType.Request)
public class QueryPermissionsByUserIdRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "易极付用户id")
	private String userId;
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "操作员id")
	private String operatorId;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
}

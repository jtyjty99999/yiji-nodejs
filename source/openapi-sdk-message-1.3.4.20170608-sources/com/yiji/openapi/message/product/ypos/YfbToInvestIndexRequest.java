/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-05-29 11:30 创建
 *
 */
package com.yiji.openapi.message.product.ypos;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yfbToInvestIndex", type = ApiMessageType.Request)
public class YfbToInvestIndexRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户登录易极付ID")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "操作员ID", constraint = "登录易房宝系统的ID")
	private String operatorId;
	
	@NotBlank
	@OpenApiField(desc = "平台标识", constraint = "平台名称的拼音")
	private String platformType;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOperatorId() {
		return operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getPlatformType() {
		return platformType;
	}
	
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
}

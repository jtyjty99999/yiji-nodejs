/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月17日 下午1:50:56 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年11月17日
 */
@OpenApiMessage(service = "userBaseinfoQuery2", type = ApiMessageType.Request)
public class UserBaseinfoQuery2Request extends ApiRequest{
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID",constraint = "用户ID",demo = "12346579801234567980")
	private String userId;
	
	@Length(max = 32)
	@OpenApiField(desc = "外部用户ID",constraint = "外部用户ID",demo = "12346579801234567980")
	private String outUserId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}
}

    
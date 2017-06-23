/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-01 17:25 创建
 *
 */
package com.yiji.openapi.message.common.ppm;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-01
 */
@OpenApiMessage(service = "redirectOpenPayAccount", type = ApiMessageType.Notify)
public class OpenPayAccountNotify extends ApiNotify {

	@NotBlank
	@OpenApiField(desc = "用户id",demo = "20150619010000072320")
	private String userId;

	@NotBlank
	@OpenApiField(desc = "异步通知消息" ,demo = "失败原因..", constraint = "若开通不成功，会把失败原因返回")
	private String message;

	@NotBlank
	@OpenApiField(desc = "开通状态" ,demo = "success" , constraint = "{\"data\":[\"success:成功\",\"fail:失败\"]}" )
	private String status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

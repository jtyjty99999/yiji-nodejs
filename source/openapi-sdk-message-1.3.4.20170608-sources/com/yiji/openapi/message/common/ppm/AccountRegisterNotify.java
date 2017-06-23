/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-14 16:45 创建
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
 * @since 2016-04-14
 */
@OpenApiMessage(service = "redirectNewRuleRegisterUser", type = ApiMessageType.Notify)
public class AccountRegisterNotify extends ApiNotify {

	@NotBlank
	@OpenApiField(desc = "状态" ,demo = "success" , constraint = "{\"data\":[\"success:成功\",\"fail:失败\",\"cancel:取消\"]}" )
	private String status;

	@NotBlank
	@OpenApiField(desc = "用户id",demo = "20150619010000072320")
	private String userId;

	@OpenApiField(desc = "用户名",demo = "username")
	private String userName;

	@NotBlank
	@OpenApiField(desc = "异步通知消息" ,demo = "失败原因..", constraint = "若开通不成功，会把失败原因返回")
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

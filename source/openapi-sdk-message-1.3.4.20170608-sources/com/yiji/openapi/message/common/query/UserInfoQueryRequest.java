/**
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */
package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 通用注册请求
 * @author mayansen
 * @date 2014年8月5日
 */
@OpenApiMessage(service = "userInfoQuery", type = ApiMessageType.Request)
public class UserInfoQueryRequest extends ApiRequest {
	
	@Length(max = 20)
	@OpenApiField(desc = "易极付用户id",demo = "12345678901324567890")
	private String userId;
	
	@Length(max = 128)
	@OpenApiField(desc = "易极付用户名",demo = "易极付")
	private String userName;
	
	public UserInfoQueryRequest() {
		super();
	}
	
	public UserInfoQueryRequest(String userId) {
		super();
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

}

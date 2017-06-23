package com.yiji.openapi.message.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * 用户激活 跳转报文
 * 
 * 该报文非直接返回给客户端，而是跳转给下层应用的报文定义
 * 
 * @author zhangpu
 * 
 */
@OpenApiMessage(service = "userActive", type = ApiMessageType.Notify)
public class UserActiveNotify extends ApiNotify {
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "易极付用户ID")
	private String userId;
	
	@OpenApiField(desc = "用户状态")
	private String userStatus;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserStatus() {
		return userStatus;
	}
	
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	
}

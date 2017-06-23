/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月29日 下午5:06:20 创建
 */
package com.yiji.openapi.message.common.ppm;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月29日
 */
@OpenApiMessage(service = "ppmNewRuleRegisterUser", type = ApiMessageType.Request)
public class PpmNewRuleRegisterUserRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "用户名", constraint = "用户名", demo = "admin")
	private String userName;
	
	@NotNull
	@OpenApiField(desc = "注册用户类型", constraint = "注册用户类型", demo = "PERSONAL")
	private String registerUserType;

	@NotBlank
	@Length(min = 11, max = 11)
	@OpenApiField(desc = "手机号", constraint = "手机号", demo = "admin")
	private String mobile;
	
	@OpenApiField(desc = "邮箱", constraint = "邮箱", demo = "admin@yiji.com")
	private String email;

	@OpenApiField(desc = "行为" , demo = "REGISTERP" , constraint = "如有特殊需求请与易极付单独商定")
	private String behavior;
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRegisterUserType() {
		return this.registerUserType;
	}
	
	public void setRegisterUserType(String registerUserType) {
		this.registerUserType = registerUserType;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
}

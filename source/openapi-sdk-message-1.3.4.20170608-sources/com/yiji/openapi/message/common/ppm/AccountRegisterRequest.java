/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-03-30 14:10 创建
 *
 */
package com.yiji.openapi.message.common.ppm;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-03-30
 */
@OpenApiMessage(service = "redirectNewRuleRegisterUser", type = ApiMessageType.Request)
public class AccountRegisterRequest extends ApiRequest {

    @NotBlank
	@OpenApiField(desc = "用户姓名" , demo = "易极付")
	private String userName;

	@OpenApiField(desc = "平台类型",demo="pc")
	private String termnalType;

	@NotNull
	@OpenApiField(desc = "用户注册类型",demo="个人用户注册")
	private String registerUserTypeEnum;

	@OpenApiField(desc = "是否设置支付密码" , demo = "1" , constraint = "移动端：默认是1，1是、0否")
	private String setPayPwd="0";

	@OpenApiField(desc = "注册按钮的名字" , demo = "注册易极付会员" , constraint = "移动端")
	private String registerBtnText="注册易极付会员";

	@OpenApiField(desc = "是否需要标题" , demo = "1" , constraint = "移动端：默认是1，1是、0否")
	private String title="1";

	@OpenApiField(desc = "行为" , demo = "REGISTERP" , constraint = "如有特殊需求请与易极付单独商定")
	private String behavior;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTermnalType() {
		return termnalType;
	}

	public void setTermnalType(String termnalType) {
		this.termnalType = termnalType;
	}

	public String getRegisterUserTypeEnum() {
		return registerUserTypeEnum;
	}

	public void setRegisterUserTypeEnum(String registerUserTypeEnum) {
		this.registerUserTypeEnum = registerUserTypeEnum;
	}
	public String getSetPayPwd() {
		return setPayPwd;
	}

	public void setSetPayPwd(String setPayPwd) {
		this.setPayPwd = setPayPwd;
	}

	public String getRegisterBtnText() {
		return registerBtnText;
	}

	public void setRegisterBtnText(String registerBtnText) {
		this.registerBtnText = registerBtnText;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
}

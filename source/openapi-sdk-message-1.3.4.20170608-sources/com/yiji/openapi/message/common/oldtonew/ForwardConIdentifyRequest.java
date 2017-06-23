/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:52:26 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "forwardConIdentify", type = ApiMessageType.Request)
public class ForwardConIdentifyRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "用户名", demo = "123@yiji.com")
	private String userName;

	@NotBlank
	@OpenApiField(desc = "用户类型", demo = "P")
	private String userType;

	@NotBlank
	@OpenApiField(desc = "真实姓名", demo = "张三")
	private String realName;

	@NotBlank
	@OpenApiField(desc = "证件号", demo = "500240198208164079")
	private String certNo;

	@NotBlank
	@OpenApiField(desc = "电子邮箱", demo = "abc@xxx.com")
	private String email;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

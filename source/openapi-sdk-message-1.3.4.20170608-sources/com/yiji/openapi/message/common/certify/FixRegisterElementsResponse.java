/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月10日 上午11:27:34 创建
 */
package com.yiji.openapi.message.common.certify;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年9月10日
 */
@OpenApiMessage(service = "fixRegisterElements", type = ApiMessageType.Response)
public class FixRegisterElementsResponse extends ApiResponse {
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "用户名", constraint = "易极付的用户名称", demo = "admin")
	private String userName;
	
	@OpenApiField(desc = "gid", constraint = "统一流水id", demo = "21115156165161")
	private String gid;
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}

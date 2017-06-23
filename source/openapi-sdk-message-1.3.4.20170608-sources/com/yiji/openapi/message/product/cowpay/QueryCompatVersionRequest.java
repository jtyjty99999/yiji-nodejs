/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月27日 下午3:54:27 创建
 */
package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "queryCompatVersion", type = ApiMessageType.Request)
public class QueryCompatVersionRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "系统类型")
	private String systemType;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "系统版本")
	private String sysVersion;
	
	public String getSystemType() {
		return this.systemType;
	}
	
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}
	
	public String getSysVersion() {
		return this.sysVersion;
	}
	
	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}
	
}

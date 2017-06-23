/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-22 11:20 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "realNameAuthorize", type = ApiMessageType.Notify)
public class RealNameAuthorizeNotify extends ApiNotify {
	
	@OpenApiField(desc = "用户名", constraint = "用户名",demo = "12345679801324567890")
	private String userId;
	
	@OpenApiField(desc = "认证状态", constraint = "认证状态",demo = "ATP")
	private String certifyStatus;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCertifyStatus() {
		return certifyStatus;
	}
	
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
}
/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月17日 上午10:29:08 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年11月17日
 */
@OpenApiMessage(service = "mpayResetPayPasswordRedirect", type = ApiMessageType.Notify)
public class MpayResetPayPasswordRedirectNotify extends ApiNotify{
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "P144768869882981")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "状态", constraint = "success:成功，fail:失败", demo = "success")
	private String status;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

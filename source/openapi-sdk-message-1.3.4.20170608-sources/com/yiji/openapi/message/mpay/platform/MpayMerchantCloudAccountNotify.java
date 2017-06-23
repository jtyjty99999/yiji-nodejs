/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月4日 下午6:16:38 创建
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年2月4日
 */
@OpenApiMessage(service = "mpayMerchantCloudAccount", type = ApiMessageType.Notify)
public class MpayMerchantCloudAccountNotify extends ApiNotify {
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20150702020006251529")
	private String userId;
	
	@OpenApiField(desc = "开户状态", constraint = "{\"data\":[\"success:开户成功\",\"false:开户失败\"],\"name\":\"开户状态\"}",
			demo = "success")
	private String status;
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}

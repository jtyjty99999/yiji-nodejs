/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-09 10:43 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.message.common.certify.info.StatusEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "personalRealNameRankUp", type = ApiMessageType.Notify)
public class PersonalRealNameRankUpNotify extends ApiNotify {
	
	@OpenApiField(desc = "用户ID", constraint = "易极付用户ID", demo = "12345679801234657890")
	private String userId;
	
	@OpenApiField(desc = "认证状态", constraint = "认证状态", demo = "ATP")
	private StatusEnum certifyStatus;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public StatusEnum getCertifyStatus() {
		return certifyStatus;
	}
	
	public void setCertifyStatus(StatusEnum certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
}

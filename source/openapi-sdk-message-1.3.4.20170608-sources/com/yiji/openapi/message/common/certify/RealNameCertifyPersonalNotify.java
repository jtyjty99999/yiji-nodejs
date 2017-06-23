/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月8日 上午10:34:28创建
 */
package com.yiji.openapi.message.common.certify;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.common.certify.info.StatusEnum;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
@Deprecated
@OpenApiMessage(service = "realNameCertifyPersonal", type = ApiMessageType.Notify)
public class RealNameCertifyPersonalNotify extends ApiNotify {
	
	@NotNull
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户ID", constraint = "易极付用户ID",demo = "12346579801234657890")
	private String userId;
	
	@OpenApiField(desc = "认证状态", constraint = "认证状态",demo = "AUT")
	private StatusEnum certifyStatus;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public StatusEnum getCertifyStatus() {
		return this.certifyStatus;
	}
	
	public void setCertifyStatus(StatusEnum certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	
}

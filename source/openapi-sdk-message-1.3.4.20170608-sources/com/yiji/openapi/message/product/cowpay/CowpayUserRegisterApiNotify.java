/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-14 14:28 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "cowpayUserRegister", type = ApiMessageType.Notify)
public class CowpayUserRegisterApiNotify extends ApiNotify {
	
	@OpenApiField(desc = "外部用户ID")
	private String externalUserId;
	
	@OpenApiField(desc = "外部流水号")
	private String userId;
	
	@OpenApiField(desc = "用户名")
	private String userName;
	
	public String getExternalUserId() {
		return externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}

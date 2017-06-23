/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-04 15:07 创建
 *
 */
package com.yiji.openapi.message.upay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "upayAsynchronousSign", type = ApiMessageType.Response)
public class UpayAsynchronousSignResponse extends ApiResponse {
	
	/**
	 * 手机号码
	 */
	@OpenApiField(desc = "手机号码", constraint = "手机号码")
	private String mobileNo;
	
	/**
	 * 用户ID
	 */
	@OpenApiField(desc = "用户ID", constraint = "用户登陆易极付的ID")
	private String userId;
	
	/**
	 * 签约编号
	 */
	@OpenApiField(desc = "签约编号", constraint = "签约编号")
	private String subscribeCode;

	/** 结果状态 */
	@OpenApiField(desc = "结果状态",constraint = "结果状态")
	protected String status;
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getSubscribeCode() {
		return subscribeCode;
	}
	
	public void setSubscribeCode(String subscribeCode) {
		this.subscribeCode = subscribeCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-28 17:00 创建
 *
 */
package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "mpayGotoWithdraw", type = ApiMessageType.Request)
public class MpayGotoWithdrawRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID",demo = "12345679801324567890")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "业务订单号", constraint = "业务订单号",demo = "12564789365526")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "是否显示导航条", constraint = "1:显示，0:不显示，默认显示",demo = "1")
	private String title = "1";
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-04 15:14 创建
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
@OpenApiMessage(service = "upayAsynchronousSignStateQuery", type = ApiMessageType.Response)
public class UpayAsynchronousSignStateQueryResponse extends ApiResponse {
	
	/**
	 * 签约状态（0，未签约；1，签约成功；2，签约处理中）
	 */
	@OpenApiField(desc = "签约状态", constraint = "0，未签约；1，签约成功；2，签约处理中")
	private int subscribeStatus;
	
	/**
	 * UPAY签约编号
	 */
	@OpenApiField(desc = "UPAY签约编号", constraint = "UPAY签约编号")
	private String subscribeCode;

	public int getSubscribeStatus() {
		return subscribeStatus;
	}
	
	public void setSubscribeStatus(int subscribeStatus) {
		this.subscribeStatus = subscribeStatus;
	}
	
	public String getSubscribeCode() {
		return subscribeCode;
	}
	
	public void setSubscribeCode(String subscribeCode) {
		this.subscribeCode = subscribeCode;
	}

}

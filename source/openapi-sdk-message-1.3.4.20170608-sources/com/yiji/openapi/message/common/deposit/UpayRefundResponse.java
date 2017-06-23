/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月12日 下午5:48:51 创建
 */
package com.yiji.openapi.message.common.deposit;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upayRefund", type = ApiMessageType.Response)
public class UpayRefundResponse extends ApiResponse {
	
	@OpenApiField(desc = "退款交易流水号")
	private String takeBackNo;
	
	public String getTakeBackNo() {
		return this.takeBackNo;
	}
	
	public void setTakeBackNo(String takeBackNo) {
		this.takeBackNo = takeBackNo;
	}
	
}

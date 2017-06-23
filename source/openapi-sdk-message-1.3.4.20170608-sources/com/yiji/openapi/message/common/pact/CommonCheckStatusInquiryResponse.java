/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * Administrator 下午5:13:13 创建
 */
package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "commonCheckStatusInquiry", type = ApiMessageType.Response)
public class CommonCheckStatusInquiryResponse extends ApiResponse {
	
	/** 签约流水号 */
	@OpenApiField(desc = "签约流水号", constraint = "")
	private String pactNo;
	
	@OpenApiField(desc = "签约状态")
	private String pactStatus;

	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getPactStatus() {
		return pactStatus;
	}

	public void setPactStatus(String pactStatus) {
		this.pactStatus = pactStatus;
	}
}

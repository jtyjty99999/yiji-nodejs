/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * Administrator 下午5:13:04 创建
 */
package com.yiji.openapi.message.common.pact;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "commonCheckStatusInquiry", type = ApiMessageType.Request)
public class CommonCheckStatusInquiryRequest extends ApiRequest {
	/** 签约流水号 */
	@OpenApiField(desc = "签约流水号")
	@NotBlank(message = "签约号不能为空")
    private String pactNo;

	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
}

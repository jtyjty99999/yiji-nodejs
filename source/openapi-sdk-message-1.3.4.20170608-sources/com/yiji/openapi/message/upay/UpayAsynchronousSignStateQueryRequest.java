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

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "upayAsynchronousSignStateQuery", type = ApiMessageType.Request)
public class UpayAsynchronousSignStateQueryRequest extends ApiRequest {
	
	/**
	 * 签约编号
	 */
	@NotBlank
	@OpenApiField(desc = "签约编号", constraint = "签约编号")
	private String subscribeCode;
	
	public String getSubscribeCode() {
		return subscribeCode;
	}
	
	public void setSubscribeCode(String subscribeCode) {
		this.subscribeCode = subscribeCode;
	}
}

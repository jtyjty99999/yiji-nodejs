/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月11日 下午3:39:42 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月11日
 */
@OpenApiMessage(service = "commonModifyLoginPassword", type = ApiMessageType.Request)
public class CommonModifyLoginPasswordRequest extends ApiRequest{
	
	@NotBlank
	@OpenApiField(desc="登陆名",constraint="登陆名",demo="admin")
	private String loginId;
	
	@OpenApiField(desc="渠道ID",constraint="渠道ID",demo="easttrad")
	private String channelId;

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
}

    
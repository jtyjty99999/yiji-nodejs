/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午10:22:43 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "zbjActivate", type = ApiMessageType.Response)
public class ZbjActivateResponse extends ApiResponse {

	@OpenApiField(desc = "密钥", demo = "openapitocommomsystem")
	private String key;

	@OpenApiField(desc = "系统来源", demo = "openapi")
	private String systemFrom;

	@OpenApiField(desc = "用户ID", demo = "20151106010009133123")
	private String userId;

	@OpenApiField(desc = "请求时间", demo = "1454406329112")
	private String requestTime;

	@OpenApiField(desc = "通知地址", demo = "http://www.oschina.net")
	private String notifyUrl;

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSystemFrom() {
		return this.systemFrom;
	}

	public void setSystemFrom(String systemFrom) {
		this.systemFrom = systemFrom;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

}

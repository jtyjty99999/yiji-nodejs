/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月11日 下午3:34:20 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月11日
 */
@OpenApiMessage(service = "applyDepositV2", type = ApiMessageType.Response)
public class ApplyDepositV2Response extends ApiResponse {
	
	@OpenApiField(desc = "跳转地址", constraint = "跳转地址", demo = "https://www.baidu.com")
	private String forwardUrl;
	
	@OpenApiField(desc = "扩展跳转地址", constraint = "扩展跳转地址", demo = "https://www.baidu.com")
	private String extUrl;
	
	@OpenApiField(desc = "扩展信息", constraint = "扩展信息", demo = "成功")
	private String info;
	
	public String getForwardUrl() {
		return this.forwardUrl;
	}
	
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}
	
	public String getExtUrl() {
		return this.extUrl;
	}
	
	public void setExtUrl(String extUrl) {
		this.extUrl = extUrl;
	}
	
	public String getInfo() {
		return this.info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
}

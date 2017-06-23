/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月11日 下午3:39:27 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月11日
 */
@OpenApiMessage(service = "commonModifyPaymentPassword", type = ApiMessageType.Response)
public class CommonModifyPaymentPasswordResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "gid", constraint = "gid", demo = "H000cxa7002652015121116005606800000")
	private String gid;
	
	@NotBlank
	@OpenApiField(desc = "登陆名", constraint = "登陆名", demo = "admin")
	private String loginId;
	
	@OpenApiField(desc = "渠道ID", constraint = "渠道ID", demo = "easttrad")
	private String channelId;
	
	public String getChannelId() {
		return this.channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getLoginId() {
		return this.loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

}

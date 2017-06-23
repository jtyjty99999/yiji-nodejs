/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月30日 下午2:17:13 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月30日
 */
@Deprecated
@OpenApiMessage(service = "mpayCertifyRedirect", type = ApiMessageType.Response)
public class MpayCertifyRedirectResponse extends ApiResponse {
	@NotBlank
	@OpenApiField(desc = "gid", constraint = "gid", demo = "H0000000002612015123014154983300000")
	private String gid;
	
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "是否显示标题", constraint = "是否显示标题,默认为1[1:显示,0:不显示]", demo = "1")
	private String title = "1";
	
	@NotBlank
	@OpenApiField(desc = "实名等级", constraint = "实名等级[0:商家选择自动判断实名等级并提供页面给用户,1:商家选择只要弱实名认证,3:商家选择只要强实名认证]", demo = "1")
	private String realLevel;

	@OpenApiField(desc = "异步通知地址", constraint = "异步通知地址", demo = "123123123")
	private String notifyUrl;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealLevel() {
		return this.realLevel;
	}
	
	public void setRealLevel(String realLevel) {
		this.realLevel = realLevel;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月30日 下午2:17:25 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月30日
 */
@Deprecated
@OpenApiMessage(service = "mpayCertifyRedirect", type = ApiMessageType.Request)
public class MpayCertifyRedirectRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "是否显示标题", constraint = "是否显示标题,默认为1[1:显示,0:不显示]", demo = "1")
	private String isShowTitle = "1";
	
	@OpenApiField(desc = "实名等级", constraint = "实名等级,默认为0[0:商家选择自动判断实名等级并提供页面给用户,1:商家选择只要弱实名认证,3:商家选择只要强实名认证]",
			demo = "0")
	private String realLevel = "0";
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getIsShowTitle() {
		return this.isShowTitle;
	}
	
	public void setIsShowTitle(String isShowTitle) {
		this.isShowTitle = isShowTitle;
	}
	
	public String getRealLevel() {
		return this.realLevel;
	}
	
	public void setRealLevel(String realLevel) {
		this.realLevel = realLevel;
	}
}

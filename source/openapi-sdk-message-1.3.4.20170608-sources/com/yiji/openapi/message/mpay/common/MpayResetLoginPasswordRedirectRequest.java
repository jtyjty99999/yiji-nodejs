/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月17日 上午9:58:36 创建
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
 * @data 2015年11月17日
 */
@OpenApiMessage(service = "mpayResetLoginPasswordRedirect", type = ApiMessageType.Request)
public class MpayResetLoginPasswordRedirectRequest extends ApiRequest {
	
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "P144768869882981")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "P144768869882981")
	private String outOrderNo;
	
	@OpenApiField(desc = "是否显示标题", constraint = "默认为1<br>1:显示<br>0：不显示", demo = "1")
	private String isShowTitle = "1";
	
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getIsShowTitle() {
		return this.isShowTitle;
	}
	
	public void setIsShowTitle(String isShowTitle) {
		this.isShowTitle = isShowTitle;
	}
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月9日 上午10:31:02 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "mpayGotoRecharge", type = ApiMessageType.Request)
public class MpayGotoRechargeRequest extends ApiRequest{
	@NotBlank
	@Length(min = 20,max = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID", demo = "2\0151026010000081900")
	private String userId;
	
	@NotBlank
	@Length(min = 20,max = 40)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "1511091124392303310149782")
	private String outOrderNo;
	
	@Length(max = 10)
	@OpenApiField(desc = "是否显示标题", constraint = "默认为1：显示,1：显示,0：不显示", demo = "1")
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

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月9日 上午10:31:24 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "mpayGotoRecharge", type = ApiMessageType.Response)
public class MpayGotoRechargeResponse extends ApiResponse{
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID", demo = "20151026010000081900")
	private String userId;
	
	@NotBlank
	@Length(max = 35)
	@OpenApiField(desc = "统一业务流水号", constraint = "统一业务流水号", demo = "H0000000366532015110911250011100000")
	private String gid;
	
	@Length(max = 10)
	@OpenApiField(desc = "是否显示标题", constraint = "默认为1：显示,1：显示,0：不显示", demo = "1")
	private String title = "1";


	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGid() {
		return this.gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月17日 上午10:28:52 创建
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
 * @data   2015年11月17日
 */
@OpenApiMessage(service = "mpayResetPayPasswordRedirect", type = ApiMessageType.Response)
public class MpayResetPayPasswordRedirectResponse extends ApiResponse{
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "P144768869882981")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "是否显示标题", constraint = "1:显示，0：不显示", demo = "1")
	private String title;
	
	@NotBlank
	@OpenApiField(desc = "gid", constraint = "gid", demo = "H0000000000232015111700122168300000")
	private String gid;

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

    
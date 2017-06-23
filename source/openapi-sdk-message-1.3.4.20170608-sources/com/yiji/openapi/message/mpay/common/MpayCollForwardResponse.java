/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-03-31 10:24 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-03-31
 */
@OpenApiMessage(service = "mpayCollForward", type = ApiMessageType.Response)
public class MpayCollForwardResponse extends ApiResponse {

	@OpenApiField(desc = "gid", constraint = "gid", demo = "H0000000002612015123014154983300000")
	private String gid;


	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

}

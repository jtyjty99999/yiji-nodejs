/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:53 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFConfirmSign", type = ApiMessageType.Response)
public class MpayPFConfirmSignResponse extends ApiResponse {
    /*签约流水号*/
    @OpenApiField(desc = "用户名",demo = "易极付")
    private String userName;

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
    
}

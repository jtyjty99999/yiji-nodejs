/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-09 14:20 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzSignForward", type = ApiMessageType.Notify)
public class YzzSignForwardNotify extends ApiNotify {
	
	@OpenApiField(desc = "签约信息列表")
	private String signInfoList;
	
	public String getSignInfoList() {
		return signInfoList;
	}
	
	public void setSignInfoList(String signInfoList) {
		this.signInfoList = signInfoList;
	}
}

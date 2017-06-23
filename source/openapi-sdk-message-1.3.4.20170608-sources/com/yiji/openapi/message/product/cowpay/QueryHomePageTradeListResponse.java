/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月20日 下午5:32:48 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "queryHomePageTradeList", type = ApiMessageType.Response)
public class QueryHomePageTradeListResponse extends ApiResponse {
	
	@OpenApiField(desc = "首页交易信息列表")
	private List<String> homePageTradeMessage;
	
	public List<String> getHomePageTradeMessage() {
		return this.homePageTradeMessage;
	}
	
	public void setHomePageTradeMessage(List<String> homePageTradeMessage) {
		this.homePageTradeMessage = homePageTradeMessage;
	}
	
}

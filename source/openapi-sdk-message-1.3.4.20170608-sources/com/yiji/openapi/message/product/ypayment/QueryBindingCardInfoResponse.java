/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月29日 下午2:32:22 创建
 */
package com.yiji.openapi.message.product.ypayment;

import java.util.List;

import com.yiji.openapi.message.product.ypayment.info.OpenApiPayBindingInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年4月29日
 */
@OpenApiMessage(service = "queryBindingCardInfo", type = ApiMessageType.Response)
public class QueryBindingCardInfoResponse extends ApiResponse {
	
	@OpenApiField(desc = "绑定缴费卡号信息列表", constraint = "绑定缴费卡号信息列表", demo = "")
	private List<OpenApiPayBindingInfo> payBindingInfos;
	
	public List<OpenApiPayBindingInfo> getPayBindingInfos() {
		return this.payBindingInfos;
	}
	
	public void setPayBindingInfos(List<OpenApiPayBindingInfo> payBindingInfos) {
		this.payBindingInfos = payBindingInfos;
	}
	
}

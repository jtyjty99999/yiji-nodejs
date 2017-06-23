/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月7日 下午2:02:51 创建
 */
package com.yiji.openapi.message.common.query;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.message.common.query.info.OpenApiIntegrateQuotaOrderInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月7日
 */
@OpenApiMessage(service = "commonQueryIntegrateQuota", type = ApiMessageType.Request)
public class CommonQueryIntegrateQuotaRequest extends ApiRequest{
	
	@NotNull
	@OpenApiField(desc = "订单信息列表", constraint = "订单信息列表", demo = "{\"userId\"：\"20150817010007217971\"}")
	private List<OpenApiIntegrateQuotaOrderInfo> orderInfos;

	public List<OpenApiIntegrateQuotaOrderInfo> getOrderInfos() {
		return this.orderInfos;
	}

	public void setOrderInfos(List<OpenApiIntegrateQuotaOrderInfo> orderInfos) {
		this.orderInfos = orderInfos;
	}
	
}

    
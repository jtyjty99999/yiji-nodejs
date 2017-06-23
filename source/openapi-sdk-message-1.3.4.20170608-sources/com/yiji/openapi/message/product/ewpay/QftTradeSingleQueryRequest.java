/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午1:50:58 创建
 */
package com.yiji.openapi.message.product.ewpay;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "qftTradeSingleQuery", type = ApiMessageType.Request)
public class QftTradeSingleQueryRequest extends ApiRequest {
	/**
	 * 交易订单号
	 */
	@NotNull
	@Size(min = 1, max = 32)
	@OpenApiField(desc = "外部订单号" ,demo = "outorderno1443068550641")
	private String outOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

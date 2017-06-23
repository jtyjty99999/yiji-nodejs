/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月4日 下午2:32:13 创建
 */
package com.yiji.openapi.message.product.pos;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年11月4日
 */
@OpenApiMessage(service = "posCashierOrderSync", type = ApiMessageType.Response)
public class PosCashierOrderSyncResponse extends ApiResponse{
	@NotBlank
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号",demo="2015110414340580524_YIPINHUI")
	private String outOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}

    
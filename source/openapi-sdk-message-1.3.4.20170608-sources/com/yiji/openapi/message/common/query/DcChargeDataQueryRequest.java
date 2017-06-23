/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月27日 下午12:57:09 创建
 */
package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年10月27日
 */
@OpenApiMessage(service = "dcChargeDataQuery", type = ApiMessageType.Request)
public class DcChargeDataQueryRequest extends ApiRequest{
	@Length(max=20)
	@OpenApiField(desc = "外部流水号",constraint="outBizNo和outOrderNo至少传入其中一个",demo="20151016026035860522")
	private String outBizNo;
	
	@Length(max=64)
	@OpenApiField(desc = "商户订单号",constraint="outBizNo和outOrderNo至少传入其中一个",demo="20151016026035860522")
	private String outOrderNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

    
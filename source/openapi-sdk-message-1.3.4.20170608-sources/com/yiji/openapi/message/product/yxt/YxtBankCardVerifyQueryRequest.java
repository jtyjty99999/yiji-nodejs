/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月9日 下午4:02:50 创建
 */
package com.yiji.openapi.message.product.yxt;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "yxtBankCardVerifyQuery", type = ApiMessageType.Request)
public class YxtBankCardVerifyQueryRequest extends ApiRequest {
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "P144733894089711")
	private String outOrderNo;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

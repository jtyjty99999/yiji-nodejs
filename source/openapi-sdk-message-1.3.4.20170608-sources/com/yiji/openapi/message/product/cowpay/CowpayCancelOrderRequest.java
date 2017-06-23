/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-17 16:09 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "cowpayCancelOrder", type = ApiMessageType.Request)
public class CowpayCancelOrderRequest extends ApiRequest {
	
	@OpenApiField(desc = "交易订单号")
	@NotBlank
	private String userId;
	
	@OpenApiField(desc = "外部订单号")
	@NotBlank
	private String outOrderNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

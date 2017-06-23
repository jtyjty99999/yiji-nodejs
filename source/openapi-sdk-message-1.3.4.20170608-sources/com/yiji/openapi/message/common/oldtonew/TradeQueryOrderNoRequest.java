/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月9日 下午2:49:09 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月9日
 */
@OpenApiMessage(service = "tradeQueryOrderNo", type = ApiMessageType.Request)
public class TradeQueryOrderNoRequest extends ApiRequest{
	
	@NotNull
	@Length(max = 32)
	@OpenApiField(desc = "外部订单号",constraint = "外部订单号",demo = "12346579801234567980")
	private String qOrderNo;

	public String getqOrderNo() {
		return this.qOrderNo;
	}

	public void setqOrderNo(String qOrderNo) {
		this.qOrderNo = qOrderNo;
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com Thu Jan 22 14:10:15 CST 2015 创建
 */
package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "yzzTenderTradeCancel", type = ApiMessageType.Request)
public class YzzTenderTradeCancelRequest extends ApiRequest {
	
	@NotEmpty
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "借款项目主交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "说明")
	private String memo;
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
}
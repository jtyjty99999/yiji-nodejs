/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-27 11:09 创建
 *
 */
package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "tradePolymerQuery", type = ApiMessageType.Request)
public class TradePolymerQueryRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "查询类型", constraint = "tradeNo:根据交易号，outOrderNo:根据外部流水号")
	private String queryType;
	
	@OpenApiField(desc = "外部流水号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	public String getQueryType() {
		return queryType;
	}
	
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}

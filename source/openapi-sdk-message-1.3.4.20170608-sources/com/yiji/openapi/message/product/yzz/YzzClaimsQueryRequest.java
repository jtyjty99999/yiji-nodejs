/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-13 13:43 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "", type = ApiMessageType.Request)
public class YzzClaimsQueryRequest extends ApiRequest {
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "转让流水号")
	private String bizNo;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "外部流水号")
	private String outOrderNo;
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

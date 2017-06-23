/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月5日 下午9:15:42 创建
 */
package com.yiji.openapi.message.common.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "tradeRemittance", type = ApiMessageType.Notify)
public class TradeRemittanceApiNotify extends ApiNotify {
	
	@OpenApiField(desc = "交易信息")
	private String message;
	
	@OpenApiField(desc = "交易流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "交易类型")
	private String tradeType;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeType() {
		return this.tradeType;
	}
	
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

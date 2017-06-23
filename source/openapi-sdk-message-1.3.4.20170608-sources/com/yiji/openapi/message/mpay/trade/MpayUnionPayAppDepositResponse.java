/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午7:56:58 创建
 */

package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 银联SDK充值出参
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "mpayUnionPayAppDeposit", type = ApiMessageType.Response)
public class MpayUnionPayAppDepositResponse extends ApiResponse {
	
	/** 银联流水号 */
	@OpenApiField(desc = "银联流水号", demo = "123456789")
	private String tradeNo;
	
	/** 外部订单号 */
	@OpenApiField(desc = "外部订单号", demo = "1234567890")
	private String outOrderNo;
	
	/** 充值流水号 */
	@OpenApiField(desc = "充值流水号 ", demo = "1234567890123456789")
	private String payNo;
	
	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
}

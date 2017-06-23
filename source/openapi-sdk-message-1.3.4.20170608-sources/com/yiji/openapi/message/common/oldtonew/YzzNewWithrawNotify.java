/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月5日 上午10:26:08 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年4月5日
 */
@OpenApiMessage(service = "yzzNewWithraw", type = ApiMessageType.Notify)
public class YzzNewWithrawNotify extends ApiNotify {
	
	@OpenApiField(desc = "支付方式", constraint = "支付方式", demo = "WITHDRAW")
	private String payType;
	
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20130812020055285248")
	private String outBizNo;
	
	@OpenApiField(desc = "支付号", constraint = "支付号", demo = "2014100841C027780927")
	private String payNo;
	
	@OpenApiField(desc = "实际到账金额", constraint = "实际到账金额", demo = "66.66")
	private String amountIn;
	
	@OpenApiField(desc = "交易金额", constraint = "交易金额", demo = "66.66")
	private String amount;
	
	public String getPayType() {
		return this.payType;
	}
	
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getPayNo() {
		return this.payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public String getAmountIn() {
		return this.amountIn;
	}
	
	public void setAmountIn(String amountIn) {
		this.amountIn = amountIn;
	}
	
	public String getAmount() {
		return this.amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}

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
 * 支付台查询绑卡列表结果
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "fsTradePayByDeduct", type = ApiMessageType.Response)
public class TradePayDeductResponse extends ApiResponse {
	
	@OpenApiField(desc = "业务交易号", demo = "20160315000029186659")
	private String tradeNo;
	
	@OpenApiField(desc = "代扣流水编号", demo = "20160315000029226659")
	private String depositId;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getDepositId() {
		return this.depositId;
	}
	
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
}

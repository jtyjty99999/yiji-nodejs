/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午6:50:08 创建
 */
package com.yiji.openapi.message.product.ewpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "qftIntegratedPayment", type = ApiMessageType.Notify)
public class QftIntegratedPaymentNotify extends ApiNotify {
	@OpenApiField(desc = "交易流水号" ,demo = "123456789013245678")
	private String tradeNo;
	
	@OpenApiField(desc = "交易状态" ,demo = "SUCCESS")
	private String tradeStatus;

	@OpenApiField(desc = "外部订单号" ,demo = "outorderno1443068550641")
	private String outOrderNo;
	
	@OpenApiField(desc = "执行动作" ,demo = "ESCOW_TRADE_BUYER_ESCOW_PAY")
	private String executeAction;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getExecuteAction() {
		return this.executeAction;
	}

	public void setExecuteAction(String executeAction) {
		this.executeAction = executeAction;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午3:45:08 创建
 */
package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 银联SDK充值异步通知参数
 * 
 * @author "dengwei@yiji.com"
 * 
 */
@OpenApiMessage(service = "mpayUnionPayAppDeposit", type = ApiMessageType.Notify)
public class MpayUnionPayAppDepositNotify extends ApiNotify {
	
	@OpenApiField(desc = "外部订单号", demo = "12345678")
	private String outOrderNo;
	
	@OpenApiField(desc = "充值流水号", demo = "20160223123456790")
	private String payNo;
	
	@OpenApiField(desc = "充值状态", constraint="{\"data\":[\"success:成功\",\"fail:失败\"],\"name\":\"充值状态\"}", demo = "success/fail")
	private String status;
	
	@OpenApiField(desc = "充值金额", demo = "88.88")
	private Money amount;
	
	@OpenApiField(desc = "实际到账金额", demo = "88.88")
	private Money amountIn;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayNo() {
		return this.payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public Money getAmountIn() {
		return this.amountIn;
	}

	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}

}

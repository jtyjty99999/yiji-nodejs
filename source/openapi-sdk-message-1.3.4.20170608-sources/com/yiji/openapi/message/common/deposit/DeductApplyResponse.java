/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月30日 上午11:13:55 创建
 */
package com.yiji.openapi.message.common.deposit;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "deductApply", type = ApiMessageType.Response)
public class DeductApplyResponse extends ApiResponse {
	
	@OpenApiField(desc = "充退流水",demo = "123456978123")
	private String depositId;
	
	@OpenApiField(desc = "外部请求订单号",demo = "12364548977")
	private String outBizNo;
	
	@OpenApiField(desc = "状态",demo = "INITIAL")
	private String status;
	
	@OpenApiField(desc = "应付额",demo = "88.66")
	private Money payAmount;
	
	@OpenApiField(desc = "应付实收额",demo = "88.66")
	private Money payAmountIn;
	
	public String getDepositId() {
		return this.depositId;
	}
	
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Money getPayAmount() {
		return this.payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		this.payAmount = payAmount;
	}
	
	public Money getPayAmountIn() {
		return this.payAmountIn;
	}
	
	public void setPayAmountIn(Money payAmountIn) {
		this.payAmountIn = payAmountIn;
	}
	
}

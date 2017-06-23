/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午4:08:15 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "deductDeposit.apply", type = ApiMessageType.Notify)
public class DeductDepositApplyNotify extends ApiNotify {

	@OpenApiField(desc = "充值流水", demo = "20140720222222222222")
	private String payNo;

	@OpenApiField(desc = "外部订单号", demo = "20140711000000000000")
	private String outBizNo;

	@OpenApiField(desc = "应付额", demo = "1.11")
	private Money amount;

	@OpenApiField(desc = "应付实收额", demo = "1.11")
	private Money amountIn;

	@OpenApiField(desc = "消息", demo = "代扣充值成功")
	private String message;

	@OpenApiField(desc = "充值类型CODE", demo = "DEPOSIT_ONLY")
	private String payType;

	@OpenApiField(desc = "充值类型MSG", demo = "纯充值")
	private String payTypeMessage;

	@OpenApiField(desc = "内部处理结果", demo = "处理成功")
	private String SETTLE_REASON;

	public String getPayNo() {
		return this.payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayTypeMessage() {
		return this.payTypeMessage;
	}

	public void setPayTypeMessage(String payTypeMessage) {
		this.payTypeMessage = payTypeMessage;
	}

	public String getSETTLE_REASON() {
		return this.SETTLE_REASON;
	}

	public void setSETTLE_REASON(String sETTLE_REASON) {
		SETTLE_REASON = sETTLE_REASON;
	}

}

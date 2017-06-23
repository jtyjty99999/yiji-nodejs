/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午10:19:35 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

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
@OpenApiMessage(service = "drawback", type = ApiMessageType.Notify)
public class DrawbackNotify extends ApiNotify {

	@OpenApiField(desc = "消息", demo = "成功")
	private String message;

	@NotNull
	@OpenApiField(desc = "退款金额", demo = "1.11")
	private Money refundAmount;

	@NotBlank
	@OpenApiField(desc = "退款流水号", demo = "20141017000009047910")
	private String refundNo;

	@NotBlank
	@OpenApiField(desc = "执行状态", constraint = "{\"data\":[\"true:成功\",\"false:失败\"],\"name\":\"执行状态\"}", demo = "true")
	private String executeStatus;

	@NotBlank
	@OpenApiField(desc = "交易号", demo = "20141016000009023868")
	private String tradeNo;

	@NotBlank
	@OpenApiField(desc = "退款完成时间", constraint = "yyyy-MM-dd HH:mm:ss", demo = "2016-11-11 11:11:11")
	private String refundFinishTime;

	@OpenApiField(desc = "币种", demo = "CNY")
	private String currency;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Money getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundNo() {
		return this.refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public String getExecuteStatus() {
		return this.executeStatus;
	}

	public void setExecuteStatus(String executeStatus) {
		this.executeStatus = executeStatus;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getRefundFinishTime() {
		return this.refundFinishTime;
	}

	public void setRefundFinishTime(String refundFinishTime) {
		this.refundFinishTime = refundFinishTime;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}

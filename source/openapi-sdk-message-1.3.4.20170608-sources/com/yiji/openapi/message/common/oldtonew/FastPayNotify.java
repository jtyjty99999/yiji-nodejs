/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午5:26:16 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "fastpay", type = ApiMessageType.Notify)
public class FastPayNotify extends ApiNotify {

	@OpenApiField(desc = "通知类型", demo = "fastpay")
	private String notifyType;

	@OpenApiField(desc = "交易号", demo = "6843192280647118")
	private String tradeNo;

	@OpenApiField(desc = "交易是否成功", demo = "true")
	private String executeStatus;

	@OpenApiField(desc = "交易动作", demo = "付款")
	private String tradeAction;

	@OpenApiField(desc = "付款时间", demo = "2016-11-11")
	private Date payTime;

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getExecuteStatus() {
		return this.executeStatus;
	}

	public void setExecuteStatus(String executeStatus) {
		this.executeStatus = executeStatus;
	}

	public String getTradeAction() {
		return this.tradeAction;
	}

	public void setTradeAction(String tradeAction) {
		this.tradeAction = tradeAction;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

}

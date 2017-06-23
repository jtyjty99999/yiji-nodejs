/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月27日 下午3:21:36 创建
 */
package com.yiji.openapi.message.mpay.common;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年10月27日
 */
@OpenApiMessage(service = "mpayTradePayment", type = ApiMessageType.Notify)
public class MpayTradePaymentNotify extends ApiNotify{
	
	@OpenApiField(desc = "类型", constraint = "trade：交易，deposit：抵押，transfer：转账，withdraw：退款",demo="trade")
	private String type;
	
	@OpenApiField(desc = "金额", constraint = "金额",demo="6.66")
	private Money amount;
	
	@OpenApiField(desc = "用户ID", constraint = "用户ID",demo="20150705000000455716")
	private String userId;
	
	@OpenApiField(desc = "用户名", constraint = "用户名",demo="admin")
	private String userName;
	
	@OpenApiField(desc = "状态", constraint = "状态",demo="true")
	private String status;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月22日 下午3:28:58 创建
 */
package com.yiji.openapi.message.product.common;

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
 * @author zhike@yiji.com
 * @data 2016年2月22日
 */
@OpenApiMessage(service = "commonRefund", type = ApiMessageType.Notify)
public class CommonRefundNotify extends ApiNotify {
	@NotNull
	@OpenApiField(desc = "退款金额", constraint = "退款金额", demo = "66.66")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "原始交易流水号", constraint = "如果type是充退传充退流水号，如果是交易传交易号", demo = "20151109020009158022")
	private String tradeNo;
	
	@OpenApiField(desc = "账期", constraint = "账期", demo = "20140912")
	private String accountDay;
	
	@NotBlank
	@OpenApiField(desc = "退款状态", constraint = "{\"data\":[\"true:成功\",\"false:失败\"],\"name\":\"退款状态\"}", demo = "true")
	private String status;
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getAccountDay() {
		return this.accountDay;
	}
	
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}

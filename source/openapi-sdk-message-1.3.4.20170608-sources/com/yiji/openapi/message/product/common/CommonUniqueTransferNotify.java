/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午2:55:12 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "commonUniqueTransfer", type = ApiMessageType.Notify)
public class CommonUniqueTransferNotify extends ApiNotify {
	@NotBlank
	@Length(min = 20,max = 40)
	@OpenApiField(desc = "流水号",constraint = "汇付或转账流水号",demo = "254154515154151")
	private String bizNo;
	
	@NotBlank
	@OpenApiField(desc = "金额",constraint = "汇付或转账金额且金额大于0",demo = "66.66")
	private Money amount;

	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}
}

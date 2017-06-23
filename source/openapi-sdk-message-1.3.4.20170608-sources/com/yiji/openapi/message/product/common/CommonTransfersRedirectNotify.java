/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月22日 上午10:32:57 创建
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
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "commonTransfersRedirect", type = ApiMessageType.Notify)
public class CommonTransfersRedirectNotify extends ApiNotify{
	@NotBlank
	@Length(min = 20,max = 40)
	@OpenApiField(desc = "流水号",constraint = "汇付或转账流水号",demo = "254154515154151")
	private String bizNo;
	
	@NotBlank
	@OpenApiField(desc = "金额",constraint = "汇付或转账金额且金额大于0",demo = "66.66")
	private Money amount;
	
	@Length(max = 256)
	@OpenApiField(desc = "备注",constraint = "备注",demo = "转账成功")
	private String memo;

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

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}

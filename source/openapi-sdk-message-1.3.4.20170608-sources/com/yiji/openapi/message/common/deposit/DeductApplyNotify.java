/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月30日 下午3:21:46 创建
 */
package com.yiji.openapi.message.common.deposit;

import javax.validation.constraints.NotNull;

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
 * @author xiyang
 *
 */
@OpenApiMessage(service = "deductApply", type = ApiMessageType.Notify)
public class DeductApplyNotify extends ApiNotify {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "支付流水号",demo = "1324567890154")
	private String payNo;
	
	@NotNull
	@OpenApiField(desc = "金额",demo = "88.66")
	private Money amount;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "外部请求订单号",demo = "1233465479812345")
	private String outBizNo;
	
	public String getPayNo() {
		return this.payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
}

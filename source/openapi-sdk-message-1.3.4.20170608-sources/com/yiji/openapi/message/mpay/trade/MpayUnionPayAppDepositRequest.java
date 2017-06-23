/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午8:52:35 创建
 */

package com.yiji.openapi.message.mpay.trade;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * 银联SDK充值入参
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "mpayUnionPayAppDeposit", type = ApiMessageType.Request)
public class MpayUnionPayAppDepositRequest extends ApiRequest {

	/**
	 * 易极付会员ID
	 */
	@NotBlank
	@Length(max = 64, min = 1)
	@OpenApiField(desc = "易极付会员ID", demo = "12345679801234567890")
	private String userId;

	/**
	 * 外部订单号
	 */
	@NotBlank
	@Length(max = 64, min = 1)
	@OpenApiField(desc = "外部订单号", demo = "123456798")
	private String outOrderNo;

	/**
	 * 金额
	 */
	@NotNull
	@OpenApiField(desc = "金额", demo = "88.66")
	private Money amount;

	/**
	 * 备注
	 */
	@Length(max = 200, min = 1)
	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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

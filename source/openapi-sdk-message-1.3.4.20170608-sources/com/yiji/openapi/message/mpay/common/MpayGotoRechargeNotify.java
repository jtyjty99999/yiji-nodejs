/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月9日 下午1:46:24 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "mpayGotoRecharge", type = ApiMessageType.Notify)
public class MpayGotoRechargeNotify extends ApiNotify{
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "充值id", constraint = "充值id", demo = "20151026010000081900")
	private String depositId;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "外部商户号", constraint = "外部商户号", demo = "20151026010000081900")
	private String outOrderNo;
	
	@NotBlank
	@Length(min = 20,max = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID", demo = "20151026010000081900")
	private String userId;
	
	@Length(max = 20)
	@OpenApiField(desc = "充值类型", constraint = "充值类型", demo = "deposit")
	private String type;
	
	@Length(max = 10)
	@OpenApiField(desc = "状态", constraint = "状态", demo = "true")
	private String status;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "充值金额", constraint = "充值金额", demo = "66.66")
	private String amount;

	public String getDepositId() {
		return this.depositId;
	}

	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}

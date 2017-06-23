/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月8日 下午2:09:12 创建
 */
package com.yiji.openapi.message.product.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月8日
 */
@OpenApiMessage(service = "commonRedirectToWithdrawal", type = ApiMessageType.Notify)
public class CommonRedirectToWithdrawalNotify extends ApiNotify{

	@NotBlank
	@OpenApiField(desc = "状态", constraint = "状态", demo = "true")
	private boolean status;
	
	@NotBlank
	@OpenApiField(desc = "商户订单号", constraint = "商户订单号", demo = "20140821010000051558")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "业务流水号", constraint = "业务流水号", demo = "20140821010000051558")
	private String bizNo;
    
	@NotBlank
	@OpenApiField(desc = "业务流水号", constraint = "业务流水号", demo = "66.66")
	private String amount;
    
	@OpenApiField(desc = "失败原因", constraint = "失败原因", demo = "银行卡号不存在")
	private String failReason;
	
	@OpenApiField(desc = "手续费", constraint = "手续费", demo = "6.66")
	private String chargeAmount;
	
	@NotBlank
	@OpenApiField(desc = "总金额是否包含手续费", constraint = "总金额是否包含手续费", demo = "true")
	private boolean containChargeAmount;

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFailReason() {
		return this.failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getChargeAmount() {
		return this.chargeAmount;
	}

	public void setChargeAmount(String chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public boolean isContainChargeAmount() {
		return this.containChargeAmount;
	}

	public void setContainChargeAmount(boolean containChargeAmount) {
		this.containChargeAmount = containChargeAmount;
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月3日 下午2:06:34 创建
 */
package com.yiji.openapi.message.common.deposit;

import javax.validation.constraints.DecimalMax;
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
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "rechargeBackApply", type = ApiMessageType.Request)
public class RechargeBackApplyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "充值流水号", constraint = "充值指令的流水号",demo = "1234566")
	private String depositId;
	
	@NotNull
	@OpenApiField(desc = "充退支付金额", constraint = "单位：元",demo = "88.66")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "是否转提现", constraint = "如果无法充退,是否转提现",demo = "N")
	private String toWithdraw;
	
	@Length(max = 1024)
	@OpenApiField(desc = "备注", constraint = "备注",demo = "充退")
	private String memo;
	
	@NotBlank
	@OpenApiField(desc = "充退协议", constraint = "充退协议",demo = "ASYNC_PREBALANCE_DEPOSITBACK_CONTRACT")
	private String subContractCode;
	
	@DecimalMax(value = "99")
	@OpenApiField(desc = "延迟处理时间", constraint = "延迟处理时间",demo = "60")
	private int delay;
	
	@OpenApiField(desc = "是否需要二次充退", constraint = "是否需要二次充退",demo = "Y")
	private String repeating;
	
	public String getDepositId() {
		return this.depositId;
	}
	
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getToWithdraw() {
		return this.toWithdraw;
	}
	
	public void setToWithdraw(String toWithdraw) {
		this.toWithdraw = toWithdraw;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getSubContractCode() {
		return this.subContractCode;
	}
	
	public void setSubContractCode(String subContractCode) {
		this.subContractCode = subContractCode;
	}
	
	public int getDelay() {
		return this.delay;
	}
	
	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	public String getRepeating() {
		return this.repeating;
	}
	
	public void setRepeating(String repeating) {
		this.repeating = repeating;
	}
	
}

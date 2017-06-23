/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月4日 上午11:04:52 创建
 */
package com.yiji.openapi.message.common.installment.info;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年2月4日
 */
public class OpenapiExtraSettleItem {
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "结算外部流水号", demo = "bff024f3-7c20-488b-a8ac-d9a8f119f78a", constraint = "结算外部流水号")
	private String externalOrderNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "结算UserId", demo = "20140917010001721742", constraint = "结算UserId")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "结算金额", demo = "66.66", constraint = "结算金额")
	private Money amount;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "结算备注", demo = "结算成功", constraint = "结算备注")
	private String settleMemo;
	
	public String getExternalOrderNo() {
		return this.externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getSettleMemo() {
		return this.settleMemo;
	}
	
	public void setSettleMemo(String settleMemo) {
		this.settleMemo = settleMemo;
	}
}

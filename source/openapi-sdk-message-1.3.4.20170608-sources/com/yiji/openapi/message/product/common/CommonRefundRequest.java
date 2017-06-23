/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月22日 下午3:27:18 创建
 */
package com.yiji.openapi.message.product.common;

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
 * @author zhike@yiji.com
 * @data 2016年2月22日
 */
@OpenApiMessage(service = "commonRefund", type = ApiMessageType.Request)
public class CommonRefundRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "退款类型", constraint = "{\"data\":[\"DEPOSIT_BACK:充退\",\"REFUND:交易退款\"],\"name\":\"退款类型\"}",
			demo = "DEPOSIT_BACK")
	private String type;
	
	@NotBlank
	@OpenApiField(desc = "原始交易流水号", constraint = "如果type是充退传充退流水号，如果是交易传交易号", demo = "20151109020009158022")
	private String tradeNo;
	
	@OpenApiField(desc = "退款额", constraint = "如果传入负值或不传，则表示全额退款", demo = "66.66")
	private Money amount;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "退款原因", constraint = "退款原因", demo = "货物未到")
	private String reason;
	
	@Length(max = 256)
	@OpenApiField(desc = "备注", constraint = "备注", demo = "尽快到账")
	private String memo;
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getReason() {
		return this.reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-12 15:40 创建
 *
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-12
 */
@OpenApiMessage(service = "crossBack", type = ApiMessageType.Request)
public class CrossBackRequest extends ApiRequest {
	
	@OpenApiField(desc = "退款额", demo = "Default")
	private Money refundAmount;
	
	@OpenApiField(desc = "退款日期", demo = "mnsc")
	private String refundTime;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号", demo = "20160501213022000000100012828")
	private String orderNumber;
	
	@NotBlank
	@OpenApiField(desc = "退款原因", demo = "因为必须要退款", constraint = "退款原因长度必须在1-40位之间！")
	private String refundReason;
	
	public Money getRefundAmount() {
		return refundAmount;
	}
	
	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}
	
	public String getRefundTime() {
		return refundTime;
	}
	
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	
	public String getRefundReason() {
		return refundReason;
	}
	
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	
	public String getOrderNumber() {
		return this.orderNumber;
	}
	
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
}

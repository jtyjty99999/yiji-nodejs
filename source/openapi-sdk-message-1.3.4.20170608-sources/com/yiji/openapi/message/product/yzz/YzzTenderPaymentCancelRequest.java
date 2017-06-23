/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 14:46 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzTenderPaymentCancel", type = ApiMessageType.Request)
public class YzzTenderPaymentCancelRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "借款项目主交易号")
	@Size(min = 20, max = 20)
	private String tradeNo;
	
	@NotEmpty
	@OpenApiField(desc = "投资交易号")
	@Size(min = 20, max = 20)
	private String paymentTradeNo;
	
	@NotEmpty
	@OpenApiField(desc = "投资用戶ID")
	@Size(min = 20, max = 20)
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "说明")
	private String memo;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPaymentTradeNo() {
		return paymentTradeNo;
	}
	
	public void setPaymentTradeNo(String paymentTradeNo) {
		this.paymentTradeNo = paymentTradeNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

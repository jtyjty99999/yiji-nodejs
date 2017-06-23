/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 15:35 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.Size;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzAutoRepaymentTrade", type = ApiMessageType.Response)
public class YzzAutoRepaymentTradeResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号")
	@Size(min = 20, max = 20)
	private String repaymentNo;
	
	@OpenApiField(desc = "还款用户Id")
	@Size(min = 20, max = 20)
	private String userId;
	
	@OpenApiField(desc = "借款项目编码")
	@Size(min = 20, max = 64)
	private String tradeNo;
	
	@OpenApiField(desc = "交易状态(交易结果判断标志)")
	private String tradeStatus;
	
	@OpenApiField(desc = "还款总金额（不包括分润）")
	private Money totalAmount;
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	public String getRepaymentNo() {
		return repaymentNo;
	}
	
	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeStatus() {
		return tradeStatus;
	}
	
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
}

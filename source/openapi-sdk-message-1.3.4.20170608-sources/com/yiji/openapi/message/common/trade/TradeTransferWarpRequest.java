/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月4日 下午10:20:13 创建
 */
package com.yiji.openapi.message.common.trade;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "tradeTransferWarp", type = ApiMessageType.Request)
public class TradeTransferWarpRequest extends ApiRequest {
	
	@Size(max = 64)
	@OpenApiField(desc = "交易名称")
	private String tradeName;
	
	@NotNull
	@OpenApiField(desc = "付款人ID")
	private String payerId;
	
	@NotNull
	@OpenApiField(desc = "收款人ID")
	private String payeeId;
	
	@NotNull
	@OpenApiField(desc = "交易额")
	private Money tradeAmount;
	
	@NotNull
	@OpenApiField(desc = "币种,默认人民币")
	private String currency;
	
	@OpenApiField(desc = "交易子类型")
	private String gatheringType;
	
	@Length(max = 1024)
	@OpenApiField(desc = "交易备注")
	private String tradeMemo;
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getPayerId() {
		return payerId;
	}
	
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	
	public String getPayeeId() {
		return payeeId;
	}
	
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getGatheringType() {
		return gatheringType;
	}
	
	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月10日 下午3:26:44 创建
 */
package com.yiji.openapi.message.common.trade;

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
@OpenApiMessage(service = "highWayTradeCreate", type = ApiMessageType.Request)
public class HighWayTradeCreateRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖方ID")
	private String sellerUserId;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买方ID")
	private String buyerUserId;
	
	@NotNull
	@OpenApiField(desc = "交易金额")
	private Money tradeAmount;
	
	@OpenApiField(desc = "交易名称")
	private String tradeName;
	
	@OpenApiField(desc = "交易业务编码")
	private String tradeBizProductCode;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	public String getSellerUserId() {
		return this.sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public Money getTradeAmount() {
		return this.tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getTradeName() {
		return this.tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

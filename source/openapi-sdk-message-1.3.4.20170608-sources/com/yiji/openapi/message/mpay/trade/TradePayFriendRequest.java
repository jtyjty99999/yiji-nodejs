/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午8:52:35 创建
 */

package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "fsTradePayByFriend", type = ApiMessageType.Request)
public class TradePayFriendRequest extends ApiRequest {
	
	/**
	 * 外部会员id
	 */
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "易极付会员id", demo = "20151201042059760178", constraint = "支付人账号")
	private String payerUserId;
	
		
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "易极付交易号", demo = "20160315000029186659")
	private String tradeNo;
	
	@NotBlank
	@Length(max = 32, min = 10)
	@OpenApiField(desc = "商户订单号", demo = "14580351919721111111")
	private String merchantOrderNo;
	
	
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPayerUserId() {
		return this.payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
}

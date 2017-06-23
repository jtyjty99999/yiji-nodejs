/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月6日 下午3:19:33 创建
 */
package com.yiji.openapi.message.common.guaranteepay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author lvchen@yiji.com
 */
@OpenApiMessage(service = "guaranteePay", type = ApiMessageType.Response)
public class GuaranteePayResponse extends ApiResponse {
	@OpenApiField
	private String gid;
	
	@OpenApiField
	private String channelId = "openapi";
	
	@OpenApiField
	private String tradeNo;
	
	@OpenApiField(desc = "入口编码")
	private String inlet = "01";
	
	@OpenApiField(desc = "商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金帐号")
	private String merchantAccNo;
	
	@OpenApiField(desc = "商户会员ID")
	private String merchantUserId;
	
	@OpenApiField(desc = "商户外部业务ID")
	private String merchantOrderBizNo;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getChannelId() {
		return channelId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}
	
	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}
}

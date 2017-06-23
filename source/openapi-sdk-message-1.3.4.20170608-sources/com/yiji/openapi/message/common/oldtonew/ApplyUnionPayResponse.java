/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月14日 下午2:08:08 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月14日
 */
@OpenApiMessage(service = "applyUnionPay", type = ApiMessageType.Response)
public class ApplyUnionPayResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易号", constraint = "交易号", demo = "2016031311565812037241003")
	private String tradeNo;
	
	@OpenApiField(desc = "渠道id", demo = "1111a4")
	private String channelId;
	
	@OpenApiField(desc = "统一流水号", demo = "12399871238312312")
	private String gid;
	
	@OpenApiField(desc = "入口", demo = "01")
	private String inlet;
	
	@OpenApiField(desc = "商户卡号", demo = "xxx")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户账户号", demo = "xxx")
	private String merchantAccNo;
	
	@OpenApiField(desc = "商户用户id", demo = "xxx")
	private String merchantUserId;
	
	@OpenApiField(desc = "商户订单号", demo = "xxx")
	private String merchantOrderBizNo;
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getChannelId() {
		return this.channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getInlet() {
		return this.inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getMerchantCardNo() {
		return this.merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return this.merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public String getMerchantOrderBizNo() {
		return this.merchantOrderBizNo;
	}
	
	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}
	
}

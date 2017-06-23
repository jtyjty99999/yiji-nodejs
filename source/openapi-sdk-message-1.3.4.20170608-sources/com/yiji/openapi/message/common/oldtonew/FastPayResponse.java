/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:51:59 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "fastpay", type = ApiMessageType.Response)
public class FastPayResponse extends ApiResponse {

	@OpenApiField(desc = "GID", demo = "M0111111001092016012118233257200100")
	private String gid;

	@OpenApiField(desc = "系统入口", demo = "01")
	private String inlet;

	@OpenApiField(desc = "交易号", demo = "12345678998765432100")
	private String tradeNo;

	@OpenApiField(desc = "渠道ID", demo = "openapi")
	private String channelId;

	@OpenApiField(desc = "商户卡号", demo = "20150519020005491913")
	private String merchantCardNo;

	@OpenApiField(desc = "商户账号", demo = "20150519020005491913")
	private String merchantAccNo;

	@OpenApiField(desc = "商户号", demo = "20150519020005491913")
	private String merchantUserId;

	@OpenApiField(desc = "商户订单号", demo = "12345678998765432100")
	private String merchantOrderBizNo;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
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

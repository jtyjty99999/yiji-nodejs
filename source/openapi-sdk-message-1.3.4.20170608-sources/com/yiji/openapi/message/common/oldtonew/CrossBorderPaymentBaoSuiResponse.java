/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 上午10:23:01 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "crossBorderPaymentBaoSui", type = ApiMessageType.Response)
public class CrossBorderPaymentBaoSuiResponse extends ApiResponse {

	@OpenApiField(desc = "交易号", demo = "20160127000048120823")
	private String tradeNo;

	@OpenApiField(desc = "税费交易号", demo = "20160127000048120823,20160127000048120666")
	private String taxTradeNo;

	@OpenApiField(desc = "物流费交易号", demo = "20160127000048120823,20160127000048120666")
	private String logisticsTradeNo;

	@OpenApiField(desc = "外币金额", demo = "1.11")
	private Money payForeignAmount;

	@OpenApiField(desc = "币种", demo = "CNY")
	private String currency;

	@OpenApiField(desc = "牌价汇率渠道", demo = "ICBC")
	private String bankCode;

	@OpenApiField(desc = "牌价汇率", demo = "92")
	private String rate;

	@OpenApiField(desc = "入口", demo = "01")
	private String inlet;

	@OpenApiField(desc = "商户卡号", demo = "20150519020005491913")
	private String merchantCardNo;

	@OpenApiField(desc = "商户账号", demo = "20150519020005491913")
	private String merchantAccNo;

	@OpenApiField(desc = "商户号", demo = "20150519020005491913")
	private String merchantUserId;

	@OpenApiField(desc = "商户订单号", demo = "20150519020005538423")
	private String merchantOrderBizNo;

	@OpenApiField(desc = "路由ID", demo = "openapi")
	private String channelId;

	@OpenApiField(desc = "GID", demo = "Q0060101002652016012609020672400000")
	private String gid;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTaxTradeNo() {
		return this.taxTradeNo;
	}

	public void setTaxTradeNo(String taxTradeNo) {
		this.taxTradeNo = taxTradeNo;
	}

	public String getLogisticsTradeNo() {
		return this.logisticsTradeNo;
	}

	public void setLogisticsTradeNo(String logisticsTradeNo) {
		this.logisticsTradeNo = logisticsTradeNo;
	}

	public Money getPayForeignAmount() {
		return this.payForeignAmount;
	}

	public void setPayForeignAmount(Money payForeignAmount) {
		this.payForeignAmount = payForeignAmount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
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

}

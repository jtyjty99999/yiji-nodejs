/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 上午10:57:35 创建
 */
package com.yiji.openapi.message.common.deposit;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author lvchen@yiji.com
 */
@OpenApiMessage(service = "ebankGatewayDeposit", type = ApiMessageType.Response)
public class EBankDepositGatewayResponse extends ApiResponse {
	
	@OpenApiField(desc = "全站统一流水号")
	private String gid;
	
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@OpenApiField(desc = "接入渠道")
	private String channelId = "openapi";
	
	@OpenApiField(desc = "充值业务号")
	private String businessNo;
	
	@OpenApiField(desc = "充值金额")
	private Money depositAmount;
	
	@OpenApiField(desc = "收费编码")
	private String tradeBizProductCode;
	
	@OpenApiField(desc = "对公对私标志")
	private String publicOptionTag;
	
	@OpenApiField(desc = "银行编码")
	private String bankCode;
	
	@OpenApiField(desc = "充值类型")
	private String rechargeType = "gateway";
	
	@OpenApiField(desc = "minipay充值类型")
	private String mutableType;
	
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
	
	/**
	 * @return the gid
	 */
	public String getGid() {
		return gid;
	}
	
	/**
	 * @param gid the gid to set
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}
	
	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	/**
	 * @return the businessNo
	 */
	public String getBusinessNo() {
		return businessNo;
	}
	
	/**
	 * @param businessNo the businessNo to set
	 */
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}
	
	/**
	 * @return the depositAmount
	 */
	public Money getDepositAmount() {
		return depositAmount;
	}
	
	/**
	 * @param depositAmount the depositAmount to set
	 */
	public void setDepositAmount(Money depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	/**
	 * @return the tradeBizProductCode
	 */
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	/**
	 * @param tradeBizProductCode the tradeBizProductCode to set
	 */
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	/**
	 * @return the publicOptionTag
	 */
	public String getPublicOptionTag() {
		return publicOptionTag;
	}
	
	/**
	 * @param publicOptionTag the publicOptionTag to set
	 */
	public void setPublicOptionTag(String publicOptionTag) {
		this.publicOptionTag = publicOptionTag;
	}
	
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	/**
	 * @return the rechargeType
	 */
	public String getRechargeType() {
		return rechargeType;
	}
	
	/**
	 * @param rechargeType the rechargeType to set
	 */
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}
	
	/**
	 * @return the mutableType
	 */
	public String getMutableType() {
		return mutableType;
	}
	
	/**
	 * @param mutableType the mutableType to set
	 */
	public void setMutableType(String mutableType) {
		this.mutableType = mutableType;
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

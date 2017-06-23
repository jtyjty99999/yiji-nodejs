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
@OpenApiMessage(service = "ebankDeposit", type = ApiMessageType.Response)
public class EBankDepositResponse extends ApiResponse {
	
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
	
	@OpenApiField(desc = "冻结类型")
	private String freezeBalanceType;
	
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
	
	@OpenApiField(desc = "收费扩展字段", constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
	private String chargeExtend;
	
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
		if (!"ALL".equals(publicOptionTag)) {
			this.publicOptionTag = publicOptionTag;
		}
	}
	
	/**
	 * @return the freezeBalanceType
	 */
	public String getFreezeBalanceType() {
		return freezeBalanceType;
	}
	
	/**
	 * @param freezeBalanceType the freezeBalanceType to set
	 */
	public void setFreezeBalanceType(String freezeBalanceType) {
		this.freezeBalanceType = freezeBalanceType;
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
	
	public String getChargeExtend() {
		return chargeExtend;
	}
	
	public void setChargeExtend(String chargeExtend) {
		this.chargeExtend = chargeExtend;
	}
}

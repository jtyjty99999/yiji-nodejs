/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 上午10:57:18 创建
 */
package com.yiji.openapi.message.common.deposit;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 
 * @author mayansen
 * @date 20140904
 * 
 */
@OpenApiMessage(service = "ebankDeposit", type = ApiMessageType.Request)
public class EBankDepositRequest extends ApiRequest {
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户ID",demo = "20140909010000052206")
	private String userId;
	
	@Length(max = 50)
	@OpenApiField(desc = "用户名",demo = "易极付")
	private String userName;
	
	@OpenApiField(desc = "充值金额",demo = "88.66")
	private Money amount;
	
	@OpenApiField(desc = "对公对私标志",demo = "B2B")
	private String publicTag;
	
	@OpenApiField(desc = "商户平台id",demo = "1234565463")
	private String tradeMerchantId;
	
	@OpenApiField(desc = "冻结类型",demo = "COMMON_FREEZE")
	private String freezeBalanceType;
	
	@OpenApiField(desc = "收费扩展字段", constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP",demo = "0")
	private String chargeExtend;
	
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the publicTag
	 */
	public String getPublicTag() {
		return publicTag;
	}
	
	/**
	 * @param publicTag the publicTag to set
	 */
	public void setPublicTag(String publicTag) {
		this.publicTag = publicTag;
	}
	
	/**
	 * @return the tradeMerchantId
	 */
	public String getTradeMerchantId() {
		return tradeMerchantId;
	}
	
	/**
	 * @param tradeMerchantId the tradeMerchantId to set
	 */
	public void setTradeMerchantId(String tradeMerchantId) {
		this.tradeMerchantId = tradeMerchantId;
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
	
	public String getChargeExtend() {
		return chargeExtend;
	}
	
	public void setChargeExtend(String chargeExtend) {
		this.chargeExtend = chargeExtend;
	}
}

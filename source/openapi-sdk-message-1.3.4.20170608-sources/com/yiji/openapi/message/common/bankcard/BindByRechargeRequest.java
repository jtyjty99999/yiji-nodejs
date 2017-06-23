/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-19 12:20 创建
 *
 */
package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "", type = ApiMessageType.Request)
public class BindByRechargeRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "需要查询的银行卡号")
	private String cardNo;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "持卡人姓名", constraint = "签约身份证姓名")
	private String cardName;
	
	@OpenApiField(desc = "证件类型", constraint = "证件类型")
	private String certType;
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "证件号", constraint = "对应证件类型的证件号")
	private String certNo;
	
	@OpenApiField(desc = "手机号")
	private String mobile;
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "充值金额")
	private Money amount;
	
	@OpenApiField(desc = "对公对私标志")
	private String publicTag;
	
	@NotBlank
	@OpenApiField(desc = "商户平台id")
	private String tradeMerchantId;
	
	@OpenApiField(desc = "冻结类型")
	private String freezeBalanceType;
	
	public String getCardNo() {
		return this.cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCardName() {
		return this.cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCertType() {
		return this.certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPublicTag() {
		return this.publicTag;
	}
	
	public void setPublicTag(String publicTag) {
		this.publicTag = publicTag;
	}
	
	public String getTradeMerchantId() {
		return this.tradeMerchantId;
	}
	
	public void setTradeMerchantId(String tradeMerchantId) {
		this.tradeMerchantId = tradeMerchantId;
	}
	
	public String getFreezeBalanceType() {
		return this.freezeBalanceType;
	}
	
	public void setFreezeBalanceType(String freezeBalanceType) {
		this.freezeBalanceType = freezeBalanceType;
	}
	
}

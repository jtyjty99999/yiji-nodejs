/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年8月11日 上午10:57:18 创建
 */
package com.yiji.openapi.message.common.deposit;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;
import com.yiji.openapi.sdk.exception.ApiServerException;

/**
 * 
 * @author mayansen
 * @date 20140904
 * 
 */
@OpenApiMessage(service = "ebankGatewayDeposit", type = ApiMessageType.Request)
public class EBankDepositGatewayRequest extends ApiRequest {
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户ID", demo = "20140814010000052219")
	private String userId;
	
	@Length(max = 50)
	@OpenApiField(desc = "用户名", demo = "易极付")
	private String userName;
	
	@NotNull
	@OpenApiField(desc = "充值金额", demo = "88.66")
	private Money amount;
	
	@OpenApiField(desc = "对公对私标志", demo = "B2B")
	private String publicTag;
	
	@OpenApiField(desc = "商户平台id", demo = "32165465")
	private String tradeMerchantId;
	
	@NotBlank
	@OpenApiField(desc = "银行代码", demo = "ABC")
	private String bankCode;
	
	@OpenApiField(desc = "minipay充值类型", demo = "minipay")
	private String spicalDepositType;
	

	public void check() throws ApiServerException {
		if (StringUtils.isBlank(userId) && StringUtils.isBlank(userName)) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "userId或userName 不能为空！");
		}
		
		if (StringUtils.isBlank(bankCode)) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "bankCode 不能为空！");
		}
		if (amount == null) {
			throw new ApiServerException(ApiServiceResultCode.PARAMETER_ERROR.getCode(), "amount 不能为空！");
		}
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
	 * @return the spicalDepositType
	 */
	public String getSpicalDepositType() {
		return spicalDepositType;
	}
	
	/**
	 * @param spicalDepositType the spicalDepositType to set
	 */
	public void setSpicalDepositType(String spicalDepositType) {
		this.spicalDepositType = spicalDepositType;
	}
	
}

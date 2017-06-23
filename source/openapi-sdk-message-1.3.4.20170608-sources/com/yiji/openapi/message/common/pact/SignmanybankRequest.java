/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-07 11:32 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "signmanybank", type = ApiMessageType.Request)
public class SignmanybankRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "用户ID",demo = "12345678901234567890")
	private String userId;
	
	@OpenApiField(desc = "银行简称",demo = "ABC")
	private String bankNo;
	
	@OpenApiField(desc = "银行卡号",demo = "123456789012345678")
	private String cardNo;
	
	@OpenApiField(desc = "目的", constraint = "DEDUCT：代扣，WITHDRAW：提现",demo = "DEDUCT")
	private String purpose;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBankNo() {
		return bankNo;
	}
	
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
}

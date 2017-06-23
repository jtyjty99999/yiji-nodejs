/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月19日 上午10:45:45 创建
 */
package com.yiji.openapi.message.common.pact;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "pactApply", type = ApiMessageType.Request)
public class PactApplyRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "会员号", constraint = "")
	private String userId;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "持卡人姓名", constraint = "")
	private String cardName;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "")
	private String cardNo;
	
	@NotBlank
	@OpenApiField(desc = "银行卡类型", constraint = "")
	private String cardType;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "证件号", constraint = "")
	private String certNo;
	
	@NotNull
	@OpenApiField(desc = "证件类型", constraint = "")
	private String certType;
	
	@Length(max = 20)
	@OpenApiField(desc = "电话号码", constraint = "有密签约，UPMP签约手机号为必填")
	private String userPhoneNo;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardName() {
		return this.cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public String getCardNo() {
		return this.cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertType() {
		return this.certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getUserPhoneNo() {
		return this.userPhoneNo;
	}
	
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
}

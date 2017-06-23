/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-24 11:41 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mobileAddBankCard", type = ApiMessageType.Request)
public class MobileAddBankCardRequest extends ApiRequest {
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户ID",demo="20150619010000072320")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "银行卡号",demo="6210 3000 1584 2596")
	private String bankAccountNo;
	
	@NotBlank
	@OpenApiField(desc = "手机号",demo="13500250698")
	private String mobileNo;
	
	@OpenApiField(desc = "cvv2",demo="660")
	private String cvv2;
	
	@OpenApiField(desc = "有效期",demo="20151016")
	private String validDate;

	@OpenApiField(desc = "外部用户ID",demo="20150619010000072320")
	private String partnerUserId;

	@OpenApiField(desc = "真实姓名",demo="大猫")
	private String realName;

	@OpenApiField(desc = "证件号",demo="5124125412512213")
	private String certNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getCvv2() {
		return cvv2;
	}
	
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	
	public String getValidDate() {
		return validDate;
	}
	
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public String getPartnerUserId() {
		return partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月3日 上午11:20:10 创建
 */
package com.yiji.openapi.message.common.bankcard;

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
@OpenApiMessage(service = "bankCardElementsCheck", type = ApiMessageType.Request)
public class BankCardElementsCheckRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "需要查询的银行卡号")
	private String cardNo;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "持卡人姓名", constraint = "签约身份证姓名")
	private String cardName;
	
	@NotNull
	@OpenApiField(desc = "证件类型", constraint = "证件类型")
	private String certType;
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "证件号", constraint = "对应证件类型的证件号")
	private String certNo;
	
	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型：信用卡/借记卡")
	private String cardType;
	
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
	
}

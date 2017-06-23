/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月1日 下午1:15:01 创建
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
 * @author zhike@yiji.com
 * @data 2015年12月1日
 */
@OpenApiMessage(service = "bankCardThreeElementsBinding", type = ApiMessageType.Request)
public class BankCardThreeElementsBindingRequest extends ApiRequest {

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "会员ID", constraint = "会员ID", demo = "20150817010007217971")
	private String userId;

	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "6210355519582573")
	private String cardNo;

	@NotNull
	@OpenApiField(desc = "签约用途", demo = "WITHDRAW")
	private String purpose;

	@OpenApiField(desc = "银行卡类型", constraint = "银行卡类型,默认值为DEBIT", demo = "DEBIT")
	private String cardType = "DEBIT";

	/** 用户证件号 */
	@OpenApiField(desc = "用户证件号",demo = "5214859635214585474")
	private String certNo;

	/** 用户证件类型 */
	@OpenApiField(desc = "用户证件类型",demo = "Identity_Card",constraint = "默认身份证")
	private String certType = "ID";

	/** 持卡人真实姓名 */
	@OpenApiField(desc = "持卡人真实姓名",demo = "张三")
	private String realName;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
}

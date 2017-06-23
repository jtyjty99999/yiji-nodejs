/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-09-01 14:03 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "commonApplySigning", type = ApiMessageType.Request)
public class CommonApplySigningRequest extends ApiRequest {

	/** 卡号 **/
	@NotBlank(message = "卡号不能为空")
	@OpenApiField(desc = "银行卡号",demo = "987445786547812")
	private String cardNo;

	/** 会员ID */
	@NotBlank(message = "用户ID不能为空")
	@OpenApiField(desc = "会员ID",demo = "123489654")
	private String userId;

	/** 签约目的 */
	@NotNull(message = "签约目的不能为空")
	@OpenApiField(desc = "签约目的",demo = "WITHDRAW")
	private String purpose;

	/** 手机号 */
	@NotBlank
	@OpenApiField(desc = "手机号",constraint = "银行预留手机号",demo = "10086100101")
	private String userPhoneNo;

	/** 安全索引 */
	@OpenApiField(desc = "安全索引",demo = "kt554")
	private String securityIndex;

	/** 用户证件号 */
	@OpenApiField(desc = "用户证件号",demo = "515465495845315697")
	private String certNo;

	/** 持卡人真实姓名 */
	@OpenApiField(desc = "持卡人真实姓名",demo = "易极付")
	private String cardName;

	/** 用户证件类型 */
	@OpenApiField(desc = "用户证件类型",demo = "Identity_Card")
	private String certType;

	/** 银行简称 **/
	@OpenApiField(desc = "银行简称",demo = "ICBC")
	private String bankCode;

	/** 卡类型 **/
	@OpenApiField(desc = "卡类型",demo = "DEBIT")
	private String cardType = "DEBIT";

	@OpenApiField(desc = "是否需要异步通知",constraint = "true:需要异步通知<br>false:不需要异步通知<br>默认有异步通知",demo = "true")
	private Boolean notify = true;

	@OpenApiField(desc = "是否需要发送短信",demo = "false",constraint = "true:自动发送短信<br>false:不自动发送短信<br>默认不发送")
	private Boolean sendMsg = false;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPhoneNo() {
		return userPhoneNo;
	}

	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	public String getSecurityIndex() {
		return securityIndex;
	}

	public void setSecurityIndex(String securityIndex) {
		this.securityIndex = securityIndex;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public Boolean getNotify() {
		return notify;
	}

	public void setNotify(Boolean notify) {
		this.notify = notify;
	}

	public Boolean getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(Boolean sendMsg) {
		this.sendMsg = sendMsg;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
}

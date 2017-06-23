/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-07 11:48 创建
 *
 */
package com.yiji.openapi.message.common.pact;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "signmanybank", type = ApiMessageType.Notify)
public class SignResultNotify extends ApiNotify {
	
	@OpenApiField(desc = "用户ID")
	private String userId;
	
	@OpenApiField(desc = "签约流水号")
	private String pactNo;
	
	@OpenApiField(desc = "银行卡号")
	private String cardNo;
	
	@OpenApiField(desc = "银行卡类型")
	private String cardType;
	
	@OpenApiField(desc = "卡片类型别名")
	private String cardTypeName;
	
	@OpenApiField(desc = "银行图片地址")
	private String bankGifUrl;
	
	@OpenApiField(desc = "银行简码",constraint = "例如 CCB 建行")
	private String bankCode;
	
	@OpenApiField(desc = "银行名称")
	private String bankName;
	
	@OpenApiField(desc = "签约状态")
	private String pactStatus;
	
	@OpenApiField(desc = "签约信息")
	private String message;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPactNo() {
		return pactNo;
	}
	
	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardTypeName() {
		return cardTypeName;
	}
	
	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}
	
	public String getBankGifUrl() {
		return bankGifUrl;
	}
	
	public void setBankGifUrl(String bankGifUrl) {
		this.bankGifUrl = bankGifUrl;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getPactStatus() {
		return pactStatus;
	}
	
	public void setPactStatus(String pactStatus) {
		this.pactStatus = pactStatus;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午5:02:52 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "verifyFacade", type = ApiMessageType.Request)
public class VerifyFacadeRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "帐号", demo = "6217003798730434617")
	private String accountNo;

	@NotBlank
	@OpenApiField(desc = "帐户名", demo = "张三")
	private String accountName;

	@NotBlank
	@OpenApiField(desc = "证件号", demo = "500225198711111133")
	private String certNo;

	@OpenApiField(desc = "银行简码", demo = "CCB")
	private String bankCode;

	/** 手机号 */
	@OpenApiField(desc = "手机号", demo = "13866668888")
	private String userPhoneNo;

	/** 证件类型 */
	@OpenApiField(desc = "证件类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"证件类型\"}",
			demo = "ID")
	private String certType;

	/** 卡类型 */
	@OpenApiField(desc = "卡类型", demo = "DEBIT")
	private String cardType;

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getUserPhoneNo() {
		return this.userPhoneNo;
	}

	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午6:20:16 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "yzzNewWithraw", type = ApiMessageType.Request)
public class YzzNewWithrawRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "易极付用户ID", demo = "20150519020005491913")
	private String userId;

	@NotBlank
	@OpenApiField(desc = "银行省名", demo = "重庆")
	private String bankProvName;

	@NotBlank
	@OpenApiField(desc = "银行市名", demo = "重庆")
	private String bankCityName;

	@NotBlank
	@OpenApiField(desc = "账号", demo = "6228999988887777666")
	private String bankAccountNo;

	@NotNull
	@OpenApiField(desc = "金额", demo = "1.11")
	private Money money;

	@OpenApiField(desc = "是否VIP", demo = "Y")
	private String vipTag;

	@NotBlank
	@OpenApiField(desc = "银行代码", demo = "CQRCB")
	private String bankCode;

	@NotBlank
	@OpenApiField(desc = "支付手续费方", constraint = "{\"data\":[\"U:用户\",\"P:平台商\"],\"name\":\"支付手续费方\"}", demo = "U")
	private String payMode;

	@OpenApiField(desc = "提现模式", constraint = "{\"data\":[\"0:T + 0\",\"1:T + 1\",\"3:T + 3\"],\"name\":\"提现模式\"}",
			demo = "0")
	private String delay;

	@OpenApiField(desc = "渠道所属来源", demo = "Default")
	private String owner;

	@OpenApiField(desc = "产品子集", demo = "mnsc")
	private String subOwner;

	@OpenApiField(desc = "业务请求者身份标识", demo = "MERCHANT")
	private String bizIdentity;

	@OpenApiField(desc = "业务号", demo = "026")
	private String bizNo;

	@OpenApiField(desc = "证件号", demo = "4400198711114411")
	private String certNo;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankProvName() {
		return this.bankProvName;
	}

	public void setBankProvName(String bankProvName) {
		this.bankProvName = bankProvName;
	}

	public String getBankCityName() {
		return this.bankCityName;
	}

	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public Money getMoney() {
		return this.money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public String getVipTag() {
		return this.vipTag;
	}

	public void setVipTag(String vipTag) {
		this.vipTag = vipTag;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getDelay() {
		return this.delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSubOwner() {
		return this.subOwner;
	}

	public void setSubOwner(String subOwner) {
		this.subOwner = subOwner;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getBizNo() {
		return this.bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}

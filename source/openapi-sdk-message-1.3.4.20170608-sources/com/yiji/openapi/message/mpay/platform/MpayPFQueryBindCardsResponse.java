/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:22 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.mpay.platform.info.BindCardDto;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFQueryBindCards", type = ApiMessageType.Response)
public class MpayPFQueryBindCardsResponse extends ApiResponse {
	/** 绑卡列表 */
	@OpenApiField(desc = "绑卡列表")
	private List<BindCardDto> cardList;
	
	/** 默认银行卡签约流水号 */
	@OpenApiField(desc = "默认银行卡签约流水号", demo = "12345687231")
	private String defaultPactNo;
	
	/** 真实姓名 */
	@OpenApiField(desc = "真实姓名", demo = "易极付")
	private String realName;
	
	/** 证件号码 */
	@OpenApiField(desc = "证件号码", demo = "1234567890123456789")
	private String certNo;
	
	/** 手机号码 */
	@OpenApiField(desc = "手机号码", demo = "100861001010")
	private String mobileNo;
	
	/**
	 * 易极付用户编号（绑卡成功后有值）
	 */
	@OpenApiField(desc = "易极付用户ID", demo = "12345678901234567890", constraint = "绑卡成功后有值")
	private String userId;
	
	/**
	 * 易极付用户名（绑卡成功后有值）
	 */
	@OpenApiField(desc = "易极付用户名", demo = "用户名", constraint = "绑卡成功后有值")
	private String userName;
	
	@OpenApiField(desc = "余额", demo = "66.66", constraint = "余额")
	private Money balance;
	
	@Length(max = 10)
	@OpenApiField(desc = "实名等级", demo = "3", constraint = "{\"data\":[\"0:未实名\",\"1:弱实名\",\"2:银行卡实名\",\"3:强实名\",\"5:增强实名\"],\"name\":\"实名等级\"}")
	private String certifyRank;
	
	@Length(max = 10)
	@OpenApiField(desc = "实名状态", demo = "A", constraint = "{\"data\":[\"U:未认证\",\"A:已认证\",\"I:认证中\",\"R:被驳回\",\"O:过期\"],\"name\":\"实名状态\"}")
	private String certifyStatus;
	
	@Length(max = 2)
	@OpenApiField(desc = "是否可用小额免密", demo = "0", constraint = "{\"data\":[\"1:是\",\"0:否\"],\"name\":\"是否开启小额免密支付\"}")
	private String pwdFlag;
	
	public Money getBalance() {
		return this.balance;
	}
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public String getCertifyRank() {
		return this.certifyRank;
	}
	
	public void setCertifyRank(String certifyRank) {
		this.certifyRank = certifyRank;
	}
	
	public String getCertifyStatus() {
		return this.certifyStatus;
	}
	
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	
	public String getPwdFlag() {
		return this.pwdFlag;
	}
	
	public void setPwdFlag(String pwdFlag) {
		this.pwdFlag = pwdFlag;
	}
	
	public List<BindCardDto> getCardList() {
		return cardList;
	}
	
	public void setCardList(List<BindCardDto> cardList) {
		this.cardList = cardList;
	}
	
	public String getDefaultPactNo() {
		return defaultPactNo;
	}
	
	public void setDefaultPactNo(String defaultPactNo) {
		this.defaultPactNo = defaultPactNo;
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
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}

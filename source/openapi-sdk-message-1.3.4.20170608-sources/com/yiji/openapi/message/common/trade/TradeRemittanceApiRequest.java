/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月4日 下午10:20:13 创建
 */
package com.yiji.openapi.message.common.trade;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "tradeRemittance", type = ApiMessageType.Request)
public class TradeRemittanceApiRequest extends ApiRequest {
	
	@OpenApiField(desc = "交易名称")
	@Size(max = 64)
	private String tradeName;
	
	@OpenApiField(desc = "购买者用户ID")
	@NotBlank
	private String userId;
	
	@OpenApiField(desc = "真实姓名")
	@NotBlank
	@Length(max = 128)
	private String realName;
	
	@OpenApiField(desc = "解冻码")
	private String freezeType;
	
	@NotNull
	@OpenApiField(desc = "交易金额")
	private Money tradeAmount;
	
	@OpenApiField(desc = "交易备注")
	@Length(max = 1024)
	private String tradeMemo;
	
	@OpenApiField(desc = "延迟处理时间", constraint = "延迟处理时间，以小时为单位;0表示立即报送")
	private int delayHours = 0;
	
	@OpenApiField(
			desc = "是否包含在本金中",
			constraint = "本案中，SELLER表示转出的易极付账户，BUYER代表转入的银行卡账户，当该参数为SELLER时表示收费将在本金中收取，即交易金额为1000元，收费为1元时，从用户的易极付账户中扣除1000元，到账将是999元，若为BUYER，则从易极付账户扣除1001元，到账为1000元。默认为BUYER")
	private String chargeFrom;
	
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "转到的银行卡号 ")
	private String bankAccountNo;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "银行账户开户名 ")
	private String bankAccountName;
	
	@Length(max = 256)
	@OpenApiField(desc = "开户行地址 ")
	private String bankAddress;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "开户银行省名  ")
	private String provName;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "开户银行城市名  ")
	private String cityName;
	
	@NotNull
	@OpenApiField(desc = "银行代码 ")
	private String bankCode;
	
	@NotNull
	@OpenApiField(desc = "商品信息 ", constraint = "易极付保存商户的交易信息，以便后续操作查看")
	private List<GoodsClause> goodsClauses;
	
	@OpenApiField(desc = "外部订单号 ")
	private String outOrderNo;
	
	@OpenApiField(desc = "对公对私标记 ")
	private String publicTag;
	
	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */

	public String toString() {
		return "TradeRemittanceApiRequest [tradeName=" + tradeName + ", userId=" + userId + ", realName=" + realName
				+ ", tradeAmount=" + tradeAmount + ", tradeMemo=" + tradeMemo + ", delayHours=" + delayHours
				+ ", chargeFrom=" + chargeFrom + ", bankAccountNo=" + bankAccountNo + ", bankAccountName="
				+ bankAccountName + ", bankAddress=" + bankAddress + ", provName=" + provName + ", cityName="
				+ cityName + ", bankCode=" + bankCode + ", goodsClauses=" + goodsClauses + ", outOrderNo=" + outOrderNo
				+ ", publicTag=" + publicTag + "]";
	}
	
	public String getTradeName() {
		return this.tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public Money getTradeAmount() {
		return this.tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getTradeMemo() {
		return this.tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public int getDelayHours() {
		return this.delayHours;
	}
	
	public void setDelayHours(int delayHours) {
		this.delayHours = delayHours;
	}
	
	public String getChargeFrom() {
		return this.chargeFrom;
	}
	
	public void setChargeFrom(String chargeFrom) {
		this.chargeFrom = chargeFrom;
	}
	
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getBankAccountName() {
		return this.bankAccountName;
	}
	
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	
	public String getBankAddress() {
		return this.bankAddress;
	}
	
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public String getProvName() {
		return this.provName;
	}
	
	public void setProvName(String provName) {
		this.provName = provName;
	}
	
	public String getCityName() {
		return this.cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getBankCode() {
		return this.bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public List<GoodsClause> getGoodsClauses() {
		return this.goodsClauses;
	}
	
	public void setGoodsClauses(List<GoodsClause> goodsClauses) {
		this.goodsClauses = goodsClauses;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getPublicTag() {
		return this.publicTag;
	}
	
	public void setPublicTag(String publicTag) {
		this.publicTag = publicTag;
	}
	
	public String getFreezeType() {
		return this.freezeType;
	}
	
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
	
}

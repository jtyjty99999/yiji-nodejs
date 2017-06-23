/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-19 09:45 创建
 *
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ewpay.info.GoodsList;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-19
 */
@OpenApiMessage(service = "qftSyncPosTrade", type = ApiMessageType.Request)
public class QftSyncPosTradeRequest extends ApiRequest {

	@OpenApiField(desc = "交易名称", constraint = "交易名称", demo = "购买基金")
	private String tradeName;

	@NotBlank
	@OpenApiField(desc = "Pos交易订单号", constraint = "Pos系统参考号", demo = "YYMMDD+00000001")
	private String posTradeOrderNo;

	@NotBlank
	@OpenApiField(desc = "pos商户号", constraint = "pos商户号", demo = "1234567981023")
	private String posMerchanId;

	@NotBlank
	@OpenApiField(desc = "pos终端号", constraint = "pos终端号", demo = "1234567891023")
	private String terminalId;

	@NotBlank
	@OpenApiField(desc = "pos交易传输时间", constraint = "yyyyMMddHHmmss", demo = "201604191006")
	private String posTradeTransferTime;

	@NotBlank
	@OpenApiField(desc = "pos交易状态", constraint = "{\"data\":[\"00：代表成功，其它失败\",\"01：消费冲正（中视在线项目专用）\"],\"name\":\"pos交易状态\" }", demo = "00")
	private String posTradeStatus;

	@NotBlank
	@OpenApiField(desc = "pos支付类型", constraint = "{\"data\":[\"03：刷卡\",\"04：消费撤销\"],\"name\":\"pos支付类型\"}", demo = "03")
	private String posPayType;

	@OpenApiField(desc = "POS终端归属", constraint = "{\"data\":[\"DISTRIBUTOR：经销商\",\"SUPPLIER：供应商\"],\"name\":\"POS终端归属\" }", demo = "SUPPLIER")
	private String posTerminalBelongs;

	@NotBlank
	@OpenApiField(desc = "交易渠道", constraint = "CASHIER_POS:POS收银台", demo = "CASHIER_POS")
	private String tradeChannel;

	@NotNull
	@OpenApiField(desc = "交易金额", constraint = "交易金额", demo = "500")
	private Money tradeMoney;

	@NotNull
	@OpenApiField(desc = "支付金额", constraint = "支付金额", demo = "500")
	private Money payMoney;

	@OpenApiField(desc = "红包金额", constraint = "红包金额", demo = "100")
	private Money redPacketMoney;

	@OpenApiField(desc = "交易备注", constraint = "交易备注", demo = "备注")
	private String memo;

	@NotBlank
	@OpenApiField(desc = "买家易极付id", constraint = "买家易极付id", demo = "132456798012345678")
	private String buyerYJFUserId;

	@OpenApiField(desc = "买家易极付账户名", constraint = "买家易极付账户名", demo = "易极付")
	private String buyerYJFName;

	@NotBlank
	@OpenApiField(desc = "买家外部会员ID", constraint = "买家外部会员ID", demo = "132456798012345678")
	private String buyerOutId;

	@OpenApiField(desc = "买家外部会员商家名称", constraint = "买家外部会员商家名称", demo = "易极付")
	private String buyerOutName;

	@NotBlank
	@OpenApiField(desc = "卖家易极付id", constraint = "卖家id", demo = "易极付")
	private String salerYJFUserId;

	@OpenApiField(desc = "卖家易极付账户名", constraint = "卖家易极付账户名", demo = "易极付")
	private String salerYJFName;

	@NotBlank
	@OpenApiField(desc = "卖家外部会员ID", constraint = "卖家外部会员ID", demo = "500237199008287628")
	private String salerOutId;

	@OpenApiField(desc = "卖家外部会员商家名称", constraint = "卖家外部会员商家名称", demo = "今日富")
	private String salerOutName;

	@OpenApiField(desc = "币种", constraint = "CNY:人民币", demo = "CNY")
	private String currency;

	@OpenApiField(desc = "来源", constraint = "{\"data\":[\"MOBILE:手机\",\"PC:PC\",\"SDK:SDK\"],\"name\":\"来源\"}", demo = "PC")
	private String origin;

	@NotNull
	@OpenApiField(desc = "关联商品", constraint = "关联商品", demo = "")
	private List<GoodsList> goodsList;

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getPosTradeOrderNo() {
		return posTradeOrderNo;
	}

	public void setPosTradeOrderNo(String posTradeOrderNo) {
		this.posTradeOrderNo = posTradeOrderNo;
	}

	public String getPosMerchanId() {
		return posMerchanId;
	}

	public void setPosMerchanId(String posMerchanId) {
		this.posMerchanId = posMerchanId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getPosTradeTransferTime() {
		return posTradeTransferTime;
	}

	public void setPosTradeTransferTime(String posTradeTransferTime) {
		this.posTradeTransferTime = posTradeTransferTime;
	}

	public String getPosTradeStatus() {
		return posTradeStatus;
	}

	public void setPosTradeStatus(String posTradeStatus) {
		this.posTradeStatus = posTradeStatus;
	}

	public String getPosPayType() {
		return posPayType;
	}

	public void setPosPayType(String posPayType) {
		this.posPayType = posPayType;
	}

	public String getPosTerminalBelongs() {
		return posTerminalBelongs;
	}

	public void setPosTerminalBelongs(String posTerminalBelongs) {
		this.posTerminalBelongs = posTerminalBelongs;
	}

	public String getTradeChannel() {
		return tradeChannel;
	}

	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public Money getTradeMoney() {
		return tradeMoney;
	}

	public void setTradeMoney(Money tradeMoney) {
		this.tradeMoney = tradeMoney;
	}

	public Money getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(Money payMoney) {
		this.payMoney = payMoney;
	}

	public Money getRedPacketMoney() {
		return redPacketMoney;
	}

	public void setRedPacketMoney(Money redPacketMoney) {
		this.redPacketMoney = redPacketMoney;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getBuyerYJFUserId() {
		return buyerYJFUserId;
	}

	public void setBuyerYJFUserId(String buyerYJFUserId) {
		this.buyerYJFUserId = buyerYJFUserId;
	}

	public String getBuyerYJFName() {
		return buyerYJFName;
	}

	public void setBuyerYJFName(String buyerYJFName) {
		this.buyerYJFName = buyerYJFName;
	}

	public String getBuyerOutId() {
		return buyerOutId;
	}

	public void setBuyerOutId(String buyerOutId) {
		this.buyerOutId = buyerOutId;
	}

	public String getBuyerOutName() {
		return buyerOutName;
	}

	public void setBuyerOutName(String buyerOutName) {
		this.buyerOutName = buyerOutName;
	}

	public String getSalerYJFName() {
		return salerYJFName;
	}

	public void setSalerYJFName(String salerYJFName) {
		this.salerYJFName = salerYJFName;
	}

	public String getSalerOutId() {
		return salerOutId;
	}

	public void setSalerOutId(String salerOutId) {
		this.salerOutId = salerOutId;
	}

	public String getSalerOutName() {
		return salerOutName;
	}

	public void setSalerOutName(String salerOutName) {
		this.salerOutName = salerOutName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public List<GoodsList> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsList> goodsList) {
		this.goodsList = goodsList;
	}

	public String getSalerYJFUserId() {
		return salerYJFUserId;
	}

	public void setSalerYJFUserId(String salerYJFUserId) {
		this.salerYJFUserId = salerYJFUserId;
	}
}

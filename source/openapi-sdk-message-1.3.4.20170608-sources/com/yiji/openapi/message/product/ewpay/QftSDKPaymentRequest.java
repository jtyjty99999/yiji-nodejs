/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 上午9:54:32 创建
 */
package com.yiji.openapi.message.product.ewpay;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.ewpay.info.GoodsOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "qftSDKPayment", type = ApiMessageType.Request)
public class QftSDKPaymentRequest extends ApiRequest {
	/** 外部软件商号 */
	@Length(max=50)
	@OpenApiField(desc = "外部软件商号" ,demo = "500237199008287628")
	private String outOrderPno;
	
	/** 外部付款单号 */
	@NotNull
	@Length(min = 1, max = 64)
	@OpenApiField(desc = "外部付款单号" ,demo = "500237199008287628")
	private String outOrderNo;
	
	/** 交易名称 */
	@Length(max = 64)
	@OpenApiField(desc = "交易名称" ,demo = "购买基金")
	private String outTradeTitle;
	
	/** 交易渠道 */
	@NotBlank
	@OpenApiField(desc = "交易渠道" ,demo = "GATEWAY")
	private String tradeChannel;
	
	/** 交易金额 */
	@NotNull
	@OpenApiField(desc = "交易金额" ,demo = "500")
	private Money money;
	
	/** 支付金额 */
	@NotNull
	@OpenApiField(desc = "支付金额" ,demo = "500")
	private Money moneyReal;
	
	/** 红包金额 */
	@OpenApiField(desc = "红包金额" ,demo = "100")
	private Money moneyGift;
	
	/** 交易备注 */
	@Length(max=64)
	@OpenApiField(desc = "交易备注" ,demo = "备注")
	private String memo;
	
	/** 买家外部会员ID */
	@Length(max=50)
	@OpenApiField(desc = "买家外部会员ID" ,demo = "132456798012345678")
	private String outPayerShopId;
	
	/** 买家id */
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id" ,demo = "132456798012345678")
	private String payerUserId;
	
	/** 买家外部会员姓名 */
	@Length(max=64)
	@OpenApiField(desc = "买家外部会员姓名" ,demo = "易极付")
	private String payerRealName;
	
	/** 买家外部会员商家名称 */
	@Length(max=256)
	@OpenApiField(desc = "买家外部会员商家名称" ,demo = "易极付")
	private String outPayerShopName;
	
	/** 卖家外部会员ID */
	@NotNull
	@Length(max=50)
	@OpenApiField(desc = "卖家外部会员ID" ,demo = "500237199008287628")
	private String outPayeeShopId;
	
	/** 卖家id */
	@NotNull
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家id" ,demo = "易极付")
	private String payeeUserId;
	
	/** 卖家外部会员姓名 */
	@Length(max=64)
	@OpenApiField(desc = "卖家外部会员姓名" ,demo = "易极付")
	private String payeeRealName;
	
	/** 币种 */
	@OpenApiField(desc = "币种" ,demo = "CNY")
	private String currency;
	
	/** 关联的goods */
	@NotNull
	@Size(min=0)
	@OpenApiField(desc = "关联的商品")
	private List<GoodsOrder> goodList;

	@OpenApiField(desc = "POS终端归属",demo = "DISTRIBUTOR")
	private String terminalBelongs;
	
	public String getOutOrderPno() {
		return this.outOrderPno;
	}
	
	public void setOutOrderPno(String outOrderPno) {
		this.outOrderPno = outOrderPno;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getOutTradeTitle() {
		return this.outTradeTitle;
	}
	
	public void setOutTradeTitle(String outTradeTitle) {
		this.outTradeTitle = outTradeTitle;
	}
	
	public String getTradeChannel() {
		return this.tradeChannel;
	}
	
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}
	
	public Money getMoney() {
		return this.money;
	}
	
	public void setMoney(Money money) {
		this.money = money;
	}
	
	public Money getMoneyReal() {
		return this.moneyReal;
	}
	
	public void setMoneyReal(Money moneyReal) {
		this.moneyReal = moneyReal;
	}
	
	public Money getMoneyGift() {
		return this.moneyGift;
	}
	
	public void setMoneyGift(Money moneyGift) {
		this.moneyGift = moneyGift;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getOutPayerShopId() {
		return this.outPayerShopId;
	}
	
	public void setOutPayerShopId(String outPayerShopId) {
		this.outPayerShopId = outPayerShopId;
	}
	
	public String getPayerUserId() {
		return this.payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayerRealName() {
		return this.payerRealName;
	}
	
	public void setPayerRealName(String payerRealName) {
		this.payerRealName = payerRealName;
	}
	
	public String getOutPayerShopName() {
		return this.outPayerShopName;
	}
	
	public void setOutPayerShopName(String outPayerShopName) {
		this.outPayerShopName = outPayerShopName;
	}
	
	public String getOutPayeeShopId() {
		return this.outPayeeShopId;
	}
	
	public void setOutPayeeShopId(String outPayeeShopId) {
		this.outPayeeShopId = outPayeeShopId;
	}
	
	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	
	public String getPayeeRealName() {
		return this.payeeRealName;
	}
	
	public void setPayeeRealName(String payeeRealName) {
		this.payeeRealName = payeeRealName;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public List<GoodsOrder> getGoodList() {
		return this.goodList;
	}
	
	public void setGoodList(List<GoodsOrder> goodList) {
		this.goodList = goodList;
	}

	public String getTerminalBelongs() {
		return terminalBelongs;
	}

	public void setTerminalBelongs(String terminalBelongs) {
		this.terminalBelongs = terminalBelongs;
	}
}

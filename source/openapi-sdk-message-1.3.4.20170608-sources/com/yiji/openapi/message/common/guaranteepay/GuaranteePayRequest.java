/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 下午2:19:25 创建
 */
package com.yiji.openapi.message.common.guaranteepay;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.guaranteepay.info.AdditionalFeeInfo;
import com.yiji.openapi.message.common.guaranteepay.info.GoodsInfo;
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
@OpenApiMessage(service = "guaranteePay", type = ApiMessageType.Request)
public class GuaranteePayRequest extends ApiRequest {
	
	@Length(max = 64)
	@OpenApiField(desc = "外部订单号", demo = "123654798")
	private String outOrderNo;
	
	@NotBlank
	@Size(max = 64)
	@OpenApiField(desc = "交易名称", constraint = "交易名称", demo = "交易")
	private String tradeName;
	
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "买家会员号", constraint = "买家会员号", demo = "20140814010000052219")
	private String buyerUserId;
	
	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "卖家会员号", constraint = "卖家会员号", demo = "20140814010000052219")
	private String sellerUserId;
	
	@NotNull
	@OpenApiField(desc = "交易额", constraint = "交易额(格式：保留2位小数的元)，交易额不包含物流费和保险费.", demo = "88.66")
	private Money tradeAmount;
	
	@Size(max = 8)
	@OpenApiField(desc = "请求类型",
			constraint = "请求类型表示商户请求支付的类型，目前支付两种请求类型。1: 同步跳转收银台（默认）2: 同步请求，表示请求支付后，易极付直接返回易极付交易号，然后商户调用对应的支付（暂不支持，预留）",
			demo = "1")
	private String requestType;
	
	@OpenApiField(desc = "币种", constraint = "可选参数为：CNY: 人民币(默认) USD: 美元 JPY:日元", demo = "CNY")
	private String currency;
	
	@OpenApiField(desc = "交易类型", constraint = "可选值：GOODS_BUY：商品购买 （默认）SERVICE_BUY：服务购买 MOBILE_PAY：手机支付",
			demo = "GOODS_BUY")
	private String gatheringType;
	
	@Size(max = 1024)
	@OpenApiField(desc = "交易备注", constraint = "交易备注", demo = "备注")
	private String tradeMemo;
	
	@OpenApiField(
			desc = "是否自动打款",
			constraint = "可选值：true: 自动付款（默认）false: 不自动付款 自动付款表示买家担保支付后，autoConfirmPayMinutes参数指定时间内，买家没有确定付款，则易极付自动付款给卖家，但也会受到额度的限制（交易金额在10000元以内才会生效）",
			demo = "true")
	private boolean autoConfirmPayFlag = true;
	
	@OpenApiField(desc = "自动付款时间", constraint = "卖家发货后的自动打款时间，单位分钟，默认为10天（交易金额在10000元以内才会生效，超过限额的交易不会自动打款）",
			demo = "2400")
	private Integer autoConfirmPayMinutes;
	
	@OpenApiField(desc = "自动关闭时间",
			constraint = "自动关闭交易时间,单位为分钟，创建交易后,没有完成担保支付，直接关闭收银台，该参数指定时间后，易极付自动关闭交易，默认为:4320(3天) ", demo = "4320")
	private Integer autoCloseTradeMinutes;
	
	@OpenApiField(desc = "二次分润", constraint = "二次分润(如邮费、税费、分润)，支持多条，单条的结构请参见下表：“additionalFees 结构定义”。")
	@Valid
	private List<AdditionalFeeInfo> additionalFees = new ArrayList<AdditionalFeeInfo>();
	
	@OpenApiField(desc = "商品列表", constraint = "商品列表。支持多条，单条结构请参考下表:” goods结构定义”")
	@Valid
	private List<GoodsInfo> goods = new ArrayList<GoodsInfo>();
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getRequestType() {
		return requestType;
	}
	
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getGatheringType() {
		return gatheringType;
	}
	
	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public boolean getAutoConfirmPayFlag() {
		return autoConfirmPayFlag;
	}
	
	public void setAutoConfirmPayFlag(boolean autoConfirmPayFlag) {
		this.autoConfirmPayFlag = autoConfirmPayFlag;
	}
	
	public Integer getAutoConfirmPayMinutes() {
		return autoConfirmPayMinutes;
	}
	
	public void setAutoConfirmPayMinutes(Integer autoConfirmPayMinutes) {
		this.autoConfirmPayMinutes = autoConfirmPayMinutes;
	}
	
	public Integer getAutoCloseTradeMinutes() {
		return autoCloseTradeMinutes;
	}
	
	public void setAutoCloseTradeMinutes(Integer autoCloseTradeMinutes) {
		this.autoCloseTradeMinutes = autoCloseTradeMinutes;
	}
	
	public List<AdditionalFeeInfo> getAdditionalFees() {
		return additionalFees;
	}
	
	public void setAdditionalFees(List<AdditionalFeeInfo> additionalFees) {
		this.additionalFees = additionalFees;
	}
	
	public List<GoodsInfo> getGoods() {
		return goods;
	}
	
	public void setGoods(List<GoodsInfo> goods) {
		this.goods = goods;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

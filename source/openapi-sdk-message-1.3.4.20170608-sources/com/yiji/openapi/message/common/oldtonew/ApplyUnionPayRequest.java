/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月14日 下午2:07:40 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月14日
 */
@OpenApiMessage(service = "applyUnionPay", type = ApiMessageType.Request)
public class ApplyUnionPayRequest extends ApiRequest {
	@OpenApiField(desc = "交易名称", demo = "xxx")
	private String tradeName;
	
	@NotNull
	@OpenApiField(desc = "业务产品编号", demo = "xxx")
	private String tradeBizProductCode;
	
	@NotNull
	@OpenApiField(desc = "交易子类型", constraint = "交易子类型", demo = "GOODS_BUY")
	private String gatheringType;
	
	@OpenApiField(desc = "买家会员号", demo = "213123213123213213")
	private String buyerUserId;
	
	@NotNull(message = "卖家不能为空")
	@OpenApiField(desc = "卖家会员号", demo = "231232131232132132")
	private String sellerUserId;
	
	@OpenApiField(desc = "币种", constraint = "币种,默认CNY", demo = "CNY")
	private String currency;
	
	@NotNull
	@OpenApiField(desc = "交易金额", constraint = "交易金额", demo = "120.00")
	private Money tradeAmount;
	
	@OpenApiField(desc = "买家备注", constraint = "买家备注", demo = "买家备注信息")
	private String buyerMarkerMemo;
	
	@OpenApiField(desc = "卖家备注", constraint = "卖家备注", demo = "卖家备注信息")
	private String sellerMarkerMemo;
	
	@OpenApiField(desc = "交易备注", constraint = "交易备注", demo = "交易备注信息")
	private String tradeMemo;
	
	@OpenApiField(desc = "字符编码", constraint = "字符编码", demo = "utf-8")
	private String inputCharset;
	
	public String getTradeName() {
		return this.tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getSellerUserId() {
		return this.sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public Money getTradeAmount() {
		return this.tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getBuyerMarkerMemo() {
		return this.buyerMarkerMemo;
	}
	
	public void setBuyerMarkerMemo(String buyerMarkerMemo) {
		this.buyerMarkerMemo = buyerMarkerMemo;
	}
	
	public String getSellerMarkerMemo() {
		return this.sellerMarkerMemo;
	}
	
	public void setSellerMarkerMemo(String sellerMarkerMemo) {
		this.sellerMarkerMemo = sellerMarkerMemo;
	}
	
	public String getTradeMemo() {
		return this.tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getInputCharset() {
		return this.inputCharset;
	}
	
	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
	}
	
	public String getGatheringType() {
		return this.gatheringType;
	}
	
	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}

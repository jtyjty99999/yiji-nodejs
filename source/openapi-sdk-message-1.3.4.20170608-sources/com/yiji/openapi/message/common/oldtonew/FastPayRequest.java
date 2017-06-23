/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:51:42 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.oldtonew.info.GoodsClauseInfo;
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
@OpenApiMessage(service = "fastpay", type = ApiMessageType.Request)
public class FastPayRequest extends ApiRequest {

	@Length(max = 64)
	@OpenApiField(desc = "交易名称", demo = "交易名称")
	private String tradeName;

	@NotBlank
	@OpenApiField(desc = "业务产品编号", demo = "20130220_YJF")
	private String tradeBizProductCode;

	@NotNull
	@OpenApiField(desc = "交易子类型", demo = "GOODS_BUY")
	private String gatheringType;

	@Length(min = 20, max = 20)
	@OpenApiField(desc = "买家ID", demo = "20150519020005491913")
	private String buyerUserId;

	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "卖家ID", demo = "20150519020005491913")
	private String sellerUserId;

	@OpenApiField(desc = "币种", demo = "CNY")
	private String currency;

	@OpenApiField(desc = "交易金额", demo = "1.11")
	private Money tradeAmount;

	@Length(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "交易备注")
	private String tradeMemo;

	@Length(max = 10, min = 1)
	@OpenApiField(desc = "字符集", demo = "utf-8")
	private String inputCharset = "utf-8";

	@Length(max = 128, min = 1)
	@OpenApiField(desc = "买家备注", demo = "买家备注")
	private String buyerMarkerMemo;

	@Length(max = 128, min = 1)
	@OpenApiField(desc = "卖家备注", demo = "卖家备注")
	private String sellerMarkerMemo;

	@Valid
	@OpenApiField(desc = "商品详情", demo = "商品详情")
	private List<GoodsClauseInfo> goodsClauseInfo;

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

	public String getGatheringType() {
		return this.gatheringType;
	}

	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
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

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getInputCharset() {
		return this.inputCharset;
	}

	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
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

	public List<GoodsClauseInfo> getGoodsClauseInfo() {
		return this.goodsClauseInfo;
	}

	public void setGoodsClauseInfo(List<GoodsClauseInfo> goodsClauseInfo) {
		this.goodsClauseInfo = goodsClauseInfo;
	}

}

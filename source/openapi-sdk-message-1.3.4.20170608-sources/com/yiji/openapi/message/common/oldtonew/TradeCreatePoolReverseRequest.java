/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-01 14:42 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/1
 */
@Deprecated
@OpenApiMessage(service = "tradeCreatePoolReverse", type = ApiMessageType.Request)
public class TradeCreatePoolReverseRequest extends ApiRequest {
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人会员号", constraint = "付款人会员号", demo = "20130812020055285248")
	private String payerUserId;
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "买家会员号", constraint = "买家会员号", demo = "20130812020055285248")
	private String buyerUserId;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家会员号", constraint = "卖家会员号", demo = "20130812020055285248")
	private String sellerUserId;
	
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "20130812020055285248")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易名称", constraint = "交易名称", demo = "20130812020055285248")
	private String tradeName;
	
	@OpenApiField(desc = "买家备注", constraint = "", demo = "20130812020055285248")
	private String buyerMarkerMemo;
	
	@OpenApiField(desc = "卖家备注", constraint = "", demo = "20130812020055285248")
	private String sellerMarkerMemo;
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "父交易号", constraint = "父交易号", demo = "20130812020055285248")
	private String parentNo;
	
	@NotBlank
	@OpenApiField(
			desc = "流程产品",
			constraint = "{\"data\":[\"bankcard_to_bankcard:卡到卡\",\"commonEscowTrade:通用担保交易\",\"deductDepoisital:代扣充值\",\"deductTransferWithdraw:代扣转账提现交易\",\"escowTrade:担保交易\",\"fastpay:即时到账\",\"fastpayRefund:即时到账有退款\",\"freezeEscow:冻结担保\",\"freeze_escow_with_sub_trade:有子交易的冻结担保\",\"pool:流标集资\",\"poolReverse:集资的还款\",\"poolTogether:给力集资\",\"remittance:汇付\",\"remittanceV2:汇付二期\",\"transfer:站内转帐\",\"transfer_to_bankcard_v2:转账到卡\",\"transfertobankcard:转账到卡\"],\"name\":\"流程产品\"}",
			demo = "transfertobankcard")
	private String product;
	
	@NotBlank
	@OpenApiField(
			desc = "交易类型",
			constraint = "{\"data\":[\"ESCROWTRADE:担保交易\",\"FASTPAYTRADE:即时到账交易\",\"POOL:集资借款\",\"POOL_REVERSE:集资还款\",\"POOL_TOGETHER:给力式集资\",\"transferTobank:转账到卡\",\"bankcardTransfer:卡到卡\",\"deductDepoisital:代扣充值\",\"transfer:站内转帐\",\"BEHALF_DEPOISIT:代充\",\"OTHER:其他\"],\"name\":\"交易类型\"}",
			demo = "OTHER")
	private String tradeType;
	
	@NotNull
	@OpenApiField(desc = "交易子类型", constraint = "", demo = "GOODS_BUY")
	private String gatheringType;
	
	@NotNull
	@OpenApiField(desc = "交易金额", constraint = "", demo = "20130812020055285248")
	private Money tradeAmount;
	
	@OpenApiField(desc = "币种", constraint = "币种", demo = "RMB")
	private String currency;
	
	@OpenApiField(desc = "交易号", constraint = "交易号", demo = "20130812020055285248")
	private String tradeNo;
	
	@NotBlank
	@OpenApiField(desc = "交易备注", constraint = "交易备注", demo = "购买化肥农药")
	private String tradeMemo;
	
	@OpenApiField(desc = "商品列表", constraint = "商品列表", demo = "电吹风,风扇")
	private List<GoodsClause> goods;
	
	/** 商品的外部ID */
	@Length(max = 32)
	@OpenApiField(desc = "商品的外部ID", demo = "1235646")
	private String outId;
	
	/** 商品名称 */
	@Length(max = 256, min = 1)
	@OpenApiField(desc = "商品名称", demo = "笔记本电脑")
	private String name;
	
	/** 商品详情 */
	@Length(max = 512)
	@OpenApiField(desc = "商品详情", demo = "笔记本电脑")
	private String memo;
	
	/** 商品单价 */
	@OpenApiField(desc = "商品单价", demo = "88.66")
	private Money price = Money.zero();
	
	/** 商品数量 */
	@OpenApiField(desc = "商品数量", demo = "10")
	private int quantity;
	
	/** 商品其它费用 */
	@OpenApiField(desc = "商品其它费用", demo = "88.66")
	private Money otherFee = Money.zero();
	
	/** 商品单位 */
	@Length(max = 8)
	@OpenApiField(desc = "商品单位", demo = "台")
	private String unit;
	
	/** 商品描述网址 */
	@Length(max = 256)
	@OpenApiField(desc = "商品描述网址", demo = "http://www.yiji.com/")
	private String detailUrl;
	
	/** 商品来源网址 */
	@Length(max = 256)
	@OpenApiField(desc = "商品来源网址", demo = "http://www.yiji.com/")
	private String referUrl;
	
	/** 商品类目 */
	@Length(max = 16)
	@OpenApiField(desc = "商品类目", demo = "计算机")
	private String category;
	
	public String getPayerUserId() {
		return payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
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
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getBuyerMarkerMemo() {
		return buyerMarkerMemo;
	}
	
	public void setBuyerMarkerMemo(String buyerMarkerMemo) {
		this.buyerMarkerMemo = buyerMarkerMemo;
	}
	
	public String getSellerMarkerMemo() {
		return sellerMarkerMemo;
	}
	
	public void setSellerMarkerMemo(String sellerMarkerMemo) {
		this.sellerMarkerMemo = sellerMarkerMemo;
	}
	
	public String getParentNo() {
		return parentNo;
	}
	
	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getTradeType() {
		return tradeType;
	}
	
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getGatheringType() {
		return gatheringType;
	}
	
	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public List<GoodsClause> getGoods() {
		return goods;
	}
	
	public void setGoods(List<GoodsClause> goods) {
		this.goods = goods;
	}
	
	public String getOutId() {
		return outId;
	}
	
	public void setOutId(String outId) {
		this.outId = outId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Money getPrice() {
		return price;
	}
	
	public void setPrice(Money price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Money getOtherFee() {
		return otherFee;
	}
	
	public void setOtherFee(Money otherFee) {
		this.otherFee = otherFee;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public String getDetailUrl() {
		return detailUrl;
	}
	
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	
	public String getReferUrl() {
		return referUrl;
	}
	
	public void setReferUrl(String referUrl) {
		this.referUrl = referUrl;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
}

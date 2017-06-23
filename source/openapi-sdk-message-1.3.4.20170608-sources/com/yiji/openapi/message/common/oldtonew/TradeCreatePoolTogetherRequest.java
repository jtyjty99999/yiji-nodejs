/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午11:28:03 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
@Deprecated
@OpenApiMessage(service = "tradeCreatePoolTogether", type = ApiMessageType.Request)
public class TradeCreatePoolTogetherRequest extends ApiRequest {

	@Valid
	@OpenApiField(desc = "商品条目", demo = "")
	private List<GoodsClauseInfo> goods;

	@Size(max = 20, min = 20)
	@OpenApiField(desc = "付款人会员号", demo = "20150519020005491913")
	private String payerUserId;

	@Size(min = 1, max = 64)
	@OpenApiField(desc = "订单号", demo = "2016012500000040")
	private String outOrderNo;

	@OpenApiField(desc = "外部交易号", demo = "2016012500000040")
	private String tradeOutBizNo;

	@Size(max = 64)
	@OpenApiField(desc = "交易名称", demo = "借款生成交易单据")
	private String tradeName;

	@Size(max = 20, min = 20)
	@OpenApiField(desc = "买家会员号", demo = "20150519020005491913")
	private String buyerUserId;

	@NotBlank
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "卖家会员号", demo = "20150519020005491913")
	private String sellerUserId;

	@Size(max = 128, min = 1)
	@OpenApiField(desc = "买家备注", demo = "买家备注")
	private String buyerMarkerMemo;

	@Size(max = 128, min = 1)
	@OpenApiField(desc = "卖家备注", demo = "卖家备注")
	private String sellerMarkerMemo;

	@OpenApiField(desc = "业务产品编号", demo = "0216")
	private String tradeBizProductCode;

	@Size(max = 20, min = 20)
	@OpenApiField(desc = "父交易号", demo = "20160519020005491913")
	private String parentNo;

	// FIXME 方林/看下这个字段/日志里传的POOL_TOGETHER这个玩意儿/能取到值？？？
	@OpenApiField(desc = "流程产品枚举", demo = "poolTogether")
	private String product;

	@NotBlank
	@OpenApiField(desc = "交易类型", demo = "POOL_TOGETHER")
	private String tradeType;

	@NotNull
	@OpenApiField(desc = "交易子类型", demo = "SERVICE_BUY")
	private String gatheringType;

	@OpenApiField(desc = "交易额", demo = "1.11")
	private Money tradeAmount;

	@OpenApiField(desc = "币种,默认为人民币", demo = "CNY")
	private String currency;

	@OpenApiField(desc = "交易号", demo = "20160125000046400410")
	private String tradeNo;

	@Size(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "交易备注")
	private String tradeMemo;

	@Size(max = 10, min = 1)
	@OpenApiField(desc = "字符编码,默认为utf-8", demo = "utf-8")
	private String inputCharset = "utf-8";

	/**
	 * 商品信息字段
	 */

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
		return this.payerUserId;
	}

	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
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

	public String getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}

	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}

	public String getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getGatheringType() {
		return this.gatheringType;
	}

	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}

	public Money getTradeAmount() {
		return this.tradeAmount;
	}

	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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

	public List<GoodsClauseInfo> getGoods() {
		return this.goods;
	}

	public void setGoods(List<GoodsClauseInfo> goods) {
		this.goods = goods;
	}

	public String getTradeOutBizNo() {
		return this.tradeOutBizNo;
	}

	public void setTradeOutBizNo(String tradeOutBizNo) {
		this.tradeOutBizNo = tradeOutBizNo;
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Money getPrice() {
		return this.price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Money getOtherFee() {
		return this.otherFee;
	}

	public void setOtherFee(Money otherFee) {
		this.otherFee = otherFee;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getReferUrl() {
		return this.referUrl;
	}

	public void setReferUrl(String referUrl) {
		this.referUrl = referUrl;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}

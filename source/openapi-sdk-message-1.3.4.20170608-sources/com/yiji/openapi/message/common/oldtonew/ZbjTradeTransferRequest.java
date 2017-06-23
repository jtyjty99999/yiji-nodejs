/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:06:34 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.common.oldtonew.enums.ZbjTradeBizProductEnum;
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
@OpenApiMessage(service = "zbjTradeTransfer", type = ApiMessageType.Request)
public class ZbjTradeTransferRequest extends ApiRequest {

	@OpenApiField(desc = "转账行为", demo = "NORMAL")
	private String transferAction;

	@OpenApiField(desc = "解冻金额", demo = "1.11")
	private Money unfreezeAmount;

	@OpenApiField(desc = "冻结金额", demo = "1.11")
	private Money freezeAmount;

	@OpenApiField(desc = "订单号", demo = "DT2016021500003888")
	private String outBizNo;

	@Length(max = 64)
	@OpenApiField(desc = "交易名称", demo = "交易名称")
	private String tradeName;

	@Length(min = 20, max = 20)
	@OpenApiField(desc = "卖家会员号", demo = "20150519020005491913")
	private String sellerUserId;

	@Length(max = 128)
	@OpenApiField(desc = "买家备注", demo = "买家备注")
	private String buyerMarkerMemo;

	@Length(max = 128)
	@OpenApiField(desc = "卖家备注", demo = "卖家备注")
	private String sellerMarkerMemo;

	@NotNull
	@OpenApiField(desc = "业务产品编号", demo = "123456")
	private ZbjTradeBizProductEnum tradeBizProductCode;

	@Length(min = 20, max = 20)
	@OpenApiField(desc = "父交易号", demo = "20150519020005491913")
	private String parentNo;

	@OpenApiField(desc = "交易额", demo = "1.11")
	private Money tradeAmount;

	@OpenApiField(desc = "币种（默认人民币）", demo = "CNY")
	private String currency;

	@OpenApiField(desc = "交易号", demo = "593112541399556297")
	private String tradeNo;

	@Length(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "交易备注")
	private String tradeMemo;

	@OpenApiField(desc = "解冻类型", demo = "SYSTEM_FREEZE")
	private String unFreezeType;

	@OpenApiField(desc = "冻结类型", demo = "SYSTEM_FREEZE")
	private String freezeType;

	@Valid
	@OpenApiField(desc = "商品条款", demo = "")
	private List<GoodsClauseInfo> zbjGoods;

	@Valid
	@OpenApiField(desc = "商品条款", demo = "")
	private List<GoodsClauseInfo> goods;

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

	public String getTransferAction() {
		return this.transferAction;
	}

	public void setTransferAction(String transferAction) {
		this.transferAction = transferAction;
	}

	public Money getUnfreezeAmount() {
		return this.unfreezeAmount;
	}

	public void setUnfreezeAmount(Money unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}

	public Money getFreezeAmount() {
		return this.freezeAmount;
	}

	public void setFreezeAmount(Money freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
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

	public ZbjTradeBizProductEnum getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}

	public void setTradeBizProductCode(ZbjTradeBizProductEnum tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}

	public String getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
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

	public String getUnFreezeType() {
		return this.unFreezeType;
	}

	public void setUnFreezeType(String unFreezeType) {
		this.unFreezeType = unFreezeType;
	}

	public String getFreezeType() {
		return this.freezeType;
	}

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

	public List<GoodsClauseInfo> getZbjGoods() {
		return this.zbjGoods;
	}

	public void setZbjGoods(List<GoodsClauseInfo> zbjGoods) {
		this.zbjGoods = zbjGoods;
	}

	public List<GoodsClauseInfo> getGoods() {
		return this.goods;
	}

	public void setGoods(List<GoodsClauseInfo> goods) {
		this.goods = goods;
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

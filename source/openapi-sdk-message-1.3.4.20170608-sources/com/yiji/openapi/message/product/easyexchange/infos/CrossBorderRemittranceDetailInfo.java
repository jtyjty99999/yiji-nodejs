/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年8月9日 下午3:49:22 创建
 */
package com.yiji.openapi.message.product.easyexchange.infos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2016年8月9日
 */

public class CrossBorderRemittranceDetailInfo {

	/** -------业务选择参数------ */
	/** 贸易类型，参考String.GOODS_TRADE 和 SERVICES_TRADE */
	@NotBlank
	private String tradeType;
	/** 交易编码 122030-未纳入海关统计的网络购物 */
	@NotBlank
	private String tradeCode = "122030";

	/** 唯一序列号 */
	@NotBlank
	private String detailOrderSerialNo ;
	/** 明细金额 */
	@NotNull
	private Money detailOrderAmount ;
	/** 明细币种 */
	@NotBlank
	private String detailOrderCurrency ;
	/** 是否为保税货物项下付款 （Y or N）*/
	@NotBlank
	private String verificationFlag = "Y";
	
	/** 买家真实名称 */
	private String buyerRealName;
	
	/** 买家身份证号*/
	private String buyerIDNumber;
	
	/** 物流信息 */
	@Valid
	@NotNull
	private LogisticInfo logisticInfo;
	
	/** 商品信息 */
	@Valid
	@NotNull
	private GoodsClause goodsClause;

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getDetailOrderSerialNo() {
		return detailOrderSerialNo;
	}

	public void setDetailOrderSerialNo(String detailOrderSerialNo) {
		this.detailOrderSerialNo = detailOrderSerialNo;
	}

	public Money getDetailOrderAmount() {
		return detailOrderAmount;
	}

	public String getBuyerRealName() {
		return buyerRealName;
	}

	public void setBuyerRealName(String buyerRealName) {
		this.buyerRealName = buyerRealName;
	}

	public String getBuyerIDNumber() {
		return buyerIDNumber;
	}

	public void setBuyerIDNumber(String buyerIDNumber) {
		this.buyerIDNumber = buyerIDNumber;
	}

	public void setDetailOrderAmount(Money detailOrderAmount) {
		this.detailOrderAmount = detailOrderAmount;
	}

	public String getDetailOrderCurrency() {
		return detailOrderCurrency;
	}

	public void setDetailOrderCurrency(String detailOrderCurrency) {
		this.detailOrderCurrency = detailOrderCurrency;
	}

	public String getVerificationFlag() {
		return verificationFlag;
	}

	public void setVerificationFlag(String verificationFlag) {
		this.verificationFlag = verificationFlag;
	}

	public LogisticInfo getLogisticInfo() {
		return logisticInfo;
	}

	public void setLogisticInfo(LogisticInfo logisticInfo) {
		this.logisticInfo = logisticInfo;
	}

	public GoodsClause getGoodsClause() {
		return goodsClause;
	}

	public void setGoodsClause(GoodsClause goodsClause) {
		this.goodsClause = goodsClause;
	}
}

    
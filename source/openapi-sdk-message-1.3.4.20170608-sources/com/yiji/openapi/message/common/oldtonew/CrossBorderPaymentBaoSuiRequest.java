/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 上午10:22:50 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.oldtonew.info.GoodsClauseInfo;
import com.yiji.openapi.message.common.oldtonew.info.StudyInfoApi;
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
@OpenApiMessage(service = "crossBorderPaymentBaoSui", type = ApiMessageType.Request)
public class CrossBorderPaymentBaoSuiRequest extends ApiRequest {

	/** 外部商户订单号 */
	@NotBlank
	@Size(min = 1, max = 64)
	@OpenApiField(desc = "外部商户订单号", demo = "1601260206871906")
	private String outBizNo;

	/** 交易名称 */
	@NotBlank
	@Size(max = 64)
	@OpenApiField(desc = "交易名称", demo = "交易名称")
	private String tradeName;

	@OpenApiField(desc = "业务产品编号", demo = "626")
	private String tradeBizProductCode;

	/** 买家 */
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "买家用户ID", demo = "20150807300007032321")
	private String buyerUserId;

	/** 卖家 */
	@Size(max = 20, min = 20)
	@OpenApiField(desc = "卖家用户ID", demo = "20150807300007032321")
	private String sellerUserId;

	/** 币种（默认人民币） */
	@OpenApiField(desc = "币种（默认人民币）", demo = "CNY")
	private String currency;

	/** 交易额 */
	@OpenApiField(desc = "交易额", demo = "1.11")
	private Money tradeAmount = Money.zero();

	/** 附加费金额 */
	@OpenApiField(desc = "物流费", demo = "1.11")
	private Money logistics = Money.zero();

	/** 附加费金额 */
	@OpenApiField(desc = "税费", demo = "1.11")
	private Money tax = Money.zero();

	/** 交易备注 */
	@Size(max = 1024)
	@OpenApiField(desc = "交易备注", demo = "交易备注")
	private String tradeMemo;

	/** 字符编码,默认为utf-8 */
	@Size(max = 10, min = 1)
	@OpenApiField(desc = "字符编码", demo = "utf-8",constraint = "默认为utf-8")
	private String inputCharset = "utf-8";

	/** 买家备注 */
	@Size(max = 128, min = 1)
	@OpenApiField(desc = "买家备注", demo = "买家备注")
	private String buyerMarkerMemo;

	/** 卖家备注 */
	@Size(max = 128, min = 1)
	@OpenApiField(desc = "卖家备注", demo = "卖家备注")
	private String sellerMarkerMemo;

	@Valid
	@OpenApiField(desc = "商品条款", demo = "xxx")
	private List<GoodsClauseInfo> goodsClauses;

	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "商品类目", demo = "食品")
	private String category;

	@OpenApiField(desc = "留学凭证信息", demo = "凭证信息")
	private StudyInfoApi studyInfoApi;

	public StudyInfoApi getStudyInfoApi() {
		return studyInfoApi;
	}

	public void setStudyInfoApi(StudyInfoApi studyInfoApi) {
		this.studyInfoApi = studyInfoApi;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public Money getLogistics() {
		return this.logistics;
	}

	public void setLogistics(Money logistics) {
		this.logistics = logistics;
	}

	public Money getTax() {
		return this.tax;
	}

	public void setTax(Money tax) {
		this.tax = tax;
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

	public List<GoodsClauseInfo> getGoodsClauses() {
		return this.goodsClauses;
	}

	public void setGoodsClauses(List<GoodsClauseInfo> goodsClauses) {
		this.goodsClauses = goodsClauses;
	}
}

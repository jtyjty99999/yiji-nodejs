package com.yiji.openapi.message.mpay.trade;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.message.common.trade.info.ProfitClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 创建交易订单 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "createTradeOrder", type = ApiMessageType.Request)
public class CreateTradeOrderApiRequest extends ApiRequest {
	
	/** 交易额 */
	@OpenApiField(desc = "交易额", demo = "88.66")
	@NotNull
	private Money tradeAmount;
	
	/** 交易名称 */
	@Length(max = 64)
	@OpenApiField(desc = "交易名称", demo = "交易")
	@NotBlank
	private String tradeName;
	
	/** 买家 */
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id", demo = "20140909010000052206")
	private String buyerUserId;
	
	@Length(max = 64)
	@OpenApiField(desc = "外部会员id", demo = "20140909010000052206")
	private String partnerUserId;
	
	/** 卖家 */
	@Length(max = 20, min = 20)
	@NotBlank
	@OpenApiField(desc = "卖家id", demo = "20140909010000052206")
	private String sellerUserId;
	
	/** 平台商会员号 */
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "平台商会员号", demo = "20140909010000052206")
	private String merchantUserId;
	
	/** 商品条款 */
	@OpenApiField(desc = "商品条款")
	private List<GoodsClause> goodsClauses = new ArrayList<GoodsClause>();
	
	/** 币种（默认人民币） */
	@OpenApiField(desc = "币种", demo = "CNY")
	private String currency;
	
	/**
	 * 备注
	 */
	@OpenApiField(desc = "备注", demo = "备注")
	private String tradeMemo;
	
	/**
	 * 外汇订单标示
	 */
	@OpenApiField(desc = "外汇订单标示", demo = "1")
	private String kjTrade;
	
	@OpenApiField(desc = "商品明细", demo = "商品明细")
	private String goods;
	
	@OpenApiField(desc = "分润金额", demo = "88.66")
	private String incidentalFee;
	
	@OpenApiField(desc = "请求类型", demo = "2")
	private String requestType;
	
	@OpenApiField(desc = "订单类型", demo = "1")
	private String orderType = "1";
	
	@Length(min = 1, max = 60)
	@OpenApiField(desc = "外部订单号", constraint = "商户传入的外部订单号", demo = "20141229020000062199")
	private String outOrderNo;
	
	/** 附带费用(如邮费、税费) */
	@OpenApiField(desc = "分润列表")
	private List<ProfitClause> subTrade;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	public String getRequestType() {
		return requestType;
	}
	
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	public String getGoods() {
		return goods;
	}
	
	public void setGoods(String goods) {
		this.goods = goods;
	}
	
	public String getIncidentalFee() {
		return incidentalFee;
	}
	
	public void setIncidentalFee(String incidentalFee) {
		this.incidentalFee = incidentalFee;
	}
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
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
	
	public String getPartnerUserId() {
		return partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public List<GoodsClause> getGoodsClauses() {
		return goodsClauses;
	}
	
	public void setGoodsClauses(List<GoodsClause> goodsClauses) {
		this.goodsClauses = goodsClauses;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getKjTrade() {
		return kjTrade;
	}
	
	public void setKjTrade(String kjTrade) {
		this.kjTrade = kjTrade;
	}
	
	
	public List<ProfitClause> getSubTrade() {
		return subTrade;
	}
	
	public void setSubTrade(List<ProfitClause> subTrade) {
		this.subTrade = subTrade;
	}
}

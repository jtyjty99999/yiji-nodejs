package com.yiji.openapi.message.common.cashier.info;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

public class ProdDetailInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "订单号",demo = "3216542165810")
	private String outOrderNo;
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "交易名称",demo = "交易")
	private String tradeName;
	
	@NotNull
	@OpenApiField(desc = "交易金额",demo = "88.66")
	private Money tradeAmount;
	
	@NotNull
	@Size(min = 1)
	@OpenApiField(desc = "商品条款")
	private List<GoodsClause> goodsClauses;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家",demo = "20140814010000052219")
	private String sellerUserId;
	
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
	
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public List<GoodsClause> getGoodsClauses() {
		return goodsClauses;
	}
	
	public void setGoodsClauses(List<GoodsClause> goodsClauses) {
		this.goodsClauses = goodsClauses;
	}
	
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
}
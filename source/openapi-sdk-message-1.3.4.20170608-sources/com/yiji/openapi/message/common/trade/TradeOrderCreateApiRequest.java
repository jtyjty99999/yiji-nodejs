package com.yiji.openapi.message.common.trade;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.trade.info.ExtInfoClause;
import com.yiji.openapi.message.common.trade.info.GoodsClause;
import com.yiji.openapi.message.common.trade.info.IncidentalFeeClause;
import com.yiji.openapi.message.common.trade.info.ProfitClause;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "tradeOrderCreate", type = ApiMessageType.Request)
public class TradeOrderCreateApiRequest extends ApiRequest {
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人id",demo = "20140809010000051239")
	private String payerUserId;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人卡号",demo = "1234567980123465978")
	private String payerCardNo;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家卡号",demo = "123456987123456789")
	protected String buyerCardNo;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id",demo = "20140809010000051239")
	protected String buyerUserId;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家卡号",demo = "123645798123456")
	private String sellerCardNo;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家id",demo = "20140809010000051239")
	private String sellerUserId;
	
	/** 交易额 */
	@OpenApiField(desc = "交易额",demo = "88.66")
	private Money tradeAmount = Money.zero();
	
	/** 交易名称 */
	@Size(max = 64)
	@OpenApiField(desc = "交易名称",demo = "交易")
	private String tradeName;
	
	@Length(max = 1024)
	@OpenApiField(desc = "交易备注",demo = "交易")
	protected String tradeMemo;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号",demo = "1236459780134568")
	private String outOrderNo;
	
	@NotEmpty
	@Valid
	@OpenApiField(desc = "商品条款")
	private List<GoodsClause> goodsClauses = new ArrayList<GoodsClause>();
	
	@OpenApiField(desc = "扩展信息")
	@Valid
	private ExtInfoClause extInfoClause = new ExtInfoClause();
	
	@Size(max = 10)
	@Valid
	@OpenApiField(desc = "分润项")
	private List<ProfitClause> profitClauses = new ArrayList<ProfitClause>();
	
	@Size(max = 10)
	@Valid
	@OpenApiField(desc = "附带费用")
	private List<IncidentalFeeClause> incidentalFeeClauses = new ArrayList<IncidentalFeeClause>();
	
	public String getPayerUserId() {
		return this.payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayerCardNo() {
		return this.payerCardNo;
	}
	
	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}
	
	public String getBuyerCardNo() {
		return this.buyerCardNo;
	}
	
	public void setBuyerCardNo(String buyerCardNo) {
		this.buyerCardNo = buyerCardNo;
	}
	
	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	public String getSellerCardNo() {
		return this.sellerCardNo;
	}
	
	public void setSellerCardNo(String sellerCardNo) {
		this.sellerCardNo = sellerCardNo;
	}
	
	public Money getTradeAmount() {
		return this.tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public String getTradeName() {
		return this.tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public String getTradeMemo() {
		return this.tradeMemo;
	}
	
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public List<GoodsClause> getGoodsClauses() {
		return this.goodsClauses;
	}
	
	public void setGoodsClauses(List<GoodsClause> goodsClauses) {
		this.goodsClauses = goodsClauses;
	}
	
	public ExtInfoClause getExtInfoClause() {
		return this.extInfoClause;
	}
	
	public void setExtInfoClause(ExtInfoClause extInfoClause) {
		this.extInfoClause = extInfoClause;
	}
	
	public List<ProfitClause> getProfitClauses() {
		return this.profitClauses;
	}
	
	public void setProfitClauses(List<ProfitClause> profitClauses) {
		this.profitClauses = profitClauses;
	}
	
	public List<IncidentalFeeClause> getIncidentalFeeClauses() {
		return this.incidentalFeeClauses;
	}
	
	public void setIncidentalFeeClauses(List<IncidentalFeeClause> incidentalFeeClauses) {
		this.incidentalFeeClauses = incidentalFeeClauses;
	}
	
	public String getSellerUserId() {
		return this.sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
}

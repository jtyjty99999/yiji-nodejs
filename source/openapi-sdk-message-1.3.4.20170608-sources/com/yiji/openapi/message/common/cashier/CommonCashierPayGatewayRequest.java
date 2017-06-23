/**
 * 
 */
package com.yiji.openapi.message.common.cashier;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
 * @author mayansen
 *
 */
@OpenApiMessage(service = "commonGatewayTradePay", type = ApiMessageType.Request)
public class CommonCashierPayGatewayRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(desc = "借贷标志",demo = "DEBIT")
	private String debitCreditType;
	
	@NotNull
	@OpenApiField(desc = "对公对私标志",demo = "PERSONAL")
	private String personalCorporateType;
	
	@NotBlank
	@OpenApiField(desc = "银行编码",demo = "ABC")
	private String bankCode;
	
	@Length(max = 64)
	@OpenApiField(desc = "交易名称",demo = "付款")
	private String tradeName;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id",demo = "20140814010000052219")
	protected String buyerUserId;
	
	@Length(max = 20)
	@OpenApiField(desc = "买家name",demo = "易极付")
	protected String buyerUserName;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家卡号",demo = "20140814010000052219")
	protected String buyerCardNo;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家id",demo = "20140814010000052219")
	private String sellerUserId;
	
	/** 卖家sellerUserName */
	@Length(max = 50)
	@OpenApiField(desc = "卖家账户名(登录名)",demo = "易极付")
	protected String sellerUserName;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "卖家卡号",demo = "20140814010000052219")
	private String sellerCardNo;
	
	@Length(max = 20)
	@OpenApiField(desc = "买家手机号",demo = "10086100101")
	private String buyerMobile;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人id",demo = "20140814010000052219")
	private String payerUserId;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款人卡号",demo = "20140814010000052219")
	private String payerCardNo;
	
	@Length(max = 1024)
	@OpenApiField(desc = "交易备注",demo = "交易")
	protected String tradeMemo;
	
	@NotEmpty
	@Valid
	@OpenApiField(desc = "商品条款")
	private List<GoodsClause> goodsClauses = new ArrayList<GoodsClause>();
	
	@OpenApiField(desc = "扩展信息")
	@Valid
	private ExtInfoClause extInfoClause;
	
	@Size(max = 10)
	@Valid
	@OpenApiField(desc = "附带费用")
	private List<IncidentalFeeClause> incidentalFeeClauses = new ArrayList<IncidentalFeeClause>();
	
	@Size(max = 10)
	@Valid
	@OpenApiField(desc = "分润项")
	private List<ProfitClause> profitClauses = new ArrayList<ProfitClause>();
	
	@OpenApiField(desc = "交易额",demo = "88.66")
	private Money tradeAmount = Money.zero();
	
	/** 币种（默认人民币） */
	@NotNull
	@OpenApiField(desc = "币种",demo = "CNY")
	private String currency;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号",demo = "123645798123456")
	private String outOrderNo;
	

	@OpenApiField(desc = "网关类型",constraint = "NETBANK=网银网关\n" +
			"QUICK=快捷网关\n"+"为空则默认网银网关",demo = "NETBANK")
	private String gatewayType = "NETBANK";

	@OpenApiField(desc = "UI风格",constraint = "PC_NORMAL = PC标准版\n" +
			"ZBJ =猪八戒版\n"+"为空则默认PC标准版",demo = "PC_NORMAL")
	private String uiStyle = "PC_NORMAL";
	
	/**
	 * @return the String
	 */
	public String getPersonalCorporateType() {
		return personalCorporateType;
	}
	
	/**
	 * @param String the String to set
	 */
	public void setPersonalCorporateType(String personalCorporateType) {
		this.personalCorporateType = personalCorporateType;
	}
	
	/**
	 * @return the tradeName
	 */
	public String getTradeName() {
		return tradeName;
	}
	
	/**
	 * @param tradeName the tradeName to set
	 */
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	/**
	 * @return the buyerUserId
	 */
	public String getBuyerUserId() {
		return buyerUserId;
	}
	
	/**
	 * @param buyerUserId the buyerUserId to set
	 */
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	
	/**
	 * @return the buyerUserName
	 */
	public String getBuyerUserName() {
		return buyerUserName;
	}
	
	/**
	 * @param buyerUserName the buyerUserName to set
	 */
	public void setBuyerUserName(String buyerUserName) {
		this.buyerUserName = buyerUserName;
	}
	
	/**
	 * @return the buyerCardNo
	 */
	public String getBuyerCardNo() {
		return buyerCardNo;
	}
	
	/**
	 * @param buyerCardNo the buyerCardNo to set
	 */
	public void setBuyerCardNo(String buyerCardNo) {
		this.buyerCardNo = buyerCardNo;
	}
	
	/**
	 * @return the sellerUserId
	 */
	public String getSellerUserId() {
		return sellerUserId;
	}
	
	/**
	 * @param sellerUserId the sellerUserId to set
	 */
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	/**
	 * @return the sellerCardNo
	 */
	public String getSellerCardNo() {
		return sellerCardNo;
	}
	
	/**
	 * @param sellerCardNo the sellerCardNo to set
	 */
	public void setSellerCardNo(String sellerCardNo) {
		this.sellerCardNo = sellerCardNo;
	}
	
	/**
	 * @return the payerUserId
	 */
	public String getPayerUserId() {
		return payerUserId;
	}
	
	/**
	 * @param payerUserId the payerUserId to set
	 */
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	/**
	 * @return the payerCardNo
	 */
	public String getPayerCardNo() {
		return payerCardNo;
	}
	
	/**
	 * @param payerCardNo the payerCardNo to set
	 */
	public void setPayerCardNo(String payerCardNo) {
		this.payerCardNo = payerCardNo;
	}
	
	/**
	 * @return the tradeMemo
	 */
	public String getTradeMemo() {
		return tradeMemo;
	}
	
	/**
	 * @param tradeMemo the tradeMemo to set
	 */
	public void setTradeMemo(String tradeMemo) {
		this.tradeMemo = tradeMemo;
	}
	
	/**
	 * @return the goodsClauses
	 */
	public List<GoodsClause> getGoodsClauses() {
		return goodsClauses;
	}
	
	/**
	 * @param goodsClauses the goodsClauses to set
	 */
	public void setGoodsClauses(List<GoodsClause> goodsClauses) {
		this.goodsClauses = goodsClauses;
	}
	
	/**
	 * @return the extInfoClause
	 */
	public ExtInfoClause getExtInfoClause() {
		return extInfoClause;
	}
	
	/**
	 * @param extInfoClause the extInfoClause to set
	 */
	public void setExtInfoClause(ExtInfoClause extInfoClause) {
		this.extInfoClause = extInfoClause;
	}
	
	/**
	 * @return the incidentalFeeClauses
	 */
	public List<IncidentalFeeClause> getIncidentalFeeClauses() {
		return incidentalFeeClauses;
	}
	
	/**
	 * @param incidentalFeeClauses the incidentalFeeClauses to set
	 */
	public void setIncidentalFeeClauses(List<IncidentalFeeClause> incidentalFeeClauses) {
		this.incidentalFeeClauses = incidentalFeeClauses;
	}
	
	/**
	 * @return the profitClauses
	 */
	public List<ProfitClause> getProfitClauses() {
		return profitClauses;
	}
	
	/**
	 * @param profitClauses the profitClauses to set
	 */
	public void setProfitClauses(List<ProfitClause> profitClauses) {
		this.profitClauses = profitClauses;
	}
	
	/**
	 * @return the tradeAmount
	 */
	public Money getTradeAmount() {
		return tradeAmount;
	}
	
	/**
	 * @param tradeAmount the tradeAmount to set
	 */
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getDebitCreditType() {
		return debitCreditType;
	}
	
	public void setDebitCreditType(String debitCreditType) {
		this.debitCreditType = debitCreditType;
	}
	
	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}
	
	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBuyerMobile() {
		return buyerMobile;
	}
	
	public void setBuyerMobile(String buyerMobile) {
		this.buyerMobile = buyerMobile;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	/**
	 * @return the sellerUserName
	 */
	public String getSellerUserName() {
		return sellerUserName;
	}
	
	/**
	 * @param sellerUserName the sellerUserName to set
	 */
	public void setSellerUserName(String sellerUserName) {
		this.sellerUserName = sellerUserName;
	}
	
	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getUiStyle() {
		return uiStyle;
	}

	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}
}

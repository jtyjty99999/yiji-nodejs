/**
 * www.yiji.com
 */
package com.yiji.openapi.message.common.transferAccounts;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.transferAccounts.info.BankCardPayeeOrder;
import com.yiji.openapi.message.common.transferAccounts.info.BankCardPayerOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author mayansen
 * @date 20140828
 *
 */
@OpenApiMessage(service = "bankCardTransfer", type = ApiMessageType.Request)
public class BankCardTransferRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 64)
	@OpenApiField(desc = "交易名称")
	private String tradeName;
	
	@NotNull
	@OpenApiField(desc = "交易金额")
	private Money tradeAmount;
	
	@OpenApiField(desc = "币种")
	private String currency;
	
	@Size(max = 1024)
	@OpenApiField(desc = "交易备注")
	private String tradeMemo;
	
	@NotEmpty
	@OpenApiField(desc = "付款方信息")
	@Valid
	private List<BankCardPayerOrder> bankCardPayerOrder = new ArrayList<BankCardPayerOrder>();
	
	@NotEmpty
	@OpenApiField(desc = "支付方信息")
	@Valid
	private List<BankCardPayeeOrder> bankCardPayeeOrder = new ArrayList<BankCardPayeeOrder>();

	/** 商品类型码 */
	@OpenApiField(desc = "商品类型码")
	private String goodsTypeCode;

	/** 商品类型名称 */
	@OpenApiField(desc = "商品类型名称")
	private String goodsTypeName;

	/** 商品名称 */
	@OpenApiField(desc = "商品名称")
	private String goodsName;

	/** 用户客户端IP，目前使用ipv4的格式，例如192.168.1.110 **/
	@OpenApiField(desc = "用户客户端IP",constraint = "目前使用ipv4的格式，例如192.168.1.110")
	private String userEndIp;

	/** 用户终端类型 **/
	@OpenApiField(desc = "用户终端类型")
	private String userTemunalType;

	/** 交易类型 **/
	@OpenApiField(desc = "交易类型")
	private String tradeCategory;
	/**
	 * 
	 */
	public BankCardTransferRequest() {
		super();
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
	 * @return the bankCardPayerOrder
	 */
	public List<BankCardPayerOrder> getBankCardPayerOrder() {
		return bankCardPayerOrder;
	}
	
	/**
	 * @param bankCardPayerOrder the bankCardPayerOrder to set
	 */
	public void setBankCardPayerOrder(List<BankCardPayerOrder> bankCardPayerOrder) {
		this.bankCardPayerOrder = bankCardPayerOrder;
	}
	
	/**
	 * @return the bankCardPayeeOrder
	 */
	public List<BankCardPayeeOrder> getBankCardPayeeOrder() {
		return bankCardPayeeOrder;
	}
	
	/**
	 * @param bankCardPayeeOrder the bankCardPayeeOrder to set
	 */
	public void setBankCardPayeeOrder(List<BankCardPayeeOrder> bankCardPayeeOrder) {
		this.bankCardPayeeOrder = bankCardPayeeOrder;
	}

	public String getGoodsTypeCode() {
		return goodsTypeCode;
	}

	public void setGoodsTypeCode(String goodsTypeCode) {
		this.goodsTypeCode = goodsTypeCode;
	}

	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getUserEndIp() {
		return userEndIp;
	}

	public void setUserEndIp(String userEndIp) {
		this.userEndIp = userEndIp;
	}

	public String getUserTemunalType() {
		return userTemunalType;
	}

	public void setUserTemunalType(String userTemunalType) {
		this.userTemunalType = userTemunalType;
	}

	public String getTradeCategory() {
		return tradeCategory;
	}

	public void setTradeCategory(String tradeCategory) {
		this.tradeCategory = tradeCategory;
	}
}

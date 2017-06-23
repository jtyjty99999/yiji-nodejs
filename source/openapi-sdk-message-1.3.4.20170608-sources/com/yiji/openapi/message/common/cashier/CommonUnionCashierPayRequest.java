package com.yiji.openapi.message.common.cashier;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.common.cashier.info.TradeGoodsInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.exception.ApiServerException;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "commonUnionCashierPay", type = ApiMessageType.Request)
public class CommonUnionCashierPayRequest extends ApiRequest {

	/**
	 * 收银台字段
	 */
	@OpenApiField(desc = "业务来源",demo = "NORMAL",constraint = "单笔付款:NORMAL<br>多笔合并付款:MERGE<br>公路局:HIGHWAY_ADMIN<br>默认NORMAL")
	private String payFrom = "NORMAL";

	@OpenApiField(desc = "业务类型",demo = "PAYMENT",constraint = "网页付款:PAYMENT<br>网关支付:PAYMENT_GATEWAY<br>默认PAYMENT")
	private String bizType = "PAYMENT";

	@OpenApiField(desc = "网关类型",demo = "NETBANK")
	private String gatewayType;

	@OpenApiField(desc = "协议号",demo = "1236458123854")
	private String protocolNo;

	@OpenApiField(desc = "收费扩展标志",demo = "0",constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
	private String chargeExtend;

	@OpenApiField(desc = "银行简称",constraint = "网关支付必填",demo = "ABC")
	private String bankCode;

	@OpenApiField(desc = "对公对私",demo = "PERSONAL",constraint = "网关支付字段")
	private String personalCorporateType;

	@OpenApiField(desc = "银行卡类型",demo = "DEBIT",constraint = "网关支付字段")
	private String debitCreditType;

	/**
	 * 交易系统字段
	 */

	@NotNull
	@Size(min = 1, max = 40)
	@OpenApiField(desc = "商品信息列表")
	private List<TradeGoodsInfo> prodInfoList;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "买家id",demo = "20140814010000052219")
	private String buyerUserId;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号",demo = "123456789123456")
	private String mergeOrderNo;

	/** 币种（默认人民币） */
	@OpenApiField(desc = "币种",demo = "CNY")
	private String currency;
	

	public void check() {
		if (!"NORMAL".equals(payFrom) && !"MERGE".equals(payFrom) && !"HIGHWAY_ADMIN".equals(payFrom)) {
			throw new ApiServerException("PARAMETER_ERROR", "业务来源只能为NORMAL、MERGE或HIGHWAY_ADMIN");
		}
		if (!"PAYMENT".equals(bizType) && !"PAYMENT_GATEWAY".equals(bizType)) {
			throw new ApiServerException("PARAMETER_ERROR", "业务类型只能为PAYMENT或PAYMENT_GATEWAY");
		}
		if ("PAYMENT_GATEWAY".equals(bizType)) {
			if (StringUtils.isBlank(bankCode)) {
				throw new ApiServerException("PARAMETER_ERROR", "网关支付时，bankCode必填");
			}
		}
	}

	public List<TradeGoodsInfo> getProdInfoList() {
		return prodInfoList;
	}

	public void setProdInfoList(List<TradeGoodsInfo> prodInfoList) {
		this.prodInfoList = prodInfoList;
	}

	public String getBuyerUserId() {
		return this.buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getGatewayType() {
		return this.gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getMergeOrderNo() {
		return mergeOrderNo;
	}

	public void setMergeOrderNo(String mergeOrderNo) {
		this.mergeOrderNo = mergeOrderNo;
	}

	public String getPayFrom() {
		return payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getProtocolNo() {
		return protocolNo;
	}

	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}

	public String getChargeExtend() {
		return chargeExtend;
	}

	public void setChargeExtend(String chargeExtend) {
		this.chargeExtend = chargeExtend;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPersonalCorporateType() {
		return personalCorporateType;
	}

	public void setPersonalCorporateType(String personalCorporateType) {
		this.personalCorporateType = personalCorporateType;
	}

	public String getDebitCreditType() {
		return debitCreditType;
	}

	public void setDebitCreditType(String debitCreditType) {
		this.debitCreditType = debitCreditType;
	}
}

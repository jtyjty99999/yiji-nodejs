package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 * @since 2015-11-27 17:14.
 */
@OpenApiMessage(service = "commonWchatTradeRedirect", type = ApiMessageType.Response)
public class CommonWchatTradeRedirectResponse extends ApiResponse {
	
	@OpenApiField(desc = "gid")
	private String gid;
	
	@OpenApiField(desc = "接入渠道ID")
	private String channelId;
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金账号")
	private String merchantAccNo;
	
	@OpenApiField(desc = "入口编码")
	private String inlet;
	
	@OpenApiField(desc = "付款类型")
	private String payFrom;
	
	@OpenApiField(desc = "业务类型")
	private String bizType;
	
	@OpenApiField(desc = "网关类型")
	private String gatewayType;
	
	@OpenApiField(desc = "页面风格")
	private String uiStyle;
	
	@OpenApiField(desc = "银行简称")
	private String bankCode;
	
	@OpenApiField(desc = "对公对私")
	private String personalCorporateType;
	
	@OpenApiField(desc = "银行卡类型")
	private String debitCreditType;
	
	@OpenApiField(desc = "可变类型")
	private String mutableType;
	
	@OpenApiField(desc = "收费扩展信息")
	private String chargeExtend;
	
	public String getGid() {
		return gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getChannelId() {
		return channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getMerchantCardNo() {
		return merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
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
	
	public String getMutableType() {
		return mutableType;
	}
	
	public void setMutableType(String mutableType) {
		this.mutableType = mutableType;
	}
	
	public String getChargeExtend() {
		return chargeExtend;
	}
	
	public void setChargeExtend(String chargeExtend) {
		this.chargeExtend = chargeExtend;
	}
}

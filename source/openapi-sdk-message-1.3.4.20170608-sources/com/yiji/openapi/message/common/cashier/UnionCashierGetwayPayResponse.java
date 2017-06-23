package com.yiji.openapi.message.common.cashier;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "unionCashierGetwayPay", type = ApiMessageType.Response)
public class UnionCashierGetwayPayResponse extends ApiResponse {
	
	@OpenApiField(desc = "统一流水号")
	private String gid;
	
	@OpenApiField(desc = "渠道id")
	private String channelId;
	
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "业务来源")
	private String payFrom = "MERGE";
	
	@OpenApiField(desc = "业务类型")
	private String bizType = "PAYMENT_GATEWAY";
	
	@OpenApiField(desc = "网关类型")
	private String gatewayType;
	
	@OpenApiField(desc = "样式风格")
	private String uiStyle;
	
	@OpenApiField(desc = "大数据商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "大数据商户资金账号")
	private String merchantAccNo;
	
	@OpenApiField(desc = "大数据入口")
	private String inlet = "01";
	
	@OpenApiField(desc = "银行简称")
	private String bankCode;
	
	@OpenApiField(desc = "对公对私")
	private String personalCorporateType;
	
	@OpenApiField(desc = "银行卡类型")
	private String debitCreditType;
	
	@OpenApiField(desc = "用户名")
	private String userName;
	
	public String getGid() {
		return this.gid;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public String getChannelId() {
		return this.channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getPayFrom() {
		return this.payFrom;
	}
	
	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}
	
	public String getBizType() {
		return this.bizType;
	}
	
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	
	public String getGatewayType() {
		return this.gatewayType;
	}
	
	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}
	
	public String getUiStyle() {
		return this.uiStyle;
	}
	
	public void setUiStyle(String uiStyle) {
		this.uiStyle = uiStyle;
	}
	
	public String getMerchantCardNo() {
		return this.merchantCardNo;
	}
	
	public void setMerchantCardNo(String merchantCardNo) {
		this.merchantCardNo = merchantCardNo;
	}
	
	public String getMerchantAccNo() {
		return this.merchantAccNo;
	}
	
	public void setMerchantAccNo(String merchantAccNo) {
		this.merchantAccNo = merchantAccNo;
	}
	
	public String getInlet() {
		return this.inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
	
	public String getBankCode() {
		return this.bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getPersonalCorporateType() {
		return this.personalCorporateType;
	}
	
	public void setPersonalCorporateType(String personalCorporateType) {
		this.personalCorporateType = personalCorporateType;
	}
	
	public String getDebitCreditType() {
		return this.debitCreditType;
	}
	
	public void setDebitCreditType(String debitCreditType) {
		this.debitCreditType = debitCreditType;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}

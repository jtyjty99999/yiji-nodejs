/**
 * 
 */
package com.yiji.openapi.message.common.cashier;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author Administrator
 *
 */
@OpenApiMessage(service = "commonGatewayTradePay", type = ApiMessageType.Response)
public class CommonCashierPayGatewayResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "渠道id")
	private String channelId;
	
	@NotBlank
	@OpenApiField(desc = "统一流水号")
	private String gid;
	
	@NotBlank
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "订单详情")
	private String order;
	
	@OpenApiField(desc = "付款用户ID")
	private String payerUserId;
	
	@OpenApiField(desc = "对公对私")
	private String personalCorporateType;
	
	@OpenApiField(desc = "借贷标志")
	private String debitCreditType;
	
	@OpenApiField(desc = "银行编码")
	private String bankCode;
	
	@OpenApiField(desc = "买家手机号")
	private String userName;
	
	@OpenApiField(desc = "网关付款")
	private String bizType = "PAYMENT_GATEWAY";
	
	@OpenApiField(desc = "入口编码")
	private String inlet = "01";
	
	@OpenApiField(desc = "商户卡号")
	private String merchantCardNo;
	
	@OpenApiField(desc = "商户资金帐号")
	private String merchantAccNo;
	
	@OpenApiField(desc = "商户会员ID")
	private String merchantUserId;
	
	@OpenApiField(desc = "商户外部业务ID")
	private String merchantOrderBizNo;
	
	@OpenApiField(desc = "网关类型", constraint = "NETBANK=网银网关\n" + "QUICK=快捷网关\n" + "为空则默认网银网关")
	private String gatewayType = "NETBANK";
	
	@OpenApiField(desc = "UI风格", constraint = "PC_NORMAL = PC标准版\n" + "ZBJ =猪八戒版\n" + "为空则默认PC标准版")
	private String uiStyle = "PC_NORMAL";
	
	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}
	
	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	/**
	 * @return the gid
	 */
	public String getGid() {
		return gid;
	}
	
	/**
	 * @param gid the gid to set
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	/**
	 * @return the tradeNo
	 */
	public String getTradeNo() {
		return tradeNo;
	}
	
	/**
	 * @param tradeNo the tradeNo to set
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	/**
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}
	
	/**
	 * @param order the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
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
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
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
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	
	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}
	
	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
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
}

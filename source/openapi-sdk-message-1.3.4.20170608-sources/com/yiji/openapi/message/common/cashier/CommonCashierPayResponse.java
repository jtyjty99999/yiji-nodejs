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
 */
@OpenApiMessage(service = "commonTradePay", type = ApiMessageType.Response)
public class CommonCashierPayResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "渠道id")
	private String channelId;
	
	@NotBlank
	@OpenApiField(desc = "统一流水号")
	private String gid;
	
	@NotBlank
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@OpenApiField(desc = "付款用户ID")
	private String payerUserId;
	
	@OpenApiField(desc = "对公对私")
	private String personalCorporateType;
	
	@OpenApiField(desc = "借贷标志")
	private String debitCreditTypeEnum;
	
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
	
	@OpenApiField(desc = "收费扩展字段", constraint = "外部商户传入的收费扩展字段，比如当做Vip标识，用户对特殊角色进行收费，0:非VIP，1:VIP")
	private String chargeExtend;
	
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
	
	/**
	 * @return the String
	 */
	public String getDebitCreditTypeEnum() {
		return debitCreditTypeEnum;
	}
	
	/**
	 * @param String the String to set
	 */
	public void setDebitCreditTypeEnum(String debitCreditTypeEnum) {
		this.debitCreditTypeEnum = debitCreditTypeEnum;
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
	
	public String getChargeExtend() {
		return chargeExtend;
	}
	
	public void setChargeExtend(String chargeExtend) {
		this.chargeExtend = chargeExtend;
	}
}

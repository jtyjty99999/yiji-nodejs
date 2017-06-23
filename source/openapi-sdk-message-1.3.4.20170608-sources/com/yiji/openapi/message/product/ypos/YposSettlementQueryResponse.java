/**
 * www.yiji.com
 */
package com.yiji.openapi.message.product.ypos;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author mayansen
 * @date 20140821
 *
 */
@OpenApiMessage(service = "yposSettlementQuery", type = ApiMessageType.Response)
public class YposSettlementQueryResponse extends ApiResponse {
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "pos消费id")
	private String id;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "结算id")
	private String settleId;
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "商户id")
	private String merchantId;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "终端id")
	private String terminalId;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "批次号")
	private String batchId;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "凭证号")
	private String credentialId;
	
	@NotBlank
	@Length(min = 16, max = 20)
	@OpenApiField(desc = "银行卡号")
	private String cardNo;
	
	@NotBlank
	@Length(max = 10)
	@OpenApiField(desc = "手续费率")
	private String chargeRate;
	
	@NotBlank
	@OpenApiField(desc = "刷卡金额")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "实际到账金额")
	private Money accountedAmount;
	
	@NotBlank
	@OpenApiField(desc = "总的手续费")
	private Money charge;
	
	@NotBlank
	@OpenApiField(desc = "易极付收取的手续费")
	private Money yjfChargeAmount;
	
	@NotBlank
	@OpenApiField(desc = "结算金额")
	private Money settleAmount;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "交易日期")
	private Date tradeDate;
	
	/**
	 * 
	 */
	public YposSettlementQueryResponse() {
		super();
	}
	
	/**
	 * @param id
	 * @param settleId
	 * @param merchantId
	 * @param terminalId
	 * @param batchId
	 * @param credentialId
	 * @param cardNo
	 * @param chargeRate
	 * @param amount
	 * @param accountedAmount
	 * @param charge
	 * @param yjfChargeAmount
	 * @param settleAmount
	 * @param tradeDate
	 */
	public YposSettlementQueryResponse(String id, String settleId, String merchantId, String terminalId,
										String batchId, String credentialId, String cardNo, String chargeRate,
										Money amount, Money accountedAmount, Money charge, Money yjfChargeAmount,
										Money settleAmount, Date tradeDate) {
		super();
		this.id = id;
		this.settleId = settleId;
		this.merchantId = merchantId;
		this.terminalId = terminalId;
		this.batchId = batchId;
		this.credentialId = credentialId;
		this.cardNo = cardNo;
		this.chargeRate = chargeRate;
		this.amount = amount;
		this.accountedAmount = accountedAmount;
		this.charge = charge;
		this.yjfChargeAmount = yjfChargeAmount;
		this.settleAmount = settleAmount;
		this.tradeDate = tradeDate;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the settleId
	 */
	public String getSettleId() {
		return settleId;
	}
	
	/**
	 * @param settleId the settleId to set
	 */
	public void setSettleId(String settleId) {
		this.settleId = settleId;
	}
	
	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}
	
	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	/**
	 * @return the terminalId
	 */
	public String getTerminalId() {
		return terminalId;
	}
	
	/**
	 * @param terminalId the terminalId to set
	 */
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	
	/**
	 * @return the batchId
	 */
	public String getBatchId() {
		return batchId;
	}
	
	/**
	 * @param batchId the batchId to set
	 */
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	
	/**
	 * @return the credentialId
	 */
	public String getCredentialId() {
		return credentialId;
	}
	
	/**
	 * @param credentialId the credentialId to set
	 */
	public void setCredentialId(String credentialId) {
		this.credentialId = credentialId;
	}
	
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = "**" + cardNo.substring(cardNo.length() - 4, cardNo.length());
		;
	}
	
	/**
	 * @return the chargeRate
	 */
	public String getChargeRate() {
		return chargeRate;
	}
	
	/**
	 * @param chargeRate the chargeRate to set
	 */
	public void setChargeRate(String chargeRate) {
		this.chargeRate = chargeRate;
	}
	
	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the accountedAmount
	 */
	public Money getAccountedAmount() {
		return accountedAmount;
	}
	
	/**
	 * @param accountedAmount the accountedAmount to set
	 */
	public void setAccountedAmount(Money accountedAmount) {
		this.accountedAmount = accountedAmount;
	}
	
	/**
	 * @return the charge
	 */
	public Money getCharge() {
		return charge;
	}
	
	/**
	 * @param charge the charge to set
	 */
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	/**
	 * @return the yjfChargeAmount
	 */
	public Money getYjfChargeAmount() {
		return yjfChargeAmount;
	}
	
	/**
	 * @param yjfChargeAmount the yjfChargeAmount to set
	 */
	public void setYjfChargeAmount(Money yjfChargeAmount) {
		this.yjfChargeAmount = yjfChargeAmount;
	}
	
	/**
	 * @return the settleAmount
	 */
	public Money getSettleAmount() {
		return settleAmount;
	}
	
	/**
	 * @param settleAmount the settleAmount to set
	 */
	public void setSettleAmount(Money settleAmount) {
		this.settleAmount = settleAmount;
	}
	
	/**
	 * @return the tradeDate
	 */
	public Date getTradeDate() {
		return tradeDate;
	}
	
	/**
	 * @param date the tradeDate to set
	 */
	public void setTradeDate(Date date) {
		this.tradeDate = date;
	}
	
}

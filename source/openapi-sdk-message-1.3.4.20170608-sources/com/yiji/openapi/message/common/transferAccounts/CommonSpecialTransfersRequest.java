package com.yiji.openapi.message.common.transferAccounts;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

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
@OpenApiMessage(service = "commonSpecialTransfers", type = ApiMessageType.Request)
public class CommonSpecialTransfersRequest extends ApiRequest {
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "付款用户ID",demo = "20140809010000051239")
	private String payerUserId;
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "收款用户ID",demo = "20140809010000051239")
	private String payeeUserId;
	
	/** 交易名称 */
	@Size(max = 64)
	@OpenApiField(desc = "交易名称",demo = "交易")
	private String tradeName;
	
	/** 交易金额 */
	@OpenApiField(desc = "交易金额",demo = "88.66")
	private Money tradeAmount;
	
	/** 解冻金额 */
	@NotNull
	@OpenApiField(desc = "解冻金额",demo = "88.66")
	private Money unfreezeAmount;
	
	/** 冻结金额 */
	@NotNull
	@OpenApiField(desc = "冻结金额",demo = "88.66")
	private Money freezeAmount;
	
	@OpenApiField(desc = "币种",demo = "CNY")
	private String currency;
	
	public String getPayerUserId() {
		return this.payerUserId;
	}
	
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}
	
	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}
	
	public String getTradeName() {
		return this.tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	public Money getTradeAmount() {
		return this.tradeAmount;
	}
	
	public void setTradeAmount(Money tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	public Money getUnfreezeAmount() {
		return this.unfreezeAmount;
	}
	
	public void setUnfreezeAmount(Money unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}
	
	public Money getFreezeAmount() {
		return this.freezeAmount;
	}
	
	public void setFreezeAmount(Money freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}

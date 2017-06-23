/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com Tue Sep 30 15:54:12 CST 2014 创建
 */
package com.yiji.openapi.message.product.easyexchange;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "applyRemittranceWithSynOrder", type = ApiMessageType.Request)
public class ApplyRemittranceWithSynOrderRequest extends ApiRequest {
	
	@OpenApiField(desc = "跨境付款批次号")
	@NotNull
	private String remittranceBatchNo;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotNull
	@OpenApiField(desc = "汇款金额")
	private Money payAmount;
	
	@NotBlank
	@OpenApiField(desc = "汇款币种")
	private String payCurrency;
	
	@NotBlank
	@OpenApiField(desc = "提现币种")
	private String withdrawCurrency;
	
	@OpenApiField(desc = "汇款备注")
	private String payMemo;
	
	@NotBlank
	@OpenApiField(desc = "汇往国家代码")
	private String toCountryCode;
	
	@NotBlank
	@OpenApiField(desc = "交易用途编码")
	private String tradeUseCode;
	
	@NotBlank
	@OpenApiField(desc = "收款人姓名")
	private String payeeName;
	
	@NotBlank
	@OpenApiField(desc = "收款人地址")
	private String payeeAddress;
	
	@NotBlank
	@OpenApiField(desc = "收款人银行名称")
	private String payeeBankName;
	
	@NotBlank
	@OpenApiField(desc = "收款银行地址")
	private String payeeBankAddress;
	
	@NotBlank
	@OpenApiField(desc = "银行国际代码")
	private String payeeBankSwiftCode;
	
	@NotBlank
	@OpenApiField(desc = "收款账号")
	private String payeeBankNo;
	
	@OpenApiField(desc = "代理银行名称")
	private String payeeProxyBankName;
	
	@OpenApiField(desc = "代理银行地址")
	private String payeeProxyBankAddress;
	
	public String getTradeUseCode() {
		return tradeUseCode;
	}
	
	public void setTradeUseCode(String tradeUseCode) {
		this.tradeUseCode = tradeUseCode;
	}
	
	public String getRemittranceBatchNo() {
		return remittranceBatchNo;
	}
	
	public void setRemittranceBatchNo(String remittranceBatchNo) {
		this.remittranceBatchNo = remittranceBatchNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public Money getPayAmount() {
		return this.payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		this.payAmount = payAmount;
	}
	
	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}
	
	public String getPayCurrency() {
		return this.payCurrency;
	}
	
	public void setWithdrawCurrency(String withdrawCurrency) {
		this.withdrawCurrency = withdrawCurrency;
	}
	
	public String getWithdrawCurrency() {
		return this.withdrawCurrency;
	}
	
	public void setPayMemo(String payMemo) {
		this.payMemo = payMemo;
	}
	
	public String getPayMemo() {
		return this.payMemo;
	}
	
	public void setToCountryCode(String toCountryCode) {
		this.toCountryCode = toCountryCode;
	}
	
	public String getToCountryCode() {
		return this.toCountryCode;
	}
	
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	
	public String getPayeeName() {
		return this.payeeName;
	}
	
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}
	
	public String getPayeeAddress() {
		return this.payeeAddress;
	}
	
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	
	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	
	public String getPayeeBankAddress() {
		return this.payeeBankAddress;
	}
	
	public void setPayeeBankAddress(String payeeBankAddress) {
		this.payeeBankAddress = payeeBankAddress;
	}
	
	public void setPayeeBankSwiftCode(String payeeBankSwiftCode) {
		this.payeeBankSwiftCode = payeeBankSwiftCode;
	}
	
	public String getPayeeBankSwiftCode() {
		return this.payeeBankSwiftCode;
	}
	
	public void setPayeeBankNo(String payeeBankNo) {
		this.payeeBankNo = payeeBankNo;
	}
	
	public String getPayeeBankNo() {
		return this.payeeBankNo;
	}
	
	public void setPayeeProxyBankName(String payeeProxyBankName) {
		this.payeeProxyBankName = payeeProxyBankName;
	}
	
	public String getPayeeProxyBankName() {
		return this.payeeProxyBankName;
	}
	
	public void setPayeeProxyBankAddress(String payeeProxyBankAddress) {
		this.payeeProxyBankAddress = payeeProxyBankAddress;
	}
	
	public String getPayeeProxyBankAddress() {
		return this.payeeProxyBankAddress;
	}
	
}
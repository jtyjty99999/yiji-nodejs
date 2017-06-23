/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com Tue Sep 30 15:54:12 CST 2014 创建
 */
package com.yiji.openapi.message.product.easyexchange;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.message.product.easyexchange.infos.CrossBorderRemittranceDetailInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "applyCrossRemittrance", type = ApiMessageType.Request)
public class ApplyCrossRemittranceRequest extends ApiRequest {
	
	@NotBlank
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
	
	@OpenApiField(desc = "汇往国家代码")
	private String toCountryCode;
	
	@OpenApiField(desc = "交易编码")
	private String tradeCode = "122030";
	
	@OpenApiField(desc = "交易用途编码")
	private String tradeUseCode;
	
	@OpenApiField(desc = "收款人姓名")
	private String payeeName;
	
	@OpenApiField(desc = "收款人地址")
	private String payeeAddress;
	
	@OpenApiField(desc = "收款人银行名称")
	private String payeeBankName;
	
	@OpenApiField(desc = "收款银行地址")
	private String payeeBankAddress;
	
	@OpenApiField(desc = "银行国际代码")
	private String payeeBankSwiftCode;
	
	@OpenApiField(desc = "收款账号")
	private String payeeBankNo;
	
	@OpenApiField(desc = "代理银行名称")
	private String payeeProxyBankName;
	
	@OpenApiField(desc = "代理银行地址")
	private String payeeProxyBankAddress;
	
	@OpenApiField(desc = "买家ID")
	private String buyerid;
	
	@NotNull
	@OpenApiField(desc = "明细列表")
	private List<CrossBorderRemittranceDetailInfo> details;
	
	@NotBlank
	@OpenApiField(desc = "贸易类型")
	private String tradeType;
	
	@NotNull
	@OpenApiField(desc = "付款类型")
	private String payType;
	
	@OpenApiField(desc = "收款账户")
	private String payeeAccount;
	
	@OpenApiField(desc = "是否同步响应", constraint = "Y：同步响应，N：同步跳转")
	private String isSyn = "N";
	
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
	
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	
	public String getTradeCode() {
		return this.tradeCode;
	}
	
	public void setTradeUseCode(String tradeUseCode) {
		this.tradeUseCode = tradeUseCode;
	}
	
	public String getTradeUseCode() {
		return this.tradeUseCode;
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
	
	public List<CrossBorderRemittranceDetailInfo> getDetails() {
		return this.details;
	}
	
	public void setDetails(List<CrossBorderRemittranceDetailInfo> details) {
		this.details = details;
	}
	
	public String getBuyerid() {
		return this.buyerid;
	}
	
	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}
	
	public String getTradeType() {
		return this.tradeType;
	}
	
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getPayType() {
		return this.payType;
	}
	
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	
	public String getIsSyn() {
		return this.isSyn;
	}
	
	public void setIsSyn(String isSyn) {
		this.isSyn = isSyn;
	}
	
}
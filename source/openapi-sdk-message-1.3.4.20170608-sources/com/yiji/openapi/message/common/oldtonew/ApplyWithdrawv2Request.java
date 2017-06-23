/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-25 14:11 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/25
 */
@OpenApiMessage(service = "applyWithdrawv2", type = ApiMessageType.Request)
public class ApplyWithdrawv2Request extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名", demo = "陈开国")
	private String realName;
	
	@OpenApiField(desc = "币种", constraint = "币种", demo = "CNY")
	private String currency;
	
	@OpenApiField(desc = "收费金额", constraint = "收费金额", demo = "2.00")
	private Money charge;
	
	@OpenApiField(desc = "收费规则", constraint = "收费规则", demo = "无")
	private String chargeRule="chargeV2";
	
	@OpenApiField(desc = "冻结码", constraint = "冻结码", demo = "DEPOSIT_FREEZE")
	private String freezeType;
	
	@OpenApiField(desc = "提现类型", constraint = "提现类型", demo = "WITHDRAW_SINGLE")
	private String withdrawType;
	
	@NotBlank
	@OpenApiField(desc = "商业身份", constraint = "商业身份", demo = "SPECIAL_MERCHANT")
	private String bizIdentity;
	
	@NotBlank
	@OpenApiField(desc = "流水号", constraint = "流水号", demo = "23923492348234")
	private String bizNo;
	
	@OpenApiField(desc = "外部流水号", constraint = "外部流水号", demo = "23423423423423")
	private String outBizNo;
	
	@OpenApiField(desc = "收费选项", constraint = "收费选项", demo = "Y")
	private String chargeOption;
	
	@OpenApiField(desc = "是否自动处理", constraint = "{\"data\":[\"true:是\",\"false:否\"],\"name\":\"是否自动处理\"}",
			demo = "true")
	private boolean autoProcess;
	
	@OpenApiField(desc = "延迟处理时间", constraint = "延迟处理时间", demo = "23")
	private Integer delay;
	
	@OpenApiField(desc = "业务申请时间", constraint = "业务申请时间", demo = "2016-2-22 14:14:28")
	private Date bizApplyTime;
	
	@OpenApiField(desc = "余额", constraint = "余额", demo = "2423.2")
	private Money balance;
	
	@OpenApiField(desc = "备注", constraint = "备注", demo = "无")
	private String memo;
	
	@OpenApiField(desc = "产品层自定义信息", constraint = "产品层自定义信息", demo = "无")
	private String reserved1;
	
	@OpenApiField(desc = "产品层自定义信息", constraint = "产品层自定义信息", demo = "无")
	private String reserved2;
	
	@OpenApiField(desc = "后台是否审核", constraint = "后台是否审核", demo = "N")
	private String applyIsInter;
	
	//支付渠道查询相关
	
	@OpenApiField(desc = "支付渠道", constraint = "支付渠道", demo = "无")
	private String payChannelApi;
	
	@OpenApiField(desc = "支付渠道查询业务编码", constraint = "支付渠道查询业务编码", demo = "ABC123")
	private String owner;
	
	@OpenApiField(desc = "支付渠道查询子业务编码", constraint = "支付渠道查询子业务编码", demo = "ABC123-123")
	private String subOwner;
	
	@OpenApiField(desc = "省名", constraint = "省名", demo = "四川省")
	private String provName;
	
	@OpenApiField(desc = "城市", constraint = "城市", demo = "成都市")
	private String cityName;
	
	@NotBlank
	@OpenApiField(desc = "银行码", constraint = "银行码", demo = "ICBC")
	private String bankCode;
	
	@OpenApiField(desc = "交易类型", constraint = "交易类型", demo = "WITHDRAW")
	private String transactionType;
	
	@OpenApiField(desc = "子交易类型", constraint = "子交易类型", demo = "DEFAULT")
	private String subTransactionType;
	
	@OpenApiField(desc = "标签", constraint = "标签", demo = "Y")
	private String publicTag;
	
	@OpenApiField(desc = "卡类型", constraint = "{\"data\":[\"DEBIT_CARD:借记卡\",\"CREDIT_CARD:贷记卡\"],\"name\":\"卡类型\"}",
			demo = "DEBIT_CARD")
	private String cardType;
	
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "201237812382347234")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "提现金额", constraint = "提现金额", demo = "20123.23")
	private Money amount;
	
	@NotBlank
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "6222123456780912")
	private String bankAccountNo;
	
	@NotBlank
	@OpenApiField(desc = "银行户名", constraint = "银行户名", demo = "陈开国")
	private String bankAccountName;
	
	@NotBlank
	@OpenApiField(desc = "银行卡开户行地址", constraint = "银行卡开户行地址", demo = "重庆市渝北区黄山大道木星1区")
	private String bankAddress;
	
	@NotBlank
	@OpenApiField(desc = "银行联行号", constraint = "银行联行号", demo = "123123")
	private String bankCnapsNo;
	
	@OpenApiField(desc = "交易商户ID", constraint = "交易商户ID", demo = "20123823923412")
	private String tradeMerchantId;
	
	@OpenApiField(desc = "交易商户CardNo",constraint="交易商户CardNo", demo = "2018239123123")
	private String tradePartnerId;
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Money getCharge() {
		return charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public String getChargeRule() {
		return chargeRule;
	}
	
	public void setChargeRule(String chargeRule) {
		this.chargeRule = chargeRule;
	}
	
	public String getFreezeType() {
		return freezeType;
	}
	
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
	
	public String getWithdrawType() {
		return withdrawType;
	}
	
	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}
	
	public String getBizIdentity() {
		return bizIdentity;
	}
	
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getChargeOption() {
		return chargeOption;
	}
	
	public void setChargeOption(String chargeOption) {
		this.chargeOption = chargeOption;
	}
	
	public Integer getDelay() {
		return delay;
	}
	
	public void setDelay(Integer delay) {
		this.delay = delay;
	}
	
	public Date getBizApplyTime() {
		return bizApplyTime;
	}
	
	public void setBizApplyTime(Date bizApplyTime) {
		this.bizApplyTime = bizApplyTime;
	}
	
	public Money getBalance() {
		return balance;
	}
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getReserved1() {
		return reserved1;
	}
	
	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}
	
	public String getReserved2() {
		return reserved2;
	}
	
	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}
	
	public String getApplyIsInter() {
		return applyIsInter;
	}
	
	public void setApplyIsInter(String applyIsInter) {
		this.applyIsInter = applyIsInter;
	}
	
	public String getTradeMerchantId() {
		return tradeMerchantId;
	}
	
	public void setTradeMerchantId(String tradeMerchantId) {
		this.tradeMerchantId = tradeMerchantId;
	}
	
	public String getTradePartnerId() {
		return tradePartnerId;
	}
	
	public void setTradePartnerId(String tradePartnerId) {
		this.tradePartnerId = tradePartnerId;
	}
	
	public String getPayChannelApi() {
		return payChannelApi;
	}
	
	public void setPayChannelApi(String payChannelApi) {
		this.payChannelApi = payChannelApi;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getSubOwner() {
		return subOwner;
	}
	
	public void setSubOwner(String subOwner) {
		this.subOwner = subOwner;
	}
	
	public String getProvName() {
		return provName;
	}
	
	public void setProvName(String provName) {
		this.provName = provName;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public String getSubTransactionType() {
		return subTransactionType;
	}
	
	public void setSubTransactionType(String subTransactionType) {
		this.subTransactionType = subTransactionType;
	}
	
	public String getPublicTag() {
		return publicTag;
	}
	
	public void setPublicTag(String publicTag) {
		this.publicTag = publicTag;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public boolean isAutoProcess() {
		return autoProcess;
	}
	
	public void setAutoProcess(boolean autoProcess) {
		this.autoProcess = autoProcess;
	}
	
	public String getBankAccountName() {
		return bankAccountName;
	}
	
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	
	public String getBankAddress() {
		return bankAddress;
	}
	
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public String getBankCnapsNo() {
		return bankCnapsNo;
	}
	
	public void setBankCnapsNo(String bankCnapsNo) {
		this.bankCnapsNo = bankCnapsNo;
	}
}

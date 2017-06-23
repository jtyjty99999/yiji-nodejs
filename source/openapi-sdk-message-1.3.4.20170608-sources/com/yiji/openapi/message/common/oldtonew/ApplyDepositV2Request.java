/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月11日 下午3:34:03 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.enums.ApiServiceResultCode;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月11日
 */
@OpenApiMessage(service = "applyDepositV2", type = ApiMessageType.Request)
public class ApplyDepositV2Request extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "充值账户(会员ID)", constraint = "默认人名币账户会员", demo = "20151218021119636673")
	private String userId;
	
	@OpenApiField(desc = "交易发生金额", constraint = "交易发生金额", demo = "66.66")
	private Money amount = Money.zero();
	
	@OpenApiField(desc = "交易发生币种", constraint = "交易发生币种", demo = "CNY")
	private String currency;
	
	@OpenApiField(desc = "手续费 ", constraint = "手续费 ", demo = "66.66")
	private Money charge;
	
	@OpenApiField(desc = "收费规则", constraint = "收费规则", demo = "default")
	private String chargeRule = "default";
	
	@OpenApiField(desc = "资金账户", constraint = "若为换汇,则是持有币种资金账户", demo = "wck")
	private String accountNo;
	
	@OpenApiField(desc = "易极付充值账户名 ", constraint = "易极付充值账户名 ", demo = "zhangsan@yiji.com")
	private String accountName;
	
	
	@OpenApiField(desc = "银行开户账户卡号", constraint = "银行开户账户卡号", demo = "6217300018962517")
	private String bankAccountNo;
	
	@OpenApiField(desc = "银行账户开户名 ", constraint = "银行账户开户名 ", demo = "张三")
	private String bankAccountName;
	
	@OpenApiField(desc = "开户行地址", constraint = "开户行地址", demo = "重新两江新区")
	private String bankAddress;
	
	@NotBlank
	@OpenApiField(desc = "银行简称 ", constraint = "银行简称 ", demo = "ABC")
	private String bankCode;
	
	@OpenApiField(desc = "卡类型", constraint = "卡类型", demo = "DEBIT_CARD")
	private String cardType;
	
	@OpenApiField(desc = "冻结解冻选项", constraint = "冻结解冻选项", demo = "SYSTEM_FREEZE")
	private String freezeType;
	
	@OpenApiField(desc = "充值类型", constraint = "充值类型", demo = "DEPOSIT_ONLY")
	private String depositType;
	
	@NotBlank
	@OpenApiField(desc = "业务请求者身份标识码", constraint = "业务请求者身份标识码", demo = "SPECIAL_MERCHANT")
	private String bizIdentity;
	
	@NotBlank
	@OpenApiField(desc = "业务号", constraint = "业务号", demo = "032")
	private String bizNo;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号 ", constraint = "系统交互会话流水号", demo = "20151218021119636673")
	private String outBizNo;
	
	@OpenApiField(desc = "备注", constraint = "备注", demo = "成功")
	private String memo;
	
	@OpenApiField(desc = "扩展跳转地址", constraint = "扩展跳转地址", demo = "https://www.baidu.com")
	private String extUrl;
	
	@OpenApiField(desc = "储备参数1", constraint = "储备参数1", demo = "sdfsdf")
	private String reserve1;
	
	@OpenApiField(desc = "储备参数2", constraint = "储备参数2", demo = "sdfsdf")
	private String reserve2;
	
	@OpenApiField(desc = "平台商ID", constraint = "平台商，在带个交易之中提供平台服务的商家", demo = "20151218020009636673")
	private String tradeMerchantId;
	
	@OpenApiField(desc = "参与者", constraint = "参与者", demo = "张三")
	private String tradePartnerId;
	
	@OpenApiField(desc = "产品编号", constraint = "产品编号", demo = "001")
	private String tradeBizProductCode;
	
	@OpenApiField(desc = "用户客户端IP", constraint = "目前使用ipv4的格式，例如192.168.1.110", demo = "192.168.1.110")
	private String userEndIp;
	
	/** 用户终端类型 **/
	@OpenApiField(desc = "用户终端类型", constraint = "用户终端类型", demo = "01")
	private String userTemunalType;
	
	/** 交易类型 **/
	@OpenApiField(desc = "交易类型", constraint = "交易类型", demo = "ESCROWTRADE")
	private String tradeCategory;
	
	/** 商品类型码 */
	@OpenApiField(desc = "商品类型码", constraint = "商品类型码", demo = "ACYK")
	private String goodsTypeCode;
	
	/** 商品类型名称 */
	@OpenApiField(desc = "商品类型名称 ", constraint = "商品类型名称 ", demo = "生活类")
	private String goodsTypeName;
	
	/** 商品名称 */
	@OpenApiField(desc = "商品名称", constraint = "商品名称", demo = "大米")
	private String goodsName;
	
	@OpenApiField(desc = "支付源", constraint = "支付源", demo = "ac1010")
	private String apis;
	
	@OpenApiField(desc = "支付参数", constraint = "支付参数", demo = "ac1010")
	private String payChannelApi;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Money getCharge() {
		return this.charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public String getChargeRule() {
		return this.chargeRule;
	}
	
	public void setChargeRule(String chargeRule) {
		this.chargeRule = chargeRule;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getBankAccountName() {
		return this.bankAccountName;
	}
	
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	
	public String getBankAddress() {
		return this.bankAddress;
	}
	
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	public String getBankCode() {
		return this.bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getCardType() {
		return this.cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getFreezeType() {
		return this.freezeType;
	}
	
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}
	
	public String getDepositType() {
		return this.depositType;
	}
	
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}
	
	public String getBizIdentity() {
		return this.bizIdentity;
	}
	
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getExtUrl() {
		return this.extUrl;
	}
	
	public void setExtUrl(String extUrl) {
		this.extUrl = extUrl;
	}
	
	public String getReserve1() {
		return this.reserve1;
	}
	
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	
	public String getReserve2() {
		return this.reserve2;
	}
	
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	
	public String getTradeMerchantId() {
		return this.tradeMerchantId;
	}
	
	public void setTradeMerchantId(String tradeMerchantId) {
		this.tradeMerchantId = tradeMerchantId;
	}
	
	public String getTradePartnerId() {
		return this.tradePartnerId;
	}
	
	public void setTradePartnerId(String tradePartnerId) {
		this.tradePartnerId = tradePartnerId;
	}
	
	public String getTradeBizProductCode() {
		return this.tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getUserEndIp() {
		return this.userEndIp;
	}
	
	public void setUserEndIp(String userEndIp) {
		this.userEndIp = userEndIp;
	}
	
	public String getUserTemunalType() {
		return this.userTemunalType;
	}
	
	public void setUserTemunalType(String userTemunalType) {
		this.userTemunalType = userTemunalType;
	}
	
	public String getTradeCategory() {
		return this.tradeCategory;
	}
	
	public void setTradeCategory(String tradeCategory) {
		this.tradeCategory = tradeCategory;
	}
	
	public String getGoodsTypeCode() {
		return this.goodsTypeCode;
	}
	
	public void setGoodsTypeCode(String goodsTypeCode) {
		this.goodsTypeCode = goodsTypeCode;
	}
	
	public String getGoodsTypeName() {
		return this.goodsTypeName;
	}
	
	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	
	public String getGoodsName() {
		return this.goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public String getApis() {
		return this.apis;
	}
	
	public void setApis(String apis) {
		this.apis = apis;
	}
	
	public String getPayChannelApi() {
		return this.payChannelApi;
	}
	
	public void setPayChannelApi(String payChannelApi) {
		this.payChannelApi = payChannelApi;
	}
}

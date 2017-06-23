/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月28日 下午6:14:08 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;
import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月28日
 */

public class OpenApiQueryDepositInfo implements Serializable{
	
	private static final long serialVersionUID = -3567160115738869000L;

	/** 交易时间 创建时间 yyyyMMDDHHMMSS */
	@OpenApiField(desc="交易时间 创建时间",constraint="格式:yyyyMMDDHHMMSS",demo="20151228181556")
	private Date payTime;
	
	/** 交易更新时间 **/
	@OpenApiField(desc="交易更新时间",constraint="格式:yyyyMMDDHHMMSS",demo="20151228181556")
	private Date payUpdateTime;
	
	/** 银行上账时间 **/
	@OpenApiField(desc="银行上账时间",constraint="格式:yyyyMMDDHHMMSS",demo="20151228181556")
	private Date settleDate;
	
	/** 充值来源(系统标识) */
	@OpenApiField(desc="充值来源(系统标识)",constraint="充值来源(系统标识)",demo="ESTATE_CQ")
	private String bizIdentity;
	
	/** 子业务类型 */
	@OpenApiField(desc="子业务类型",constraint="子业务类型",demo="EBANK")
	private String apiAccess;
	
	/** 用户id 会员id */
	@OpenApiField(desc="用户id 会员id",constraint="用户id 会员id",demo="20150619010000072320")
	private String userId;
	
	/** 充值账号 */
	@OpenApiField(desc="充值账号",constraint="充值账号",demo="admin")
	private String accountNo;
	
	/** 充值账户名 */
	@OpenApiField(desc="充值账户名",constraint="充值账户名",demo="admin")
	private String accountName;
	
	/** 支付流水 */
	@OpenApiField(desc="支付流水",constraint="支付流水",demo="2014100941C027784355")
	private String payNo;
	
	/** 账务流水 */
	@OpenApiField(desc="账务流水",constraint="账务流水",demo="00851410090951361888")
	private String accBizNo;
	
	/** 外部订单号 */
	@OpenApiField(desc="外部订单号",constraint="外部订单号",demo="00851410090951361888")
	private String outBizNo;
	
	/** 清算流水 银行流水 */
	@OpenApiField(desc="清算流水 银行流水",constraint="清算流水 银行流水",demo="00851410090951361888")
	private String settleBizNo;
	
	/** 清算api */
	@OpenApiField(desc="清算api",constraint="清算api",demo="icbc1144")
	private String settleChannelApi;
	
	/** 银行名称 资金渠道 */
	@OpenApiField(desc="银行名称 资金渠道 ",constraint="银行名称 资金渠道 ",demo="农业银行")
	private String bankName;
	
	/** 银行账号 卡号 */
	@OpenApiField(desc="银行账号 卡号",constraint="银行账号 卡号",demo="62103000154852254")
	private String bankAccountNo;
	
	/** 交易币种 **/
	@OpenApiField(desc="交易币种",constraint="交易币种",demo="CNY")
	private String currency;
	
	/** 充值金额 本金 */
	@OpenApiField(desc="充值金额 本金",constraint="充值金额 本金",demo="66.66")
	private Money amout;
	
	/** 手续费 */
	@OpenApiField(desc="手续费",constraint="手续费",demo="66.66")
	private Money charge;
	
	/** 充值总金额 本金+手续费 */
	@OpenApiField(desc="充值总金额 本金+手续费",constraint="充值总金额 本金+手续费",demo="66.66")
	private Money amouontIn;
	
	/** 充值状态 */
	@OpenApiField(desc="充值状态",constraint="充值状态",demo="INITIAL")
	private String status;
	
	/** 账期 */
	@OpenApiField(desc="账期",constraint="账期",demo="20141009")
	private String accountDay;
	
	/** 清算原因/银行原因 **/
	@OpenApiField(desc="清算原因/银行原因",constraint="清算原因/银行原因",demo="交易成功")
	private String settleReason;
	
	/** 商户会员ID **/
	@OpenApiField(desc="商户会员ID",constraint="商户会员ID",demo="20141229020000062199")
	private String merchantUserId;
	
	/** 商户卡号 **/
	@OpenApiField(desc="商户卡号",constraint="商户卡号",demo="20141229020000062199")
	private String merchantCardNo;
	
	/** 商户资金账号 **/
	@OpenApiField(desc="商户资金账号",constraint="商户资金账号",demo="20141229020000062199")
	private String merchantAccNo;
	
	/** 商户外部订单号 **/
	@OpenApiField(desc="商户外部订单号",constraint="商户外部订单号",demo="00851410090951361888")
	private String merchantOrderBizNo;
	
	/** 入口编码 **/
	@OpenApiField(desc="入口编码 ",constraint="入口编码 ",demo="01")
	private String inlet;
	
	/** 备注 原因 */
	@OpenApiField(desc="备注 原因",constraint="备注 原因",demo="二手房[105房地证2009字 第690号],交易号=20140804003000296435,首款")
	private String memo;
	
	public Date getPayTime() {
		return payTime;
	}
	
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPayNo() {
		return payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public String getAccBizNo() {
		return accBizNo;
	}
	
	public void setAccBizNo(String accBizNo) {
		this.accBizNo = accBizNo;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	
	public String getSettleChannelApi() {
		return settleChannelApi;
	}
	
	public void setSettleChannelApi(String settleChannelApi) {
		this.settleChannelApi = settleChannelApi;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	
	public String getSettleBizNo() {
		return settleBizNo;
	}
	
	public void setSettleBizNo(String settleBizNo) {
		this.settleBizNo = settleBizNo;
	}
	
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getApiAccess() {
		return apiAccess;
	}
	
	public void setApiAccess(String apiAccess) {
		this.apiAccess = apiAccess;
	}
	
	public Money getAmout() {
		return amout;
	}
	
	public void setAmout(Money amout) {
		this.amout = amout;
	}
	
	public Money getAmouontIn() {
		return amouontIn;
	}
	
	public void setAmouontIn(Money amouontIn) {
		this.amouontIn = amouontIn;
	}
	
	public Money getCharge() {
		return charge;
	}
	
	public void setCharge(Money charge) {
		this.charge = charge;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	public String getAccountDay() {
		return accountDay;
	}
	
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}
	
	public Date getPayUpdateTime() {
		return payUpdateTime;
	}
	
	public void setPayUpdateTime(Date payUpdateTime) {
		this.payUpdateTime = payUpdateTime;
	}

	
	public Date getSettleDate() {
		return settleDate;
	}
	
	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}
	
	public String getBizIdentity() {
		return bizIdentity;
	}
	
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	public String getSettleReason() {
		return settleReason;
	}
	
	public void setSettleReason(String settleReason) {
		this.settleReason = settleReason;
	}
	
	
	public String getMerchantUserId() {
		return merchantUserId;
	}
	
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
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
	
	
	public String getMerchantOrderBizNo() {
		return merchantOrderBizNo;
	}
	
	public void setMerchantOrderBizNo(String merchantOrderBizNo) {
		this.merchantOrderBizNo = merchantOrderBizNo;
	}
	
	
	public String getInlet() {
		return inlet;
	}
	
	public void setInlet(String inlet) {
		this.inlet = inlet;
	}
}

    
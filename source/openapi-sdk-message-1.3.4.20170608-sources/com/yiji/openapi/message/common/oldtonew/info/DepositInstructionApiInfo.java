/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 下午4:50:07 创建
*/

package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;
import java.util.Map;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */

public class DepositInstructionApiInfo implements Serializable {

	private static final long serialVersionUID = -38785913715071490L;

	@NotBlank
	@OpenApiField(desc = "充值流水", demo = "20140722999999999999")
	private String depositId;

	@OpenApiField(desc = "业务请求者身份标识码", demo = "MERCHANT")
	private String bizIdentity;

	@OpenApiField(desc = "外部订单号", demo = "20140711000000000000")
	private String outBizNo;

	@OpenApiField(desc = "外部上下文", demo = "xxx")
	private Map<String, String> outBizContext;

	@OpenApiField(desc = "账务冻结码", demo = "DEDUCT_FREEZE")
	private String freezeType;

	@OpenApiField(desc = "回执产品层的通知地址", demo = "http://www.xxx.xx.xxx/receipt")
	private String receiptUrl;

	@OpenApiField(desc = "回执优先级", demo = "0")
	private String priority;

	@OpenApiField(desc = "子协议代码",
			constraint = "{\"data\":[\"CZ00101:异步网关型充值协议\",\"CZ00102:异步线下充值协议\",\"CZ00103:代扣充值协议\",\"CZ00104:同步线下充值协议\",\"CZ00201:快捷支付充值协议\",\"CZ00301:异步证书型充值协议\",\"CZ00302:异步验证型充值协议\"],\"name\":\"子协议代码\"}",
			demo = "CZ00201")
	private String subContractCode;

	@OpenApiField(desc = "指令状态", demo = "SUCCESS")
	private String status;

	@OpenApiField(desc = "充值类型", demo = "DEPOSIT_ONLY")
	private String depositType;

	@OpenApiField(desc = "应付额币种", demo = "CNY")
	private String payAmountCurrency;

	@OpenApiField(desc = "应付额", demo = "1.11")
	private Money payAmount;

	@OpenApiField(desc = "应付实收额,加上手续费", demo = "1.11")
	private Money payAmountIn;

	@OpenApiField(desc = "账户账号", demo = "20140722010000000000")
	private String accountNo;

	@OpenApiField(desc = "账户名", demo = "法海")
	private String accountName;

	@OpenApiField(desc = "账户类别", demo = "BUSINESS")
	private String accountType;

	@OpenApiField(desc = "用户银行账号", demo = "6216613200019255887")
	private String bankAccountNo;

	@OpenApiField(desc = "用户开户名", demo = "法海")
	private String bankAccountName;

	@OpenApiField(desc = "银行代码", demo = "CCBC")
	private String bankCode;

	@OpenApiField(desc = "银行联号", demo = "6216")
	private String bankCnapsNo;

	@OpenApiField(desc = "银行名称", demo = "中国建设银行")
	private String bankName;

	@OpenApiField(desc = "支付渠道API接入方式", demo = "xxx")
	private String apiAccess;

	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	@OpenApiField(desc = "添加时间", demo = "2016-11-11 11:11:11")
	private String rawAddTime;

	@OpenApiField(desc = "修改时间", demo = "2016-11-11 11:11:11")
	private String rawUpdateTime;

	//	@OpenApiField(desc = "交易产品编码", demo = "20131018-financingyjDP")
	//	private String tradeBizProductCode;

	public String getDepositId() {
		return this.depositId;
	}

	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}

	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Map<String, String> getOutBizContext() {
		return this.outBizContext;
	}

	public void setOutBizContext(Map<String, String> outBizContext) {
		this.outBizContext = outBizContext;
	}

	public String getFreezeType() {
		return this.freezeType;
	}

	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

	public String getReceiptUrl() {
		return this.receiptUrl;
	}

	public void setReceiptUrl(String receiptUrl) {
		this.receiptUrl = receiptUrl;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getSubContractCode() {
		return this.subContractCode;
	}

	public void setSubContractCode(String subContractCode) {
		this.subContractCode = subContractCode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDepositType() {
		return this.depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public String getPayAmountCurrency() {
		return this.payAmountCurrency;
	}

	public void setPayAmountCurrency(String payAmountCurrency) {
		this.payAmountCurrency = payAmountCurrency;
	}

	public Money getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(Money payAmount) {
		this.payAmount = payAmount;
	}

	public Money getPayAmountIn() {
		return this.payAmountIn;
	}

	public void setPayAmountIn(Money payAmountIn) {
		this.payAmountIn = payAmountIn;
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

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
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

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCnapsNo() {
		return this.bankCnapsNo;
	}

	public void setBankCnapsNo(String bankCnapsNo) {
		this.bankCnapsNo = bankCnapsNo;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getApiAccess() {
		return this.apiAccess;
	}

	public void setApiAccess(String apiAccess) {
		this.apiAccess = apiAccess;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRawAddTime() {
		return this.rawAddTime;
	}

	public void setRawAddTime(String rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public String getRawUpdateTime() {
		return this.rawUpdateTime;
	}

	public void setRawUpdateTime(String rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}

}

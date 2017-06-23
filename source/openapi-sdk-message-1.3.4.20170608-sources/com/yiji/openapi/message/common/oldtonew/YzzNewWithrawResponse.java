/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午6:20:35 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "yzzNewWithraw", type = ApiMessageType.Response)
public class YzzNewWithrawResponse extends ApiResponse {

	@OpenApiField(desc = "提现流水号", demo = "5123456789")
	private String withdrawId;

	@OpenApiField(desc = "应付实收额", demo = "1.11")
	private Money amountIn;

	@OpenApiField(desc = "应付额", demo = "1.11")
	private Money amount;

	@OpenApiField(desc = "账户账号", demo = "20150519020005491913")
	private String userId;

	@OpenApiField(desc = "账户名", demo = "123@yiji.com")
	private String userName;

	@OpenApiField(desc = "用户银行账号", demo = "62260066***789")
	private String bankAccountNo;

	@OpenApiField(desc = "银行账户名", demo = "张三")
	private String bankAccountName;

	@OpenApiField(desc = "银行代码", demo = "ICBC")
	private String bankCode;

	@OpenApiField(desc = "银行名称", demo = "中国工商银行")
	private String bankName;

	@OpenApiField(desc = "银行地址", demo = "重庆市北部新区")
	private String bankAddress;

	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	public String getWithdrawId() {
		return this.withdrawId;
	}

	public void setWithdrawId(String withdrawId) {
		this.withdrawId = withdrawId;
	}

	public Money getAmountIn() {
		return this.amountIn;
	}

	public void setAmountIn(Money amountIn) {
		this.amountIn = amountIn;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return this.bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}

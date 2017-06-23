/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-14 11:29 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.WithdrawRecordInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "queryCowpayWithdraw", type = ApiMessageType.Response)
public class QueryCowpayWithdrawResponse extends ApiResponse {
	
	@OpenApiField(desc = "当前页")
	private int currPage;
	
	@OpenApiField(desc = "总记录数")
	private long count;
	
	@OpenApiField(desc = "本金总金额")
	private Money amounts;
	
	@OpenApiField(desc = "总金额 本金+手续费")
	private Money amountsIn;
	
	@OpenApiField(desc = "手续费总金额")
	private Money charges;
	
	@OpenApiField(desc = "记录列表")
	private List<WithdrawRecordInfo> withdrawInfos;
	
	public int getCurrPage() {
		return currPage;
	}
	
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	
	public long getCount() {
		return count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
	
	public Money getAmounts() {
		return amounts;
	}
	
	public void setAmounts(Money amounts) {
		this.amounts = amounts;
	}
	
	public Money getAmountsIn() {
		return amountsIn;
	}
	
	public void setAmountsIn(Money amountsIn) {
		this.amountsIn = amountsIn;
	}
	
	public Money getCharges() {
		return charges;
	}
	
	public void setCharges(Money charges) {
		this.charges = charges;
	}
	
	public List<WithdrawRecordInfo> getWithdrawInfos() {
		return withdrawInfos;
	}
	
	public void setWithdrawInfos(List<WithdrawRecordInfo> withdrawInfos) {
		this.withdrawInfos = withdrawInfos;
	}
}

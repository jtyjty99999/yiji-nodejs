/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月4日 下午3:40:32 创建
 */
package com.yiji.openapi.message.common.query;

import java.util.ArrayList;
import java.util.List;

import com.yiji.openapi.message.common.query.info.QueryDepositInfoResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "depositListQuery", type = ApiMessageType.Response)
public class DepositListQueryResponse extends ApiResponse {
	
	/** */
	@OpenApiField(desc = "当前页")
	private int currPage;
	
	@OpenApiField(desc = "总记录数")
	private long count;
	
	@OpenApiField(desc = "本金总金额")
	private Money amounts;
	
	@OpenApiField(desc = "总金额=本金+手续费")
	private Money amountsIn;
	
	@OpenApiField(desc = "手续费总金额")
	private Money charges;
	
	@OpenApiField(desc = "充值记录列表")
	private List<QueryDepositInfoResult> depositInfos = new ArrayList<QueryDepositInfoResult>();
	
	public int getCurrPage() {
		return this.currPage;
	}
	
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	
	public long getCount() {
		return this.count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
	
	public Money getAmounts() {
		return this.amounts;
	}
	
	public void setAmounts(Money amounts) {
		this.amounts = amounts;
	}
	
	public Money getAmountsIn() {
		return this.amountsIn;
	}
	
	public void setAmountsIn(Money amountsIn) {
		this.amountsIn = amountsIn;
	}
	
	public Money getCharges() {
		return this.charges;
	}
	
	public void setCharges(Money charges) {
		this.charges = charges;
	}
	
	public List<QueryDepositInfoResult> getDepositInfos() {
		return this.depositInfos;
	}
	
	public void setDepositInfos(List<QueryDepositInfoResult> depositInfos) {
		this.depositInfos = depositInfos;
	}
	
}

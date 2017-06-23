/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-05 11:05 创建
 *
 */
package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.AccountPageQueryResult;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "accountPageQuery", type = ApiMessageType.Response)
public class AccountPageQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户收支流水信息")
	private List<AccountPageQueryResult> accountPageQueryResults;
	
	/** 总记录数 */
	@OpenApiField(desc = "总记录数",demo = "10")
	private long totalCount = 0;
	
	@OpenApiField(desc = "页码",demo = "1")
	private int page;
	
	@OpenApiField(desc = "总页码数",demo = "1")
	private int totalPage;
	
	@OpenApiField(desc = "是否有下一页", constraint = "是否有下一页",demo = "false")
	private boolean nextPage;
	
	@OpenApiField(desc = "支出总金额", constraint = "支出总金额",demo = "88.66")
	private Money totalOutAmount;
	
	@OpenApiField(desc = "收入总金额", constraint = "收入总金额",demo = "88.66")
	private Money totalInAmount;
	
	public int getTotalPage() {
		return totalPage;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public int getPage() {
		
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public List<AccountPageQueryResult> getAccountPageQueryResults() {
		return accountPageQueryResults;
	}
	
	public void setAccountPageQueryResults(List<AccountPageQueryResult> accountPageQueryResults) {
		this.accountPageQueryResults = accountPageQueryResults;
	}
	
	public long getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
	public boolean isNextPage() {
		return nextPage;
	}
	
	public void setNextPage(boolean nextPage) {
		this.nextPage = nextPage;
	}
	
	public Money getTotalOutAmount() {
		return totalOutAmount;
	}
	
	public void setTotalOutAmount(Money totalOutAmount) {
		this.totalOutAmount = totalOutAmount;
	}
	
	public Money getTotalInAmount() {
		return totalInAmount;
	}
	
	public void setTotalInAmount(Money totalInAmount) {
		this.totalInAmount = totalInAmount;
	}
}

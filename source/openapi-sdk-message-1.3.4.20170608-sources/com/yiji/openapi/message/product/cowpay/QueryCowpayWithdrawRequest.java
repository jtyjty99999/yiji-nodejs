/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-04-14 11:16 创建
 *
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "queryCowpayWithdraw", type = ApiMessageType.Request)
public class QueryCowpayWithdrawRequest extends ApiRequest {
	
	@OpenApiField(desc = "当前页")
	private int currPage = 1;
	
	@OpenApiField(desc = "每页大小")
	private int pageSize = 10;
	
	@NotBlank
	@OpenApiField(desc = "账户id")
	protected String userId;
	
	@OpenApiField(desc = "起始时间,业务发生时间")
	private Date startTime;
	
	@OpenApiField(desc = "终止时间,业务发生时间")
	private Date endTime;
	
	public int getCurrPage() {
		return currPage;
	}
	
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}

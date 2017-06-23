/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月28日 下午5:55:13 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月28日
 */
@OpenApiMessage(service = "deposit.query", type = ApiMessageType.Request)
public class DepositQuery2Request extends ApiRequest{
	
	@NotBlank
	@OpenApiField(desc="用户ID",constraint="用户ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc="当前页",constraint="当前页",demo="1")
	private int currPage = 1;
	
	@OpenApiField(desc="每页大小",constraint="每页大小",demo="10")
	private int pageSize = 10;
	
	@OpenApiField(desc="外部订单号",constraint="外部订单号",demo="20150619010000072320")
	private String outBizNo;
	
	@OpenApiField(desc="起始时间,业务发生时间",constraint="格式:yyyy-MM-dd HH:mm",demo="2015-12-12 08:20")
	private String startTime;
	
	@OpenApiField(desc="终止时间,业务发生时间",constraint="格式:yyyy-MM-dd HH:mm",demo="2015-12-12 08:20")
	private String endTime;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCurrPage() {
		return this.currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}

    
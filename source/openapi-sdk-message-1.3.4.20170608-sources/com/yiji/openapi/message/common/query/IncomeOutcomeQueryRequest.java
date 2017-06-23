/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年9月3日 下午8:12:21 创建
 */
package com.yiji.openapi.message.common.query;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "incomeOutcomeQuery", type = ApiMessageType.Request)
public class IncomeOutcomeQueryRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户ID",demo = "12346579801234567980")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "查询开始时间",demo = "1972-12-12")
	private String beginDate;
	
	@NotBlank
	@OpenApiField(desc = "查询结束时间",demo = "1972-12-12")
	private String endDate;
	
	@Min(1)
	@OpenApiField(desc = "页码",demo = "1")
	private int pageNo = 1;
	
	@Min(1)
	@Max(100)
	@OpenApiField(desc = "每页记录数",demo = "20")
	private int pageSize = 20;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBeginDate() {
		return beginDate;
	}
	
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public int getPageNo() {
		return this.pageNo;
	}
	
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	public int getPageSize() {
		return this.pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}

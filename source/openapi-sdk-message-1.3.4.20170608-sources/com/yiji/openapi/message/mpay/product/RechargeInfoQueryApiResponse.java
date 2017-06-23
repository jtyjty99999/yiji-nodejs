/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * lvchen@yiji.com 2014年11月4日 下午12:09:05 创建
 */
package com.yiji.openapi.message.mpay.product;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.yiji.openapi.message.mpay.product.info.RechargeQueryInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author lvchen@yiji.com
 *
 */
@OpenApiMessage(service = "rechargeInfoQuery", type = ApiMessageType.Response)
public class RechargeInfoQueryApiResponse extends ApiResponse {
	
	/**
	 * 总条数
	 */
	@OpenApiField(desc = "总条数",demo = "1")
	@NotNull
	private int totalCount;
	
	/**
	 * 总页数
	 */
	@OpenApiField(desc = "总页数",demo = "1")
	@NotNull
	private int totalPageCount;
	
	/**
	 * 当前页
	 */
	@OpenApiField(desc = "当前页",demo = "1")
	@NotNull
	private int currentPageNo;
	
	/**
	 * 查询结果列表
	 */
	@OpenApiField(desc = "查询结果列表")
	private List<RechargeQueryInfo> rechargeQueryInfoList;
	
	public List<RechargeQueryInfo> getRechargeQueryInfoList() {
		return this.rechargeQueryInfoList;
	}
	
	public void setRechargeQueryInfoList(List<RechargeQueryInfo> rechargeQueryInfoList) {
		this.rechargeQueryInfoList = rechargeQueryInfoList;
	}
	
	public int getTotalCount() {
		return this.totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getTotalPageCount() {
		return this.totalPageCount;
	}
	
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public int getCurrentPageNo() {
		return this.currentPageNo;
	}
	
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	
}

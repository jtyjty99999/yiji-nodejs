/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-05 11:00 创建
 *
 */
package com.yiji.openapi.message.common.core;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "queryGrRecord", type = ApiMessageType.Request)
public class QueryGrRecordRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "会员ID")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "产品编码")
	private String productCode;
	
	@NotBlank
	@OpenApiField(desc = "子产品编码")
	private String subProductCode;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易流水号")
	private String tradeNo;
	
	@OpenApiField(desc = "交易开始时间", constraint = "请求受理时间")
	private Date startTime;
	
	@OpenApiField(desc = "交易结束时间", constraint = "请求受理时间")
	private Date endTime;
	
	@Min(1)
	@OpenApiField(desc = "开始位置")
	private int start = 1;
	
	@Max(1000)
	@OpenApiField(desc = "每页记录最大数")
	private int limit = 100;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public String getSubProductCode() {
		return subProductCode;
	}
	
	public void setSubProductCode(String subProductCode) {
		this.subProductCode = subProductCode;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
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
	
	public int getStart() {
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
}

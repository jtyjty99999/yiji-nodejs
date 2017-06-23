/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月24日 上午10:33:30 创建
 */
package com.yiji.openapi.message.upay;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upayQuickPay", type = ApiMessageType.Request)
public class UpayQuickPayQueryRequest extends ApiRequest {
	
	@Min(1)
	@OpenApiField(desc = "签约编号")
	private int start = 1;
	
	@Max(1000)
	@OpenApiField(desc = "每页记录最大数")
	private int limit = 100;
	
	@OpenApiField(desc = "服务器交易号")
	private String tradeNo;
	
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "服务器交易号")
	private String userId;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易开始时间(请求受理时间)")
	private Date startTime;
	
	@OpenApiField(desc = "[可选]交易结束时间(请求受理时间)")
	private Date endTime;
	
	public int getStart() {
		return this.start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getLimit() {
		return this.limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}

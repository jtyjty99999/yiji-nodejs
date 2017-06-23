package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "mpayQueryTransaction", type = ApiMessageType.Request)
public class MpayQueryTransRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "交易类型",constraint="交易类型",demo="ALLTYPE")
	private String transactionType;
	
	@OpenApiField(desc = "开始位置",constraint="开始位置",demo="1")
	private int start = 1;
	
	@OpenApiField(desc = "每页记录最大数",constraint="每页记录最大数",demo="66")
	private int limit = 100;
	
	@Length(max = 10, min = 10)
	@OpenApiField(desc = "交易开始时间", constraint = "yyyy-MM-dd",demo="2015-10-12")
	private String startTime;
	
	@Length(max = 10, min = 10)
	@OpenApiField(desc = "交易开始时间", constraint = "yyyy-MM-dd",demo="2015-10-15")
	private String endTime;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getTransactionType() {
		return transactionType;
	}
	
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
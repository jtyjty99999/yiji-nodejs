package com.yiji.openapi.message.common.query;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

import java.text.DateFormat;

@OpenApiMessage(service = "tradeRecordQuery", type = ApiMessageType.Request)
public class TradeRecordQueryRequest extends ApiRequest {

	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "易极付用户ID")
	private String userId;

	@Min(value = 1)
	@OpenApiField(desc = "页码")
	private Long pageNo;

	@Max(value = 50)
	@Min(value = 1)
	@OpenApiField(desc = "每页大小")
	private Long pageSize;

	@Length(max = 10, min = 10)
	@OpenApiField(desc = "开始时间",constraint = "格式：yyyy-MM-dd")
	private String startTime;

	@Length(max = 10, min = 10)
	@OpenApiField(desc = "结束时间",constraint = "格式：yyyy-MM-dd")
	private String endTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Long getPageNo() {
		return pageNo;
	}

	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	
}

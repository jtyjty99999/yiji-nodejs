package com.yiji.openapi.message.mpay.query;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "mpayTradeInfoQuery", type = ApiMessageType.Request)
public class MpayTradeInfoQueryRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "外部商户会员id",demo = "1234567890213456789")
	private String partnerUserId;
	
	@Min(value = 1)
	@OpenApiField(desc = "页码",demo = "1")
	private Long pageNo;
	
	@Max(value = 100)
	@Min(value = 1)
	@OpenApiField(desc = "每页大小",demo = "1")
	private Long pageSize;
	
	@Length(max = 10, min = 10)
	@OpenApiField(desc = "开始时间",constraint = "格式：yyyy-MM-dd",demo = "2015-10-12")
	private String startTime;
	
	@Length(max = 10, min = 10)
	@OpenApiField(desc = "结束时间",constraint = "格式：yyyy-MM-dd",demo = "2015-10-12")
	private String endTime;
	
	public String getPartnerUserId() {
		return partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public Long getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	
	public Long getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

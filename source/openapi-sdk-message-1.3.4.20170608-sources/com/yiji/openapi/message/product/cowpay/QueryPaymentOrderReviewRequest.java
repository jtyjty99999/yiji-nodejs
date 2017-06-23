/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月21日 上午9:47:04 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

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
@OpenApiMessage(service = "queryPaymentOrderReview", type = ApiMessageType.Request)
public class QueryPaymentOrderReviewRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 64)
	@OpenApiField(desc = "操作员ID")
	private String operatorId;
	
	@OpenApiField(desc = "交易类型", constraint = "1提现,2转账到借记卡,3转账到信用卡,4转账到易极付")
	private Integer[] paymentType;
	
	@OpenApiField(desc = "审核状态", constraint = "-1驳回,0审核中,1通过")
	private Integer[] reviewStatus;
	
	@OpenApiField(desc = "开始时间", constraint = "")
	private Date startTime;
	
	@OpenApiField(desc = "结束时间", constraint = "")
	private Date endTime;
	
	@OpenApiField(desc = "查询页数", constraint = "")
	private int pageNum = 1;
	
	@OpenApiField(desc = "每页查询数量", constraint = "")
	private int pageSize = 20;
	
	public String getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public Integer[] getPaymentType() {
		return this.paymentType;
	}
	
	public void setPaymentType(Integer[] paymentType) {
		this.paymentType = paymentType;
	}
	
	public Integer[] getReviewStatus() {
		return this.reviewStatus;
	}
	
	public void setReviewStatus(Integer[] reviewStatus) {
		this.reviewStatus = reviewStatus;
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
	
	public int getPageNum() {
		return this.pageNum;
	}
	
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public int getPageSize() {
		return this.pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}

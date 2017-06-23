/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月21日 下午5:00:23 创建
 */
package com.yiji.openapi.message.product.cowpay;

import javax.validation.constraints.NotNull;

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
@OpenApiMessage(service = "paymentOrderReview", type = ApiMessageType.Request)
public class PaymentOrderReviewRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(desc = "操作员ID")
	private String operatorId;
	
	@NotNull
	@OpenApiField(desc = "审核记录ID")
	private Long reviewId;
	
	@NotNull
	@OpenApiField(desc = "付款记录ID")
	private Long paymentId;
	
	@NotNull
	@OpenApiField(desc = "审核结果", constraint = "通过(1),驳回(-1")
	private Integer reviewStatus;
	
	@OpenApiField(desc = "描述")
	private String reviewMemo;
	
	public String getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public Long getReviewId() {
		return this.reviewId;
	}
	
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	
	public Long getPaymentId() {
		return this.paymentId;
	}
	
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	
	public Integer getReviewStatus() {
		return this.reviewStatus;
	}
	
	public void setReviewStatus(Integer reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	
	public String getReviewMemo() {
		return this.reviewMemo;
	}
	
	public void setReviewMemo(String reviewMemo) {
		this.reviewMemo = reviewMemo;
	}
	
}

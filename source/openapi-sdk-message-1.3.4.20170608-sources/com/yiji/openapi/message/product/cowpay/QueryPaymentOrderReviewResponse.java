/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月21日 上午10:40:43 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.ReviewRecordInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "queryPaymentOrderReview", type = ApiMessageType.Response)
public class QueryPaymentOrderReviewResponse extends ApiResponse {
	
	@OpenApiField(desc = "审核次数")
	private Integer waitingReviewNumber;
	
	@OpenApiField(desc = "审核记录列表")
	private List<ReviewRecordInfo> reviewRecordInfoPageList;
	
	public Integer getWaitingReviewNumber() {
		return this.waitingReviewNumber;
	}
	
	public void setWaitingReviewNumber(Integer waitingReviewNumber) {
		this.waitingReviewNumber = waitingReviewNumber;
	}
	
	public List<ReviewRecordInfo> getReviewRecordInfoPageList() {
		return this.reviewRecordInfoPageList;
	}
	
	public void setReviewRecordInfoPageList(List<ReviewRecordInfo> reviewRecordInfoPageList) {
		this.reviewRecordInfoPageList = reviewRecordInfoPageList;
	}
	
}

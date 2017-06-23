/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月21日 下午5:39:02 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.PaymentOrderInfo;
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
@OpenApiMessage(service = "queryPaymentOrderInfo", type = ApiMessageType.Response)
public class QueryPaymentOrderInfoResponse extends ApiResponse {
	
	@OpenApiField(desc = "订单信息")
	private PaymentOrderInfo paymentOrderInfo;
	
	@OpenApiField(desc = "审核记录列表")
	private List<ReviewRecordInfo> reviewRecordInfoList;
	
	public PaymentOrderInfo getPaymentOrderInfo() {
		return this.paymentOrderInfo;
	}
	
	public void setPaymentOrderInfo(PaymentOrderInfo paymentOrderInfo) {
		this.paymentOrderInfo = paymentOrderInfo;
	}
	
	public List<ReviewRecordInfo> getReviewRecordInfoList() {
		return this.reviewRecordInfoList;
	}
	
	public void setReviewRecordInfoList(List<ReviewRecordInfo> reviewRecordInfoList) {
		this.reviewRecordInfoList = reviewRecordInfoList;
	}
	
}

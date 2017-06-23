/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月12日 下午5:48:51 创建
 */
package com.yiji.openapi.message.common.deposit;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upayRefund", type = ApiMessageType.Notify)
public class UpayRefundNotify extends ApiNotify {
	
	@OpenApiField(desc = "退款交易流水号")
	private String takeBackNo;
	
	@OpenApiField(desc = "是否成功标志")
	private String isSuccess;
	
	@OpenApiField(desc = "退款金额")
	private String amount;
	
	@OpenApiField(desc = "详情原因")
	private String detail;
	
	public String getTakeBackNo() {
		return this.takeBackNo;
	}
	
	public void setTakeBackNo(String takeBackNo) {
		this.takeBackNo = takeBackNo;
	}
	
	public String getAmount() {
		return this.amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getDetail() {
		return this.detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getIsSuccess() {
		return this.isSuccess;
	}
	
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-25 17:46 创建
 *
 */
package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yjrBankCard3ElementsCheck", type = ApiMessageType.Response)
public class YjrBankCard3ElementsCheckResponse extends ApiResponse {
	/**
	 * 易极付交易流水号
	 */
	@OpenApiField(desc = "易极付交易流水号")
	private String transNo;
	/**
	 * 交易接收处理时间
	 */
	@OpenApiField(desc = "交易接收处理时间")
	private Date dealDate;

	/** 结果状态 */
	@OpenApiField(desc = "结果状态")
	protected String status;
	
	public String getTransNo() {
		return transNo;
	}
	
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	
	public Date getDealDate() {
		return dealDate;
	}
	
	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

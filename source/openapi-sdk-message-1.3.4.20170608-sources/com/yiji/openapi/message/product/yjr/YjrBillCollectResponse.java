/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-25 09:33 创建
 *
 */
package com.yiji.openapi.message.product.yjr;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yjrBillCollect", type = ApiMessageType.Response)
public class YjrBillCollectResponse extends ApiResponse {
	/**
	 * 易极付交易流水号
	 */
	@OpenApiField(desc = "交易流水号", constraint = "易极付交易流水号")
	private String transNo;
	/**
	 * 交易码
	 */
	@OpenApiField(desc = "交易码", constraint = "交易码")
	private String transCode;
	/**
	 * 交易接收处理时间
	 */
	@OpenApiField(desc = "交易处理时间", constraint = "交易处理时间")
	private Date dealDate;
	/**
	 * 清算完成时间
	 */
	@OpenApiField(desc = "清算完成时间", constraint = "清算完成时间")
	private Date settleDate;
	/**
	 * 交易金额
	 */
	@OpenApiField(desc = "交易金额", constraint = "交易金额")
	private Money transAmt;
	
	/** 结果状态 */
	@OpenApiField(desc = "状态", constraint = "交易结果状态")
	protected String status;
	
	public String getTransNo() {
		return transNo;
	}
	
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	
	public String getTransCode() {
		return transCode;
	}
	
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getDealDate() {
		return dealDate;
	}
	
	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}
	
	public Date getSettleDate() {
		return settleDate;
	}
	
	public void setSettleDate(Date settleDate) {
		this.settleDate = settleDate;
	}
	
	public Money getTransAmt() {
		return transAmt;
	}
	
	public void setTransAmt(Money transAmt) {
		this.transAmt = transAmt;
	}
}

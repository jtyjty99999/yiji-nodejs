/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-25 09:51 创建
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
@OpenApiMessage(service = "yjrOrderQuery", type = ApiMessageType.Response)
public class YjrOrderQueryResponse extends ApiResponse {
	/**
	 * 易极付交易流水号
	 */
	@OpenApiField(desc = "交易流水号", constraint = "易极付交易流水号")
	private String transNo;
	
	@OpenApiField(desc = "订单号", constraint = "创建交易时的订单号")
	private String outBizNo;
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
	protected String transString;

	@OpenApiField(desc = "交易结果信息",demo = "成功")
	private String transResultMessage;
	
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
	
	public String getTransString() {
		return transString;
	}
	
	public void setTransString(String transString) {
		this.transString = transString;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTransResultMessage() {
		return transResultMessage;
	}

	public void setTransResultMessage(String transResultMessage) {
		this.transResultMessage = transResultMessage;
	}
}

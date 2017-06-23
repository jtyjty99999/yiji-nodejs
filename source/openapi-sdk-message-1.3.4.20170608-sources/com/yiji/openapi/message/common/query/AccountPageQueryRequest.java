/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-05 11:04 创建
 *
 */
package com.yiji.openapi.message.common.query;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "accountPageQuery", type = ApiMessageType.Request)
public class AccountPageQueryRequest extends ApiRequest {

	@NotNull
	@OpenApiField(desc = "开始时间",demo = "1972-12-12 08:45:12")
	private Date beginCreateTime;

	@NotNull
	@OpenApiField(desc = "结束时间",demo = "1972-12-12 06:51:12")
	private Date endCreateTime;

	@NotBlank
	@Length(max = 20, min = 10)
	@OpenApiField(desc = "卡号",demo = "12345679801234567890")
	private String cardNo;
	
	@OpenApiField(desc = "收支方向", constraint = "收支方向",demo = "IN")
	private String paymentsDirection;
	
	@OpenApiField(desc = "业务类型", constraint = "业务类型",demo = "[{\"TRADE\":\"TRADE\",\"DEPOSIT\":\"DEPOSIT\"}]")
	private List<String> event;
	
	@Max(value = 500)
	@Min(value = 1)
	@OpenApiField(desc = "每页记录最大数",demo = "10")
	private long limit = 10;
	
	@OpenApiField(desc = "起始位置",demo = "0")
	private long start = 0;
	
	/** 外部订单号 */
	@Length(max = 64)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号",demo = "123465789")
	private String outBizNo;
	
	@Length(max = 64)
	@OpenApiField(desc = "交易流水号", constraint = "易极付交易号",demo = "1235644789")
	private String tradeNo;
	
	public Date getBeginCreateTime() {
		return beginCreateTime;
	}
	
	public void setBeginCreateTime(Date beginCreateTime) {
		this.beginCreateTime = beginCreateTime;
	}
	
	public Date getEndCreateTime() {
		return endCreateTime;
	}
	
	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public long getLimit() {
		return limit;
	}
	
	public void setLimit(long limit) {
		this.limit = limit;
	}
	
	public long getStart() {
		return start;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public String getPaymentsDirection() {
		return paymentsDirection;
	}
	
	public void setPaymentsDirection(String paymentsDirection) {
		this.paymentsDirection = paymentsDirection;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public List<String> getEvent() {
		return event;
	}

	public void setEvent(List<String> event) {
		this.event = event;
	}
}

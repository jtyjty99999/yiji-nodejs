/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-03-09 14:06 创建
 *
 */
package com.yiji.openapi.message.common.query;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "reconciliationQuery", type = ApiMessageType.Request)
public class ReconciliationQueryRequest extends ApiRequest {
	
	@OpenApiField(desc = "数据业务类型")
	private List<String> dataBizTypes;
	
	@OpenApiField(desc = "用户ID")
	@Length(max = 20, min = 20)
	private String userId;
	
	@OpenApiField(desc = "交易对象ID")
	@Length(max = 20, min = 20)
	private String counterPartyUserId;
	
	@OpenApiField(desc = "业务产品编码")
	private String tradeBizProductCode;
	
	@OpenApiField(desc = "银行代码")
	private String bankCode;
	
	@OpenApiField(desc = "银行账户号")
	private String bankAccountNo;
	
	@OpenApiField(desc = "账期")
	private String accountDay;
	
	@NotNull
	@OpenApiField(desc = "开始时间")
	private Date beginCreateTime;
	
	@NotNull
	@OpenApiField(desc = "截止时间")
	private Date endCreateTime;
	
	@OpenApiField(desc = "付款流向")
	private String richDirection;
	
	@OpenApiField(desc = "起始位置")
	private long start = 0;
	
	@Max(value = 100)
	@Min(value = 1)
	@OpenApiField(desc = "每页记录最大数")
	private long limit = 10;
	
	public List<String> getDataBizTypes() {
		return dataBizTypes;
	}
	
	public void setDataBizTypes(List<String> dataBizTypes) {
		this.dataBizTypes = dataBizTypes;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCounterPartyUserId() {
		return counterPartyUserId;
	}
	
	public void setCounterPartyUserId(String counterPartyUserId) {
		this.counterPartyUserId = counterPartyUserId;
	}
	
	public String getTradeBizProductCode() {
		return tradeBizProductCode;
	}
	
	public void setTradeBizProductCode(String tradeBizProductCode) {
		this.tradeBizProductCode = tradeBizProductCode;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getAccountDay() {
		return accountDay;
	}
	
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}
	
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
	
	public String getRichDirection() {
		return richDirection;
	}
	
	public void setRichDirection(String richDirection) {
		this.richDirection = richDirection;
	}
	
	public long getStart() {
		return start;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public long getLimit() {
		return limit;
	}
	
	public void setLimit(long limit) {
		this.limit = limit;
	}
}

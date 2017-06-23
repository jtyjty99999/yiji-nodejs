/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-28 10:09 创建
 *
 */
package com.yiji.openapi.message.product.ccp;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */

@OpenApiMessage(service = "easySpeedLoanProfit", type = ApiMessageType.Request)
public class EasySpeedLoanProfitRequest extends ApiRequest {
	
	@NotNull
	@OpenApiField(desc = "分润总金额")
	private Money profitAmount;
	
	@NotNull
	@OpenApiField(desc = "贷款总金额")
	private Money loanAmount;
	
	@NotEmpty
	@OpenApiField(desc = "易房保交易id")
	private String tradeId;
	
	@NotNull
	@OpenApiField(desc = "分润模板id")
	private Long profitTemplateId;
	
	@NotNull
	@OpenApiField(desc = "开始时间")
	private Date startTime;
	
	@NotNull
	@OpenApiField(desc = "银行贷款发放时间")
	private Date bankLoanTime;
	
	@NotEmpty
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;

	@OpenApiField(desc = "系统平台id")
	private String platformId;
	
	public Money getProfitAmount() {
		return profitAmount;
	}
	
	public void setProfitAmount(Money profitAmount) {
		this.profitAmount = profitAmount;
	}
	
	public Money getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(Money loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public String getTradeId() {
		return tradeId;
	}
	
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	
	public Long getProfitTemplateId() {
		return profitTemplateId;
	}
	
	public void setProfitTemplateId(Long profitTemplateId) {
		this.profitTemplateId = profitTemplateId;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getBankLoanTime() {
		return bankLoanTime;
	}
	
	public void setBankLoanTime(Date bankLoanTime) {
		this.bankLoanTime = bankLoanTime;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getPlatformId() {
		return platformId;
	}
	
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
}

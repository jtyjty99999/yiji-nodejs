/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-21 15:39 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzTenderTradeCreate", type = ApiMessageType.Request)
public class YzzTenderTradeCreateRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "借款项目编码。", constraint = "唯一标识借款项目，可以使他们的合同号或自定义编码")
	@Size(min = 20, max = 64)
	private String tenderCode;
	
	@NotEmpty
	@OpenApiField(desc = "借款项目标题")
	@Size(min = 5, max = 64)
	private String tenderTitle;
	
	@NotNull
	@OpenApiField(desc = "交易类型(默认P2P)", constraint = "可选值：{P2P}")
	private String tradeType;
	
	@NotNull
	@OpenApiField(desc = "付款方式(默认冻结)", constraint = "可选值：{transfer:即时到账,frezee:冻结待付}")
	private String paymentType;
	
	@OpenApiField(desc = "资金流模式", constraint = "可选值：{Direct:直接到账,Bridge:监管户中转}")
	private String cashFlowType;
	
	@OpenApiField(desc = "满标生效是否需要商户审批(默认不需要)")
	private boolean needApproval = false;
	
	@NotEmpty
	@OpenApiField(desc = "借款人用户Id")
	@Size(min = 20, max = 20)
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "借款项目总金额")
	private Money tenderAmount;
	
	@OpenApiField(desc = "借款项目类型(抵押，质押，信用)")
	@Size(min = 0, max = 32)
	private String tenderType;
	
	@OpenApiField(desc = "借款项目周期(天)")
	@Size(min = 0, max = 32)
	private String tenderPeriod;
	
	@OpenApiField(desc = "借款项目年利率")
	@Size(min = 0, max = 32)
	private String tenderRate;
	
	@OpenApiField(desc = "备注")
	@Length(max = 128)
	private String memo;
	
	public String getTenderCode() {
		return tenderCode;
	}
	
	public void setTenderCode(String tenderCode) {
		this.tenderCode = tenderCode;
	}
	
	public String getTenderTitle() {
		return tenderTitle;
	}
	
	public void setTenderTitle(String tenderTitle) {
		this.tenderTitle = tenderTitle;
	}
	
	public String getTradeType() {
		return tradeType;
	}
	
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public String getCashFlowType() {
		return cashFlowType;
	}
	
	public void setCashFlowType(String cashFlowType) {
		this.cashFlowType = cashFlowType;
	}
	
	public boolean isNeedApproval() {
		return needApproval;
	}
	
	public void setNeedApproval(boolean needApproval) {
		this.needApproval = needApproval;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getTenderAmount() {
		return tenderAmount;
	}
	
	public void setTenderAmount(Money tenderAmount) {
		this.tenderAmount = tenderAmount;
	}
	
	public String getTenderType() {
		return tenderType;
	}
	
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	
	public String getTenderPeriod() {
		return tenderPeriod;
	}
	
	public void setTenderPeriod(String tenderPeriod) {
		this.tenderPeriod = tenderPeriod;
	}
	
	public String getTenderRate() {
		return tenderRate;
	}
	
	public void setTenderRate(String tenderRate) {
		this.tenderRate = tenderRate;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 14:21 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.product.yzz.info.ProfitOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "yzzHandTenderPayment", type = ApiMessageType.Request)
public class YzzHandTenderPaymentRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "借款项目主交易号")
	@Size(min = 20, max = 20)
	private String tradeNo;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotEmpty
	@OpenApiField(desc = "投资用戶ID")
	@Size(min = 20, max = 20)
	private String userId;
	
	@OpenApiField(desc = "奖励金额")
	private Money bonusAmount;
	
	@OpenApiField(desc = "体验金")
	private Money experAmount;
	
	@NotNull
	@OpenApiField(desc = "投资金额")
	private Money amount;
	
	@Length(max = 128)
	@OpenApiField(desc = "备注")
	private String memo;
	
	@Size(min = 0, max = 10)
	@OpenApiField(desc = "分润列表", constraint = "当投资到账方式为即时到账时分润列表可用")
	private List<ProfitOrder> profits;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getBonusAmount() {
		return bonusAmount;
	}
	
	public void setBonusAmount(Money bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	
	public Money getExperAmount() {
		return experAmount;
	}
	
	public void setExperAmount(Money experAmount) {
		this.experAmount = experAmount;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public List<ProfitOrder> getProfits() {
		return profits;
	}
	
	public void setProfits(List<ProfitOrder> profits) {
		this.profits = profits;
	}
}

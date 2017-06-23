/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-26 10:11 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import java.util.LinkedList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.message.common.installment.info.OpenapiExtraSettleItem;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentSelfRepay", type = ApiMessageType.Request)
public class InstallmentSelfRepayRequest extends ApiRequest {
	
	@NotEmpty
	@OpenApiField(desc = "合约号", constraint = "还款合约号",demo="20151022000204923296")
	private String contractNo;
	
	@NotEmpty
	@OpenApiField(desc = "订单号", constraint = "商户订单号",demo="")
	private String externalOrderNo;
	
	@NotNull
	@OpenApiField(desc = "还款总金额", constraint = "自助还款的总金额（包括滞纳金）")
	private Money totalAmount;
	
	@OpenApiField(desc = "滞纳金", constraint = "未按时还款产生的滞纳金")
	private Money overdueFineAmount = new Money(0L);
	
	@Min(0L)
	@OpenApiField(desc = "还款截止期数", constraint = "还款的截止期数。默认值为当前月份所在期数。")
	private int currentTime;
	
	@OpenApiField(desc = "额外结算列表", constraint = "设置清分结算规则，金额和指定结算账户")
	private List<OpenapiExtraSettleItem> openapiExtraSettleItemList = new LinkedList<OpenapiExtraSettleItem>();
	
	public List<OpenapiExtraSettleItem> getOpenapiExtraSettleItemList() {
		return this.openapiExtraSettleItemList;
	}
	
	public void setOpenapiExtraSettleItemList(List<OpenapiExtraSettleItem> openapiExtraSettleItemList) {
		this.openapiExtraSettleItemList = openapiExtraSettleItemList;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Money getOverdueFineAmount() {
		return overdueFineAmount;
	}
	
	public void setOverdueFineAmount(Money overdueFineAmount) {
		this.overdueFineAmount = overdueFineAmount;
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
}

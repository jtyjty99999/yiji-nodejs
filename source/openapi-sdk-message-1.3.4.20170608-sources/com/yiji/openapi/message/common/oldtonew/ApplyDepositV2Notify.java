/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月11日 下午3:34:29 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月11日
 */
@OpenApiMessage(service = "applyDepositV2", type = ApiMessageType.Notify)
public class ApplyDepositV2Notify extends ApiNotify {
	
	@OpenApiField(desc = "支付流水号", constraint = "支付流水号", demo = "2014071841C027413057")
	private String payNo;
	
	@OpenApiField(desc = "账期", constraint = "账期", demo = "20160322")
	private String accountDay;
	
	@OpenApiField(desc = "业务请求者身份标识码 ", constraint = "业务请求者身份标识码 ", demo = "ESTATE_CQ")
	private String bizIdentity;
	
	@OpenApiField(desc = "外部业务单据号 ", constraint = "属于产品码所对应的业务流水号 ", demo = "2014071841C027413057")
	private String outBizNo;
	
	@OpenApiField(desc = "支付金额  ", constraint = "支付金额 ", demo = "66.66")
	private Money amount = Money.zero();
	
	@OpenApiField(desc = "支付类型  ", constraint = "支付金额 ", demo = "DEPOSIT")
	private String payType;
	
	public String getPayNo() {
		return this.payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	public String getAccountDay() {
		return this.accountDay;
	}
	
	public void setAccountDay(String accountDay) {
		this.accountDay = accountDay;
	}
	
	public String getBizIdentity() {
		return this.bizIdentity;
	}
	
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}
	
	public String getOutBizNo() {
		return this.outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPayType() {
		return this.payType;
	}
	
	public void setPayType(String payType) {
		this.payType = payType;
	}
}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午6:20:01 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.List;

import com.yiji.openapi.message.common.oldtonew.info.PaymentNGResultApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "applyBillPaymentV2", type = ApiMessageType.Response)
public class ApplyBillPaymentV2Response extends ApiResponse {

	@OpenApiField(desc = "易生活订单号", demo = "123456789987654321")
	private String easyLifeOrderNo;

	@OpenApiField(desc = "订单状态", demo = "SUCCESS")
	private String orderStatus;

	@OpenApiField(desc = "备付金余额", demo = "1.11")
	private Money balance;

	@OpenApiField(desc = "外部订单号", demo = "123456789987654321")
	private String outBizNo;

	@OpenApiField(desc = "缴费结果信息", demo = "XXX")
	private List<PaymentNGResultApiInfo> paymentResultInfos;

	public String getEasyLifeOrderNo() {
		return this.easyLifeOrderNo;
	}

	public void setEasyLifeOrderNo(String easyLifeOrderNo) {
		this.easyLifeOrderNo = easyLifeOrderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Money getBalance() {
		return this.balance;
	}

	public void setBalance(Money balance) {
		this.balance = balance;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PaymentNGResultApiInfo> getPaymentResultInfos() {
		return this.paymentResultInfos;
	}

	public void setPaymentResultInfos(List<PaymentNGResultApiInfo> paymentResultInfos) {
		this.paymentResultInfos = paymentResultInfos;
	}

}

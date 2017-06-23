/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午10:32:37 创建
*/

package com.yiji.openapi.message.common.oldtonew.info;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */

public class PaymentOrderItemApiInfo {

	@Length(max = 20, min = 5, message = "合作伙伴订单号长度不合法")
	@OpenApiField(desc = "条目外部流水号", demo = "20168643478748")
	private String itemOutSerialNo;

	@OpenApiField(desc = "条目缴费金额", demo = "1.11")
	private Money itemPaymentAmount;

	@OpenApiField(desc = "用户欠费金额", demo = "1.11")
	private Money itemPayable;

	@OpenApiField(desc = "缴费渠道号", demo = "026")
	private String channelCode;

	@NotBlank
	@OpenApiField(desc = "缴费类型",
			constraint = "{\"data\":[\"000010:水费\",\"000020:燃气费\",\"000030:电费\",\"000040:手机话费\",\"000050:有线电视基本费\",\"000060:垃圾费\",\"000070:固定电话费\",\"000080:宽带网络费\",\"000090:有线电视互动费\"],\"name\":\"XXX\"}",
			demo = "000010")
	private String paymentType;

	public String getItemOutSerialNo() {
		return this.itemOutSerialNo;
	}

	public void setItemOutSerialNo(String itemOutSerialNo) {
		this.itemOutSerialNo = itemOutSerialNo;
	}

	public Money getItemPaymentAmount() {
		return this.itemPaymentAmount;
	}

	public void setItemPaymentAmount(Money itemPaymentAmount) {
		this.itemPaymentAmount = itemPaymentAmount;
	}

	public Money getItemPayable() {
		return this.itemPayable;
	}

	public void setItemPayable(Money itemPayable) {
		this.itemPayable = itemPayable;
	}

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
}

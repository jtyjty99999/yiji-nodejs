/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午8:52:35 创建
 */

package com.yiji.openapi.message.mpay.trade;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author dengwei@yiji.com
 *
 */
@OpenApiMessage(service = "mpayDirectTransfer", type = ApiMessageType.Request)
public class DirectTransferRequest extends ApiRequest {

	/**
	 * 外部会员id
	 */
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "易极付会员id", demo = "12345679801234567890")
	private String userId;

	@Length(max = 32)
	@OpenApiField(desc = "易极付绑卡编号/签约流水号", demo = "14556770495680575")
	private String pactNo;

	@NotNull
	@OpenApiField(desc = "金额", demo = "88.66")
	private Money amount;

	@Length(max = 120)
	@OpenApiField(desc = "交易备注", demo = "用于购买xxxx")
	private String memo;

	@NotBlank
	@Length(max = 32, min = 10)
	@OpenApiField(desc = "商户订单号", demo = "14556680575")
	private String merchantOrderNo;

	@OpenApiField(desc = "延迟时间", constraint = "延迟处理时间，以小时为单位;0表示立即报送", demo = "24")
	private int delayHours;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public Money getAmount() {
		return this.amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public int getDelayHours() {
		return delayHours;
	}

	public void setDelayHours(int delayHours) {
		this.delayHours = delayHours;
	}
}

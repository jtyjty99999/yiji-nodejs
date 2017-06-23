/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午10:18:44 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.Size;

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
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "drawback", type = ApiMessageType.Request)
public class DrawbackRequest extends ApiRequest {

	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号", demo = "20160121000043128431")
	private String tradeNo;

	@OpenApiField(desc = "退款额", demo = "1.11",constraint = "如果不传或入参为负值，则视为全额退款")
	private Money refundAmount;

	@OpenApiField(desc = "退款日期", demo = "2016-11-11",constraint = "格式：yyyy-mm-dd")
	private String refundTime;

	@NotBlank
	@Size(max = 256)
	@OpenApiField(desc = "退款原因", demo = "货物未发送")
	private String refundReason;

	@Length(max = 256)
	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	@NotBlank
	@Size(max = 64)
	@OpenApiField(desc = "外部订单号", demo = "1453367005356601")
	private String outOrderNo;

	@Size(max = 10, min = 1)
	@OpenApiField(desc = "字符编码", demo = "utf-8",constraint = "默认为utf-8")
	private String inputCharset = "utf-8";

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Money getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Money refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundTime() {
		return this.refundTime;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}

	public String getRefundReason() {
		return this.refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getInputCharset() {
		return this.inputCharset;
	}

	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
	}

}

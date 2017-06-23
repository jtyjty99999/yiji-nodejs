/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月25日 上午10:33:55 创建
 */
package com.yiji.openapi.message.product.easyexchange;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "singlePaymentUpload", type = ApiMessageType.Response)
public class SinglePaymentUploadResponse extends ApiResponse {
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "156772595")
	private String outOrderNo;
	
	@OpenApiField(desc = "支付交易号", constraint = "支付交易号，也叫交易流水号", demo = "20151125000002637903")
	private String tradeNo;
	
	@NotNull
	@OpenApiField(desc = "支付单金额", constraint = "交易总金额", demo = "6.66")
	private Money paymentBillMoney;
	
	@NotBlank
	@OpenApiField(desc = "结果状态",
			constraint = "SUCCESS(\"success\", \"成功\"),FAIL(\"fail\", \"失败\"),PROCESSING(\"processing\", \"处理中\");",
			demo = "SUCCESS")
	private String status;
	
	@OpenApiField(desc = "信息码", constraint = "信息码", demo = "E0001")
	private String code;
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeNo() {
		return this.tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public Money getPaymentBillMoney() {
		return this.paymentBillMoney;
	}
	
	public void setPaymentBillMoney(Money paymentBillMoney) {
		this.paymentBillMoney = paymentBillMoney;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
}

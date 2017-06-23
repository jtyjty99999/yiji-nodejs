/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年11月25日 上午10:34:09 创建
 */
package com.yiji.openapi.message.product.easyexchange;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 *
 */
@OpenApiMessage(service = "singlePaymentUpload", type = ApiMessageType.Notify)
public class SinglePaymentUploadNotify extends ApiNotify {
	@NotBlank
	@Length(max = 30)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号", demo = "156772595")
	private String outOrderNo;
	
	@OpenApiField(desc = "支付交易号", constraint = "支付交易号，也叫交易流水号", demo = "20151125000002637903")
	private String tradeNo;
	
	@OpenApiField(desc = "可用上传金额", constraint = "商户可用上传金额", demo = "6.66")
	private String availableBalance;
	
	@NotBlank
	@OpenApiField(desc = "结果状态",
			constraint = "SUCCESS(\"success\", \"成功\"),FAIL(\"fail\", \"失败\"),PROCESSING(\"processing\", \"处理中\");",
			demo = "processing")
	private String status;
	
	@OpenApiField(desc = "结果描述", constraint = "结果描述", demo = "支付单上传成功")
	private String memo;
	
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
	
	public String getAvailableBalance() {
		return this.availableBalance;
	}
	
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}

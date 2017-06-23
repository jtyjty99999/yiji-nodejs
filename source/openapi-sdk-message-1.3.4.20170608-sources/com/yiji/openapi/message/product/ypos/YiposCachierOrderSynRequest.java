/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年12月8日 上午10:57:06 创建
 */
package com.yiji.openapi.message.product.ypos;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "yiposCachierOrderSyn", type = ApiMessageType.Request)
public class YiposCachierOrderSynRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "pos机商户号")
	private String merchantId;
	
	@NotBlank
	@OpenApiField(desc = "pos机终端号")
	private String terminalId;
	
	@NotBlank
	@OpenApiField(desc = "受保人身份证号码")
	private String targetIdNo;
	
	@NotBlank
	@OpenApiField(desc = "受保人姓名")
	private String targetName;
	
	@NotNull
	@OpenApiField(desc = "金额")
	private Money amount;
	
	@OpenApiField(desc = "目标卡号")
	private String targetCardNumber;
	
	public String getMerchantId() {
		return this.merchantId;
	}
	
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	public String getTerminalId() {
		return this.terminalId;
	}
	
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	
	public String getTargetIdNo() {
		return this.targetIdNo;
	}
	
	public void setTargetIdNo(String targetIdNo) {
		this.targetIdNo = targetIdNo;
	}
	
	public String getTargetName() {
		return this.targetName;
	}
	
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getTargetCardNumber() {
		return this.targetCardNumber;
	}
	
	public void setTargetCardNumber(String targetCardNumber) {
		this.targetCardNumber = targetCardNumber;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

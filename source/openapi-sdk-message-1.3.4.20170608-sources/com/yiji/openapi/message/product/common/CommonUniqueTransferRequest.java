/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * @author xinqing@yiji.com 下午3:08:23 创建
 */
package com.yiji.openapi.message.product.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.message.product.common.info.OpenapiTransferBankOrder;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "commonUniqueTransfer", type = ApiMessageType.Request)
public class CommonUniqueTransferRequest extends ApiRequest {
	@NotNull(message = "金额不能为空")
	@OpenApiField(desc = "金额", constraint = "汇付或转账金额且金额大于0", demo = "66.66")
	private Money amount;
	
	@Length(max = 20)
	@OpenApiField(desc = "收款人ID", constraint = "汇付或转账收款人ID", demo = "2541254698412563214")
	private String sellerUserId;
	
	@OpenApiField(desc = "延迟时间", constraint = "延迟处理时间，以小时为单位;0表示立即报送", demo = "24")
	private int delayHours;
	
	@Length(max = 256)
	@OpenApiField(desc = "备注", constraint = "备注", demo = "转账成功")
	private String memo;
	
	@OpenApiField(desc = "收款人银行信息", constraint = "收款人银行信息", demo = "")
	private OpenapiTransferBankOrder transferBankOrder;
	
	@OpenApiField(desc = "外部订单号", demo = "324651032465")
	private String outOrderNo;
	
	@OpenApiField(desc = "自定义收费规则", constraint = "自定义收费规则，在收费规则中配置后使用", demo = "sadas")
	private String chargeExtends;
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getSellerUserId() {
		return this.sellerUserId;
	}
	
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}
	
	public int getDelayHours() {
		return this.delayHours;
	}
	
	public void setDelayHours(int delayHours) {
		this.delayHours = delayHours;
	}
	
	public String getMemo() {
		return this.memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public OpenapiTransferBankOrder getTransferBankOrder() {
		return this.transferBankOrder;
	}
	
	public void setTransferBankOrder(OpenapiTransferBankOrder transferBankOrder) {
		this.transferBankOrder = transferBankOrder;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getChargeExtends() {
		return this.chargeExtends;
	}
	
	public void setChargeExtends(String chargeExtends) {
		this.chargeExtends = chargeExtends;
	}
	
}

package com.yiji.openapi.message.common.transferAccounts;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "commonSpecialTransfers", type = ApiMessageType.Notify)
public class CommonSpecialTransfersNotify extends ApiNotify {
	
	@OpenApiField(desc = "商户订单号",demo = "213465798031245648")
	private String merchantOrderNo;
	
	@OpenApiField(desc = "订单号",demo = "12123456987132")
	private String bizNo;
	
	@OpenApiField(desc = "金额",demo = "88.66")
	private Money amount;
	
	@OpenApiField(desc = "失败原因",demo = "余额不足")
	private String failReason;
	
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	
	public String getBizNo() {
		return this.bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public Money getAmount() {
		return this.amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getFailReason() {
		return this.failReason;
	}
	
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	
}

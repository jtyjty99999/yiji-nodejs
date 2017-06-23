package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * 移动转账响应对象
 * 
 * @author lingjiao
 * 
 */
@OpenApiMessage(service = "mpayTransfer", type = ApiMessageType.Response)
public class MpayTransferResponse extends ApiResponse {
	
	@NotBlank
	@OpenApiField(desc = "转账总金额",constraint="转账总金额",demo="66.66")
	private Money amount;
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
}

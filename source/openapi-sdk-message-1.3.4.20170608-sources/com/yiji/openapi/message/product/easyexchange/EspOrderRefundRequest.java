package com.yiji.openapi.message.product.easyexchange;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "espOrderRefund", type = ApiMessageType.Request)
public class EspOrderRefundRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@NotNull
	@OpenApiField(desc = "退款金额")
	private Money refundMoney;
	
	@Length(max = 100)
	@OpenApiField(desc = "原因")
	private String reason;
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public Money getRefundMoney() {
		return refundMoney;
	}
	
	public void setRefundMoney(Money refundMoney) {
		this.refundMoney = refundMoney;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}
package com.yiji.openapi.message.product.easyexchange;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "espOrderCancel", type = ApiMessageType.Request)
public class EspOrderCancelRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "外部商户订单号")
	private String outOrderNo;
	
	@Length(max = 100)
	@OpenApiField(desc = "原因")
	private String reason;
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}
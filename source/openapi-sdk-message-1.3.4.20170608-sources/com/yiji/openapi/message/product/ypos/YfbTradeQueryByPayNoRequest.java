package com.yiji.openapi.message.product.ypos;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "yfbTradeQueryByPayNo", type = ApiMessageType.Request)
public class YfbTradeQueryByPayNoRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "支付流水号")
	private String payNo;
	
	public String getPayNo() {
		return payNo;
	}
	
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
}

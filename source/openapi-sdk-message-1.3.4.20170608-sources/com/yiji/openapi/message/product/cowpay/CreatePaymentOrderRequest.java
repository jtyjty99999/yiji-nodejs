package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/3/25.
 */
@OpenApiMessage(service = "createPaymentOrder", type = ApiMessageType.Request)
public class CreatePaymentOrderRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 40)
	@OpenApiField(desc = "")
	private String customerId;
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

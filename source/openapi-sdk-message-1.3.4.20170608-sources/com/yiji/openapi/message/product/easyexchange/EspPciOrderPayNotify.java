package com.yiji.openapi.message.product.easyexchange;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;


@OpenApiMessage(service = "espPciOrderPay", type = ApiMessageType.Notify)
public class EspPciOrderPayNotify extends ApiNotify {
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "支付状态", constraint = "success/fail")
	private String pay_status;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getPay_status() {
		return pay_status;
	}
	
	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
	
}

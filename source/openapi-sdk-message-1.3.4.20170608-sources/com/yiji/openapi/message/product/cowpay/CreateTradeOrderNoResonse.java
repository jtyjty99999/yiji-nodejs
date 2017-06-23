package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/4/18.
 */
@OpenApiMessage(service = "createTradeOrderNo", type = ApiMessageType.Response)
public class CreateTradeOrderNoResonse extends ApiResponse {
	
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	@OpenApiField(desc = "交易订单号")
	private String tradeOrderNo;
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
	public String getTradeOrderNo() {
		return tradeOrderNo;
	}
	
	public void setTradeOrderNo(String tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}
}

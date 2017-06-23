package com.yiji.openapi.message.mpay.trade;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 创建交易订单 响应报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "createTradeOrder", type = ApiMessageType.Response)
public class CreateTradeOrderApiResponse extends ApiResponse {
	@OpenApiField(desc = "交易号",demo = "123654987132654")
	private String tradeNo;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}

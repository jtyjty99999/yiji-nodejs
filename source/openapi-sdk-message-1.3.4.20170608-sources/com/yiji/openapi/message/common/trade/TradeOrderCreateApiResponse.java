package com.yiji.openapi.message.common.trade;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "tradeOrderCreate", type = ApiMessageType.Response)
public class TradeOrderCreateApiResponse extends ApiResponse {
	@NotBlank
	@OpenApiField(desc = "交易号",demo = "1234657890145612354")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}

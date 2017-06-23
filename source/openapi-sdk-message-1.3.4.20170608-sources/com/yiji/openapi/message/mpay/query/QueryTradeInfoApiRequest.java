package com.yiji.openapi.message.mpay.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 查询交易信息 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "queryTradeInfo", type = ApiMessageType.Request)
public class QueryTradeInfoApiRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号",demo = "1234567890123456458")
	private String tradeNo;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}

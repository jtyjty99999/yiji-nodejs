package com.yiji.openapi.message.product.yzz;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.exception.ApiServerException;


@OpenApiMessage(service = "yzzClaimsTransferQuery", type = ApiMessageType.Request)
public class YzzClaimsTransferQueryRequest extends ApiRequest {
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "业务流水号")
	private String bizNo;
	
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号")
	private String tradeNo;
	
	@Override
	public void check() throws ApiServerException {
		if (StringUtils.isBlank(bizNo) && StringUtils.isBlank(tradeNo)) {
			throw new IllegalArgumentException("订单号,交易号和业务流水号不能同时为空");
		}
	}
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}

package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/4/18.
 */
@OpenApiMessage(service = "createTradeOrderNo", type = ApiMessageType.Request)
public class CreateTradeOrderNoRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "外部订单号")
	private String outOrderNo;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getOutOrderNo() {
		return outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
}

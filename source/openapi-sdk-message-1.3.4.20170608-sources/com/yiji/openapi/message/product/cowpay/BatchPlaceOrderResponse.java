package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by Jason Ma on 2015/1/20.
 */
@OpenApiMessage(service = "batchPlaceOrder", type = ApiMessageType.Response)
public class BatchPlaceOrderResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户id")
	private String userId;
	
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

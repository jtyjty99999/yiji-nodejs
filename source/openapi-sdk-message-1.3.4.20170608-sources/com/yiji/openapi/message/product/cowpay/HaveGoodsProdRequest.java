package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "haveGoodsProd", type = ApiMessageType.Request)
public class HaveGoodsProdRequest extends ApiRequest {
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "易极付用户ID")
	private String userId;
	
	@NotEmpty
	@Length(max = 40)
	@OpenApiField(desc = "订单编号")
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

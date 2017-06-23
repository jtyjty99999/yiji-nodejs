package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;


@OpenApiMessage(service = "modifyPw2Cowpay", type = ApiMessageType.Request)
public class ModifyPw2CowpayRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 4)
	@OpenApiField(desc = "外部软件商useId")
	private String externalUserId;
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "易极付用户ID")
	private String userId;
	
	@OpenApiField(desc = "0：移动端，1：PC端")
	private int entrance;
	
	public String getExternalUserId() {
		return externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getEntrance() {
		return entrance;
	}
	
	public void setEntrance(int entrance) {
		this.entrance = entrance;
	}
}

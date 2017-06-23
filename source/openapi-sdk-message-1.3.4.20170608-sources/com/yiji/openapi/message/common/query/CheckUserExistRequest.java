package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "checkUserNameExistOrNot", type = ApiMessageType.Request)
public class CheckUserExistRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "易极付用户名",demo = "易极付")
	private String userName;
	
	public CheckUserExistRequest() {
		super();
	}
	
	public CheckUserExistRequest(String name) {
		super();
		this.userName = name;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}

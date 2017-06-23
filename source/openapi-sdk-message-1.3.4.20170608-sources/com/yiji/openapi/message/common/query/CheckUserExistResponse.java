package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

@OpenApiMessage(service = "checkUserNameExistOrNot", type = ApiMessageType.Response)
public class CheckUserExistResponse extends ApiResponse {
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "用户是否存在",constraint = "类型为布尔值",demo = "true")
	private boolean isExist;
	
	/**
	 * @return the isExist
	 */
	public boolean isExist() {
		return isExist;
	}
	
	/**
	 * @param isExist the isExist to set
	 */
	public void setExist(boolean isExist) {
		this.isExist = isExist;
	}
	
}

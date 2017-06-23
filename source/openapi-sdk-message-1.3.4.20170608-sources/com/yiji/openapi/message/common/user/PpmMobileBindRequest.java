package com.yiji.openapi.message.common.user;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 * @date 2015年7月29日
 */
@OpenApiMessage(service = "ppmMobileBind", type = ApiMessageType.Request)
public class PpmMobileBindRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "用户ID")
	private String userName;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}

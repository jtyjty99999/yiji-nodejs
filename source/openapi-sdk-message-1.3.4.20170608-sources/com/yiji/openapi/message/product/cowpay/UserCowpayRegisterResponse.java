package com.yiji.openapi.message.product.cowpay;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "cowpayUserRegisterV2", type = ApiMessageType.Response)
public class UserCowpayRegisterResponse extends ApiResponse {
	
	@OpenApiField(desc = "软件商会员id")
	private String externalUserId;
	
	@OpenApiField(desc = "易极付userid")
	private String userId;
	
	@OpenApiField(desc = "易极付用户名")
	private String userName;
	
	@OpenApiField(desc = "用户类型")
	private String userType;
	
	public String getExternalUserId() {
		return this.externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserType() {
		return this.userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
}

package com.yiji.openapi.message.product.rewardloan;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@OpenApiMessage(service = "rewardloanLoanInfoQuery", type = ApiMessageType.Request)
public class RewardloanLoanInfoQueryRequest extends ApiRequest {
	
	/**
	 * 用户易极付ID
	 */
	@NotBlank(message = "用户易极付ID不能为空")
	@Size(max = 20, min = 20, message = "易极付ID必须是20位")
	@OpenApiField(desc = "易极付用户ID")
	private String userId;
	/**
	 * 用户姓名
	 */
	@NotBlank(message = "用户姓名不能为空")
	@OpenApiField(desc = "用户姓名")
	private String username;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}

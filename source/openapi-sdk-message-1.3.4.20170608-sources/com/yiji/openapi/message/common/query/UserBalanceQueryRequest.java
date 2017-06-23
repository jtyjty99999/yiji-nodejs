/**
 * 
 */
package com.yiji.openapi.message.common.query;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author mayansen
 * @date 20140806
 *
 */
@OpenApiMessage(service = "userBalanceQuery", type = ApiMessageType.Request)
public class UserBalanceQueryRequest extends ApiRequest {
	
	@OpenApiField(desc = "资金账户编码",demo = "1345614")
	private String accountNo;
	
	@NotBlank
	@Length(max = 20)
	@OpenApiField(desc = "用户id",demo = "12345678901234567980")
	private String userId;
	
	public String getAccountNo() {
		return this.accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * Created by Jason Ma on 2015/1/19.
 */
@OpenApiMessage(service = "bankCardUserIdCheck", type = ApiMessageType.Request)
public class BankCardUserIdCheckRequest extends ApiRequest {
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotEmpty
	@Length(max = 30)
	@OpenApiField(desc = "银行卡号")
	private String cardNo;
	
	@OpenApiField(desc = "手机号")
	private String mobile;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

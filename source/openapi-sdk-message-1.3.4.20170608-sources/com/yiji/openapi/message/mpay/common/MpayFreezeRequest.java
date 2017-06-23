package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;


@OpenApiMessage(service = "mpayFreeze", type = ApiMessageType.Request)
public class MpayFreezeRequest extends ApiRequest {
	
	@NotEmpty
	@Length(max = 20)
	@OpenApiField(desc = "用户名",constraint="用户名",demo="20150619010000072320")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "冻结金额",constraint="冻结金额",demo="66.66")
	private Money amount;
	
	@NotEmpty
	@Length(min = 6, max = 32)
	@OpenApiField(desc = "支付密码",constraint="支付密码",demo="123456")
	private String password;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}

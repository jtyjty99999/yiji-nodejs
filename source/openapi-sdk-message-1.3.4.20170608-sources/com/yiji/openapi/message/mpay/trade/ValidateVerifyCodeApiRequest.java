package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 校验验证码 请求报文
 * 
 * @author dw
 * 
 */
@OpenApiMessage(service = "validateVerifyCode", type = ApiMessageType.Request)
public class ValidateVerifyCodeApiRequest extends ApiRequest {
	
	@OpenApiField(desc = "验证码",demo = "123456")
	@NotBlank
	private String verifyCode;
	
	@OpenApiField(desc = "交易号",demo = "123546872452125")
	@NotBlank
	private String tradeNo;
	
	public String getVerifyCode() {
		return verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}

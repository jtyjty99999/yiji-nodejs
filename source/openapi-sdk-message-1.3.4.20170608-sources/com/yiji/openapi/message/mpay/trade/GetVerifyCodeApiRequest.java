package com.yiji.openapi.message.mpay.trade;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 发送交易验证码 请求报文
 * 
 * @author zhangpu
 * 
 */
@OpenApiMessage(service = "getVerifyCode", type = ApiMessageType.Request)
public class GetVerifyCodeApiRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 20, min = 20)
	@OpenApiField(desc = "交易号",demo = "12345678912564")
	private String tradeNo;
	
	@NotBlank
	@Length(max = 16, min = 11)
	@OpenApiField(desc = "手机号码",demo = "10086100101")
	private String mobileNo;
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}

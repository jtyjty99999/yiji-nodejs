package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 易手富 绑定手机号码 请求报文
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "mpayBindMobileNo", type = ApiMessageType.Request)
public class MpayBindMobileNoRequest extends ApiRequest {
	/** 易极付用户ID */
	@NotBlank
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "用户ID", constraint = "易极付用户ID",demo="20150619010000072320")
	private String userId;
	
	/** 注册用户名 */
	@NotBlank
	@Size(min = 11, max = 11)
	@OpenApiField(desc = "手机号码", constraint = "11位数字",demo="13521402561")
	private String mobileNo;
	
	/** 验证码ID */
	@NotBlank
	@Size(min = 1, max = 32)
	@OpenApiField(desc = "验证码ID", constraint = "本次绑定发送验证码时，服务器端返回的验证码ID",demo="83d26fedebda16e8a6e478d13cba7fe3")
	private String verifyCode;
	
	/** 验证码 */
	@NotBlank
	@Size(min = 1, max = 32)
	@OpenApiField(desc = "验证码", constraint = "绑定手机的手机短信验证码",demo="2541")
	private String verifyCodeUniqueId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getVerifyCode() {
		return this.verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getVerifyCodeUniqueId() {
		return this.verifyCodeUniqueId;
	}
	
	public void setVerifyCodeUniqueId(String verifyCodeUniqueId) {
		this.verifyCodeUniqueId = verifyCodeUniqueId;
	}
	
}

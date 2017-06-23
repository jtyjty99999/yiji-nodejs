package com.yiji.openapi.message.mpay.common;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 易手富用户注册 请求报文
 * 
 * @author zhangpu
 *
 */
@OpenApiMessage(service = "mpayRegister", type = ApiMessageType.Request)
public class MpayRegisterRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户名",constraint="用户名",demo="admin")
	private String userName;
	
	@NotBlank
	@Size(min = 6, max = 64)
	@OpenApiField(desc = "登录密码", constraint = "6-64位字符或数字组合", security = true,demo="123456")
	private String loginPassword;
	
	@Size(min = 8, max = 16)
	@NotBlank
	@OpenApiField(desc = "手机号",constraint="手机号",demo="13526542150")
	private String mobileNo;
	
	@Length(max = 64)
	@NotBlank
	@OpenApiField(desc = "验证码",constraint="验证码",demo="1234")
	private String verifyCode;
	
	@Length(max = 64)
	@NotBlank
	@OpenApiField(desc = "服务端验证编号",constraint="服务端验证编号",demo="1444968748650687")
	private String verifyCodeUniqueId;
	
	@OpenApiField(desc = "设备编号",constraint="设备编号",demo="866050029186515")
	private String deviceId;
	
	@OpenApiField(desc = "sim编号",constraint="sim编号",demo="akiki77")
	private String sim;
	
	/** 真实姓名 */
	@Length(max = 60, min = 1)
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名",demo="张三")
	private String realName;
	
	/** 职业 */
	@Length(max = 64)
	@OpenApiField(desc = "职业", constraint = "职业",demo="职员")
	private String profession;
	
	/** 地址 */
	@Length(max = 256)
	@OpenApiField(desc = "地址", constraint = "常住地址",demo="渝北区")
	private String address;
	
	/** 身份证号码 */
	@Length(max = 50, min = 6)
	@OpenApiField(desc = "身份证号", constraint = "身份证号",demo="300221195810264513")
	private String certNo;
	
	/** 身份证有效期 */
	@Length(max = 20)
	@OpenApiField(desc = "身份证有效期", constraint = "身份证有效期",demo="20151010")
	private String certNoValidDate;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLoginPassword() {
		return loginPassword;
	}
	
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
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
	
	public String getDeviceId() {
		return this.deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getSim() {
		return this.sim;
	}
	
	public void setSim(String sim) {
		this.sim = sim;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertNoValidDate() {
		return certNoValidDate;
	}
	
	public void setCertNoValidDate(String certNoValidDate) {
		this.certNoValidDate = certNoValidDate;
	}
}

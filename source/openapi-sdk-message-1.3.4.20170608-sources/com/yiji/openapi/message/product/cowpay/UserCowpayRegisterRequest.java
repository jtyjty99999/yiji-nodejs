package com.yiji.openapi.message.product.cowpay;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xinqing@yiji.com
 *
 */
@OpenApiMessage(service = "cowpayUserRegisterV2", type = ApiMessageType.Request)
public class UserCowpayRegisterRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 6, max = 50)
	@OpenApiField(desc = "用户名称", constraint = "最大50字符")
	private String userName;
	
	@Email
	@OpenApiField(desc = "用户邮箱")
	private String email;
	
	@NotBlank
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@NotBlank
	@OpenApiField(desc = "性别")
	private String gender;
	
	@NotBlank
	@OpenApiField(desc = "职业")
	private String profession;
	
	@NotBlank
	@OpenApiField(desc = "注册地址")
	private String regAddress;
	
	@NotBlank
	@OpenApiField(desc = "身份证号码")
	private String certNo;
	
	@NotBlank
	@OpenApiField(desc = "身份证有效期")
	private String certVaildTime;
	
	@NotBlank
	@Length(max = 16, min = 11)
	@OpenApiField(desc = "手机号码")
	private String mobile;
	
	@OpenApiField(desc = "身份证正面图片真实路径")
	private String certFrontRealPath;
	
	@OpenApiField(desc = "身份证反面图片真实路径")
	private String certBackRealPath;
	
	@NotBlank
	@OpenApiField(desc = "外部软件商useId")
	private String externalUserId;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getRegAddress() {
		return regAddress;
	}
	
	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}
	
	public String getCertNo() {
		return certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertVaildTime() {
		return certVaildTime;
	}
	
	public void setCertVaildTime(String certVaildTime) {
		this.certVaildTime = certVaildTime;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getCertFrontRealPath() {
		return certFrontRealPath;
	}
	
	public void setCertFrontRealPath(String certFrontRealPath) {
		this.certFrontRealPath = certFrontRealPath;
	}
	
	public String getCertBackRealPath() {
		return certBackRealPath;
	}
	
	public void setCertBackRealPath(String certBackRealPath) {
		this.certBackRealPath = certBackRealPath;
	}
	
	public String getExternalUserId() {
		return externalUserId;
	}
	
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}
}

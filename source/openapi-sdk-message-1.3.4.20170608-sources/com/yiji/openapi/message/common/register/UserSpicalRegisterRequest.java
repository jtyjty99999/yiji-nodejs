package com.yiji.openapi.message.common.register;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

@Deprecated
@OpenApiMessage(service = "userSpicalRegister", type = ApiMessageType.Request)
public class UserSpicalRegisterRequest extends ApiRequest {
	
	@NotBlank(message = "用户姓名 不能为空！")
	@OpenApiField(desc = "用户姓名",demo = "易极付")
	private String userName;

	@NotBlank
	@OpenApiField(desc = "真实姓名",demo = "易极付")
	private String realName;

	@NotBlank
	@OpenApiField(desc = "身份证号",demo = "1234567981235")
	private String certNo;
	
	@NotBlank(message = "手机号不能为空！")
	@OpenApiField(desc = "手机号",demo = "10086100101")
	private String mobileNo;
	
	@OpenApiField(desc = "邮箱",demo = "xx@yiji.com")
	private String email;

	@NotBlank
	@OpenApiField(desc = "国籍",constraint = "默认为中国大陆",demo = "China")
	private String country;

	@NotNull
	@OpenApiField(desc = "性别",constraint = "性别",demo = "MALE")
	private String gender;

	@NotBlank
	@OpenApiField(desc = "职业",constraint = "职业",demo = "程序员")
	private String profession;

	@NotBlank
	@OpenApiField(desc = "住址",constraint = "住址",demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String address;

	@NotBlank
	@OpenApiField(desc = "身份证有效期",demo = "19721212")
	private String certValidTime;

	private Date licenseValidTime;

	@OpenApiField(desc = "注册来源",demo = "PERSONAL_EDITION",constraint = "默认小鱼财富")
	private String registerFrom;
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	/**
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}
	
	/**
	 * @param certNo the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getLicenseValidTime() {
		return licenseValidTime;
	}

	public void setLicenseValidTime(Date licenseValidTime) {
		this.licenseValidTime = licenseValidTime;
	}

	public String getCertValidTime() {

		return certValidTime;
	}

	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}

	public String getRegisterFrom() {
		return registerFrom;
	}

	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}
}

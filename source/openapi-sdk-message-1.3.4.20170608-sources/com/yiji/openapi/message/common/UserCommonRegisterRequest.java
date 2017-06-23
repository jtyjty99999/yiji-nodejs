/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */
package com.yiji.openapi.message.common;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 通用注册请求
 * 
 * @author zhangpu
 * @date 2014年8月5日
 */
@Deprecated
@OpenApiMessage(service = "userCommonRegister", type = ApiMessageType.Request)
public class UserCommonRegisterRequest extends ApiRequest {
	
	public static enum RegisterTypeEnum {
		normal,
		middle,
		high;
	}

	@NotBlank
	@Length(min = 6, max = 50)
	@OpenApiField(desc = "用户名称", constraint = "最大50字符",demo = "userName")
	private String userName;

	@Email
	@OpenApiField(desc = "用户邮箱",demo = "xx@yiji.com")
	private String email;
	
	@Length(max = 16, min = 11)
	@OpenApiField(desc = "手机号码",demo = "10086100101")
	private String mobileNo;

	@OpenApiField(desc = "注册类型",demo = "normal")
	private RegisterTypeEnum registerType = RegisterTypeEnum.normal;

	@OpenApiField(desc = "用户类型",demo = "PERSON")
	private String userType;

	@NotBlank
	@OpenApiField(desc = "真实姓名",demo = "易极付")
	private String realName;

	@NotNull(message = "证件类型不能为空")
	@OpenApiField(desc = "证件类型",demo = "Identity_Card")
	private String certType;

	@NotBlank
	@OpenApiField(desc = "证件号码",demo = "123456789012345678")
	private String certNo;

	@NotNull
	@OpenApiField(desc = "证件有效期",demo = "19721212")
	private Integer certVaildTime;

	@OpenApiField(desc = "所属商户ID",demo = "12345678901234567890")
	private String merchantCode;

	@OpenApiField(desc = "注册来源",demo = "EXT_IMPORT")
	private String registerFrom;

	/**
	 * 个人
	 */
	@OpenApiField(desc = "国籍",constraint = "默认为中国大陆",demo = "MAINLAND")
	private String country;

	@OpenApiField(desc = "性别",constraint = "性别",demo = "MALE")
	private String gender;

	@OpenApiField(desc = "职业",constraint = "职业",demo = "公务员")
	private String profession;

	@OpenApiField(desc = "住址",constraint = "住址",demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String address;

	/**
	 * 企业
	 */

	/** 经营范围*/
	@OpenApiField(desc = "经营范围",constraint = "经营范围",demo = "水产")
	private String 					enterpriseBusinessScope;

	/** 组织机构代码 */
	@OpenApiField(desc = "组织机构代码",constraint = "组织机构代码",demo = "12346")
	private String					organizationCode;

	/** 注册地址 */
	@OpenApiField(desc = "注册地址",constraint = "注册地址",demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String					regAddress;

	/** 法人代表证件类型*/
	@OpenApiField(desc = "法人代表证件类型",constraint = "法人代表证件类型",demo = "Identity_Card")
	private String			legalCertType;

	/** 法人代表证件有效期*/
	@OpenApiField(desc = "法人代表证件有效期",constraint = "法人代表证件有效期",demo = "19721212")
	private Integer legalLicValidTime;

	/** 法人或者经营者真实姓名 */
	@OpenApiField(desc = "法人或者经营者真实姓名",constraint = "法人或者经营者真实姓名",demo = "易极付")
	private String				legalPersonName;

	/** 法人或者经营者证件号 */
	@OpenApiField(desc = "法人或者经营者证件号",constraint = "法人或者经营者证件号",demo = "123456789012345678")
	private String	legalPersonCertNo;

	public UserCommonRegisterRequest() {
		super();
	}

	/**
	 * @param userName
	 * @param email
	 * @param mobileNo
	 */
	public UserCommonRegisterRequest(String userName, String email, String mobileNo) {
		super();
		this.userName = userName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public RegisterTypeEnum getRegisterType() {
		return registerType;
	}

	public void setRegisterType(RegisterTypeEnum registerType) {
		this.registerType = registerType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getRegisterFrom() {
		return registerFrom;
	}

	public void setRegisterFrom(String registerFrom) {
		this.registerFrom = registerFrom;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getLegalCertType() {
		return legalCertType;
	}

	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}

	public Integer getLegalLicValidTime() {
		return legalLicValidTime;
	}

	public void setLegalLicValidTime(Integer legalLicValidTime) {
		this.legalLicValidTime = legalLicValidTime;
	}

	public String getLegalPersonName() {
		return legalPersonName;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getLegalPersonCertNo() {
		return legalPersonCertNo;
	}

	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEnterpriseBusinessScope() {
		return enterpriseBusinessScope;
	}

	public void setEnterpriseBusinessScope(String enterpriseBusinessScope) {
		this.enterpriseBusinessScope = enterpriseBusinessScope;
	}

	public Integer getCertVaildTime() {
		return certVaildTime;
	}

	public void setCertVaildTime(Integer certVaildTime) {
		this.certVaildTime = certVaildTime;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-08-25 14:59 创建
 *
 */
package com.yiji.openapi.message.common.register;

import java.util.Date;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "commonBusinessRegister", type = ApiMessageType.Request)
public class CommonBusinessRegisterRequest extends ApiRequest {

	/**
	 * 通用参数
	 */
	/**
	 * 用户登录名
	 */
	@NotBlank
	@Size(max = 128)
	@OpenApiField(desc = "用户登录名",demo = "易极付")
	private String userName;

	/**
	 * 用户真实姓名(个人姓名/企业名称)
	 */
	@NotBlank
	@Size(max = 128)
	@OpenApiField(desc = "用户真实姓名", constraint = "个人姓名/企业名称",demo = "易极付")
	private String realName;

	/**
	 * 营业执照编号
	 */
	@NotBlank
	@Size(max = 64)
	@OpenApiField(desc = "营业执照编号",demo = "132456789")
	private String licenseNo;

	/**
	 * 营业执照有效期
	 */
	@NotBlank
	@OpenApiField(desc = "营业执照有效期",demo = "1972-12-12")
	private String licenseValidTime;
	//营业执照有效期Date形式，传参、校验使用
	private Date licensevalidtime;

	/**
	 * 详细地址
	 */
	@NotBlank
	@Size(max = 256)
	@OpenApiField(desc = "详细地址",demo = "重庆市北部新区黄山大道中段9号木星大厦1区6楼")
	private String address;

	/**
	 * 邮箱
	 */
	@Size(max = 128)
	@OpenApiField(desc = "邮箱",demo = "xx@yiji.com")
	private String email;

	/**
	 * 手机
	 */
	@Size(max = 16)
	@OpenApiField(desc = "手机",demo = "10086100101")
	private String mobile;

	@NotBlank
	@OpenApiField(desc = "用户类型",demo = "BUSINESS")
	private String userType;

	/**
	 * 经营范围
	 */
	@NotBlank
	@OpenApiField(desc = "经营范围",demo = "水产")
	private String businessScope;

	/**
	 * 企业参数
	 */
	/**
	 * 组织机构代码
	 */
	@Size(max = 32)
	@OpenApiField(desc = "组织机构代码",demo = "132456478")
	private String organizationCode;

	/**
	 * 法人代表姓名
	 */
	@Size(max = 128)
	@OpenApiField(desc = "法人代表姓名",demo = "易极付")
	private String legalRepresentativeName;

	/**
	 * 法人代表证件类型
	 */
	@OpenApiField(desc = "法人代表证件类型",demo = "Identity_Card")
	private String legalCertType;

	/**
	 * 法人代表证件有效期
	 */
	@OpenApiField(desc = "法人代表证件有效期",demo = "1972-12-12")
	private String legalLicValidTime;
	private Date legallicvalidtime;

	/**
	 * 法人代表身份证号码
	 */
	@Size(max = 64)
	@OpenApiField(desc = "法人代表身份证号码",demo = "123456789013245678")
	private String legalRepresentativeCardNo;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseValidTime() {
		return licenseValidTime;
	}

	public void setLicenseValidTime(String licenseValidTime) {
		this.licenseValidTime = licenseValidTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getLegalRepresentativeName() {
		return legalRepresentativeName;
	}

	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

	public String getLegalCertType() {
		return legalCertType;
	}

	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}

	public Date getLegallicvalidtime() {
		return legallicvalidtime;
	}

	public void setLegallicvalidtime(Date legallicvalidtime) {
		this.legallicvalidtime = legallicvalidtime;
	}

	public String getLegalLicValidTime() {
		return legalLicValidTime;
	}

	public void setLegalLicValidTime(String legalLicValidTime) {
		this.legalLicValidTime = legalLicValidTime;
	}

	public String getLegalRepresentativeCardNo() {
		return legalRepresentativeCardNo;
	}

	public void setLegalRepresentativeCardNo(String legalRepresentativeCardNo) {
		this.legalRepresentativeCardNo = legalRepresentativeCardNo;
	}

	public Date getLicensevalidtime() {
		return licensevalidtime;
	}

	public void setLicensevalidtime(Date licensevalidtime) {
		this.licensevalidtime = licensevalidtime;
	}
}
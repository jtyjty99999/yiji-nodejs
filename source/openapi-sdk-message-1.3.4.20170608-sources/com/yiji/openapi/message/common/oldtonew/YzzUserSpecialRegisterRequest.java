/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午7:50:45 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 *
 *
 * @author wkeduo
 *
 */
@Deprecated
@OpenApiMessage(service = "yzzUserSpecialRegister", type = ApiMessageType.Request)
public class YzzUserSpecialRegisterRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "身份证号码", demo = "440332198808081144")
	private String certNo;

	@NotBlank
	@OpenApiField(desc = "真实姓名", demo = "张三")
	private String realName;

	@NotBlank
	@OpenApiField(desc = "邮箱", demo = "123@yiji.com")
	private String email;

	@NotBlank
	@OpenApiField(desc = "用户名", demo = "20150519020005491913")
	private String userName;

	@NotBlank
	@OpenApiField(desc = "用户类型", constraint = "{\"data\":[\"P:个人用户\",\"B:企业用户\"],\"name\":\"用户类型\"}", demo = "P")
	private String userType;

	@NotBlank
	@OpenApiField(desc = "手机号码", demo = "13888888888")
	private String mobile;

	@NotBlank
	@OpenApiField(desc = "身份证有效期", demo = "2016-11-11")
	private String certValidTime;

	@OpenApiField(desc = "是否大陆用户", demo = "Y")
	private String isMainland;

	@NotBlank
	@OpenApiField(desc = "性别", constraint = "{\"data\":[\"M:男性\",\"F:女性\",\"U:未知\"],\"name\":\"性别\"}", demo = "F")
	private String gender;

	@NotBlank
	@OpenApiField(desc = "职业", demo = "砖工")
	private String profession;

	@NotBlank
	@OpenApiField(desc = "国籍", demo = "中国")
	private String country;

	@NotBlank
	@OpenApiField(desc = "详细地址", demo = "重庆南岸区")
	private String address;

	@NotBlank
	@OpenApiField(desc = "用户身份类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"用户身份类型\"}",
			demo = "ID")
	private String certType;

	@OpenApiField(desc = "组织机构代码", demo = "52435")
	private String organizationCode;

	@OpenApiField(desc = "所属行业", demo = "食品")
	private String businessType;

	@OpenApiField(desc = "税务登记号", demo = "52435")
	private String taxRegistrationNo;

	@OpenApiField(desc = "营业执照类型", demo = "个体工商户")
	private String businessLicenseType;

	@OpenApiField(desc = "注册地址", demo = "重庆市")
	private String regAddress;

	@OpenApiField(desc = "法人代表姓名", demo = "张三")
	private String legalRepresentativeName;

	@OpenApiField(desc = "法人代表身份证号码", demo = "440332198808081144")
	private String legalRepresentativeCardNo;

	@OpenApiField(desc = "代理人姓名", demo = "李四")
	private String agentName;

	@OpenApiField(desc = "代理人身份证号码", demo = "440332198808084411")
	private String agentCardNo;

	@OpenApiField(desc = "联系人姓名", demo = "张三")
	private String contactPersonName;

	@OpenApiField(desc = "联系电话", demo = "13888888888")
	private String contactPhone;

	@OpenApiField(desc = "传真", demo = "023-66558877")
	private String fax;

	@OpenApiField(desc = "商务网站", demo = "http://www.stackflow.com")
	private String webSite;

	@OpenApiField(desc = "注册资本", demo = "1.11")
	private Money registeredCapital;

	@OpenApiField(desc = "对外贸易经营者备案登记税编号", demo = "54321")
	private String registrationTaxCode;

	@OpenApiField(desc = "法人代表性别", constraint = "{\"data\":[\"M:男性\",\"F:女性\",\"U:未知\"],\"name\":\"法人代表性别\"}",
			demo = "F")
	private String legalRepresentativeGender;

	@OpenApiField(desc = "法人代表邮箱", demo = "123@yiji.com")
	private String legalRepresentativeEmail;

	@OpenApiField(desc = "法人代表手机", demo = "138888888888")
	private String legalRepresentativeMobile;

	@OpenApiField(desc = "法人代表固定电话", demo = "023-66339988")
	private String legalRepresentativePhone;

	@OpenApiField(desc = "法人代表传真", demo = "023-66558877")
	private String legalRepresentativeFax;

	@OpenApiField(desc = "法人代表联系地址", demo = "重庆市")
	private String legalRepresentativeAddress;

	@OpenApiField(desc = "法人代表邮编", demo = "404300")
	private String legalRepresentativeZipcode;

	@OpenApiField(desc = "联系人性别", constraint = "{\"data\":[\"M:男性\",\"F:女性\",\"U:未知\"],\"name\":\"联系人性别\"}", demo = "F")
	private String contactPersonGender;

	@OpenApiField(desc = "联系人邮箱", demo = "123@yiji.com")
	private String contactPersonEmail;

	@OpenApiField(desc = "联系人手机", demo = "13888888888")
	private String contactPersonMobile;

	@OpenApiField(desc = "联系人传真", demo = "023-66558877")
	private String contactPersonFax;

	@OpenApiField(desc = "联系人联系地址", demo = "重庆市")
	private String contactPersonAddress;

	@OpenApiField(desc = "联系人邮编", demo = "404300")
	private String contactPersonZipcode;

	@OpenApiField(desc = "法人代表证件类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"法人代表证件类型\"}",
			demo = "ID")
	private String legalCertType;

	@OpenApiField(desc = "法人代表证件有效期", demo = "2016-11-11")
	private Date legalLicValidTime;

	@OpenApiField(desc = "控股股东证件有效期", demo = "2016-11-11")
	private Date holdingCertValidTime;

	@OpenApiField(desc = "代理人证件有效期", demo = "2016-11-11")
	private Date agentValidTime;

	@OpenApiField(desc = "营业执照有效期", demo = "2016-11-11")
	private Date businessLicenseValidTime;

	@OpenApiField(desc = "控股股东姓名 (企业：公司名称，个人：姓名)", demo = "重庆易极付")
	private String holdingName;

	@OpenApiField(desc = "控股股东证件类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"控股股东证件类型\"}",
			demo = "ID")
	private String holdingCertType;

	@OpenApiField(desc = "控股股东证件号", demo = "123456")
	private String holdingCertNo;

	@OpenApiField(desc = "控股股东经营范围", demo = "食品")
	private String holdingBusinessScope;

	@OpenApiField(desc = "控股股东机构代码", demo = "123456")
	private String majOrganizationCode;

	@OpenApiField(desc = "控股股东税务登记证号", demo = "123456")
	private String majTaxRegistrationNo;

	@OpenApiField(desc = "控股股东类型", constraint = "{\"data\":[\"P:个人用户\",\"B:企业用户\"],\"name\":\"控股股东类型\"}", demo = "P")
	private String majUserType;

	@OpenApiField(desc = "代理人证件类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"代理人证件类型\"}",
			demo = "ID")
	private String agentCertType;

	@OpenApiField(desc = "企业法人证书号", demo = "123456")
	private String busiLegalCertNo;

	@OpenApiField(desc = "经营范围", demo = "食品")
	private String enterpriseBusinessScope;

	public String getCertNo() {
		return this.certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCertValidTime() {
		return this.certValidTime;
	}

	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}

	public String getIsMainland() {
		return this.isMainland;
	}

	public void setIsMainland(String isMainland) {
		this.isMainland = isMainland;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getTaxRegistrationNo() {
		return this.taxRegistrationNo;
	}

	public void setTaxRegistrationNo(String taxRegistrationNo) {
		this.taxRegistrationNo = taxRegistrationNo;
	}

	public String getBusinessLicenseType() {
		return this.businessLicenseType;
	}

	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}

	public String getRegAddress() {
		return this.regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getLegalRepresentativeName() {
		return this.legalRepresentativeName;
	}

	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

	public String getLegalRepresentativeCardNo() {
		return this.legalRepresentativeCardNo;
	}

	public void setLegalRepresentativeCardNo(String legalRepresentativeCardNo) {
		this.legalRepresentativeCardNo = legalRepresentativeCardNo;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentCardNo() {
		return this.agentCardNo;
	}

	public void setAgentCardNo(String agentCardNo) {
		this.agentCardNo = agentCardNo;
	}

	public String getContactPersonName() {
		return this.contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebSite() {
		return this.webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public Money getRegisteredCapital() {
		return this.registeredCapital;
	}

	public void setRegisteredCapital(Money registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getRegistrationTaxCode() {
		return this.registrationTaxCode;
	}

	public void setRegistrationTaxCode(String registrationTaxCode) {
		this.registrationTaxCode = registrationTaxCode;
	}

	public String getLegalRepresentativeGender() {
		return this.legalRepresentativeGender;
	}

	public void setLegalRepresentativeGender(String legalRepresentativeGender) {
		this.legalRepresentativeGender = legalRepresentativeGender;
	}

	public String getLegalRepresentativeEmail() {
		return this.legalRepresentativeEmail;
	}

	public void setLegalRepresentativeEmail(String legalRepresentativeEmail) {
		this.legalRepresentativeEmail = legalRepresentativeEmail;
	}

	public String getLegalRepresentativeMobile() {
		return this.legalRepresentativeMobile;
	}

	public void setLegalRepresentativeMobile(String legalRepresentativeMobile) {
		this.legalRepresentativeMobile = legalRepresentativeMobile;
	}

	public String getLegalRepresentativePhone() {
		return this.legalRepresentativePhone;
	}

	public void setLegalRepresentativePhone(String legalRepresentativePhone) {
		this.legalRepresentativePhone = legalRepresentativePhone;
	}

	public String getLegalRepresentativeFax() {
		return this.legalRepresentativeFax;
	}

	public void setLegalRepresentativeFax(String legalRepresentativeFax) {
		this.legalRepresentativeFax = legalRepresentativeFax;
	}

	public String getLegalRepresentativeAddress() {
		return this.legalRepresentativeAddress;
	}

	public void setLegalRepresentativeAddress(String legalRepresentativeAddress) {
		this.legalRepresentativeAddress = legalRepresentativeAddress;
	}

	public String getLegalRepresentativeZipcode() {
		return this.legalRepresentativeZipcode;
	}

	public void setLegalRepresentativeZipcode(String legalRepresentativeZipcode) {
		this.legalRepresentativeZipcode = legalRepresentativeZipcode;
	}

	public String getContactPersonGender() {
		return this.contactPersonGender;
	}

	public void setContactPersonGender(String contactPersonGender) {
		this.contactPersonGender = contactPersonGender;
	}

	public String getContactPersonEmail() {
		return this.contactPersonEmail;
	}

	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}

	public String getContactPersonMobile() {
		return this.contactPersonMobile;
	}

	public void setContactPersonMobile(String contactPersonMobile) {
		this.contactPersonMobile = contactPersonMobile;
	}

	public String getContactPersonFax() {
		return this.contactPersonFax;
	}

	public void setContactPersonFax(String contactPersonFax) {
		this.contactPersonFax = contactPersonFax;
	}

	public String getContactPersonAddress() {
		return this.contactPersonAddress;
	}

	public void setContactPersonAddress(String contactPersonAddress) {
		this.contactPersonAddress = contactPersonAddress;
	}

	public String getContactPersonZipcode() {
		return this.contactPersonZipcode;
	}

	public void setContactPersonZipcode(String contactPersonZipcode) {
		this.contactPersonZipcode = contactPersonZipcode;
	}

	public String getLegalCertType() {
		return this.legalCertType;
	}

	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}

	public Date getLegalLicValidTime() {
		return this.legalLicValidTime;
	}

	public void setLegalLicValidTime(Date legalLicValidTime) {
		this.legalLicValidTime = legalLicValidTime;
	}

	public Date getHoldingCertValidTime() {
		return this.holdingCertValidTime;
	}

	public void setHoldingCertValidTime(Date holdingCertValidTime) {
		this.holdingCertValidTime = holdingCertValidTime;
	}

	public Date getAgentValidTime() {
		return this.agentValidTime;
	}

	public void setAgentValidTime(Date agentValidTime) {
		this.agentValidTime = agentValidTime;
	}

	public Date getBusinessLicenseValidTime() {
		return this.businessLicenseValidTime;
	}

	public void setBusinessLicenseValidTime(Date businessLicenseValidTime) {
		this.businessLicenseValidTime = businessLicenseValidTime;
	}

	public String getHoldingCertType() {
		return this.holdingCertType;
	}

	public void setHoldingCertType(String holdingCertType) {
		this.holdingCertType = holdingCertType;
	}

	public String getHoldingName() {
		return this.holdingName;
	}

	public void setHoldingName(String holdingName) {
		this.holdingName = holdingName;
	}

	public String getHoldingCertNo() {
		return this.holdingCertNo;
	}

	public void setHoldingCertNo(String holdingCertNo) {
		this.holdingCertNo = holdingCertNo;
	}

	public String getHoldingBusinessScope() {
		return this.holdingBusinessScope;
	}

	public void setHoldingBusinessScope(String holdingBusinessScope) {
		this.holdingBusinessScope = holdingBusinessScope;
	}

	public String getMajOrganizationCode() {
		return this.majOrganizationCode;
	}

	public void setMajOrganizationCode(String majOrganizationCode) {
		this.majOrganizationCode = majOrganizationCode;
	}

	public String getMajTaxRegistrationNo() {
		return this.majTaxRegistrationNo;
	}

	public void setMajTaxRegistrationNo(String majTaxRegistrationNo) {
		this.majTaxRegistrationNo = majTaxRegistrationNo;
	}

	public String getMajUserType() {
		return this.majUserType;
	}

	public void setMajUserType(String majUserType) {
		this.majUserType = majUserType;
	}

	public String getAgentCertType() {
		return this.agentCertType;
	}

	public void setAgentCertType(String agentCertType) {
		this.agentCertType = agentCertType;
	}

	public String getBusiLegalCertNo() {
		return this.busiLegalCertNo;
	}

	public void setBusiLegalCertNo(String busiLegalCertNo) {
		this.busiLegalCertNo = busiLegalCertNo;
	}

	public String getEnterpriseBusinessScope() {
		return this.enterpriseBusinessScope;
	}

	public void setEnterpriseBusinessScope(String enterpriseBusinessScope) {
		this.enterpriseBusinessScope = enterpriseBusinessScope;
	}

}

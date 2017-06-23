/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-03-02 10:24 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/3/2
 */
@Deprecated
@OpenApiMessage(service = "yzzUserRegister", type = ApiMessageType.Request)
public class YzzUserRegisterRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "用户身份类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"用户身份类型\"}",
			demo = "ID")
	private String certType;
	
	@NotNull
	@OpenApiField(desc = "证件号", demo = "40012198193812998123")
	private String certNo;
	
	@NotNull
	@OpenApiField(desc = "真实姓名", demo = "陈开国")
	private String realName;
	
	@OpenApiField(desc = "外部商户ID", demo = "JD123123")
	private String externalId;
	
	@OpenApiField(desc = "邮件", demo = "ckg@126.com")
	private String email;
	
	@NotNull
	@OpenApiField(desc = "用户名", demo = "muyu")
	private String userName;
	
	@NotNull
	@OpenApiField(
			desc = "用户类型",
			constraint = "{\"name\":\"用户类型\",\"data\":"
					+ "[\"P:个人用户\","
					+ "\"B:企业用户\""
					+ "]}",
			demo = "P")
	private String userType;

	@OpenApiField(
			desc = "用户状态",
			constraint = "{\"name\":\"用户状态\",\"data\":"
					+ "[\"W:未激活\","
					+ "\"Q:快速注册用户\","
					+ "\"T:正常用户\""
					+ "]}",
			demo = "T")
	private String userStatus;
	
	@NotNull
    @OpenApiField(desc = "证件有效期", demo = "20181123",constraint = "格式：yyyyMMDD")
	private String licenseValidTime;

    @OpenApiField(desc = "营业执照有效期", demo = "20181123",constraint = "格式：yyyyMMDD")
	private String businessLicenseValidTime;
	
    @OpenApiField(desc = "法人代表证件有效期", demo = "20181123",constraint = "格式：yyyyMMDD")
	private String legalLicValidTime;

	@OpenApiField(
			desc = "认证状态",
			constraint = "{\"name\":\"认证状态\",\"data\":"
					+ "[\"U:未认证\","
					+ "\"A:已认证\","
					+ "\"I:认证中\","
					+ "\"R:被驳回\","
					+ "\"O:过期\""
					+ "]}",
			demo = "A")
	private String certifyStatus;

	@OpenApiField(
			desc = "运行时状态",
			constraint = "{\"name\":\"运行时状态\",\"data\":"
					+ "[\"B:账户被冻结\","
					+ "\"C:账户被注销\","
					+ "\"T:正常状态\""
					+ "]}",
			demo = "T")
	private String runtimeStatus;

    @NotNull
    @OpenApiField(desc = "用户所在国家", demo = "20181123")
	private String country;

    @OpenApiField(desc = "用户所在省", demo = "四川")
	private String province;

    @OpenApiField(desc = "用户所在城市", demo = "成都")
	private String city;

    @NotNull
    @OpenApiField(desc = "用户所在地址", demo = "武侯区青岗路2号12-10")
	private String address;

    @OpenApiField(desc = "用户电话", demo = "02388881234")
	private String phone;

    @NotNull
    @OpenApiField(desc = "用户手机", demo = "13587239192")
	private String mobile;

    @OpenApiField(desc = "用户所在地邮编", demo = "401100")
	private String zipcode;

    @OpenApiField(desc = "备注", demo = "无")
	private String memo;

    @NotNull
	@OpenApiField(
			desc = "性别",
			constraint = "{\"name\":\"法人代表性别\",\"data\":"
					+ "[\"M:男性\","
					+ "\"F:女性\","
					+ "\"U:未知\""
					+ "]}",
			demo = "M")
	private String gender;

    @NotNull
    @OpenApiField(desc = "职业", demo = "教师")
	private String profession;

    @OpenApiField(desc = "学历", demo = "硕士")
	private String education;

    @OpenApiField(desc = "组织编码", demo = "ABC-123")
	private String organizationCode;

    @OpenApiField(desc = "所属行业", demo = "教师")
	private String businessType;

    @OpenApiField(desc = "税务登记号", demo = "123412341234")
	private String taxRegistrationNo;

    @OpenApiField(desc = "营业执照类型", demo = "工商许可证")
	private String businessLicenseType;

    @OpenApiField(desc = "注册地址", demo = "重庆市渝北区黄石路")
	private String regAddress;

    @OpenApiField(desc = "法人代表姓名", demo = "陈开国")
	private String legalRepresentativeName;

    @OpenApiField(desc = "法人代表证件号码", demo = "402383871283")
	private String legalRepresentativeCardNo;

    @OpenApiField(desc = "代理人姓名", demo = "陈开国")
	private String agentName;

    @OpenApiField(desc = "代理人证件号码", demo = "239234872139423")
	private String agentCardNo;

    @OpenApiField(desc = "联系人姓名", demo = "陈开国")
	private String contactPersonName;

    @OpenApiField(desc = "联系人电话", demo = "02312312312")
	private String contactPhone;

    @OpenApiField(desc = "联系人传真", demo = "02312312312")
	private String fax;

    @OpenApiField(desc = "商务网站", demo = "http://yiji.com")
	private String webSite;

    @OpenApiField(desc = "注册资本", demo = "500000")
	private Money registeredCapital;

    @OpenApiField(desc = "对外贸易经营者备案登记税编号", demo = "398123")
	private String registrationTaxCode;

	@OpenApiField(
			desc = "法人代表性别",
			constraint = "{\"name\":\"法人代表性别\",\"data\":"
					+ "[\"M:男性\","
					+ "\"F:女性\","
					+ "\"U:未知\""
					+ "]}",
			demo = "M")
	private String legalRepresentativeGender;

    @OpenApiField(desc = "法人代表邮箱", demo = "ckg@yiji.com")
	private String legalRepresentativeEmail;

    @OpenApiField(desc = "法人代表手机号", demo = "13883812744")
	private String legalRepresentativeMobile;

    @OpenApiField(desc = "法人代表电话", demo = "02386127821")
	private String legalRepresentativePhone;

    @OpenApiField(desc = "法人代表传真", demo = "02398271234")
	private String legalRepresentativeFax;

    @OpenApiField(desc = "法人代表地址", demo = "重庆市渝北区黄山大道9号")
	private String legalRepresentativeAddress;

    @OpenApiField(desc = "法人代表邮编", demo = "401100")
	private String legalRepresentativeZipcode;

	@OpenApiField(
			desc = "联系人性别",
			constraint = "{\"name\":\"法人代表性别\",\"data\":"
					+ "[\"M:男性\","
					+ "\"F:女性\","
					+ "\"U:未知\""
					+ "]}",
			demo = "M")
	private String contactPersonGender;

    @OpenApiField(desc = "联系人邮箱", demo = "ckg@yiji.com")
	private String contactPersonEmail;

    @OpenApiField(desc = "联系人号码", demo = "13723689482")
	private String contactPersonMobile;

    @OpenApiField(desc = "联系人传真", demo = "02312341234")
	private String contactPersonFax;

    @OpenApiField(desc = "联系人地址", demo = "重庆市渝北区黄山大道")
	private String contactPersonAddress;

    @OpenApiField(desc = "联系人邮编", demo = "401001")
	private String contactPersonZipcode;

    @OpenApiField(desc = "支付密码", demo = "123456")
	private String payPassword;

    @OpenApiField(desc = "账户扩展信息", demo = "P2P_ACCOUNT")
	private String accountExtType;

    @OpenApiField(desc = "银行卡默认绑定标识", demo = "Y",constraint = "{\"data\":[\"Y:默认绑定\",\"N:非默认绑定\"],\"name\":\"银行卡默认绑定标识\"}")
	private String bindDefault;

    @OpenApiField(desc = "联行号", demo = "1234")
	private String bankKey;

    @OpenApiField(desc = "银行卡类型", demo = "DEBIT_CARD")
	private String bankCardType;

    @OpenApiField(desc = "银行账户类型", demo = "PUBLIC")
	private String bankAccountType;

    @OpenApiField(desc = "开户人姓名", demo = "陈开国")
	private String bankCardUserName;

    @OpenApiField(desc = "开户人证件类型", demo = "身份证")
	private String bankCardUserCertType;

    @OpenApiField(desc = "开户人证件号码", demo = "20123921312323")
	private String bankCardUserCertNo;

	@OpenApiField(
			desc = "开户人性别",
			constraint = "{\"name\":\"法人代表性别\",\"data\":"
					+ "[\"M:男性\","
					+ "\"F:女性\","
					+ "\"U:未知\""
					+ "]}",
			demo = "M")
	private String bankCardUserGender;

    @OpenApiField(desc = "开户省", demo = "四川省")
	private String bankCardUserProvince;

    @OpenApiField(desc = "开户市", demo = "成都市")
	private String bankCardUserCity;

    @OpenApiField(desc = "开户地址", demo = "武侯区XX路XX号")
	private String bankCardUserAddress;

    @OpenApiField(desc = "银行类型", demo = "ICBC")
	private String bankType;

    @OpenApiField(desc = "银行卡号", demo = "6222123412341234")
	private String bankCardNo;

    @OpenApiField(desc = "安全问题-问题", demo = "我的小学老师？")
	private String questionTitle;

    @OpenApiField(desc = "安全问题-答案", demo = "陈开国")
	private String questionAnswer;

    @OpenApiField(desc = "营业执照图片路径", demo = "/var/a.jpg")
	private String businessLicensePath;

    @OpenApiField(desc = "带公章营业执照图片路径", demo = "/var/a.jpg")
	private String businessLicenseCachetPath;

    @OpenApiField(desc = "身份证正面图片路径", demo = "/var/a.jpg")
	private String certFrontPath;

    @OpenApiField(desc = "身份证反面图片路径", demo = "/var/a.jpg")
	private String certBackPath;

    @OpenApiField(desc = "上传开户许可证图片路径", demo = "/var/a.jpg")
	private String openingLicensePath;

    @OpenApiField(desc = "经营范围", demo = "五金")
	private String enterpriseBusinessScope;

	@OpenApiField(desc = "法人证件类型",
			constraint = "{\"data\":[\"ID:身份证\",\"ARMY_ID:军官证\",\"PASSPORT:护照\",\"HOME_RETURN:回乡证\",\"TAIWAN:台胞证\",\"OFFICERS_CARD:警官证\",\"SOLDIER_CARD:士兵证\",\"BUSINESS_LICENSE:营业执照\",\"HOUSEHOLD_REGISTER:户口簿\",\"HK_MACAO_PASS:港澳通行证\",\"HK_LOCAL_IDENTITY_CARD:香港本地身份证\",\"MACAO_LOCAL_IDENTITY_CARD:澳门本地身份证\",\"TAIWAN_LOCAL_IDENTITY_CARD:台湾本地身份证\",\"Other:其它证件\"],\"name\":\"用户身份类型\"}",
			demo = "ID")
	private String legalCertType;

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
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getExternalId() {
		return externalId;
	}
	
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLicenseValidTime() {
		return licenseValidTime;
	}
	
	public void setLicenseValidTime(String licenseValidTime) {
		this.licenseValidTime = licenseValidTime;
	}
	
	public String getBusinessLicenseValidTime() {
		return businessLicenseValidTime;
	}
	
	public void setBusinessLicenseValidTime(String businessLicenseValidTime) {
		this.businessLicenseValidTime = businessLicenseValidTime;
	}
	
	public String getLegalLicValidTime() {
		return legalLicValidTime;
	}
	
	public void setLegalLicValidTime(String legalLicValidTime) {
		this.legalLicValidTime = legalLicValidTime;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
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
	
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getOrganizationCode() {
		return organizationCode;
	}
	
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	
	public String getBusinessType() {
		return businessType;
	}
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	public String getTaxRegistrationNo() {
		return taxRegistrationNo;
	}
	
	public void setTaxRegistrationNo(String taxRegistrationNo) {
		this.taxRegistrationNo = taxRegistrationNo;
	}
	
	public String getBusinessLicenseType() {
		return businessLicenseType;
	}
	
	public void setBusinessLicenseType(String businessLicenseType) {
		this.businessLicenseType = businessLicenseType;
	}
	
	public String getRegAddress() {
		return regAddress;
	}
	
	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}
	
	public String getLegalRepresentativeName() {
		return legalRepresentativeName;
	}
	
	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}
	
	public String getLegalRepresentativeCardNo() {
		return legalRepresentativeCardNo;
	}
	
	public void setLegalRepresentativeCardNo(String legalRepresentativeCardNo) {
		this.legalRepresentativeCardNo = legalRepresentativeCardNo;
	}
	
	public String getAgentName() {
		return agentName;
	}
	
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	public String getAgentCardNo() {
		return agentCardNo;
	}
	
	public void setAgentCardNo(String agentCardNo) {
		this.agentCardNo = agentCardNo;
	}
	
	public String getContactPersonName() {
		return contactPersonName;
	}
	
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	
	public String getContactPhone() {
		return contactPhone;
	}
	
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	public String getFax() {
		return fax;
	}
	
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getWebSite() {
		return webSite;
	}
	
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	
	public Money getRegisteredCapital() {
		return registeredCapital;
	}
	
	public void setRegisteredCapital(Money registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	
	public String getRegistrationTaxCode() {
		return registrationTaxCode;
	}
	
	public void setRegistrationTaxCode(String registrationTaxCode) {
		this.registrationTaxCode = registrationTaxCode;
	}
	
	public String getLegalRepresentativeEmail() {
		return legalRepresentativeEmail;
	}
	
	public void setLegalRepresentativeEmail(String legalRepresentativeEmail) {
		this.legalRepresentativeEmail = legalRepresentativeEmail;
	}
	
	public String getLegalRepresentativeMobile() {
		return legalRepresentativeMobile;
	}
	
	public void setLegalRepresentativeMobile(String legalRepresentativeMobile) {
		this.legalRepresentativeMobile = legalRepresentativeMobile;
	}
	
	public String getLegalRepresentativePhone() {
		return legalRepresentativePhone;
	}
	
	public void setLegalRepresentativePhone(String legalRepresentativePhone) {
		this.legalRepresentativePhone = legalRepresentativePhone;
	}
	
	public String getLegalRepresentativeFax() {
		return legalRepresentativeFax;
	}
	
	public void setLegalRepresentativeFax(String legalRepresentativeFax) {
		this.legalRepresentativeFax = legalRepresentativeFax;
	}
	
	public String getLegalRepresentativeAddress() {
		return legalRepresentativeAddress;
	}
	
	public void setLegalRepresentativeAddress(String legalRepresentativeAddress) {
		this.legalRepresentativeAddress = legalRepresentativeAddress;
	}
	
	public String getLegalRepresentativeZipcode() {
		return legalRepresentativeZipcode;
	}
	
	public void setLegalRepresentativeZipcode(String legalRepresentativeZipcode) {
		this.legalRepresentativeZipcode = legalRepresentativeZipcode;
	}
	
	public String getContactPersonGender() {
		return contactPersonGender;
	}
	
	public void setContactPersonGender(String contactPersonGender) {
		this.contactPersonGender = contactPersonGender;
	}
	
	public String getContactPersonEmail() {
		return contactPersonEmail;
	}
	
	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}
	
	public String getContactPersonMobile() {
		return contactPersonMobile;
	}
	
	public void setContactPersonMobile(String contactPersonMobile) {
		this.contactPersonMobile = contactPersonMobile;
	}
	
	public String getContactPersonFax() {
		return contactPersonFax;
	}
	
	public void setContactPersonFax(String contactPersonFax) {
		this.contactPersonFax = contactPersonFax;
	}
	
	public String getContactPersonAddress() {
		return contactPersonAddress;
	}
	
	public void setContactPersonAddress(String contactPersonAddress) {
		this.contactPersonAddress = contactPersonAddress;
	}
	
	public String getContactPersonZipcode() {
		return contactPersonZipcode;
	}
	
	public void setContactPersonZipcode(String contactPersonZipcode) {
		this.contactPersonZipcode = contactPersonZipcode;
	}
	
	public String getPayPassword() {
		return payPassword;
	}
	
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	
	public String getAccountExtType() {
		return accountExtType;
	}
	
	public void setAccountExtType(String accountExtType) {
		this.accountExtType = accountExtType;
	}
	
	public String getBankKey() {
		return bankKey;
	}
	
	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}
	
	public String getBankCardType() {
		return bankCardType;
	}
	
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	
	public String getBankAccountType() {
		return bankAccountType;
	}
	
	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}
	
	public String getBankCardUserName() {
		return bankCardUserName;
	}
	
	public void setBankCardUserName(String bankCardUserName) {
		this.bankCardUserName = bankCardUserName;
	}
	
	public String getBankCardUserCertType() {
		return bankCardUserCertType;
	}
	
	public void setBankCardUserCertType(String bankCardUserCertType) {
		this.bankCardUserCertType = bankCardUserCertType;
	}
	
	public String getBankCardUserCertNo() {
		return bankCardUserCertNo;
	}
	
	public void setBankCardUserCertNo(String bankCardUserCertNo) {
		this.bankCardUserCertNo = bankCardUserCertNo;
	}
	
	public String getBankCardUserProvince() {
		return bankCardUserProvince;
	}
	
	public void setBankCardUserProvince(String bankCardUserProvince) {
		this.bankCardUserProvince = bankCardUserProvince;
	}
	
	public String getBankCardUserCity() {
		return bankCardUserCity;
	}
	
	public void setBankCardUserCity(String bankCardUserCity) {
		this.bankCardUserCity = bankCardUserCity;
	}
	
	public String getBankCardUserAddress() {
		return bankCardUserAddress;
	}
	
	public void setBankCardUserAddress(String bankCardUserAddress) {
		this.bankCardUserAddress = bankCardUserAddress;
	}
	
	public String getBankType() {
		return bankType;
	}
	
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	public String getBankCardNo() {
		return bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	
	public String getQuestionTitle() {
		return questionTitle;
	}
	
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	
	public String getBusinessLicensePath() {
		return businessLicensePath;
	}
	
	public void setBusinessLicensePath(String businessLicensePath) {
		this.businessLicensePath = businessLicensePath;
	}
	
	public String getBusinessLicenseCachetPath() {
		return businessLicenseCachetPath;
	}
	
	public void setBusinessLicenseCachetPath(String businessLicenseCachetPath) {
		this.businessLicenseCachetPath = businessLicenseCachetPath;
	}
	
	public String getCertFrontPath() {
		return certFrontPath;
	}
	
	public void setCertFrontPath(String certFrontPath) {
		this.certFrontPath = certFrontPath;
	}
	
	public String getCertBackPath() {
		return certBackPath;
	}
	
	public void setCertBackPath(String certBackPath) {
		this.certBackPath = certBackPath;
	}
	
	public String getOpeningLicensePath() {
		return openingLicensePath;
	}
	
	public void setOpeningLicensePath(String openingLicensePath) {
		this.openingLicensePath = openingLicensePath;
	}
	
	public String getEnterpriseBusinessScope() {
		return enterpriseBusinessScope;
	}
	
	public void setEnterpriseBusinessScope(String enterpriseBusinessScope) {
		this.enterpriseBusinessScope = enterpriseBusinessScope;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getCertifyStatus() {
		return certifyStatus;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}

	public String getRuntimeStatus() {
		return runtimeStatus;
	}

	public void setRuntimeStatus(String runtimeStatus) {
		this.runtimeStatus = runtimeStatus;
	}

	public String getLegalRepresentativeGender() {
		return legalRepresentativeGender;
	}

	public void setLegalRepresentativeGender(String legalRepresentativeGender) {
		this.legalRepresentativeGender = legalRepresentativeGender;
	}

	public String getBindDefault() {
		return bindDefault;
	}

	public void setBindDefault(String bindDefault) {
		this.bindDefault = bindDefault;
	}

	public String getBankCardUserGender() {
		return bankCardUserGender;
	}

	public void setBankCardUserGender(String bankCardUserGender) {
		this.bankCardUserGender = bankCardUserGender;
	}

	public String getLegalCertType() {
		return legalCertType;
	}

	public void setLegalCertType(String legalCertType) {
		this.legalCertType = legalCertType;
	}
}

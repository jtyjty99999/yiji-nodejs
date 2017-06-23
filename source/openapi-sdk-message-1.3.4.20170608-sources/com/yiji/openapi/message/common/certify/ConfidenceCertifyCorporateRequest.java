/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月24日 上午10:50:50 创建
 */
package com.yiji.openapi.message.common.certify;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "confidenceCertifyCorporate", type = ApiMessageType.Request)
public class ConfidenceCertifyCorporateRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "用户id", constraint = "")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "企业类型", constraint = "")
	private String businessTypeEnum;
	
	@NotBlank
	@OpenApiField(desc = "企业名称或个体户名称", constraint = "")
	private String comName;
	
	@NotBlank
	@OpenApiField(desc = "营业执照号码", constraint = "")
	private String licenceNo;
	
	@NotBlank
	@OpenApiField(desc = "营业执照副本图片", constraint = "")
	private String licence;
	
	@OpenApiField(desc = "营业执照副本加盖公章图片", constraint = "")
	private String licenceCopy;
	
	@NotBlank
	@OpenApiField(desc = "法人或者经营者真实姓名", constraint = "")
	private String legalPersonName;
	
	@NotBlank
	@OpenApiField(desc = "法人或者经营者证件号", constraint = "")
	private String legalPersonCertNo;
	
	@NotNull
	@OpenApiField(desc = "法人或者经营者证件类型", constraint = "")
	private String legalPersonCertType;
	
	@NotBlank
	@OpenApiField(desc = "法人或者经营者证件到期时间 正常", constraint = "格式20120911, 长期为0")
	private String legalPersonCertValidTime;
	
	@NotBlank
	@OpenApiField(desc = "法人或者经营者证件正面图片", constraint = "")
	private String legalPersonCertFrontPath;
	
	@NotBlank
	@OpenApiField(desc = "法人或者经营者证件背面图片", constraint = "")
	private String legalPersonCertBackPath;
	
	@OpenApiField(desc = "代办人真实姓名 ", constraint = "")
	private String agentPersonName;
	
	@OpenApiField(desc = "代办人证件号", constraint = "")
	private String agentPersonCertNo;
	
	@OpenApiField(desc = "代办人证件类型", constraint = "")
	private String agentPersonCertType;
	
	@OpenApiField(desc = "代办人证件到期时间", constraint = "格式20120911, 长期为0")
	private String agentPersonCertValidTime;
	
	@OpenApiField(desc = "代办人证件正面图片", constraint = "")
	private String agentPersonCertFrontPath;
	
	@OpenApiField(desc = "代办人证件背面图片", constraint = "")
	private String agentPersonCertBackPath;
	
	@OpenApiField(desc = "代办人联系手机", constraint = "")
	private String agentPersonPhone;
	
	@OpenApiField(desc = "担保函图片", constraint = "")
	private String backLetterPic;
	
	@OpenApiField(desc = "控股者为人或企业", constraint = "")
	private String holdingEnum;
	
	@OpenApiField(desc = "股东或实际控制人真实姓名", constraint = "")
	private String holdingName;
	
	@OpenApiField(desc = "股东或实际控制人证件号", constraint = "")
	private String holdingCertNo;
	
	@OpenApiField(desc = "股东或实际控制人证件类型", constraint = "")
	private String holdingCertType;
	
	@OpenApiField(desc = "股东或实际控制人证件到期时间", constraint = "格式20120911, 长期为0")
	private String holdingCertValidTime;
	
	@OpenApiField(desc = "股东或实际控制人证件正面图片", constraint = "")
	private String holdingCertFrontPath;
	
	@OpenApiField(desc = "股东或实际控制人证件背面图片", constraint = "")
	private String holdingCertBackPath;
	
	@OpenApiField(desc = "控股企业名称", constraint = "")
	private String holdingComName;
	
	@OpenApiField(desc = "控股企业组织机构代码", constraint = "")
	private String holdingComOrganizationCode;
	
	@OpenApiField(desc = "控股企业营业执照注册号", constraint = "")
	private String holdingComLicenceNo;
	
	@OpenApiField(desc = "控股企业营业执照地址", constraint = "")
	private String holdingComAddress;
	
	@OpenApiField(desc = "控股企业营业年限", constraint = "格式 20201225，长期 0")
	private String holdingComCycle;
	
	@OpenApiField(desc = "控股企业经营范围", constraint = "")
	private String holdingComBusinessScope;
	
	@OpenApiField(desc = "控股企业营业执照副本扫描件", constraint = "")
	private String holdingComLicence;
	
	@OpenApiField(desc = "是否以代办人办理", constraint = "Y:是，N:否")
	private String isLegalPerAudit = "N";
	
	@NotBlank
	@OpenApiField(desc = "营业执照所在地 省份名称", constraint = "")
	private String provName;
	
	@NotBlank
	@OpenApiField(desc = "营业执照所在地 市名称", constraint = "")
	private String cityName;
	
	@NotBlank
	@OpenApiField(desc = "营业年限", constraint = "格式20120911, 长期为0")
	private String comCycle;
	
	@NotBlank
	@OpenApiField(desc = "常用地址", constraint = "")
	private String address;
	
	@NotBlank
	@OpenApiField(desc = "联系电话", constraint = "")
	private String phone;
	
	@OpenApiField(desc = "税务登记号", constraint = "")
	private String taxAuthorityNo;
	
	@OpenApiField(desc = "组织机构代码证号", constraint = "")
	private String organizationCode;
	
	@NotBlank
	@OpenApiField(desc = "经营范围 ", constraint = "")
	private String businessScope;
	
	@OpenApiField(desc = "公安部存档照片:法人", constraint = "")
	private String auditpic;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBusinessTypeEnum() {
		return this.businessTypeEnum;
	}
	
	public void setBusinessTypeEnum(String businessTypeEnum) {
		this.businessTypeEnum = businessTypeEnum;
	}
	
	public String getComName() {
		return this.comName;
	}
	
	public void setComName(String comName) {
		this.comName = comName;
	}
	
	public String getLicenceNo() {
		return this.licenceNo;
	}
	
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	
	public String getLicence() {
		return this.licence;
	}
	
	public void setLicence(String licence) {
		this.licence = licence;
	}
	
	public String getLicenceCopy() {
		return this.licenceCopy;
	}
	
	public void setLicenceCopy(String licenceCopy) {
		this.licenceCopy = licenceCopy;
	}
	
	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	
	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}
	
	public String getLegalPersonCertType() {
		return this.legalPersonCertType;
	}
	
	public void setLegalPersonCertType(String legalPersonCertType) {
		this.legalPersonCertType = legalPersonCertType;
	}
	
	public String getLegalPersonCertValidTime() {
		return this.legalPersonCertValidTime;
	}
	
	public void setLegalPersonCertValidTime(String legalPersonCertValidTime) {
		this.legalPersonCertValidTime = legalPersonCertValidTime;
	}
	
	public String getLegalPersonCertFrontPath() {
		return this.legalPersonCertFrontPath;
	}
	
	public void setLegalPersonCertFrontPath(String legalPersonCertFrontPath) {
		this.legalPersonCertFrontPath = legalPersonCertFrontPath;
	}
	
	public String getLegalPersonCertBackPath() {
		return this.legalPersonCertBackPath;
	}
	
	public void setLegalPersonCertBackPath(String legalPersonCertBackPath) {
		this.legalPersonCertBackPath = legalPersonCertBackPath;
	}
	
	public String getAgentPersonName() {
		return this.agentPersonName;
	}
	
	public void setAgentPersonName(String agentPersonName) {
		this.agentPersonName = agentPersonName;
	}
	
	public String getAgentPersonCertNo() {
		return this.agentPersonCertNo;
	}
	
	public void setAgentPersonCertNo(String agentPersonCertNo) {
		this.agentPersonCertNo = agentPersonCertNo;
	}
	
	public String getAgentPersonCertType() {
		return this.agentPersonCertType;
	}
	
	public void setAgentPersonCertType(String agentPersonCertType) {
		this.agentPersonCertType = agentPersonCertType;
	}
	
	public String getAgentPersonCertValidTime() {
		return this.agentPersonCertValidTime;
	}
	
	public void setAgentPersonCertValidTime(String agentPersonCertValidTime) {
		this.agentPersonCertValidTime = agentPersonCertValidTime;
	}
	
	public String getAgentPersonCertFrontPath() {
		return this.agentPersonCertFrontPath;
	}
	
	public void setAgentPersonCertFrontPath(String agentPersonCertFrontPath) {
		this.agentPersonCertFrontPath = agentPersonCertFrontPath;
	}
	
	public String getAgentPersonCertBackPath() {
		return this.agentPersonCertBackPath;
	}
	
	public void setAgentPersonCertBackPath(String agentPersonCertBackPath) {
		this.agentPersonCertBackPath = agentPersonCertBackPath;
	}
	
	public String getAgentPersonPhone() {
		return this.agentPersonPhone;
	}
	
	public void setAgentPersonPhone(String agentPersonPhone) {
		this.agentPersonPhone = agentPersonPhone;
	}
	
	public String getBackLetterPic() {
		return this.backLetterPic;
	}
	
	public void setBackLetterPic(String backLetterPic) {
		this.backLetterPic = backLetterPic;
	}
	
	public String getHoldingEnum() {
		return this.holdingEnum;
	}
	
	public void setHoldingEnum(String holdingEnum) {
		this.holdingEnum = holdingEnum;
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
	
	public String getHoldingCertType() {
		return this.holdingCertType;
	}
	
	public void setHoldingCertType(String holdingCertType) {
		this.holdingCertType = holdingCertType;
	}
	
	public String getHoldingCertValidTime() {
		return this.holdingCertValidTime;
	}
	
	public void setHoldingCertValidTime(String holdingCertValidTime) {
		this.holdingCertValidTime = holdingCertValidTime;
	}
	
	public String getHoldingCertFrontPath() {
		return this.holdingCertFrontPath;
	}
	
	public void setHoldingCertFrontPath(String holdingCertFrontPath) {
		this.holdingCertFrontPath = holdingCertFrontPath;
	}
	
	public String getHoldingCertBackPath() {
		return this.holdingCertBackPath;
	}
	
	public void setHoldingCertBackPath(String holdingCertBackPath) {
		this.holdingCertBackPath = holdingCertBackPath;
	}
	
	public String getHoldingComName() {
		return this.holdingComName;
	}
	
	public void setHoldingComName(String holdingComName) {
		this.holdingComName = holdingComName;
	}
	
	public String getHoldingComOrganizationCode() {
		return this.holdingComOrganizationCode;
	}
	
	public void setHoldingComOrganizationCode(String holdingComOrganizationCode) {
		this.holdingComOrganizationCode = holdingComOrganizationCode;
	}
	
	public String getHoldingComLicenceNo() {
		return this.holdingComLicenceNo;
	}
	
	public void setHoldingComLicenceNo(String holdingComLicenceNo) {
		this.holdingComLicenceNo = holdingComLicenceNo;
	}
	
	public String getHoldingComAddress() {
		return this.holdingComAddress;
	}
	
	public void setHoldingComAddress(String holdingComAddress) {
		this.holdingComAddress = holdingComAddress;
	}
	
	public String getHoldingComCycle() {
		return this.holdingComCycle;
	}
	
	public void setHoldingComCycle(String holdingComCycle) {
		this.holdingComCycle = holdingComCycle;
	}
	
	public String getHoldingComBusinessScope() {
		return this.holdingComBusinessScope;
	}
	
	public void setHoldingComBusinessScope(String holdingComBusinessScope) {
		this.holdingComBusinessScope = holdingComBusinessScope;
	}
	
	public String getHoldingComLicence() {
		return this.holdingComLicence;
	}
	
	public void setHoldingComLicence(String holdingComLicence) {
		this.holdingComLicence = holdingComLicence;
	}
	
	public String getIsLegalPerAudit() {
		return this.isLegalPerAudit;
	}
	
	public void setIsLegalPerAudit(String isLegalPerAudit) {
		this.isLegalPerAudit = isLegalPerAudit;
	}
	
	public String getProvName() {
		return this.provName;
	}
	
	public void setProvName(String provName) {
		this.provName = provName;
	}
	
	public String getCityName() {
		return this.cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getComCycle() {
		return this.comCycle;
	}
	
	public void setComCycle(String comCycle) {
		this.comCycle = comCycle;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getTaxAuthorityNo() {
		return this.taxAuthorityNo;
	}
	
	public void setTaxAuthorityNo(String taxAuthorityNo) {
		this.taxAuthorityNo = taxAuthorityNo;
	}
	
	public String getOrganizationCode() {
		return this.organizationCode;
	}
	
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	
	public String getBusinessScope() {
		return this.businessScope;
	}
	
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	
	public String getAuditpic() {
		return this.auditpic;
	}
	
	public void setAuditpic(String auditpic) {
		this.auditpic = auditpic;
	}
}

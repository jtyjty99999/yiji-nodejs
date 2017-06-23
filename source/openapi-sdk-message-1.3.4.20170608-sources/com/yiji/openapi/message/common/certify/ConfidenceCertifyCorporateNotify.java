/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年11月24日 上午10:50:50 创建
 */
package com.yiji.openapi.message.common.certify;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "confidenceCertifyCorporate", type = ApiMessageType.Notify)
public class ConfidenceCertifyCorporateNotify extends ApiNotify {
	
	@OpenApiField(desc = "用户id", constraint = "")
	private String userId;
	
	@OpenApiField(desc = "企业类型", constraint = "")
	private String userType;
	
	@OpenApiField(desc = "企业名称或个体户名称", constraint = "")
	private String legalPersonName;
	
	@OpenApiField(desc = "营业执照正面", constraint = "")
	private String legalPersonCertFrontPath;
	
	@OpenApiField(desc = "营业执照背面", constraint = "")
	private String legalPersonCertBackPath;
	
	@OpenApiField(desc = "到期时间", constraint = "")
	private String validityTime;
	
	@OpenApiField(desc = "状态", constraint = "")
	private String status;
	
	@OpenApiField(desc = "消息", constraint = "")
	private String message;
	
	@OpenApiField(desc = "实名认证通过日期", constraint = "")
	private String certifyPassDate;
	
	@OpenApiField(desc = "所属地", constraint = "")
	private String attribution;
	
	@OpenApiField(desc = "企业名称", constraint = "")
	private String comName;
	
	@OpenApiField(desc = "执照号", constraint = "")
	private String licenceNo;
	
	@OpenApiField(desc = "营业执照副本图片", constraint = "")
	private String licence;
	
	@OpenApiField(desc = "税务登记号", constraint = "")
	private String taxAuthorityNo;
	
	@OpenApiField(desc = "组织机构代码证号", constraint = "")
	private String organizationCode;
	
	@OpenApiField(desc = "营业年限", constraint = "格式20120911, 长期为0")
	private String comCycle;
	
	@OpenApiField(desc = "营业执照所在地 省份名称", constraint = "")
	private String provName;
	
	@OpenApiField(desc = "营业执照所在地 市名称", constraint = "")
	private String cityName;
	
	@OpenApiField(desc = "常用地址", constraint = "")
	private String address;
	
	@OpenApiField(desc = "联系电话", constraint = "")
	private String phone;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserType() {
		return this.userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
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
	
	public String getValidityTime() {
		return this.validityTime;
	}
	
	public void setValidityTime(String validityTime) {
		this.validityTime = validityTime;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getCertifyPassDate() {
		return this.certifyPassDate;
	}
	
	public void setCertifyPassDate(String certifyPassDate) {
		this.certifyPassDate = certifyPassDate;
	}
	
	public String getAttribution() {
		return this.attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
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
	
	public String getComCycle() {
		return this.comCycle;
	}
	
	public void setComCycle(String comCycle) {
		this.comCycle = comCycle;
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
	
}

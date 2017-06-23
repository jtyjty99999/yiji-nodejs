/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年3月16日 上午9:44:26 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年3月16日
 */
@Deprecated
@OpenApiMessage(service = "realNameCert.save", type = ApiMessageType.Notify)
public class RealNameCertSaveNotify extends ApiNotify {
	
	@NotBlank
	@OpenApiField(desc = "会员ID", constraint = "会员ID", demo = "20160315010000087711")
	private String userId;
	
	@OpenApiField(desc = "真实名称", constraint = "个人返回", demo = "张三")
	private String realName;
	
	@OpenApiField(desc = "证件有效期", constraint = "证件有效期", demo = "长期")
	private String validityTime;
	
	@OpenApiField(desc = "证件号", constraint = "个人返回", demo = "511221198210132315")
	private String certNo;
	
	@OpenApiField(desc = "证件图片正面路径", constraint = "个人返回", demo = "https:/www.baidu.com/a.png")
	private String certFrontPath;
	
	@OpenApiField(desc = "证件图片背面路径", constraint = "个人返回", demo = "https:/www.baidu.com/a.png")
	private String certBackPath;
	
	@NotBlank
	@OpenApiField(desc = "状态", constraint = "{\"data\":[\"SUCCESS:成功\",\"FAIL:失败\"],\"name\":\"状态\"}", demo = "FAIL")
	private String status;
	
	@NotBlank
	@OpenApiField(desc = "描述", constraint = "描述", demo = "成功")
	private String message;
	
	@OpenApiField(desc = "归属地", constraint = "归属地", demo = "重庆")
	private String attribution;
	
	@NotBlank
	@OpenApiField(desc = "用户类型", constraint = "{\"data\":[\"persnal:成功\",\"business:企业\"],\"name\":\"用户类型\"}",
			demo = "business")
	private String userType;
	
	@OpenApiField(desc = "法人姓名", constraint = "企业返回", demo = "李四")
	private String legalPersonName;
	
	@OpenApiField(desc = "法人证件图片正面路径", constraint = "企业返回", demo = "https:/www.baidu.com/a.png")
	private String legalPersonCertFrontPath;
	
	@OpenApiField(desc = "法人证件图片背面路径", constraint = "企业返回", demo = "https:/www.baidu.com/a.png")
	private String legalPersonCertBackPath;
	
	@OpenApiField(desc = "企业名称", constraint = "企业返回", demo = "易极付")
	private String comName;
	
	@OpenApiField(desc = "企业证书注册号", constraint = "企业返回", demo = "213123123")
	private String licenceNo;
	
	@OpenApiField(desc = "企业证书图片", constraint = "企业返回", demo = "https:/www.baidu.com/a.png")
	private String licence;
	
	@OpenApiField(desc = "税务登记号", constraint = "企业返回", demo = "324234")
	private String taxAuthorityNo;
	
	@OpenApiField(desc = "组织机构代码", constraint = "企业返回", demo = "00021")
	private String organizationCode;
	
	@OpenApiField(desc = "企业证书有效期", constraint = "企业返回", demo = "2019-05-06")
	private String comCycle;
	
	@OpenApiField(desc = "地址", constraint = "企业返回", demo = "重庆两江新区")
	private String address;
	
	@OpenApiField(desc = "联系电话", constraint = "企业返回", demo = "40833245")
	private String phone;
	
	@OpenApiField(desc = "企业所在省", constraint = "企业返回", demo = "重庆市")
	private String provName;
	
	@OpenApiField(desc = "企业所在市", constraint = "企业返回", demo = "重庆市")
	private String cityName;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getValidityTime() {
		return this.validityTime;
	}
	
	public void setValidityTime(String validityTime) {
		this.validityTime = validityTime;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertFrontPath() {
		return this.certFrontPath;
	}
	
	public void setCertFrontPath(String certFrontPath) {
		this.certFrontPath = certFrontPath;
	}
	
	public String getCertBackPath() {
		return this.certBackPath;
	}
	
	public void setCertBackPath(String certBackPath) {
		this.certBackPath = certBackPath;
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
	
	public String getAttribution() {
		return this.attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
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
	
}

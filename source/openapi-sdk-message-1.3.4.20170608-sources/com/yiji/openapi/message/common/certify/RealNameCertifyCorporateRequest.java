/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月8日 下午2:05:22创建
 */
package com.yiji.openapi.message.common.certify;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
@Deprecated
@OpenApiMessage(service = "realNameCertifyCorporate", type = ApiMessageType.Request)
public class RealNameCertifyCorporateRequest extends ApiRequest {
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID", demo = "12345679801234567980")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "企业类型", constraint = "NORMAL")
	private String businessTypeEnum;
	
	@NotEmpty
	@Length(max = 64)
	@OpenApiField(desc = "企业名称", constraint = "企业名称或个体户名称", demo = "重庆易极付科技有限公司")
	private String comName;
	
	@NotEmpty
	@Length(max = 32)
	@OpenApiField(desc = "营业执照号码", constraint = "营业执照号码", demo = "12345678")
	private String licenceNo;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "营业执照图片", constraint = "请提供可公网访问的URL", demo = "http://www.yiji.com/1.jpg")
	private String licence;
	
	@NotEmpty
	@Length(max = 32)
	@OpenApiField(desc = "法人姓名", constraint = "", demo = "易极付")
	private String legalPersonName;
	
	@NotNull
	@OpenApiField(desc = "法人或者经营者证件类型", demo = "Identity_Card")
	private String legalPersonCertType;
	
	@NotEmpty
	@Length(max = 50)
	@OpenApiField(desc = "法人证件号码", demo = "12345679801233456")
	private String legalPersonCertNo;
	
	@NotEmpty
	@Length(max = 8)
	@OpenApiField(desc = "法人或者经营者证件到期时间", constraint = "法人或者经营者证件到期时间。格式:yyyyMMdd。如：正常：20120911,  长期为：0",
			demo = "19721212")
	private String legalPersonCertValidTime;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "法人证件正面图片", constraint = "法人证件正面图片。请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String legalPersonCertFrontPath;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "法人证件背面图片", constraint = "法人证件背面图片。请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String legalPersonCertBackPath;
	
	@NotEmpty
	@Length(max = 255)
	@OpenApiField(desc = "常用地址", constraint = "常用地址",demo = "重庆市北部新区黄山大道中段9号")
	private String address;
	
	@NotEmpty
	@Length(max = 20)
	@OpenApiField(desc = "联系电话", constraint = "联系电话",demo = "10086100101")
	private String phone;
	
	@NotEmpty
	@Length(max = 20)
	@OpenApiField(desc = "营业执照所在地省", constraint = "营业执照所在地省。请填写省名称汉字，直辖市直接填写市名",demo = "重庆市")
	private String provName;
	
	@NotEmpty
	@Length(max = 20)
	@OpenApiField(desc = "营业执照所在地市", constraint = "营业执照所在地市名称汉字",demo = "重庆市")
	private String cityName;
	
	@NotEmpty
	@Length(max = 512)
	@OpenApiField(desc = "经营范围", constraint = "经营范围",demo = "计算机")
	private String businessScope;
	
	@NotEmpty
	@Length(max = 16)
	@OpenApiField(desc = "营业年限", constraint = "营业年限，格式:yyyyMMdd。如：正常：20120911,  长期为：0",demo = "20201111")
	private String comCycle;
	
	@OpenApiField(desc = "归属地", constraint = "归属地，默认大陆",demo = "LAND")
	private String attribution;
	
	@Length(max = 64)
	@OpenApiField(desc = "组织机构代码", demo = "123465978")
	private String organizationCode;
	
	@OpenApiField(desc = "实际控股", demo = "HOLDING_PERSON")
	private String holdingEnum;
	
	@Length(max = 32)
	@OpenApiField(desc = "股东或实际控制人真实姓名", demo = "易极付")
	private String holdingName;
	
	@OpenApiField(desc = "股东或实际控制人证件类型", constraint = "可选值请参考：“6.2.证件类型”",demo = "Identity_Card")
	private String holdingCertType;
	
	@Length(max = 50)
	@OpenApiField(desc = "股东或实际控制人证件号", constraint = "股东或实际控制人证件号",demo = "132456798012345678")
	private String holdingCertNo;
	
	@Length(max = 8)
	@OpenApiField(desc = "股东或实际控制人证件到期时间", constraint = "格式:yyyyMMdd。如：20120911。 长期为0",demo = "19721212")
	private String holdingCertValidTime;
	
	@Length(max = 256)
	@OpenApiField(desc = "股东或实际控制人证件正面图片", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String holdingCertFrontPath;
	
	@Length(max = 256)
	@OpenApiField(desc = "股东或实际控制人证件背面图片", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String holdingCertBackPath;
	
	@Length(max = 32)
	@OpenApiField(desc = "控股企业名称", demo = "易极付")
	private String holdingComName;
	
	@Length(max = 256)
	@OpenApiField(desc = "控股企业营业执照地址", demo = "http://www.yiji.com/1.jpg")
	private String holdingComAddress;
	
	@Length(max = 256)
	@OpenApiField(desc = "控股企业经营范围", demo = "计算机")
	private String holdingComBusinessScope;
	
	@Length(max = 8)
	@OpenApiField(desc = "控股企业营业年限", constraint = "格式：yyyyMMdd,长期填写0。如：2020-12-25 --> 20201225",demo = "19721212")
	private String holdingComCycle;
	
	@Length(max = 32)
	@OpenApiField(desc = "控股企业营业执照注册号", demo = "12345897")
	private String holdingComLicenceNo;
	
	@Length(max = 256)
	@OpenApiField(desc = "控股企业营业执照副本扫描件", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String holdingComLicence;
	
	@Length(max = 64)
	@OpenApiField(desc = "控股企业组织机构代码", demo = "123654897")
	private String holdingComOrganizationCode;
	
	@Length(max = 256)
	@OpenApiField(desc = "开户许可证图片", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String openAccountImg;
	
	@Length(max = 64)
	@OpenApiField(desc = "开户许可证号码", demo = "123645897")
	private String openAccountNo;
	
	@Length(max = 64)
	@OpenApiField(desc = "税务登记证号码", demo = "232146546")
	private String taxAuthorityNo;
	
	@Length(max = 256)
	@OpenApiField(desc = "税务登记证图片", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String taxAuthorityNoImg;
	
	@Length(max = 256)
	@OpenApiField(desc = "组织机构代码证图片", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String organizationCodeImg;
	
	@Length(max = 256)
	@OpenApiField(desc = "批文图片", constraint = "请提供可公网访问的URL",demo = "http://www.yiji.com/1.jpg")
	private String approvalDocument;
	
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
	
	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	
	public String getLegalPersonCertType() {
		return this.legalPersonCertType;
	}
	
	public void setLegalPersonCertType(String legalPersonCertType) {
		this.legalPersonCertType = legalPersonCertType;
	}
	
	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
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
	
	public String getBusinessScope() {
		return this.businessScope;
	}
	
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	
	public String getComCycle() {
		return this.comCycle;
	}
	
	public void setComCycle(String comCycle) {
		this.comCycle = comCycle;
	}
	
	public String getAttribution() {
		return this.attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	
	public String getOrganizationCode() {
		return this.organizationCode;
	}
	
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
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
	
	public String getHoldingCertType() {
		return this.holdingCertType;
	}
	
	public void setHoldingCertType(String holdingCertType) {
		this.holdingCertType = holdingCertType;
	}
	
	public String getHoldingCertNo() {
		return this.holdingCertNo;
	}
	
	public void setHoldingCertNo(String holdingCertNo) {
		this.holdingCertNo = holdingCertNo;
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
	
	public String getHoldingComAddress() {
		return this.holdingComAddress;
	}
	
	public void setHoldingComAddress(String holdingComAddress) {
		this.holdingComAddress = holdingComAddress;
	}
	
	public String getHoldingComBusinessScope() {
		return this.holdingComBusinessScope;
	}
	
	public void setHoldingComBusinessScope(String holdingComBusinessScope) {
		this.holdingComBusinessScope = holdingComBusinessScope;
	}
	
	public String getHoldingComCycle() {
		return this.holdingComCycle;
	}
	
	public void setHoldingComCycle(String holdingComCycle) {
		this.holdingComCycle = holdingComCycle;
	}
	
	public String getHoldingComLicenceNo() {
		return this.holdingComLicenceNo;
	}
	
	public void setHoldingComLicenceNo(String holdingComLicenceNo) {
		this.holdingComLicenceNo = holdingComLicenceNo;
	}
	
	public String getHoldingComLicence() {
		return this.holdingComLicence;
	}
	
	public void setHoldingComLicence(String holdingComLicence) {
		this.holdingComLicence = holdingComLicence;
	}
	
	public String getHoldingComOrganizationCode() {
		return this.holdingComOrganizationCode;
	}
	
	public void setHoldingComOrganizationCode(String holdingComOrganizationCode) {
		this.holdingComOrganizationCode = holdingComOrganizationCode;
	}
	
	public String getOpenAccountImg() {
		return this.openAccountImg;
	}
	
	public void setOpenAccountImg(String openAccountImg) {
		this.openAccountImg = openAccountImg;
	}
	
	public String getOpenAccountNo() {
		return this.openAccountNo;
	}
	
	public void setOpenAccountNo(String openAccountNo) {
		this.openAccountNo = openAccountNo;
	}
	
	public String getTaxAuthorityNoImg() {
		return this.taxAuthorityNoImg;
	}
	
	public void setTaxAuthorityNoImg(String taxAuthorityNoImg) {
		this.taxAuthorityNoImg = taxAuthorityNoImg;
	}
	
	public String getOrganizationCodeImg() {
		return this.organizationCodeImg;
	}
	
	public void setOrganizationCodeImg(String organizationCodeImg) {
		this.organizationCodeImg = organizationCodeImg;
	}
	
	public String getApprovalDocument() {
		return this.approvalDocument;
	}
	
	public void setApprovalDocument(String approvalDocument) {
		this.approvalDocument = approvalDocument;
	}
	
	public String getTaxAuthorityNo() {
		return taxAuthorityNo;
	}
	
	public void setTaxAuthorityNo(String taxAuthorityNo) {
		this.taxAuthorityNo = taxAuthorityNo;
	}
}

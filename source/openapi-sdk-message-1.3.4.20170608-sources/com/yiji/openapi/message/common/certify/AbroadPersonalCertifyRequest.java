/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-09 16:10 创建
 *
 */
package com.yiji.openapi.message.common.certify;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "abroadPersonalCertify", type = ApiMessageType.Request)
public class AbroadPersonalCertifyRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID",demo = "12345678901234567980")
	private String userId;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "真实名称", constraint = "真实名称",demo = "易极付")
	private String realName;
	
	@NotNull
	@OpenApiField(desc = "证件类型",demo = "Identity_Card")
	private String certType;
	
	@NotBlank
	@Length(max = 50)
	@OpenApiField(desc = "证件号码", constraint = "证件号码",demo = "123456789012345678")
	private String certNo;
	
	@NotNull
	@Length(max = 8)
	@OpenApiField(desc = "证件有效期", constraint = "证件到期日期	yyyyMMdd，长期为：0",demo = "19721212")
	private String certValidTime;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "证件正面图片", constraint = "证件正面图片。请提供可公网访问的URL",demo = "http://www.yiji.com/i.jpg")
	private String certFrontPath;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "证件背面图片", constraint = "证件背面图片。请提供可公网访问的URL",demo = "http://www.yiji.com/i.jpg")
	private String certBackPath;
	
	@NotNull
	@OpenApiField(desc = "职业	", constraint = "填写职业编码",demo = "J")
	private String occupation;
	
	@NotBlank
	@Length(max = 16)
	@OpenApiField(desc = "手机号码", constraint = "手机号码",demo = "10086100101")
	private String mobileNo;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "家庭或工作单位地址", constraint = "家庭或工作单位地址，如果是身份证，则填写身份证地址",demo = "重庆市北部新区黄山大道中段9号")
	private String address;
	
	@NotNull
	@OpenApiField(desc = "归属地",demo = "LAND")
	private String attribution;
	
	@NotBlank
	@OpenApiField(desc = "担保人真实姓名",demo = "易极付")
	private String guaranteeName;
	
	@NotBlank
	@OpenApiField(desc = "担保人证件号",demo = "123456798012345678")
	private String guaranteeCertNo;
	
	@NotNull
	@OpenApiField(desc = "担保人证件类型",demo = "Identity_Card")
	private String guaranteeCertType;
	
	@NotBlank
	@OpenApiField(desc = "担保人证件到期时间", constraint = "例：20120911, 长期为0",demo = "19721212")
	private String guaranteeCertValidTime;
	
	@NotBlank
	@OpenApiField(desc = "担保人证件正面图片",demo = "http://www.yiji.com/1.jpg")
	private String guaranteeCertFrontPath;
	
	@NotBlank
	@OpenApiField(desc = "担保人证件背面图片",demo = "http://www.yiji.com/1.jpg")
	private String guaranteeCertBackPath;
	
	@NotBlank
	@OpenApiField(desc = "担保人联系手机",demo = "10086100101")
	private String guaranteePhone;
	
	@NotNull
	@OpenApiField(desc = "担保人职业",demo = "J")
	private String guaranteeOccupation;
	
	@NotBlank
	@OpenApiField(desc = "担保人地址",demo = "重庆市北部新区黄山大道中段9号")
	private String guaranteeAddress;
	
	@NotBlank
	@OpenApiField(desc = "担保书上传图片",demo = "http://www.yiji.com/1.jpg")
	private String guaranteePic;
	
	@NotNull
	@OpenApiField(desc = "性别",demo = "WOMAN")
	private String sex;
	
	@NotNull
	@OpenApiField(desc = "国籍",demo = "China")
	private String country;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
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
	
	public String getCertValidTime() {
		return certValidTime;
	}
	
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
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
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAttribution() {
		return attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	
	public String getGuaranteeName() {
		return guaranteeName;
	}
	
	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName;
	}
	
	public String getGuaranteeCertNo() {
		return guaranteeCertNo;
	}
	
	public void setGuaranteeCertNo(String guaranteeCertNo) {
		this.guaranteeCertNo = guaranteeCertNo;
	}
	
	public String getGuaranteeCertType() {
		return guaranteeCertType;
	}
	
	public void setGuaranteeCertType(String guaranteeCertType) {
		this.guaranteeCertType = guaranteeCertType;
	}
	
	public String getGuaranteeCertValidTime() {
		return guaranteeCertValidTime;
	}
	
	public void setGuaranteeCertValidTime(String guaranteeCertValidTime) {
		this.guaranteeCertValidTime = guaranteeCertValidTime;
	}
	
	public String getGuaranteeCertFrontPath() {
		return guaranteeCertFrontPath;
	}
	
	public void setGuaranteeCertFrontPath(String guaranteeCertFrontPath) {
		this.guaranteeCertFrontPath = guaranteeCertFrontPath;
	}
	
	public String getGuaranteeCertBackPath() {
		return guaranteeCertBackPath;
	}
	
	public void setGuaranteeCertBackPath(String guaranteeCertBackPath) {
		this.guaranteeCertBackPath = guaranteeCertBackPath;
	}
	
	public String getGuaranteePhone() {
		return guaranteePhone;
	}
	
	public void setGuaranteePhone(String guaranteePhone) {
		this.guaranteePhone = guaranteePhone;
	}
	
	public String getGuaranteeOccupation() {
		return guaranteeOccupation;
	}
	
	public void setGuaranteeOccupation(String guaranteeOccupation) {
		this.guaranteeOccupation = guaranteeOccupation;
	}
	
	public String getGuaranteeAddress() {
		return guaranteeAddress;
	}
	
	public void setGuaranteeAddress(String guaranteeAddress) {
		this.guaranteeAddress = guaranteeAddress;
	}
	
	public String getGuaranteePic() {
		return guaranteePic;
	}
	
	public void setGuaranteePic(String guaranteePic) {
		this.guaranteePic = guaranteePic;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com Mon Nov 24 15:09:05 CST 2014 创建
 */
package com.yiji.openapi.message.common.certify;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
@Deprecated
@OpenApiMessage(service = "confidenceAbroadPersonal", type = ApiMessageType.Request)
public class ConfidenceAbroadPersonalRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户id")
	private String userId;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "证件号")
	private String certNo;
	
	@NotNull
	@OpenApiField(desc = "证件类型")
	private String certType;
	
	@Length(max = 256)
	@OpenApiField(desc = "证件正面图片")
	private String certFrontPath;
	
	@Length(max = 256)
	@OpenApiField(desc = "证件背面图片")
	private String certBackPath;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "证件到期时间")
	private String certValidTime;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "担保人姓名")
	private String guaranteeName;
	
	@NotBlank
	@Length(max = 32)
	@OpenApiField(desc = "担保人证件号")
	private String guaranteeCertNo;
	
	@NotNull
	@OpenApiField(desc = "担保人证件类型")
	private String guaranteeCertType;
	
	@NotBlank
	@Length(max = 8)
	@OpenApiField(desc = "担保人证件到期时间")
	private String guaranteeCertValidTime;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "担保人证件正面图片")
	private String guaranteeCertFrontPath;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "担保人证件背面图片")
	private String guaranteeCertBackPath;
	
	@NotBlank
	@OpenApiField(desc = "担保人手机号")
	private String guaranteePhone;
	
	@NotNull
	@OpenApiField(desc = "担保人职业")
	private String guaranteeOccupation;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "担保人地址")
	private String guaranteeAddress;
	
	@NotBlank
	@OpenApiField(desc = "担保函")
	private String guaranteePic;
	
	@NotNull
	@OpenApiField(desc = "归属地")
	private String attribution;
	
	@NotNull
	@OpenApiField(desc = "职业")
	private String occupation;
	
	@OpenApiField(desc = "出生日期")
	private Date birth;
	
	@OpenApiField(desc = "收入")
	private String salary;
	
	@NotBlank
	@OpenApiField(desc = "联系电话")
	private String phone;
	
	@NotNull
	@OpenApiField(desc = "性别")
	private String sex;
	
	@NotBlank
	@OpenApiField(desc = "地址")
	private String address;
	
	@NotNull
	@OpenApiField(desc = "国家")
	private String country;
	
	@NotBlank
	@Length(max = 256)
	@OpenApiField(desc = "公安部存档图片")
	private String auditpic;
	
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
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertType() {
		return this.certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
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
	
	public String getCertValidTime() {
		return this.certValidTime;
	}
	
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
	}
	
	public String getGuaranteeName() {
		return this.guaranteeName;
	}
	
	public void setGuaranteeName(String guaranteeName) {
		this.guaranteeName = guaranteeName;
	}
	
	public String getGuaranteeCertNo() {
		return this.guaranteeCertNo;
	}
	
	public void setGuaranteeCertNo(String guaranteeCertNo) {
		this.guaranteeCertNo = guaranteeCertNo;
	}
	
	public String getGuaranteeCertType() {
		return this.guaranteeCertType;
	}
	
	public void setGuaranteeCertType(String guaranteeCertType) {
		this.guaranteeCertType = guaranteeCertType;
	}
	
	public String getGuaranteeCertValidTime() {
		return this.guaranteeCertValidTime;
	}
	
	public void setGuaranteeCertValidTime(String guaranteeCertValidTime) {
		this.guaranteeCertValidTime = guaranteeCertValidTime;
	}
	
	public String getGuaranteeCertFrontPath() {
		return this.guaranteeCertFrontPath;
	}
	
	public void setGuaranteeCertFrontPath(String guaranteeCertFrontPath) {
		this.guaranteeCertFrontPath = guaranteeCertFrontPath;
	}
	
	public String getGuaranteeCertBackPath() {
		return this.guaranteeCertBackPath;
	}
	
	public void setGuaranteeCertBackPath(String guaranteeCertBackPath) {
		this.guaranteeCertBackPath = guaranteeCertBackPath;
	}
	
	public String getGuaranteePhone() {
		return this.guaranteePhone;
	}
	
	public void setGuaranteePhone(String guaranteePhone) {
		this.guaranteePhone = guaranteePhone;
	}
	
	public String getGuaranteeOccupation() {
		return this.guaranteeOccupation;
	}
	
	public void setGuaranteeOccupation(String guaranteeOccupation) {
		this.guaranteeOccupation = guaranteeOccupation;
	}
	
	public String getGuaranteeAddress() {
		return this.guaranteeAddress;
	}
	
	public void setGuaranteeAddress(String guaranteeAddress) {
		this.guaranteeAddress = guaranteeAddress;
	}
	
	public String getGuaranteePic() {
		return this.guaranteePic;
	}
	
	public void setGuaranteePic(String guaranteePic) {
		this.guaranteePic = guaranteePic;
	}
	
	public String getAttribution() {
		return this.attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public Date getBirth() {
		return this.birth;
	}
	
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String getSalary() {
		return this.salary;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getAuditpic() {
		return this.auditpic;
	}
	
	public void setAuditpic(String auditpic) {
		this.auditpic = auditpic;
	}
}
/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月8日 上午10:22:36创建
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
@OpenApiMessage(service = "realNameCertifyPersonal", type = ApiMessageType.Request)
public class RealNameCertifyPersonalRequest extends ApiRequest {
	
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户Id", constraint = "易极付用户ID", demo = "12345697801324657890")
	private String userId;
	
	@NotEmpty
	@Length(max = 50)
	@OpenApiField(desc = "真实名称", constraint = "真实名称", demo = "易极付")
	private String realName;
	
	@NotNull
	@OpenApiField(desc = "证件类型", demo = "Identity_Card")
	private String certType;
	
	@NotEmpty
	@Length(max = 50)
	@OpenApiField(desc = "证件号码", constraint = "证件号码", demo = "123456798012345678")
	private String certNo;
	
	@NotEmpty
	@Length(max = 8)
	@OpenApiField(desc = "证件有效期", constraint = "证件到期日期	yyyyMMdd，长期为：0", demo = "19721212")
	private String certValidTime;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "证件正面图片", constraint = "证件正面图片。请提供可公网访问的URL", demo = "http://www.yiji.com/1.jpg")
	private String certFrontPath;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "证件背面图片", constraint = "证件背面图片。请提供可公网访问的URL", demo = "http://www.yiji.com/1.jpg")
	private String certBackPath;
	
	@NotNull
	@OpenApiField(desc = "职业	", constraint = "填写职业编码", demo = "J")
	private String occupation;
	
	@NotEmpty
	@Length(max = 16)
	@OpenApiField(desc = "手机号码", constraint = "手机号码", demo = "10086100101")
	private String mobileNo;
	
	@NotEmpty
	@Length(max = 256)
	@OpenApiField(desc = "家庭或工作单位地址", constraint = "家庭或工作单位地址，如果是身份证，则填写身份证地址", demo = "重庆市北部新区黄山大道中段9号")
	private String address;
	
	@OpenApiField(desc = "归属地", constraint = "归属地，默认大陆", demo = "LAND")
	private String attribution;
	
	@Length(max = 256)
	@OpenApiField(
			desc = "本人持证头部照片",
			constraint = "本人持证头部照片，需要本人手持证件，的头部照片，照片中必须能清晰辨认身份证核心信息和个人头部。请提供可公网访问的URL。注意：该项为增强认证，如果填写该项并通过认证，则实名认证等级为最高。",
			demo = "http://www.yiji.com/1.jpg")
	private String holdCertPic;
	
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
	
	public String getCertType() {
		return this.certType;
	}
	
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getCertNo() {
		return this.certNo;
	}
	
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getCertValidTime() {
		return this.certValidTime;
	}
	
	public void setCertValidTime(String certValidTime) {
		this.certValidTime = certValidTime;
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
	
	public String getOccupation() {
		return this.occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getMobileNo() {
		return this.mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAttribution() {
		return this.attribution;
	}
	
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	
	public String getHoldCertPic() {
		return this.holdCertPic;
	}
	
	public void setHoldCertPic(String holdCertPic) {
		this.holdCertPic = holdCertPic;
	}
	
}

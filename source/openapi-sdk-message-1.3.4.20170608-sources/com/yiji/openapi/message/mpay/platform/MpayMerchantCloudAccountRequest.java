/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月4日 下午6:15:28 创建
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2016年2月4日
 */
@OpenApiMessage(service = "mpayMerchantCloudAccount", type = ApiMessageType.Request)
public class MpayMerchantCloudAccountRequest extends ApiRequest {
	@NotBlank
	@Length(max = 64, min = 6)
	@OpenApiField(desc = "用户名", constraint = "用户名", demo = "admin")
	private String userName;
	
	@NotBlank
	@Length(max = 256, min = 6)
	@OpenApiField(desc = "营业执照图片", constraint = "营业执照图片", demo = "http://www.baidu.com/a.jpg")
	private String licencePath;
	
	@NotBlank
	@Length(max = 256, min = 6)
	@OpenApiField(desc = "法人证件正面图片", constraint = "法人证件正面图片。请提供可公网访问的URL", demo = "http://www.baidu.com/b.jpg")
	private String legalCertFrontPath;
	
	@NotBlank
	@Length(max = 256, min = 6)
	@OpenApiField(desc = "法人证件背面图片", constraint = "法人证件背面图片。请提供可公网访问的URL", demo = "http://www.baidu.com/b.jpg")
	private String legalCertBackPath;
	
	@Length(max = 256, min = 6)
	@OpenApiField(desc = "开户许可证图片", constraint = "请提供可公网访问的URL ", demo = "http://www.baidu.com/b.jpg")
	private String openAccountImg;
	
	@Length(max = 256, min = 6)
	@OpenApiField(desc = "税务登记证图片", constraint = "请提供可公网访问的URL ", demo = "http://www.baidu.com/b.jpg")
	private String taxAuthorityNoImg;
	
	@Length(max = 256, min = 6)
	@OpenApiField(desc = "组织机构代码证图片", constraint = "请提供可公网访问的URL ", demo = "http://www.baidu.com/b.jpg")
	private String organizationCodeImg;
	
	@Length(max = 64, min = 4)
	@OpenApiField(desc = "开户邮箱", constraint = "开户邮箱", demo = "kaihu@yiji.com")
	private String email;
	
	@Length(max = 20, min = 6)
	@OpenApiField(desc = "联系电话", constraint = "联系电话", demo = "13566666666")
	private String phone;
	
	public String getOpenAccountImg() {
		return this.openAccountImg;
	}
	
	public void setOpenAccountImg(String openAccountImg) {
		this.openAccountImg = openAccountImg;
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
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getLicencePath() {
		return this.licencePath;
	}
	
	public void setLicencePath(String licencePath) {
		this.licencePath = licencePath;
	}
	
	public String getLegalCertFrontPath() {
		return this.legalCertFrontPath;
	}
	
	public void setLegalCertFrontPath(String legalCertFrontPath) {
		this.legalCertFrontPath = legalCertFrontPath;
	}
	
	public String getLegalCertBackPath() {
		return this.legalCertBackPath;
	}
	
	public void setLegalCertBackPath(String legalCertBackPath) {
		this.legalCertBackPath = legalCertBackPath;
	}
	
}

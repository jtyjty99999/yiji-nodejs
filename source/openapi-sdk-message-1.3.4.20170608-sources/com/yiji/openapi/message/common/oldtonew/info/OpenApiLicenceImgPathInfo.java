/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月9日 下午5:14:24 创建
 */
package com.yiji.openapi.message.common.oldtonew.info;

import java.io.Serializable;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月9日
 */

public class OpenApiLicenceImgPathInfo implements Serializable {
	private static final long serialVersionUID = -8761762793690218709L;
	/** 用户ID */
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "20150619010000072320")
	private String userId;
	/** 营业执照图片路径 */
	@OpenApiField(desc = "营业执照图片路径", constraint = "营业执照图片路径", demo = "http://baidu.com/a.jpg")
	private String businessLicensePath;
	/** 营业执照图片真实路径 */
	@OpenApiField(desc = "营业执照图片真实路径", constraint = "营业执照图片真实路径", demo = "http://baidu.com/b.jpg")
	private String businessLicenseRealPath;
	/** 带公章营业执照图片路径 */
	@OpenApiField(desc = "带公章营业执照图片路径", constraint = "带公章营业执照图片路径", demo = "http://baidu.com/c.jpg")
	private String businessLicenseCachetPath;
	/** 带公章营业执照图片真实路径 */
	@OpenApiField(desc = "带公章营业执照图片真实路径", constraint = "带公章营业执照图片真实路径", demo = "http://baidu.com/d.jpg")
	private String businessLicenseCachetRealPath;
	/** 身份证正面图片路径 */
	@OpenApiField(desc = "身份证正面图片路径", constraint = "身份证正面图片路径", demo = "http://baidu.com/e.jpg")
	private String certFrontPath;
	/** 身份证正面图片真实路径 */
	@OpenApiField(desc = "身份证正面图片真实路径", constraint = "身份证正面图片真实路径", demo = "http://baidu.com/f.jpg")
	private String certFrontRealPath;
	/** 身份证反面图片路径 */
	@OpenApiField(desc = "身份证反面图片路径", constraint = "身份证反面图片路径", demo = "http://baidu.com/g.jpg")
	private String certBackPath;
	/** 身份证反面图片真实路径 */
	@OpenApiField(desc = "身份证反面图片真实路径", constraint = "身份证反面图片真实路径", demo = "http://baidu.com/h.jpg")
	private String certBackRealPath;
	/** 上传开户许可证图片路径 */
	@OpenApiField(desc = "上传开户许可证图片路径", constraint = "上传开户许可证图片路径", demo = "http://baidu.com/i.jpg")
	private String openingLicensePath;
	/** 上传开户许可证图片真实路径 */
	@OpenApiField(desc = "上传开户许可证图片真实路径", constraint = "上传开户许可证图片真实路径", demo = "http://baidu.com/j.jpg")
	private String openingLicenseRealPath;
	/** 与销售人员合影照路径 */
	@OpenApiField(desc = "与销售人员合影照路径", constraint = "与销售人员合影照路径 ", demo = "http://baidu.com/k.jpg")
	private String groupPhotoPath;
	/** 与销售人员合影照真实路径 */
	@OpenApiField(desc = "与销售人员合影照真实路径", constraint = "与销售人员合影照真实路径", demo = "http://baidu.com/l.jpg")
	private String groupPhotoRealPath;
	/** 经营许可证路径 */
	@OpenApiField(desc = "经营许可证路径", constraint = "经营许可证路径", demo = "http://baidu.com/m.jpg")
	private String businessPermitPath;
	/** 经营许可证真实路径 */
	@OpenApiField(desc = "经营许可证真实路径", constraint = "经营许可证真实路径", demo = "http://baidu.com/n.jpg")
	private String businessPermitRealPath;
	/** 税务登记证路径 */
	@OpenApiField(desc = "税务登记证路径", constraint = "税务登记证路径", demo = "http://baidu.com/o.jpg")
	private String taxRegistrationCertificatePath;
	/** 税务登记证真实路径 */
	@OpenApiField(desc = "税务登记证真实路径", constraint = "税务登记证真实路径", demo = "http://baidu.com/p.jpg")
	private String taxRegistrationCertificateRealPath;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBusinessLicensePath() {
		return businessLicensePath;
	}
	
	public void setBusinessLicensePath(String businessLicensePath) {
		this.businessLicensePath = businessLicensePath;
	}
	
	public String getBusinessLicenseRealPath() {
		return businessLicenseRealPath;
	}
	
	public void setBusinessLicenseRealPath(String businessLicenseRealPath) {
		this.businessLicenseRealPath = businessLicenseRealPath;
	}
	
	public String getBusinessLicenseCachetPath() {
		return businessLicenseCachetPath;
	}
	
	public void setBusinessLicenseCachetPath(String businessLicenseCachetPath) {
		this.businessLicenseCachetPath = businessLicenseCachetPath;
	}
	
	public String getBusinessLicenseCachetRealPath() {
		return businessLicenseCachetRealPath;
	}
	
	public void setBusinessLicenseCachetRealPath(String businessLicenseCachetRealPath) {
		this.businessLicenseCachetRealPath = businessLicenseCachetRealPath;
	}
	
	public String getCertFrontPath() {
		return certFrontPath;
	}
	
	public void setCertFrontPath(String certFrontPath) {
		this.certFrontPath = certFrontPath;
	}
	
	public String getCertFrontRealPath() {
		return certFrontRealPath;
	}
	
	public void setCertFrontRealPath(String certFrontRealPath) {
		this.certFrontRealPath = certFrontRealPath;
	}
	
	public String getCertBackPath() {
		return certBackPath;
	}
	
	public void setCertBackPath(String certBackPath) {
		this.certBackPath = certBackPath;
	}
	
	public String getCertBackRealPath() {
		return certBackRealPath;
	}
	
	public void setCertBackRealPath(String certBackRealPath) {
		this.certBackRealPath = certBackRealPath;
	}
	
	public String getOpeningLicensePath() {
		return openingLicensePath;
	}
	
	public void setOpeningLicensePath(String openingLicensePath) {
		this.openingLicensePath = openingLicensePath;
	}
	
	public String getOpeningLicenseRealPath() {
		return openingLicenseRealPath;
	}
	
	public void setOpeningLicenseRealPath(String openingLicenseRealPath) {
		this.openingLicenseRealPath = openingLicenseRealPath;
	}
	
	public String getGroupPhotoPath() {
		return groupPhotoPath;
	}
	
	public void setGroupPhotoPath(String groupPhotoPath) {
		this.groupPhotoPath = groupPhotoPath;
	}
	
	public String getGroupPhotoRealPath() {
		return groupPhotoRealPath;
	}
	
	public void setGroupPhotoRealPath(String groupPhotoRealPath) {
		this.groupPhotoRealPath = groupPhotoRealPath;
	}
	
	public String getBusinessPermitPath() {
		return businessPermitPath;
	}
	
	public void setBusinessPermitPath(String businessPermitPath) {
		this.businessPermitPath = businessPermitPath;
	}
	
	public String getBusinessPermitRealPath() {
		return businessPermitRealPath;
	}
	
	public void setBusinessPermitRealPath(String businessPermitRealPath) {
		this.businessPermitRealPath = businessPermitRealPath;
	}
	
	public String getTaxRegistrationCertificatePath() {
		return taxRegistrationCertificatePath;
	}
	
	public void setTaxRegistrationCertificatePath(String taxRegistrationCertificatePath) {
		this.taxRegistrationCertificatePath = taxRegistrationCertificatePath;
	}
	
	public String getTaxRegistrationCertificateRealPath() {
		return taxRegistrationCertificateRealPath;
	}
	
	public void setTaxRegistrationCertificateRealPath(String taxRegistrationCertificateRealPath) {
		this.taxRegistrationCertificateRealPath = taxRegistrationCertificateRealPath;
	}
	
	/**
	 * @return
	 * @see java.lang.Object#hashCode()
	 */

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessLicenseCachetPath == null) ? 0 : businessLicenseCachetPath.hashCode());
		result = prime * result
					+ ((businessLicenseCachetRealPath == null) ? 0 : businessLicenseCachetRealPath.hashCode());
		result = prime * result + ((businessLicensePath == null) ? 0 : businessLicensePath.hashCode());
		result = prime * result + ((businessLicenseRealPath == null) ? 0 : businessLicenseRealPath.hashCode());
		result = prime * result + ((certBackPath == null) ? 0 : certBackPath.hashCode());
		result = prime * result + ((certBackRealPath == null) ? 0 : certBackRealPath.hashCode());
		result = prime * result + ((certFrontPath == null) ? 0 : certFrontPath.hashCode());
		result = prime * result + ((certFrontRealPath == null) ? 0 : certFrontRealPath.hashCode());
		result = prime * result + ((openingLicensePath == null) ? 0 : openingLicensePath.hashCode());
		result = prime * result + ((openingLicenseRealPath == null) ? 0 : openingLicenseRealPath.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	
	/**
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OpenApiLicenceImgPathInfo other = (OpenApiLicenceImgPathInfo) obj;
		if (businessLicenseCachetPath == null) {
			if (other.businessLicenseCachetPath != null)
				return false;
		} else if (!businessLicenseCachetPath.equals(other.businessLicenseCachetPath))
			return false;
		if (businessLicenseCachetRealPath == null) {
			if (other.businessLicenseCachetRealPath != null)
				return false;
		} else if (!businessLicenseCachetRealPath.equals(other.businessLicenseCachetRealPath))
			return false;
		if (businessLicensePath == null) {
			if (other.businessLicensePath != null)
				return false;
		} else if (!businessLicensePath.equals(other.businessLicensePath))
			return false;
		if (businessLicenseRealPath == null) {
			if (other.businessLicenseRealPath != null)
				return false;
		} else if (!businessLicenseRealPath.equals(other.businessLicenseRealPath))
			return false;
		if (certBackPath == null) {
			if (other.certBackPath != null)
				return false;
		} else if (!certBackPath.equals(other.certBackPath))
			return false;
		if (certBackRealPath == null) {
			if (other.certBackRealPath != null)
				return false;
		} else if (!certBackRealPath.equals(other.certBackRealPath))
			return false;
		if (certFrontPath == null) {
			if (other.certFrontPath != null)
				return false;
		} else if (!certFrontPath.equals(other.certFrontPath))
			return false;
		if (certFrontRealPath == null) {
			if (other.certFrontRealPath != null)
				return false;
		} else if (!certFrontRealPath.equals(other.certFrontRealPath))
			return false;
		if (openingLicensePath == null) {
			if (other.openingLicensePath != null)
				return false;
		} else if (!openingLicensePath.equals(other.openingLicensePath))
			return false;
		if (openingLicenseRealPath == null) {
			if (other.openingLicenseRealPath != null)
				return false;
		} else if (!openingLicenseRealPath.equals(other.openingLicenseRealPath))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
}

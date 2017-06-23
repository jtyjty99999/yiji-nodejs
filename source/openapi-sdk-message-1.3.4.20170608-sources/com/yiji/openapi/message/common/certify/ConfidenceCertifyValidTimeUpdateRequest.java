/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月10日 上午10:42:27 创建
 */
package com.yiji.openapi.message.common.certify;

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
* @data   2015年9月10日
*/
@Deprecated
@OpenApiMessage(service = "confidenceCertifyValidTimeUpdate", type = ApiMessageType.Request)
public class ConfidenceCertifyValidTimeUpdateRequest extends ApiRequest{
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户会员ID",constraint="用户会员ID",demo="20150619010000072320")
	private String userId;
	
	@OpenApiField(desc = "证件有效期",constraint="证件有效期",demo="20150909")
	private int licenseValidTime;
	
	@NotBlank
	@Length(max = 500)
	@OpenApiField(desc = "证件照片正面路径",constraint="证件照片正面路径",demo="http://www.baidu.com")
	private String licenseFrontPath;
	
	@Length(max = 500)
	@OpenApiField(desc = "证件照片反面路径",constraint="证件照片反面路径",demo="http://www.baidu.com")
	private String licenseBackPath;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getLicenseValidTime() {
		return licenseValidTime;
	}

	public void setLicenseValidTime(int licenseValidTime) {
		this.licenseValidTime = licenseValidTime;
	}

	public String getLicenseFrontPath() {
		return licenseFrontPath;
	}

	public void setLicenseFrontPath(String licenseFrontPath) {
		this.licenseFrontPath = licenseFrontPath;
	}

	public String getLicenseBackPath() {
		return licenseBackPath;
	}

	public void setLicenseBackPath(String licenseBackPath) {
		this.licenseBackPath = licenseBackPath;
	}
}

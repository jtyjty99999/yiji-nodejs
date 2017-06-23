/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月10日 上午10:42:27 创建
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
*
*
* @author zhike@yiji.com
* @data   2015年9月10日
*/
@Deprecated
@OpenApiMessage(service = "companyValidTimeUpdate", type = ApiMessageType.Request)
public class CompanyValidTimeUpdateRequest extends ApiRequest{
	
	@NotNull
	@OpenApiField(desc = "企业类型",constraint="企业类型",demo="NORMAL")
	private String businessType;
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户会员ID",constraint="用户会员ID",demo="20150619010000072320")
	private String userId;
	
	
	@OpenApiField(desc = "证件到期日期",constraint="证件到期日期",demo="20150909")
	private int updateComCycle;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "营业执照照片地址",constraint="营业执照照片地址",demo="http://www.baidu.com/aa.png")
	private String updateLicence;

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getUpdateComCycle() {
		return this.updateComCycle;
	}

	public void setUpdateComCycle(int updateComCycle) {
		this.updateComCycle = updateComCycle;
	}

	public String getUpdateLicence() {
		return updateLicence;
	}

	public void setUpdateLicence(String updateLicence) {
		this.updateLicence = updateLicence;
	}
}

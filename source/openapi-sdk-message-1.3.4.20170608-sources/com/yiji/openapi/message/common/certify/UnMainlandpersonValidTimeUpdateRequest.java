/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月10日 上午10:50:59 创建
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
@OpenApiMessage(service = "unMainlandpersonValidTimeUpdate", type = ApiMessageType.Request)
public class UnMainlandpersonValidTimeUpdateRequest extends ApiRequest{
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户会员ID",constraint="用户会员ID",demo="20150619010000072320")
	private String userId;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "身份证正面照片地址",constraint="身份证正面照片地址",demo="http://www.baidu.com/aa.png")
	private String updateCertFrontPath;
	
	@OpenApiField(desc = "身份证有效期",constraint="身份证有效期",demo="20150909")
	private int updateCertValidTime;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUpdateCertFrontPath() {
		return this.updateCertFrontPath;
	}

	public void setUpdateCertFrontPath(String updateCertFrontPath) {
		this.updateCertFrontPath = updateCertFrontPath;
	}

	public int getUpdateCertValidTime() {
		return this.updateCertValidTime;
	}

	public void setUpdateCertValidTime(int updateCertValidTime) {
		this.updateCertValidTime = updateCertValidTime;
	}
}

    
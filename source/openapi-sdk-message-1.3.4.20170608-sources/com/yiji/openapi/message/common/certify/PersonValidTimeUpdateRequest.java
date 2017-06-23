/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年9月10日 上午11:19:27 创建
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
@OpenApiMessage(service = "personValidTimeUpdate", type = ApiMessageType.Request)
public class PersonValidTimeUpdateRequest extends ApiRequest {
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "用户会员ID",constraint="用户会员ID",demo="20150619010000072320")
	private String userId;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "更新身份证正面图片地址",constraint="更新身份证正面图片地址",demo="http://www.baidu.com/aa.png")
	private String updateCertFrontPath;
	
	@NotBlank
	@Length(max = 128)
	@OpenApiField(desc = "更新身份证背面图片地址",constraint="更新身份证背面图片地址",demo="http://www.baidu.com/aa.png")
	private String updateCertBackPath;
	
	@OpenApiField(desc = "更新身份证有效期",constraint="更新身份证有效期",demo="20190909")
	private int updateCertValidTime ;

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

	public String getUpdateCertBackPath() {
		return this.updateCertBackPath;
	}

	public void setUpdateCertBackPath(String updateCertBackPath) {
		this.updateCertBackPath = updateCertBackPath;
	}

	public int getUpdateCertValidTime() {
		return this.updateCertValidTime;
	}

	public void setUpdateCertValidTime(int updateCertValidTime) {
		this.updateCertValidTime = updateCertValidTime;
	}
}

    
/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月30日 下午2:17:35 创建
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月30日
 */
@Deprecated
@OpenApiMessage(service = "mpayCertifyRedirect", type = ApiMessageType.Notify)
public class MpayCertifyRedirectNotify extends ApiNotify {
	@NotBlank
	@OpenApiField(desc = "用户ID", constraint = "用户ID", demo = "20150619010000072320")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "认证状态",
			constraint = "认证状态[NOA:未认证,AUT:认证中,ATP:认证通过,ATN:认证失败,UPF:升级失败,UCF:更新有效期失败,UCS:更新有效期成功]", demo = "NOA")
	private String certifyStatus;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCertifyStatus() {
		return this.certifyStatus;
	}
	
	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
}

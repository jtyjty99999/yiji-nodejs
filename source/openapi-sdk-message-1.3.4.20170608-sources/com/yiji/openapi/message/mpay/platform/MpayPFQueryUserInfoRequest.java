/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 11:06 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 查询个人信息入参
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFQueryUserInfo", type = ApiMessageType.Request)
public class MpayPFQueryUserInfoRequest extends ApiRequest {
	
	@NotBlank
	@Length(max = 128, min = 1)
	@OpenApiField(desc = "外部用户ID",demo = "12345678901234567890")
	private String partnerUserId;
	
	
	public String getPartnerUserId() {
		return this.partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
}

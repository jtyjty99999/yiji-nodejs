/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * dengwei@yiji.com 2015年9月8日 下午8:52:35 创建
 */

package com.yiji.openapi.message.mpay.query;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author dengwei@yiji.com
 * 
 */
@OpenApiMessage(service = "mpayQueryPartnerUserInfo", type = ApiMessageType.Request)
public class QueryPartnerUserInfoRequest extends ApiRequest {

	/**
	 * 外部会员id
	 */
	@NotNull
	@Length(max = 64, min = 1)
	@OpenApiField(desc = "外部商户会员id", demo = "12345679801234567890")
	private String partnerUserId;
	
	public String getPartnerUserId() {
		return this.partnerUserId;
	}

	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
}

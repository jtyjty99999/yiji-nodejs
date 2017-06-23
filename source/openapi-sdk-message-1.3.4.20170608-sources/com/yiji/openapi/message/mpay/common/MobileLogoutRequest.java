/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-05-25 12:29 创建
 *
 */
package com.yiji.openapi.message.mpay.common;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "mobileLogout", type = ApiMessageType.Request)
public class MobileLogoutRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "外部会员ID",constraint="外部会员ID",demo="9736253")
	private String partnerUserId;
	
	@NotBlank
	@OpenApiField(desc = "交易号码",constraint="交易号码",demo="20151016000452886142")
	private String tradeNo;
	
	public String getPartnerUserId() {
		return partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public String getTradeNo() {
		return tradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}

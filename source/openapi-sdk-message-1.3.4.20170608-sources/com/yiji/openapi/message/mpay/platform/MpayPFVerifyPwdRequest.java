/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:21 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.annotation.JSONField;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "mpayPFVerifyPwd", type = ApiMessageType.Request)
public class MpayPFVerifyPwdRequest extends ApiRequest {
	
	/**
	 * 外部会员id
	 */
	@NotBlank
	@Length(max = 200, min = 1, message = "外部会员id不能为空")
	@OpenApiField(desc = "外部会员id",demo = "23145687912345689700")
	private String partnerUserId;
	
	/**
	 * 支付密码
	 */
	@OpenApiField(desc = "支付密码", security = true,demo = "213fdssd")
	private String payPassword;
	
	@JSONField(serialize = false)
	public String getPayPassword() {
		return this.payPassword;
	}
	
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	
	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
}

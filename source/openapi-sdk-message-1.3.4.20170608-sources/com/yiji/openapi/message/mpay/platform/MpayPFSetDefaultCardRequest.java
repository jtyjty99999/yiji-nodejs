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

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 设置默认银行卡(支付台)请求参数
 * @author dengwei@yiji.com
 */
@OpenApiMessage(service = "mpayPFSetDefaultCard", type = ApiMessageType.Request)
public class MpayPFSetDefaultCardRequest extends ApiRequest {
	
	/**
	 * 外部会员id
	 */
	@NotBlank
	@Length(max = 200, min = 1, message = "外部会员id不能为空")
    @OpenApiField(desc = "外部会员id",demo = "12346578901324567890")
	private String partnerUserId;
	
	/**
	 * 签约流水号
	 */
	@NotBlank
    @OpenApiField(desc = "签约流水号",demo = "132456789123")
	private String pactNo;
	
	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}
	
	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}
}

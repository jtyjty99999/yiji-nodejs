/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年2月4日 下午2:45:04 创建
 */
package com.yiji.openapi.message.mpay.platform;

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
 * @data 2016年2月4日
 */
@OpenApiMessage(service = "mpayNFCSignApply", type = ApiMessageType.Request)
public class MpayNFCSignApplyRequest extends ApiRequest {
	@NotBlank
	@Length(max = 35)
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "6210322219854258")
	private String cardNo;
	
	@NotBlank
	@Length(max = 35)
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20150702020006251529")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "签约用途", constraint = "签约用途", demo = "WITHDRAW")
	private String purpose;
	
	@NotBlank
	@Length(max = 35)
	@OpenApiField(desc = "商户订单号", constraint = "商户订单号", demo = "1642941319614199")
	private String outOrderNo;
	
	public String getCardNo() {
		return this.cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPurpose() {
		return this.purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	
}

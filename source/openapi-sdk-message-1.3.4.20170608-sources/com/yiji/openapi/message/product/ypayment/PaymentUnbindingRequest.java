/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2016年4月29日 下午4:16:47 创建
 */
package com.yiji.openapi.message.product.ypayment;

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
 * @data 2016年4月29日
 */
@OpenApiMessage(service = "paymentUnbinding", type = ApiMessageType.Request)
public class PaymentUnbindingRequest extends ApiRequest {
	@NotBlank
	@OpenApiField(desc = "绑卡签约号", constraint = "绑卡签约号", demo = "20160324000000002048")
	private String contractNo;
	
	@Length(max = 35)
	@NotBlank
	@OpenApiField(desc = "易极付用户ID", constraint = "易极付用户ID", demo = "20130310bj5815689758")
	private String userId;
	
	@NotBlank
	@OpenApiField(desc = "平台类型", constraint = "平台类型", demo = "YiPingHui")
	private String platformType;
	
	public String getContractNo() {
		return this.contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPlatformType() {
		return this.platformType;
	}
	
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
}

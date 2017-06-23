/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-26 16:09 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentSelfRepay", type = ApiMessageType.Request)
public class InstallmentSelfRepayQueryOrderRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号")
	private String externalOrderNo;
	
	@NotBlank
	@OpenApiField(desc = "合约号", constraint = "合约号")
	private String contractNo;
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-27 14:15 创建
 *
 */
package com.yiji.openapi.message.product.yxt;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yxtDeductQuery", type = ApiMessageType.Request)
public class YxtDeductQueryRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 20)
	@OpenApiField(desc = "签约合同号", constraint = "签约合同号")
	private String contractNo;
	
	@NotBlank
	@Size(max = 40)
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号")
	private String externalOrderNo;
	
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

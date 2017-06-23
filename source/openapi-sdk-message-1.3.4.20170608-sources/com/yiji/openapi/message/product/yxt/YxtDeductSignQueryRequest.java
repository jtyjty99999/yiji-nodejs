/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-28 10:14 创建
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
@OpenApiMessage(service = "yxtDeductSignQuery", type = ApiMessageType.Request)
public class YxtDeductSignQueryRequest extends ApiRequest {
	
	@NotBlank
	@Size(max = 40)
	@OpenApiField(desc = "代扣合同号", constraint = "代扣合同号")
	private String withholdContractNo;
	
	public String getWithholdContractNo() {
		return withholdContractNo;
	}
	
	public void setWithholdContractNo(String withholdContractNo) {
		this.withholdContractNo = withholdContractNo;
	}
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-27 10:02 创建
 *
 */
package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yxtDeductSign", type = ApiMessageType.Notify)
public class YxtDeductSignNotify extends ApiNotify {
	
	@OpenApiField(desc = "签约合同号", constraint = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "代扣合同号", constraint = "代扣合同号")
	private String withholdContractNo;
	
	@OpenApiField(desc = "描述", constraint = "描述")
	private String description;
	
	@OpenApiField(desc = "签约状态", constraint = "签约状态")
	private String signStatus;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getWithholdContractNo() {
		return withholdContractNo;
	}
	
	public void setWithholdContractNo(String withholdContractNo) {
		this.withholdContractNo = withholdContractNo;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSignStatus() {
		return signStatus;
	}
	
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
}

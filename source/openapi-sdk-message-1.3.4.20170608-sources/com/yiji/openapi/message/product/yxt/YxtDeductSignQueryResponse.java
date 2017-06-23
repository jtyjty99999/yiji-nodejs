/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-28 10:15 创建
 *
 */
package com.yiji.openapi.message.product.yxt;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yxtDeductSignQuery", type = ApiMessageType.Response)
public class YxtDeductSignQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "签约合同号", constraint = "签约合同号，用于本次签约的唯一标识")
	private String contractNo;
	
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "职业", constraint = "职业")
	private String profession;
	
	@OpenApiField(desc = "联系地址", constraint = "联系地址")
	private String address;
	
	@OpenApiField(desc = "代扣合同号", constraint = "代扣合同号")
	private String withholdContractNo;
	
	@OpenApiField(desc = "代扣合同照片或PDF文档", constraint = "代扣合同照片或PDF文档")
	private String withholdContractImageUrl;
	
	@OpenApiField(desc = "签约状态", constraint = "签约状态")
	private String signStatus;
	
	@OpenApiField(desc = "备注", constraint = "备注")
	private String memo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getWithholdContractNo() {
		return withholdContractNo;
	}
	
	public void setWithholdContractNo(String withholdContractNo) {
		this.withholdContractNo = withholdContractNo;
	}
	
	public String getWithholdContractImageUrl() {
		return withholdContractImageUrl;
	}
	
	public void setWithholdContractImageUrl(String withholdContractImageUrl) {
		this.withholdContractImageUrl = withholdContractImageUrl;
	}
	
	public String getSignStatus() {
		return signStatus;
	}
	
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
}

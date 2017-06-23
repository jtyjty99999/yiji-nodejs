/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-27 14:16 创建
 *
 */
package com.yiji.openapi.message.product.yxt;

import java.util.Date;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "yxtDeductQuery", type = ApiMessageType.Response)
public class YxtDeductQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "签约合同号", constraint = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "代扣合同号", constraint = "代扣合同号")
	private String withholdContractNo;
	
	@OpenApiField(desc = "代扣订单号", constraint = "代扣订单号")
	private String generalWithholdOrderNo;
	
	@OpenApiField(desc = "外部订单号", constraint = "外部订单号")
	private String externalOrderNo;
	
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "总金额", constraint = "总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "费用组成", constraint = "费用组成")
	private String costComposition;
	
	@OpenApiField(desc = "代扣时间", constraint = "代扣时间")
	private Date withholdTime;
	
	@OpenApiField(desc = "状态", constraint = "状态")
	private String status;
	
	@OpenApiField(desc = "备注", constraint = "备注")
	private String memo;
	
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
	
	public String getExternalOrderNo() {
		return externalOrderNo;
	}
	
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCostComposition() {
		return costComposition;
	}
	
	public void setCostComposition(String costComposition) {
		this.costComposition = costComposition;
	}
	
	public Date getWithholdTime() {
		return withholdTime;
	}
	
	public void setWithholdTime(Date withholdTime) {
		this.withholdTime = withholdTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Money getTotalAmount() {
		return this.totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getGeneralWithholdOrderNo() {
		return generalWithholdOrderNo;
	}

	public void setGeneralWithholdOrderNo(String generalWithholdOrderNo) {
		this.generalWithholdOrderNo = generalWithholdOrderNo;
	}
}

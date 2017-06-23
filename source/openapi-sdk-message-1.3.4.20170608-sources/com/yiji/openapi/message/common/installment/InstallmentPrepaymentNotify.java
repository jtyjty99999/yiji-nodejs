/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-12 17:57 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import java.util.ArrayList;
import java.util.List;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentPrepayment", type = ApiMessageType.Notify)
public class InstallmentPrepaymentNotify extends ApiNotify {
	
	@OpenApiField(desc = "签约合同号")
	private String contractNo;
	
	@OpenApiField(desc = "提前还款订单号")
	private String installmentOrderNo;
	
	@OpenApiField(desc = "外部订单号")
	private String externalOrderNo;
	
	@OpenApiField(desc = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "实际提前还款期数列表")
	private List<Integer> prepaymentTime = new ArrayList<Integer>();
	
	@OpenApiField(desc = "提前还款金额")
	private String prepaymentAmount;
	
	@OpenApiField(desc = "实际还款时间")
	private String realRepayTime;
	
	@OpenApiField(desc = "状态")
	private String status;
	
	@OpenApiField(desc = "备注")
	private String memo;
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getInstallmentOrderNo() {
		return installmentOrderNo;
	}
	
	public void setInstallmentOrderNo(String installmentOrderNo) {
		this.installmentOrderNo = installmentOrderNo;
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
	
	public String getPrepaymentAmount() {
		return prepaymentAmount;
	}
	
	public void setPrepaymentAmount(String prepaymentAmount) {
		this.prepaymentAmount = prepaymentAmount;
	}
	
	public String getRealRepayTime() {
		return realRepayTime;
	}
	
	public void setRealRepayTime(String realRepayTime) {
		this.realRepayTime = realRepayTime;
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
	
	public List<Integer> getPrepaymentTime() {
		return prepaymentTime;
	}
	
	public void setPrepaymentTime(List<Integer> prepaymentTime) {
		this.prepaymentTime = prepaymentTime;
	}
}

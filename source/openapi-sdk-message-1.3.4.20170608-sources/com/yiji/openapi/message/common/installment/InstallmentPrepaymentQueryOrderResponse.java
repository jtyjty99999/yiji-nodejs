/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-29 10:10 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import java.util.Date;
import java.util.List;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentPrepaymentQueryOrder", type = ApiMessageType.Response)
public class InstallmentPrepaymentQueryOrderResponse extends ApiResponse {
	@OpenApiField(desc = "订单号", constraint = "订单号")
	private String installmentOrderNo;
	
	@OpenApiField(desc = "合约号", constraint = "合约号")
	private String contractNo;
	
	@OpenApiField(desc = "纸质合约号", constraint = "纸质合约号")
	private String paperContractNo;
	
	@OpenApiField(desc = "客户真实姓名", constraint = "客户真实姓名")
	private String realName;
	
	@OpenApiField(desc = "客户电话", constraint = "客户电话")
	private String mobileNo;
	
	@OpenApiField(desc = "产品名称", constraint = "产品名称")
	private String productName;
	
	@OpenApiField(desc = "总期数", constraint = "总期数")
	private int totalTimes;
	
	@OpenApiField(desc = "实际还款期数", constraint = "实际还款期数")
	private List<Integer> times;
	
	@OpenApiField(desc = "总金额", constraint = "总金额")
	private Money prepaymentAmount;
	
	@OpenApiField(desc = "订单状态", constraint = "订单状态")
	private String status;
	
	@OpenApiField(desc = "备注", constraint = "备注")
	private String memo;

	@OpenApiField(desc = "实际还款时间",demo = "2015-12-12 12:12:12")
	private Date realRepayTime;
	
	public String getInstallmentOrderNo() {
		return installmentOrderNo;
	}
	
	public void setInstallmentOrderNo(String installmentOrderNo) {
		this.installmentOrderNo = installmentOrderNo;
	}
	
	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	
	public String getPaperContractNo() {
		return paperContractNo;
	}
	
	public void setPaperContractNo(String paperContractNo) {
		this.paperContractNo = paperContractNo;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getTotalTimes() {
		return totalTimes;
	}
	
	public void setTotalTimes(int totalTimes) {
		this.totalTimes = totalTimes;
	}
	
	public List<Integer> getTimes() {
		return times;
	}
	
	public void setTimes(List<Integer> times) {
		this.times = times;
	}
	
	public Money getPrepaymentAmount() {
		return prepaymentAmount;
	}
	
	public void setPrepaymentAmount(Money prepaymentAmount) {
		this.prepaymentAmount = prepaymentAmount;
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

	public Date getRealRepayTime() {
		return realRepayTime;
	}

	public void setRealRepayTime(Date realRepayTime) {
		this.realRepayTime = realRepayTime;
	}
}

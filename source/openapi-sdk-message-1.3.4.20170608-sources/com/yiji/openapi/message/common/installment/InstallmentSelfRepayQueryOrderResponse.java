/*
] * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-26 16:10 创建
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
@OpenApiMessage(service = "installmentSelfRepay", type = ApiMessageType.Response)
public class InstallmentSelfRepayQueryOrderResponse extends ApiResponse {
	
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
	
	@OpenApiField(desc = "当前期数", constraint = "当前期数")
	private List<Integer> times;
	
	@OpenApiField(desc = "还款总金额", constraint = "还款总金额")
	private Money totalAmount;
	
	@OpenApiField(desc = "订单状态", constraint = "订单状态")
	private String status;
	
	@OpenApiField(desc = "备注", constraint = "备注")
	private String memo;

	@OpenApiField(desc = "结算编号",demo = "4156351465",constraint = "可用于企业版对账")
	private String settleNo;

	@OpenApiField(desc = "结算金额",demo = "8.66")
	private Money settleAmount;

	@OpenApiField(desc = "实际结算时间",demo = "2016-12-14 21:12:45",constraint = "格式：YYYY-MM-DD HH:mm:ss")
	private Date realSettleTime;

	@OpenApiField(desc = "结算状态",demo = "SUCCESS")
	private String settleStatus;
	
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
	
	public Money getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
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

	public String getSettleNo() {
		return settleNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	public Money getSettleAmount() {
		return settleAmount;
	}

	public void setSettleAmount(Money settleAmount) {
		this.settleAmount = settleAmount;
	}

	public Date getRealSettleTime() {
		return realSettleTime;
	}

	public void setRealSettleTime(Date realSettleTime) {
		this.realSettleTime = realSettleTime;
	}

	public String getSettleStatus() {
		return settleStatus;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}
}

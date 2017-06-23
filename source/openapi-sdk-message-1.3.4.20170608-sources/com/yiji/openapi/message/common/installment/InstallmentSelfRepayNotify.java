/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-06-26 10:19 创建
 *
 */
package com.yiji.openapi.message.common.installment;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author hgeshu@yiji.com
 */
@OpenApiMessage(service = "installmentSelfRepay", type = ApiMessageType.Notify)
public class InstallmentSelfRepayNotify extends ApiNotify {
	
	@OpenApiField(desc = "合约号", constraint = "还款合约号")
	private String contractNo;
	
	@OpenApiField(desc = "订单号", constraint = "系统订单号")
	private String installmentOrderNo;
	
	@OpenApiField(desc = "商户订单号", constraint = "商户订单号")
	private String externalOrderNo;
	
	@OpenApiField(desc = "真实姓名", constraint = "真实姓名")
	private String realName;
	
	@OpenApiField(desc = "总金额", constraint = "代扣的总金额")
	private String totalAmount;
	
	@OpenApiField(desc = "实际还款时间", constraint = "实际还款时间")
	private String realRepayTime;
	
	@OpenApiField(desc = "状态", constraint = "代扣交易状态。包含：代扣成功、代扣失败、还款成功")
	private String status;
	
	@OpenApiField(desc = "备注", constraint = "解释说明")
	private String memo;

	@OpenApiField(desc = "结算编号",demo = "4156351465",constraint = "可用于企业版对账")
	private String settleNo;

	@OpenApiField(desc = "结算金额",demo = "8.66")
	private String settleAmount;

	@OpenApiField(desc = "实际结算时间",demo = "2016-12-14 21:12:45",constraint = "格式：YYYY-MM-DD HH:mm:ss")
	private String realSettleTime;

	@OpenApiField(desc = "结算状态",demo = "SUCCESS",constraint = "{\"name\":\"结算状态\",\"data\":[\"INIT:待计算\",\"CALC:已计算\",\"WAIT_SETTLE:待结算\",\"SUCCESS:已结算\",\"CANCEL:已取消\",\"REFUND_SUCCESS:退回结算成功\"]}")
	private String settleStatus;
	
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
	
	public String getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
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

	public String getSettleNo() {
		return settleNo;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

	public String getSettleAmount() {
		return settleAmount;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getRealSettleTime() {
		return realSettleTime;
	}

	public void setRealSettleTime(String realSettleTime) {
		this.realSettleTime = realSettleTime;
	}

	public String getSettleStatus() {
		return settleStatus;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}
}

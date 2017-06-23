/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-04-15 16:02 创建
 *
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-04-15
 */
@OpenApiMessage(service = "ccpEasySpeedLoanVerifyTransfer", type = ApiMessageType.Notify)
public class CcpEasySpeedLoanVerifyTransferNotify extends ApiNotify{

	@OpenApiField(desc = "审批通过金额" , demo = "20000")
	private String approveMoney;

	@OpenApiField(desc = "手续费" , demo = "2000")
	private String advanceCharges;

	@OpenApiField(desc = "担保费" , demo = "20")
	private String guaranteeMoney;

	@OpenApiField(desc = "审批结果" , demo = "AGREE")
	private String suggestResult;

	@OpenApiField(desc = "审批内容" , demo = "审核通过")
	private String suggest;

	@OpenApiField(desc = "审核节点code" , demo = "uploadProtocolAttPoint")
	private String pointCode;

	@OpenApiField(desc = "审核节点名" , demo = "等待提交初审")
	private String pointName;

	@OpenApiField(desc = "融资订单号" , demo = "ccp02011601061459030")
	private String bizNo;

	@OpenApiField(desc = "执行成功标识" , demo = "true")
	private String isSuccess;

	@OpenApiField(desc = "是否执行" , demo = "true")
	private String isExecuted;

	public String getApproveMoney() {
		return approveMoney;
	}

	public void setApproveMoney(String approveMoney) {
		this.approveMoney = approveMoney;
	}

	public String getAdvanceCharges() {
		return advanceCharges;
	}

	public void setAdvanceCharges(String advanceCharges) {
		this.advanceCharges = advanceCharges;
	}

	public String getGuaranteeMoney() {
		return guaranteeMoney;
	}

	public void setGuaranteeMoney(String guaranteeMoney) {
		this.guaranteeMoney = guaranteeMoney;
	}

	public String getSuggestResult() {
		return suggestResult;
	}

	public void setSuggestResult(String suggestResult) {
		this.suggestResult = suggestResult;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public String getPointCode() {
		return pointCode;
	}

	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getIsExecuted() {
		return isExecuted;
	}

	public void setIsExecuted(String isExecuted) {
		this.isExecuted = isExecuted;
	}
}

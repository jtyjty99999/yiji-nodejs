/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-02-15 15:22 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;
import com.yiji.openapi.sdk.common.utils.Money;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/2/15
 */
@OpenApiMessage(service = "ccpEasySpeedLoanBankAgree", type = ApiMessageType.Request)
public class CcpEasySpeedLoanBankAgreeRequest extends ApiRequest {
	@OpenApiField(desc="贷款银行批准金额",demo="253343.23")
	private Money approveMoney;

	@OpenApiField(desc="银行Code",demo="CCB")
	private String bankCode;

	@OpenApiField(desc="流水号",demo="12341234123")
	private String bizNo;

	@NotBlank
	@OpenApiField(desc="平台ID",demo="12312341234")
	private String platformId;

	@NotBlank
	@OpenApiField(desc="外部流水号",demo="123412341234")
	private String outBizNo;

	@OpenApiField(desc="房屋贷款年限",demo="20")
	private String houseLoanDeadline;
	
	public Money getApproveMoney() {
		return approveMoney;
	}
	
	public void setApproveMoney(Money approveMoney) {
		this.approveMoney = approveMoney;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	
	public String getPlatformId() {
		return platformId;
	}
	
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	
	public String getOutBizNo() {
		return outBizNo;
	}
	
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	
	public String getHouseLoanDeadline() {
		return houseLoanDeadline;
	}
	
	public void setHouseLoanDeadline(String houseLoanDeadline) {
		this.houseLoanDeadline = houseLoanDeadline;
	}
}

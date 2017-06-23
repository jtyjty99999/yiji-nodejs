/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2016-01-19 15:00 创建
 */
package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/1/19
 */
@OpenApiMessage(service = "ccpEasySpeedLoanRepayment", type = ApiMessageType.Response)
public class CcpEasySpeedLoanRepaymentResponse extends ApiResponse {
	@OpenApiField(desc = "总金额", demo = "10190")
	private String totalMoney;
	
	@OpenApiField(desc = "流水号", demo = "10112341234123490")
	private String bizNo;
	
	public String getTotalMoney() {
		return totalMoney;
	}
	
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public String getBizNo() {
		return bizNo;
	}
	
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午7:17:52 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.message.common.oldtonew.info.DepositInstructionApiInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "deductDeposit.apply", type = ApiMessageType.Response)
public class DeductDepositApplyResponse extends ApiResponse {
	
	@OpenApiField(desc = "代扣充值信息", demo = "xxx")
	private DepositInstructionApiInfo instructionInfo = new DepositInstructionApiInfo();
	
	@OpenApiField(desc = "状态", demo = "SUCCESS")
	private String status;
	
	public DepositInstructionApiInfo getInstructionInfo() {
		return this.instructionInfo;
	}
	
	public void setInstructionInfo(DepositInstructionApiInfo instructionInfo) {
		this.instructionInfo = instructionInfo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

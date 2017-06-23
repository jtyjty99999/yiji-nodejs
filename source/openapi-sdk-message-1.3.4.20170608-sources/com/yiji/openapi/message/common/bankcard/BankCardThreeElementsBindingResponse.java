/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月1日 下午1:15:19 创建
 */
package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年12月1日
 */
@OpenApiMessage(service = "bankCardThreeElementsBinding", type = ApiMessageType.Response)
public class BankCardThreeElementsBindingResponse extends ApiResponse{
	
	@Length(max = 32)
	@OpenApiField(desc = "签约流水号", constraint = "签约流水号", demo = "20150817010007217971")
	private String pactNo;
	
	@OpenApiField(desc = "签约状态", constraint = "签约状态[\"INIT\":\"初始状态\",\"PACT\":\"签约成功\",\"PACT_FAIL\":\"签约失败\"]", demo = "INIT")
	private String pactStatus;

	public String getPactNo() {
		return this.pactNo;
	}

	public void setPactNo(String pactNo) {
		this.pactNo = pactNo;
	}

	public String getPactStatus() {
		return this.pactStatus;
	}

	public void setPactStatus(String pactStatus) {
		this.pactStatus = pactStatus;
	}
	
}

    
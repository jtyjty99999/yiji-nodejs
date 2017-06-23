/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月3日 下午2:13:37 创建
 */
package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * Created by HuCheng on 2015/5/13.
 */
@OpenApiMessage(service = "installmentBankCardVerify", type = ApiMessageType.Response)
public class InstallmentBankCardVerifyResponse extends ApiResponse {
	
	@Length(max = 32)
	@OpenApiField(desc = "验证状态", constraint = "VERIFY_CARD_SUCCESS：验证成功 / VERIFY_CARD_FAIL：验证失败")
	private String verifyStatus;
	
	public String getVerifyStatus() {
		return verifyStatus;
	}
	
	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
}

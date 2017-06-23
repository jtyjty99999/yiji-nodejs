/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月5日 上午10:39:50创建
 */
package com.yiji.openapi.message.common.bankcard;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * 
 * 
 * @author husheng@yiji.com
 * 
 */
@OpenApiMessage(service = "bankCardBinQuery", type = ApiMessageType.Request)
public class BankCardBINQueryRequest extends ApiRequest {
	@NotEmpty
	@Length(max = 32)
	@OpenApiField(desc = "银行卡号", constraint = "需要查询银行卡BIN的银行卡号",demo = "132456798123045678")
	private String bankCardNo;
	
	public String getBankCardNo() {
		return this.bankCardNo;
	}
	
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
}

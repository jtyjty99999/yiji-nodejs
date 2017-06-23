/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * husheng@yiji.com 2014年8月5日 上午10:35:11创建
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
@OpenApiMessage(service = "bankCardBindingRemove", type = ApiMessageType.Request)
public class BankCardBindingRemoveRequest extends ApiRequest {
	@NotEmpty
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "易极付会员ID", constraint = "绑定银行卡的易极付会员ID",demo = "12345679801234567890")
	private String userId;
	
	@NotEmpty
	@OpenApiField(desc = "银行卡绑定编号", constraint = "银行卡绑定编号",demo = "123564798")
	private String bindId;
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBindId() {
		return this.bindId;
	}
	
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}
	
}

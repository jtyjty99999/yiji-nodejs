/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 上午10:35:29 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "bankCodeBindingRemove", type = ApiMessageType.Request)
public class BankCodeBindingRemoveRequest extends ApiRequest {

	@NotBlank
	@Size(min = 20, max = 20)
	@OpenApiField(desc = "易极付会员ID", constraint = "绑定银行卡的易极付会员ID", demo = "20151106010009133888")
	private String userId;

	@NotBlank
	@OpenApiField(desc = "银行卡号", constraint = "银行卡号", demo = "6222335603013032773")
	private String bankCardNo;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

}

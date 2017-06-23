/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-01-22 16:40 创建
 *
 */
package com.yiji.openapi.message.common.bankcard;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "bornBankCardListQuery", type = ApiMessageType.Request)
public class BornBankCardListQueryRequest extends ApiRequest {
	
	@NotBlank
	@Length(min = 20, max = 20)
	@OpenApiField(desc = "易极付会员ID", constraint = "绑定银行卡的易极付会员ID")
	private String userId;
	
	@NotNull
	@OpenApiField(desc = "平台商列表")
	private List<String> upUserNos;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public List<String> getUpUserNos() {
		return upUserNos;
	}
	
	public void setUpUserNos(List<String> upUserNos) {
		this.upUserNos = upUserNos;
	}
	
}

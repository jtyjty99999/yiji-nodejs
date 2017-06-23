/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-05 10:11 创建
 *
 */
package com.yiji.openapi.message.common.core;

import org.hibernate.validator.constraints.NotBlank;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "removeGrCard", type = ApiMessageType.Request)
public class RemoveGrCardRequest extends ApiRequest {
	
	@NotBlank
	@OpenApiField(desc = "汇付绑卡ID")
	private String cardId;
	
	public String getCardId() {
		return cardId;
	}
	
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
}

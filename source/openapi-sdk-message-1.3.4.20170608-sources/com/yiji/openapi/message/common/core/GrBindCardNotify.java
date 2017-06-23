/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-03-03 11:12 创建
 *
 */
package com.yiji.openapi.message.common.core;

import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiNotify;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "grBindCard", type = ApiMessageType.Notify)
public class GrBindCardNotify extends ApiNotify {
	
	@OpenApiField(desc = "汇付绑卡ID")
	private String cardId;
	
	@OpenApiField(desc = "绑卡状态")
	private String status;
	
	public String getCardId() {
		return cardId;
	}
	
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

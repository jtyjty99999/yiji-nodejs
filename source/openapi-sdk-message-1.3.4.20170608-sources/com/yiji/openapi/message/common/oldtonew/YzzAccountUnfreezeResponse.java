/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 下午2:53:39 创建
*/

package com.yiji.openapi.message.common.oldtonew;

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
@OpenApiMessage(service = "yzzAccountUnfreeze", type = ApiMessageType.Response)
public class YzzAccountUnfreezeResponse extends ApiResponse {

	@OpenApiField(desc = "备注", demo = "备注")
	private String memo;

	@OpenApiField(desc = "用户ID", demo = "20150519020005491913")
	private String userId;

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午9:59:26 创建
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
@OpenApiMessage(service = "ppmRECHARGEQUERY", type = ApiMessageType.Response)
public class PpmRechargeQueryResponse extends ApiResponse {

	@OpenApiField(desc = "管理员ID", demo = "20150519020005491913")
	private String userId;

	@OpenApiField(desc = "操作员ID", demo = "20150519020005491913")
	private String operatorId;

	@OpenApiField(desc = "操作员姓名", demo = "xx@yiji.com")
	private String operatorName;

	@OpenApiField(desc = "key", demo = "OPENAPI")
	private String key = "OPENAPI";

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}

/*
* www.yiji.com Inc.
* Copyright (c) 2014 All Rights Reserved.
*/

/*
* 修订记录：
* wkeduo 上午9:59:13 创建
*/

package com.yiji.openapi.message.common.oldtonew;

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
@OpenApiMessage(service = "ppmRECHARGEQUERY", type = ApiMessageType.Request)
public class PpmRechargeQueryRequest extends ApiRequest {

	@NotBlank
	@OpenApiField(desc = "用户ID", demo = "20150519020005491913")
	private String userId;

	//	@OpenApiField(desc = "会话ID", demo = "9D9F05712DA51DC86F327CCCFA2CB572")
	//	private String sessionId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	//	public String getSessionId() {
	//		return this.sessionId;
	//	}
	//
	//	public void setSessionId(String sessionId) {
	//		this.sessionId = sessionId;
	//	}

}

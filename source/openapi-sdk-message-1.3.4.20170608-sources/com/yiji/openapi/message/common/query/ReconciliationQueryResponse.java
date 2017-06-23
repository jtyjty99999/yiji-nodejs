/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-03-10 15:07 创建
 *
 */
package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.UserTransLogRichInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@OpenApiMessage(service = "reconciliationQuery", type = ApiMessageType.Response)
public class ReconciliationQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户收支流水信息")
	private List<UserTransLogRichInfo> userTransLogRichInfos;
	
	public List<UserTransLogRichInfo> getUserTransLogRichInfos() {
		return userTransLogRichInfos;
	}
	
	public void setUserTransLogRichInfos(List<UserTransLogRichInfo> userTransLogRichInfos) {
		this.userTransLogRichInfos = userTransLogRichInfos;
	}
}

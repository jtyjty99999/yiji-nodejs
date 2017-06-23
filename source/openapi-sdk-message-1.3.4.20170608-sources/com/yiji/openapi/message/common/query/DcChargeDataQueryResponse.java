/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年10月27日 下午12:57:21 创建
 */
package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.OpenApiUserTransLogInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data   2015年10月27日
 */
@OpenApiMessage(service = "dcChargeDataQuery", type = ApiMessageType.Response)
public class DcChargeDataQueryResponse extends ApiResponse{
	
	@OpenApiField(desc = "用户收支流水信息")
	private List<OpenApiUserTransLogInfo> openApiUserTransLogInfos;

	public List<OpenApiUserTransLogInfo> getOpenApiUserTransLogInfos() {
		return this.openApiUserTransLogInfos;
	}

	public void setOpenApiUserTransLogInfos(List<OpenApiUserTransLogInfo> openApiUserTransLogInfos) {
		this.openApiUserTransLogInfos = openApiUserTransLogInfos;
	}

}

    
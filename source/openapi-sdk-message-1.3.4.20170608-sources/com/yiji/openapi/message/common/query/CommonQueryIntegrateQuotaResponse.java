/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * zhike 2015年12月7日 下午2:03:20 创建
 */
package com.yiji.openapi.message.common.query;

import java.util.List;

import com.yiji.openapi.message.common.query.info.OpenApiIntegrateQuotaInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author zhike@yiji.com
 * @data 2015年12月7日
 */
@OpenApiMessage(service = "commonQueryIntegrateQuota", type = ApiMessageType.Response)
public class CommonQueryIntegrateQuotaResponse extends ApiResponse {
	
	@OpenApiField(desc = "结果信息列表", constraint = "结果信息列表", demo = "{\"userId\"：\"20150817010007217971\"}")
	private List<OpenApiIntegrateQuotaInfo> resultInfos;

	public List<OpenApiIntegrateQuotaInfo> getResultInfos() {
		return this.resultInfos;
	}

	public void setResultInfos(List<OpenApiIntegrateQuotaInfo> resultInfos) {
		this.resultInfos = resultInfos;
	}
	
}

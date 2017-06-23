/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-13 14:02 创建
 *
 */
package com.yiji.openapi.message.product.yzz;

import java.util.List;

import com.yiji.openapi.message.product.yzz.info.QueryClaimsTransferInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "", type = ApiMessageType.Response)
public class YzzClaimsQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "转让列表")
	private List<QueryClaimsTransferInfo> queryClaimsTransferInfos;
	
	public List<QueryClaimsTransferInfo> getQueryClaimsTransferInfos() {
		return queryClaimsTransferInfos;
	}
	
	public void setQueryClaimsTransferInfos(List<QueryClaimsTransferInfo> queryClaimsTransferInfos) {
		this.queryClaimsTransferInfos = queryClaimsTransferInfos;
	}
}

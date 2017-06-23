/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-02-04 14:15 创建
 *
 */
package com.yiji.openapi.message.common.core;

import java.util.List;

import com.yiji.openapi.message.common.core.info.GrQueryCardResultInfo;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author xiyang@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "queryGrCards", type = ApiMessageType.Response)
public class QueryGrCardsResponse extends ApiResponse {
	
	@OpenApiField(desc = "最大可绑卡数量")
	private Integer maxCardLimit;
	
	@OpenApiField(desc = "已绑卡列表")
	private List<GrQueryCardResultInfo> grCardInfoList;
	
	public Integer getMaxCardLimit() {
		return maxCardLimit;
	}
	
	public void setMaxCardLimit(Integer maxCardLimit) {
		this.maxCardLimit = maxCardLimit;
	}
	
	public List<GrQueryCardResultInfo> getGrCardInfoList() {
		return grCardInfoList;
	}
	
	public void setGrCardInfoList(List<GrQueryCardResultInfo> grCardInfoList) {
		this.grCardInfoList = grCardInfoList;
	}
}

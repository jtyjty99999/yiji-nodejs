/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年9月26日 上午9:19:16 创建
 */
package com.yiji.openapi.message.product.ypos;

import com.yiji.openapi.message.product.ypos.info.SettleDetail;
import com.yiji.openapi.sdk.common.annotation.OpenApiField;
import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@OpenApiMessage(service = "yfbSettleInfoQuery", type = ApiMessageType.Response)
public class YfbSettleInfoQueryResponse extends ApiResponse {
	
	@OpenApiField(desc = "交易类型")
	private String markEnum;
	
	@OpenApiField(desc = "结算详细信息")
	private SettleDetail settleDetail;
	
	public String getMarkEnum() {
		return this.markEnum;
	}
	
	public void setMarkEnum(String markEnum) {
		this.markEnum = markEnum;
	}
	
	public SettleDetail getSettleDetail() {
		return this.settleDetail;
	}
	
	public void setSettleDetail(SettleDetail settleDetail) {
		this.settleDetail = settleDetail;
	}
	
}

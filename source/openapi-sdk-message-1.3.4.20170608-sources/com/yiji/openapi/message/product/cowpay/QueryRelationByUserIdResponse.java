/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月17日 下午3:27:23 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.QftUserInfo;
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
@OpenApiMessage(service = "queryRelationByUserId", type = ApiMessageType.Response)
public class QueryRelationByUserIdResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户信息列表")
	private List<QftUserInfo> qftUserInfoList;
	
	public List<QftUserInfo> getQftUserInfoList() {
		return this.qftUserInfoList;
	}
	
	public void setQftUserInfoList(List<QftUserInfo> qftUserInfoList) {
		this.qftUserInfoList = qftUserInfoList;
	}
	
}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月20日 上午10:31:52 创建
 */
package com.yiji.openapi.message.product.cowpay;

import java.util.List;

import com.yiji.openapi.message.product.cowpay.info.UserPermissionsInfo;
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
@OpenApiMessage(service = "queryPermissionsByUserId", type = ApiMessageType.Response)
public class QueryPermissionsByUserIdResponse extends ApiResponse {
	
	@OpenApiField(desc = "用户权限信息列表")
	private List<UserPermissionsInfo> userPermissionsList;
	
	public List<UserPermissionsInfo> getUserPermissionsList() {
		return this.userPermissionsList;
	}
	
	public void setUserPermissionsList(List<UserPermissionsInfo> userPermissionsList) {
		this.userPermissionsList = userPermissionsList;
	}
	
}

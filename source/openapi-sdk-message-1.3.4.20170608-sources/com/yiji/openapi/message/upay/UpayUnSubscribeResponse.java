/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved.
 */

/*
 * 修订记录：
 * xiyang@yiji.com 2014年10月24日 上午9:28:54 创建
 */
package com.yiji.openapi.message.upay;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author xiyang
 *
 */
@Deprecated
@OpenApiMessage(service = "upayUnSubscribe", type = ApiMessageType.Response)
public class UpayUnSubscribeResponse extends ApiResponse {
	
}

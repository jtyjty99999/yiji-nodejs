/*
        * www.yiji.com Inc.
        * Copyright (c) 2014 All Rights Reserved.
        */

/*
* 修订记录：
* wkeduo 上午9:48:27 创建
*/

package com.yiji.openapi.message.common.oldtonew;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 *
 *
 * @author wkeduo
 *
 */
@OpenApiMessage(service = "changePassword", type = ApiMessageType.Response)
public class ChangePasswordResponse extends ApiResponse {

	// no business parameter

}

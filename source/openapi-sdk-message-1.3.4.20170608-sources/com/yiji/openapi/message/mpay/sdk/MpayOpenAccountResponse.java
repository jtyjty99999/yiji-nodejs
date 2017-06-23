/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-08 17:54 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayOpenAccount", type = ApiMessageType.Response)
public class MpayOpenAccountResponse extends ApiResponse {

}

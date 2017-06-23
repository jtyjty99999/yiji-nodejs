/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * hgeshu@yiji.com 2015-07-08 14:25 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author hgeshu@yiji.com
 */
@Deprecated
@OpenApiMessage(service = "activeUser", type = ApiMessageType.Request)
public class ActiveUserRequest extends ApiRequest {
}

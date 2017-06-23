/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * zhike@yiji.com 2016-07-11 09:32 创建
 *
 */
package com.yiji.openapi.message.mpay.sdk;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author zhike@yiji.com
 */
@OpenApiMessage(service = "mpayQueryCertifyChannel", type = ApiMessageType.Request)
public class MpayQueryCertifyChannelRequest extends ApiRequest {
}

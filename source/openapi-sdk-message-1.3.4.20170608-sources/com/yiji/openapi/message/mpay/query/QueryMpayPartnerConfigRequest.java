/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 
 * mdaheng@yiji.com 2016-05-30 15:19 创建
 *
 */
package com.yiji.openapi.message.mpay.query;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiRequest;

/**
 * @author xzhengyu
 * @email mdaheng@yiji.com
 * @since 2016-05-30
 */
@OpenApiMessage(service = "queryMpayPartnerConfig", type = ApiMessageType.Request)
public class QueryMpayPartnerConfigRequest extends ApiRequest {
}

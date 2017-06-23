/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * xiyang@yiji.com 2015-09-10 14:22 创建
 *
 */
package com.yiji.openapi.message.mpay.platform;

import com.yiji.openapi.sdk.common.annotation.OpenApiMessage;
import com.yiji.openapi.sdk.common.enums.ApiMessageType;
import com.yiji.openapi.sdk.common.message.ApiResponse;

/**
 * 设置默认银行卡(支付台)出参
 * @author dengwei@yiji.com
 */
@OpenApiMessage(service = "mpayPFSetDefaultCard", type = ApiMessageType.Response)
public class MpayPFSetDefaultCardResponse extends ApiResponse {
}
